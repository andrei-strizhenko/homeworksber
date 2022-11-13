package profdz.task4;

public class MyEvenNumber {
    int tempNumber;
    private int n = 6;
    static int myPrimeNumber;

    public MyEvenNumber() {
    }

    public int getTempNumber() {
        return tempNumber;
    }

    public void setTempNumber(int tempNumber) {
        this.tempNumber = tempNumber;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void MyPrimeNumber(int tempNumber) throws MyException {
        try {
            tempNumber++;
            setTempNumber(tempNumber);
            if (tempNumber % 2 == getN() % 2) {
                myPrimeNumber = tempNumber;
                System.out.println("Инстанс создан");
            } else {
                System.out.println("Инстанс не создан");
                throw new MyException();
            }
        } catch (Exception e) {
            throw new MyException("Инстанс не создан - число n нечетное!!!");

        }   /*   finally {                 // программа продолжит работать, при этом исключение не будет выкидывать сообщение
                System.out.println("Инстанс равен "+  myPrimeNumber);
                 return;
        } */
    }
}






