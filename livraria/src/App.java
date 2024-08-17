import java.util.Date;
import java.util.Scanner;

import library.models.Author;
import library.models.Book;
import library.models.Loan;
import library.useCases.BooksUseCases;
import library.useCases.LoansUseCases;

public class App {
    public static void main(String[] args) throws Exception {

        byte option;
        String username;
        Scanner input = new Scanner(System.in);

        Author author1 = new Author(1, "George R R Martin", new Date());
        Author author2 = new Author(2, "J K Rowling", new Date());

        Book book1 = new Book(1, "As cronicas de gelo e fogo", author1);
        Book book2 = new Book(2, "Harry Potter", author2);

        BooksUseCases booksUseCases = new BooksUseCases();
        booksUseCases.addBook(book1);
        booksUseCases.addBook(book2);

        LoansUseCases loansUseCases = new LoansUseCases();

        do {
            System.out.println("----------------------");
            System.out.println("Bem Vindo!");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Listar todos os livros");
            System.out.println("2 - Emprestimos - Livros disponíveis");
            System.out.println("3 - Listar emprestimos");
            System.err.println("4 - Devolver livro");
            System.out.println("0 - Sair do sistema");
            System.out.println("----------------------");
            option = input.nextByte();
            input.nextLine();

            switch (option) {
                case 1:
                    booksUseCases.listBooks();
                    break;
                case 2:
                    booksUseCases.listBooksAvailable();
                    System.out.println("Deseja realizar o emprestimo de algum livro? (s/n)");
                    String switchLoan = input.nextLine();
                    switch (switchLoan) {
                        case "s":
                            System.out.println("Digite o id do livro desejado");
                            int switchBook = input.nextInt();
                            input.nextLine();
                            System.out.println("Digite o usuario que esta solicitando o emprestimo");
                            username = input.nextLine();
                            Book book = booksUseCases.findBookById(switchBook);
                            Loan loan = new Loan(book, username);
                            loansUseCases.addLoan(loan, book);
                            break;
                        case "n":
                            System.out.println("Voltando ao menu anterior");
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 3:
                    loansUseCases.listLoans();
                    break;
                case 4:
                    System.out.println("Informe seu usuario");
                    username = input.nextLine();
                    loansUseCases.listLoansByUsername(username);
                    System.out.println("Informe o id do emprestimo que deseja devolver o livro");
                    int switchLoanById = input.nextInt();
                    input.nextLine();
                    loansUseCases.returnLoan(switchLoanById);
                    break;
                case 0:
                    option = 0;
                    System.out.println("Obrigado por usar o sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (option != 0);
    }
}
