package dz3part2.task1new;

public class User {
    static int count = 0;
    private String[] user = new String[100];
    private int numberOfUser = 0;
    private int takenTheBook;

    public User(String user) {
        this.user[numberOfUser] = user;
    }

    public void addUser(String user) {
        numberOfUser++;
        this.user[numberOfUser] = user;
    }
}
