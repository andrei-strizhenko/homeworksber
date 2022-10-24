package dz3part1.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int hour = 6;
        int min = 18;
        int sec = 25;
        System.out.println("задаем время в часах, минутах и секундах - нажмите 1");
        System.out.println("задаем время в часах и минутах - нажмите 2");
        System.out.println("задаем время в часах - нажмите 3");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 1) {
            TimeUnit timeunit = new TimeUnit(hour, min, sec);
            timeunit.TimeRus(hour,min,sec);
        }else if(a == 2){
            TimeUnit timeunit = new TimeUnit(hour, min);
            timeunit.TimeRus(hour,min, timeunit.sec);
        }else {
            TimeUnit timeunit = new TimeUnit(hour);
            timeunit.TimeRus(hour, timeunit.min, timeunit.sec);
        }
        System.out.println();
        TimeUnit timeunit = new TimeUnit(hour, min, sec);
        timeunit.TimeUSA(hour,min,sec);
        System.out.println();
        System.out.println("Добавляем 7 часов, 53 минут, 50секунд");
        timeunit.setTime(7,53,50);
       // timeunit.addTime(timeunit.hour, timeunit.min, timeunit.sec);
        timeunit.TimeRus(timeunit.hour, timeunit.min,timeunit.sec);





        //  timeunit.setTime();
        //   timeunit.TimeRus(timeunit.hour);


    }
}
