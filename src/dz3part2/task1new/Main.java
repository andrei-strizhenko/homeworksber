package dz3part2.task1new;


public class Main {
    public static void main(String[] args) {

        String searchByTitle = "Айболит";
        String searchByAutor = "Конан Дойл";
        Book book = new Book("Война и мир", "Л.Н. Толстой");
        Book book1 = new Book("Затеряный мир","Конан Дойл");
        Book book2 = new Book("Айболит","Корней Чуковский");
        Book book3 = new Book("Шерлок Холмс","Конан Дойл");

        Library library = new Library();
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
       library.removeBook(library.searchBookByTitle(searchByTitle));



        for (int i = 0; i < library.getLibrarySize(); i++) {
            System.out.println(library.showTheBookByNum(i));
         //   System.out.println(library.library.get(i).getTitle());

        }
        System.out.println();

      Book resBookByTitle =  library.searchBookByTitle(searchByTitle);
      System.out.println("Найдена книга по названию: " + resBookByTitle.showTheBook(resBookByTitle));


      for (int i = 0; i <library.searchBookByAutor(searchByAutor).size() ; i++) {
            Book resBookByAutor = library.searchBookByAutor(searchByAutor).get(i);
            System.out.println("Найдено по автору: " +resBookByAutor.showTheBook(resBookByAutor));
        }



     //  library.searchBookByAutor(searchByAutor);







   /*     library.addBook("Таинственный остров","Жуль Верн");
        book.addBook("Война и мир","Л.Н. Толстой");
        book.addBook("Затеряный мир","Конан Дойл");
        book.addBook("Айболит","Корней Чуковский");
        book.addBook("Три мушкетера","Александр Дюма");
        book.delBook("Айболит");

    User user = new User("Иван Иванов");
        user.addUser("Петр Петров");
        user.addUser("Алексей Алексеев");
        user.addUser("Дмитрий Дмитров");
        user.addUser("Андрей Андреев");
*/
    }
}