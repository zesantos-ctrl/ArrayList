package BookList;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("J. K. Rowling", "Harry Potter e a Pedra Filosofal", 1997));
        bookList.add(new Book("John Green", "A Culpa é das Estrelas", 2012));
        bookList.add(new Book("J. R. R. Tolkien", "O Senhor dos Anéis: A Sociedade do Anel", 1954));


        System.out.println(bookList.size());
        System.out.println("Total de livros" + bookList.toString());

        for (Book book : bookList) {
            if (book.getYearOfRelease() >= 2010) {
                System.out.println(book + "->Lançados depois de 2010");
            }
        }
    }
}
