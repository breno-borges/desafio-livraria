package library.models;

import java.util.Date;

public class Loan {
    private int idLoan;
    private static int iId = 1;
    private Book book;
    private String username;
    private Date dateLoan;
    private Date dateReturn;

    public Loan(Book book, String username) {
        this.idLoan = iId++;
        this.book = book;
        this.username = username;
        this.dateLoan = new Date();
    }

    public int getIdLoan() {
        return idLoan;
    }

    public Book getBook() {
        return book;
    }

    public String getUsername() {
        return username;
    }

    public Date getDateLoan() {
        return dateLoan;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    public Date getDateReturn() {
        return dateReturn;
    }
}
