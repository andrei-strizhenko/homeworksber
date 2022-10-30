package dz3part2.task1;

public class Main {
    public static void main(String[] args) {
        String search = "Затеряный мир";
        String searchByAutor = "Жуль Верн";
        Book book = new Book("Война и мир", "Л.Н. Толстой");

        book.addBook("Таинственный остров","Жуль Верн");
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

        for (int j = 0; j < book.getTitle().length; j++) {
            System.out.println(book.getTitle()[j]);
        }
        book.searchBook(search);
        book.searchBookByAutor(searchByAutor);
    }






}