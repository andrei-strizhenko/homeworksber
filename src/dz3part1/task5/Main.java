package dz3part1.task5;

public class Main {
    public static void main(String[] args) {

        DayOfWeek dayOfWeek = new DayOfWeek();
        String[] DofWeek = new String[7];
        DofWeek[0] = dayOfWeek.getA1();
        DofWeek[1] = dayOfWeek.getA2();
        DofWeek[2] = dayOfWeek.getA3();
        DofWeek[3] = dayOfWeek.getA4();
        DofWeek[4] = dayOfWeek.getA5();
        DofWeek[5] = dayOfWeek.getA6();
        DofWeek[6] = dayOfWeek.getA7();
        byte[] NumOfWeek = new byte[7];
        byte[] num1 = dayOfWeek.getNum();
        for (int i = 0; i < 7; i++) {
            NumOfWeek[i] = num1[i];
        }
        for (int j = 0; j < 7; j++) {
            System.out.println(NumOfWeek[j] + " " + DofWeek[j]);
        }

    }
}

