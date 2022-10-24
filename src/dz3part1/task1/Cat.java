package dz3part1.task1;

import java.util.Random;

public class Cat {
    String a;

    public String status() {            //метод
        String choose;
        String[] arr = new String[3];
        arr[0] = sleep();
        arr[1] = meow();
        arr[2] = eat();
        Random random = new Random();
        int index = random.nextInt(arr.length);
        choose = arr[index];
        return choose ;
    }

        private String meow(){ // метод
            this.a = "Meow";
            return a;
        }

        private String sleep(){ //метод
            this.a = "Sleep";
            return a;
        }

        private String eat() { // метод
            this.a = "Eat";
            return a;
        }

}
