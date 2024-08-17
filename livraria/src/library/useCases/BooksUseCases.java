package library.useCases;

import library.models.Book;
import library.models.Library;

public class BooksUseCases {

    Library library = new Library();

    public void addBook(Book book) {
        library.listBooks().add(book);
    }

    public void listBooks() {
        System.out.println("\nLista de todos livros cadastrados");
        for (Book book : library.listBooks()) {
            System.out.println("-------------------");
            System.out.println(book.getIdBook());
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor().getName());
            System.out.println(book.getCreatedAt());
            System.out.println(book.getUpdatedAt());
        }
    }

    public void listBooksAvailable() {
        System.out.println("\nLista de todos livros disponíveis para empréstimo");
        for (Book book : library.listBooks()) {
            if (book.getAvailable() == 1) {
                System.out.println("-------------------");
                System.out.println(book.getIdBook());
                System.out.println(book.getTitle());
                System.out.println(book.getAuthor().getName());
                System.out.println(book.getCreatedAt());
                System.out.println(book.getUpdatedAt());
            }
        }
    }

    public Book findBookById(int idBook) {
        for (Book book : library.listBooks()) {
            if (book.getIdBook() == idBook) {
                return book;
            }
        }
        return null;
    }
}
