# Sistema de Gestão de Biblioteca
Este projeto foi desenvolvido como parte de um desafio da trilha de Java do Ignite. O objetivo é aplicar conceitos fundamentais de Java polimorfismo, estruturas de repetição, e manipulação de datas.

## Funcionalidades
### Gerenciamento de Livros
- Listar todos os livros disponíveis.
- Em empréstimo são exibidos apenas os livros que estão disponíveis para empréstimo e é possível realizar o empréstimo desses livros.
- Realizar empréstimo de um livro: Permite que um usuário escolha um livro disponível e registre o empréstimo.
- É possível listar todos os empréstimos realizados.
- É possível fazer a devolução do livro e o mesmo fica disponível para novo empréstimo.
- Devolver um livro: O usuário informa o usuário, são listados todos empréstimos desse usuário e o mesmo informa qual deles quer devolver.

## Estrutura do Projeto
### O projeto é dividido nas seguintes classes principais:

- Book: Representa os livros na biblioteca, com atributos como id, title, author, available, createdAt e updatedAt.
- Author: Representa os autores dos livros, com atributos como id, name, e birthDate.
- Loan: Gerencia os empréstimos de livros, com informações sobre o livro emprestado e datas de empréstimo e devolução.
- Library: Gerencia a coleção de livros, autores e empréstimos.

## Requisitos
- Java Development Kit (JDK) 8 ou superior
- IDE de sua escolha (Eclipse, IntelliJ IDEA, NetBeans, etc.)

## Após iniciar
A aplicação irá apresentar um menu de escolha. Basta ir seguindo a sequência e preenchendo as informações solicitadas para utilização do programa.
