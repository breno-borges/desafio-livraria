package library.useCases;

import java.util.Date;

import library.models.Book;
import library.models.Library;
import library.models.Loan;

public class LoansUseCases {

    Library library = new Library();

    BooksUseCases booksUseCases = new BooksUseCases();

    public void addLoan(Loan loan, Book book) {
        if (book.getAvailable() == 1) {
            book.setAvailable(0);
            library.listLoans().add(loan);
        } else {
            System.out.println("Livro já emprestado");
        }
    }

    public void listLoans() {
        System.out.println("\nLista de Emprestimos");
        for (Loan loan : library.listLoans()) {
            System.out.println("-------------------");
            System.out.println(loan.getIdLoan());
            System.out.println("Id Livro: " + loan.getBook().getIdBook());
            System.out.println(loan.getBook().getTitle());
            System.out.println(loan.getUsername());
            System.out.println(loan.getDateLoan());
            System.out.println(loan.getDateReturn());
        }
    }

    public void returnLoan(int idLoan) {
        for (Loan loan : library.listLoans()) {
            if (loan.getIdLoan() == idLoan && loan.getBook().getAvailable() == 0) {
                loan.setDateReturn(new Date());
                loan.getBook().setAvailable(1);
            } else {
                System.out.println("Livro já devolvido");
            }
        }
    }

    public void listLoansByUsername(String username) {
        System.out.println("\nLista de Emprestimos do usuario escolhido");
        for (Loan loan : library.listLoans()) {
            if (loan.getUsername().equals(username)) {
                System.out.println("-------------------");
                System.out.println(loan.getIdLoan());
                System.out.println("Id Livro: " + loan.getBook().getIdBook());
                System.out.println(loan.getBook().getTitle());
                System.out.println(loan.getUsername());
                System.out.println(loan.getDateLoan());
            }
        }
    }
}
