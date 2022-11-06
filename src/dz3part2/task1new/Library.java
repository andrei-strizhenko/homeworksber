package dz3part2.task1new;

import java.util.ArrayList;

public class Library {
   private ArrayList<Book> library = new ArrayList<>();
    private Book foundTheBookByTitle = null;


    public void addBook(Book newBook) {
        library.add(newBook);
    }

    public void removeBook(Book book) {
        library.remove(book);
    }

    public int getLibrarySize() {
        return library.size();
    }

    public String showTheBookByNum(int num) {
        Book book = library.get(num);
        return book.showTheBook();
    }

    public Book searchBookByTitle(String search) {
        for (int i = 0; i < getLibrarySize(); i++) {
            if (search == (library.get(i).getTitle())) {
                foundTheBookByTitle = library.get(i);
            }
        }
        return foundTheBookByTitle;
    }

    public ArrayList<Book> searchBookByAutor(String searchByAutor) {
        ArrayList<Book> foundTheBook = new ArrayList<>();
        for (int i = 0; i < getLibrarySize(); i++) {
            if (searchByAutor.equals(library.get(i).getAutor())) {
                foundTheBook.add(library.get(i));
            }
        }
        return foundTheBook;
    }


}



