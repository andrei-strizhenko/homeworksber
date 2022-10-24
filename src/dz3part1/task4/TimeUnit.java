package dz3part1.task4;

public class TimeUnit {
   int hour = 0;
   int min = 0;
   int sec = 0;
    static final int SECONDS_PER_MIN = 60;
    static final int MIN_PER_HOUR = 60;
    static final int HOUR_PER_DAY_RUS = 24;

    public TimeUnit(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    public TimeUnit(int hour, int min) {
        this.hour = hour;
        this.min = min;
        int sec = 0;
    }

    public TimeUnit(int hour) {
        this.hour = hour;
        int min = 0;
        int sec = 0;
    }

    public TimeUnit() {
    }

    public void TimeRus(int hour, int min, int sec) {
        System.out.print((hour < 10) ? "0" + hour + ":" : hour + ":");
        System.out.print((min < 10) ? "0" + min + ":" : min + ":");
        System.out.print((sec < 10) ? "0" + sec : sec);
    }

    public void TimeUSA(int hour, int min, int sec) {
        final int MAX_HOUR = 12;

        if (hour <= MAX_HOUR) {
            System.out.print((hour < 10) ? "0" + hour + ":" : hour + ":");
            System.out.print((min < 10) ? "0" + min + ":" : min + ":");
            System.out.print((sec < 10) ? "0" + sec + " am" : sec + " am");
        } else {
            System.out.print((hour - MAX_HOUR < 10) ? "0" + (hour - MAX_HOUR) + ":" : hour - MAX_HOUR + ":");
            System.out.print((min < 10) ? "0" + min + ":" : min + ":");
            System.out.print((sec < 10) ? "0" + sec + " pm" : sec + " pm");

        }
    }

    public void setTime(int a, int b, int c) {
        this.hour = hour + a;
        this.min = min + b;
        this.sec = sec + c;
        int plusMin = sec / SECONDS_PER_MIN;
        //     int plusHour = min/MIN_PER_HOUR;

        if (sec > SECONDS_PER_MIN) {
            sec = sec % SECONDS_PER_MIN;
        }
        min = (min + sec / SECONDS_PER_MIN) + plusMin;
        int plusHour = min / MIN_PER_HOUR;
        if (min > MIN_PER_HOUR) {
            min = min % MIN_PER_HOUR;
        }

        hour = (hour + min / MIN_PER_HOUR) + plusHour;
        if (hour > HOUR_PER_DAY_RUS) {

            hour = hour % HOUR_PER_DAY_RUS;
            System.out.println("Начались следующие сутки");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec(int sec) {
        return this.sec;
    }

    public void addTime(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;

    }

}
