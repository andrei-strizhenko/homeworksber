package homeWorkDz2SecondPart;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[][] a = new String[N][1];
        String[][] b = new String[N][1];
        int[][] c = new int[N][3];
        double[][] d = new double[N][3];

        int count = 0;

        for (int i = 0; i < N; i++) {
            a[i][0] = scanner.next();
        }
        for (int j = 0; j < N; j++) {
            b[j][0] = scanner.next();
        }

        for (int k = 0; k < N; k++) {
            for (int l = 0; l < 3; l++) {                //создание массива оценок int
                c[k][l] = scanner.nextInt();
            }
            break;
        }
        for (int k1 = 0; k1 < N; k1++) {
            for (int l1 = 0; l1 < 3; l1++) {               //перевод массива оценок int в формат double
                d[k1][l1] = (double) c[k1][l1];
               System.out.print(d[k1][l1]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }





        public static double[] average (double[][] v, int numberRow){
            double[] result = new double[numberRow];
            double sum = 0;
            int f = 0;                                                                      //метод: получаем массив из средних оценок типа double
            for (int i = 0; i < numberRow; i++) {
                for (int j = 0; j < 3; j++) {
                    result[i] = v[i][j];
                }
            }
            return result;
        }

       /*
                 //   sum = sum + v[N][i];
        result[f] =  Math.round(sum / 3) * 100.0 / 100.0;
*/


        private static double minValue ( double[] arr){   //находим индекс минимального значения
            double min = arr[0];
            int indexOfMin = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[indexOfMin]) {
                    indexOfMin = i;
                }
                return indexOfMin;
            }
            return indexOfMin;
        }
    }


