package dz3part1.task8;

public class Atm {
    static int count = 0;
    private double UsRu = 0; //  курс доллара к рублю
    private double RuUs = 0; //  курс доллара к рублю


    public Atm(double v, double v1) {
        count++;
        setUsRu(v);
        setRuUs(v1);
    }

    public void setUsRu (double a){
     this.UsRu = a;
    }
    public void setRuUs (double a){
        this.RuUs = a;
    }
    public double getUsRu(){
        return UsRu;
    }
    public double getRuUs(){
        return RuUs;
    }


    public double changeUsRu (double sumDol, double UsRu){
        double sumRub = sumDol*UsRu;
       return sumRub;

    }

    public double changeRuUs (double sumRub, double RuUs){
        double sumDol = ((double)((int)(sumRub/RuUs*100)))/100;
      return sumDol;
    }

    public  void countInstance() {
        System.out.println("Количество инстансов - " + count);
    }

}

