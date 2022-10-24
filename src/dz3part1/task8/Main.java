package dz3part1.task8;

public class Main {
    public static void main(String[] args) {
       double sumRub = 24586.10;
       double sumDol = 457.76;
        Atm atm = new Atm(65.3,59.5);
        Atm atm1 = new Atm(62.3,56.5);
        System.out.println( "Имеется сумма: " + sumRub+ " рублей");
        System.out.println("Получим после обмена: " + atm.changeRuUs(sumRub,atm.getUsRu())+ " долларов");
        System.out.println();
        System.out.println( "Имеется сумма: " + sumDol + " долларов");
        System.out.println("Получим после обмена: " + atm.changeUsRu(sumDol,atm.getRuUs())+" рублей");
        atm.countInstance();
    }
}
