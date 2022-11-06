package dz3part2.task1new;

public class Book {
    private String title;
    private String autor;
    static int countBook;


    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
        countBook++;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

   /* public int getCountBook() {
        return countBook;
    }*/

    public String showTheBook(){
        return ("\"" + title + "\"    " + autor);
    }

    public String showTheBook(Book book){
        return ("\"" + title + "\"    " + autor);
    }

  /*  public void setTitle(String title) {
        this.title = title;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }*/
     }



