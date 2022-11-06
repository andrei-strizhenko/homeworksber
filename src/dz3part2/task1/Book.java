package dz3part2.task1;

public class Book {
    private String[] title = new String[10];
    private String[] autor = new String[10];
    static int numberOfBook;
    private int avaible = 0;

    public Book(String title, String autor) {
        this.title[numberOfBook] = title;
        this.autor[numberOfBook] = autor;
    }

    public void addBook(String newTitle, String newAutor) {
       numberOfBook++;
        if (!checkBook(newTitle)) {
            this.title[numberOfBook] = newTitle;
            this.autor[numberOfBook] = newAutor;
        } else {
            numberOfBook--;
        }
    }

    public void delBook(String newTitle) {
        String[] temp = new String[getTitle().length];
         String[] tempAutor = new String[getAutor().length];
        int k;
        for (k = 0; k < temp.length; k++) {
            if (k == checkBookIndex(newTitle)) {
                temp[k] = getTitle()[k + 1];
                tempAutor[k] = getAutor()[k + 1];
                k++;
            } else {
                temp[k] = getTitle()[k];
                tempAutor[k] = getAutor()[k];
            }
        }
        setTitle(temp);
        setAutor(tempAutor);
    }

    public void searchBook(String search) {
        int f = checkBookIndex(search);
        if (f >= 0) {
            System.out.println("Найдена книга по вашему запросу: " + getTitle()[f]);
        } else {
            System.out.println("Книга не найдена");
        }

    }

    public void searchBookByAutor(String searchByAutor) {
        int[] index = checkBookByAutor(searchByAutor);
        for (int t = 0; t < index.length; t++) {
                if (index[t] >= 0) {
                    System.out.println("Найдена книга по вашему запросу: " + getTitle()[index[t]]);
               } else {
                   continue;
            }
        }
    }


    public boolean checkBook(String newTitle) {
        int i = 0;
        if (newTitle.equals(getTitle()[i])) {
            return true;
        } else {
            i++;
        }
        return false;
    }

    public int checkBookIndex(String newTitle) {
        int j;
        for (j = 0; j < getTitle().length; j++) {
            if (newTitle.equals(getTitle()[j])) {
                return j;
            }
        }
        return j = -1;
    }


    public int[] checkBookByAutor(String newAutor) {
        int[] x = new int[10];
        for (int h = 0; h < getAutor().length; h++) {
            if (newAutor.equals(getAutor()[h])) {
                x[h] = h;
            } else {
                x[h] = -1;
            }
        }
        return x;
    }

    public String[] getTitle() {
        return title;
    }

    public String[] getAutor() {
        return autor;
    }

    public void setTitle(String[] temp) {
        this.title = temp;
    }
    public void setAutor(String[] tempAutor) {
        this.autor = tempAutor;
    }
}

