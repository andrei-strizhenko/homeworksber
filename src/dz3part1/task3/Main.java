package dz3part1.task3;

public class Main {
    public static void main(String[] args) {
        int index = 0;
        StudentServis student = new StudentServis();
        index = student.maxIndex(student.bestStudent(student.getGrades()));
        String name = student.getNameMax(student.getName(), index);
        String surName = student.getNameMax(student.getSurname(), index);
        double[] maxAverage = student.bestStudent(student.getGrades());
        System.out.println("Лучший студент по среднему баллу:");
        System.out.println(name + " " + surName + " Максимальный средний балл - " + maxAverage[index]);
        int[] newIndex = student.sortBySurname(student.getSurname());

        System.out.println("Сортируем по алфавиту фамилии студентов:");
        for (int i = 0; i < student.getSurname().length; i++) {
            System.out.println(student.getSurname()[newIndex[i]] + " " + student.getName()[newIndex[i]] + " "
                    + student.bestStudent(student.getGrades())[newIndex[i]]);
        }
    }
}