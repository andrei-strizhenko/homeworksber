package dz3part1.task2;

public class Student {
    private String name = "Oleg";
    private String surname = "Kaidalov";
    private int[] grades = {4, 5, 3, 4, 3, 5, 5, 5, 4};

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] arr) {

        this.grades = grades;
    }


    public int[] addGrade(int[] a, int grade) {
            for (int j = 1; j < a.length; j++) {
                a[j - 1] = a[j];
            }
            a[a.length - 1] = grade;
        return a;
    }
}