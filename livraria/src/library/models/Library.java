package library.models;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Author> authors = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public List<Author> listAuthors() {
        return authors;
    }

    public List<Book> listBooks() {
        return books;
    }

    public List<Loan> listLoans() {
        return loans;
    }

}
