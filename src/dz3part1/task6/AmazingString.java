package dz3part1.task6;

public class AmazingString {
    private char [] arr;
   private String newStr;
    public AmazingString(char[] arr) {


    }

    public AmazingString(String a) {

    }

    public char[] getArr() {
        return arr;
    }
    public void setArr(String a) {
        this.newStr = a;
    }


    public String getStr(char[] b) {
        String newStr = new String(b);
        return newStr;
    }


}
