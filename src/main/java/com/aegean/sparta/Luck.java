package com.aegean.sparta;



import java.util.Random;



public class Luck {

    public String get_luck_string() {

        Random rand = new Random();

        int n = rand.nextInt(10);

        if (n == 1) {

            return "下下";

        } else if (n <= 2) {

            return "下";

        } else if (n <= 4) {

            return "平";

        } else if (n <= 8) {

            return "上";

        } else {

            return "上上";

        }

    }

}
