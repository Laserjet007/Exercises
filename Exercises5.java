/**
*Java 1. Exercises5
*
*@author Lazarev Alexei
*@version 2021
*/

class Exercises5 {
    public static void main(String[] args) {
        int count = 0;
        float nail = 10f;
        float cmPerHit = 1.95f;
        while (nail > 0) {
            count++;
            nail = nail - cmPerHit;
            System.out.println("Hit #" + count);
        }
    }
}