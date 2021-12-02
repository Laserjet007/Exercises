/**
*Java 1. Exercises6
*
*@author Lazarev Alexei
*@version 2021
*/

import java.util.Random;

class Exercises6 {
    public static void main(String[] args) {
            Random random = new Random();
            for (int i = 0; i < 30; i++) {
                System.out.println(random.nextInt(8887986) + " ");
        }
    }
}