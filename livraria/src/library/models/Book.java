package library.models;

import java.util.Date;

public class Book {

    private int idBook;
    private String title;
    private Author author;
    private int available;

    private Date createdAt;
    private Date updatedAt;

    public Book(int idBook, String title, Author author) {
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.available = 1;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public int getIdBook() {
        return idBook;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.updatedAt = new Date();
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
        this.updatedAt = new Date();
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
        this.updatedAt = new Date();
    }

}
