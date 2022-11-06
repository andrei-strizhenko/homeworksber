package profdz.task2;

public class Main {
    private static int count;
    private static String[] nameArr = new String[3];


    public static void main(String[] args) {

        addNameInArr("Андрей");
        addNameInArr("Михаил");
        addNameInArr("Константин");
        addNameInArr("Иван");


    }

    public static void addNameInArr(String name) {

        try {
            nameArr[count] = name;
            count++;
        } catch (ArrayIndexOutOfBoundsException e) {
            count--;
            throw new MyUncheckedException("There are no more free places in this array!!!");

        } finally {
            if (count == 3) {
                System.out.println("The element cannot be written to an array: ");
                printArr(nameArr);
            }
        }
    }

    public static void printArr(String[] name) {
        System.out.println("These names are written in an array:");
        for (int j = 0; j < nameArr.length; j++) {
            System.out.println(nameArr[j]);
        }
    }
}


