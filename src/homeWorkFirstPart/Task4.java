package homeWorkFirstPart;

import java.util.Scanner;

//На вход подается количество секунд, прошедших с начала текущего дня – count.
//Выведите в консоль текущее время в формате: часы и минуты.
//Ограничения:
//0 < count < 86400
public class Task4 {
    public static void main(String[] args) {
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count > 0 && count < 86400) {

            int hours = ((count / SECONDS_PER_MINUTE) / MINUTES_PER_HOUR);
            int minutes = count / SECONDS_PER_MINUTE - hours * MINUTES_PER_HOUR;
            System.out.println(hours + " " + minutes);

        }
    }


}

