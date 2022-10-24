package dz3part1.task3;

public class StudentServis {
    private String[] name = {"Oleg", "Andrei", "Mihail"};
    private String[] surname = {"Kaidalov", "Strizhenko", "Ivanov"};
    private int[][] grades = new int[][]{{4, 5, 3, 4, 3, 5, 3, 5, 4},
            {4, 5, 3, 5, 5, 5, 2},
            {4, 5, 3, 5, 5, 3}};


    public StudentServis() {
    }

    public String[] getName() {
        return name;
    }

    public String[] getSurname() {
        return surname;
    }

    public String getNameMax(String[] name, int index) {
        String nameMax = name[index];
        return nameMax;
    }


    public int[][] getGrades() {
        return grades;

    }

    public double[] bestStudent(int[][] a) {                      // получаем двумерный массив, создаем новый одномерный с суммой
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            double sum = 0;
            for (int j = 0; j < a[i].length; j++) {    //бежим по столбикам массива от 0 до длины строки массива
                sum = sum + a[i][j];
            }
            res[i] = sum / a[i].length;
        }
        return res;
    }


    public int maxIndex(double[] b) {                   // определяем мах average и получаем индекс
        int indexForMax = 0;
        for (int k = 0; k < b.length; k++) {
            if (b[k] > b[indexForMax]) {
                indexForMax = k;
            }
        }
        return indexForMax;
    }

    public int[] sortBySurname(String[] surname) {
        String sortSurname[] = new String[surname.length];
        int[] AsciiSymbol = new int[surname.length];
        int[] index = new int[surname.length];
        for (int m = 0; m < surname.length; m++) {
            char c = surname[m].charAt(0);
            AsciiSymbol[m] = c;
        }
        for (int h = 0; h < AsciiSymbol.length; h++) {
            if (h + 1 < AsciiSymbol.length) {
                if (AsciiSymbol[h] < AsciiSymbol[h + 1]) {
                    index[h] = h;

                }
                if (AsciiSymbol[h] > AsciiSymbol[h + 1]) {
                    index[h] = h + 1;
                    index[h + 1] = h;
                }
            } else {
                index[AsciiSymbol.length - 1] = AsciiSymbol.length - 2;
                break;
            }
        }
        return index;
    }

}

