package dz3part1.task2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName() + " " + student.getSurname());
        student.setName("Andrey");   // меняем имя
        student.setSurname("Strizhenko");   // меняем фамилию
        System.out.print(student.getName() + " " + student.getSurname() + " ");
        student.addGrade(student.getGrades(), 2); //добавляем оценку
        printGrade(student.getGrades());
    }

    public static void printGrade(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
