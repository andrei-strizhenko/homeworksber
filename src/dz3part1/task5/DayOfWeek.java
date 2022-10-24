package dz3part1.task5;

public class DayOfWeek {
    int i= 0;
    private byte[] num = {1,2,3,4,5,6,7};
    private String a1 = "Monday";
    private String a2 = "Tuesday";
    private String a3 = "Wednesday";
    private String a4 = "Thursday";
    private String a5 = "Friday";
    private String a6 = "Saturday";
    private String a7 = "Sunday";

    public String getA1(){this.a1 = a1; return a1;}
    public String getA2(){this.a2 = a2; return a2;}
    public String getA3(){this.a3 = a3; return a3;}
    public String getA4(){this.a4 = a4; return a4;}
    public String getA5(){this.a5 = a5; return a5;}
    public String getA6(){this.a6 = a6; return a6;}
    public String getA7(){this.a7 = a7; return a7;}

    public byte[] getNum() {
        return num;
    }
}
