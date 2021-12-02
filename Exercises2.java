/**
*Java 1. Exercises2
*
*@author Lazarev Alexei
*@version 2021
*/

class Exercises2 {
    public static void main(String[] args) {
        int water = 0;

        int kettle = 0;
		
        if (water == 0) {
            System.out.println("Pour water");
        } else {
            System.out.println("No need to pour");
        }

        System.out.println("take kettle");
        if (kettle >= 1 ) {
            System.out.println("Pure water");
		}
        if (water == 0 ) {
            System.out.println("Pure water");
        }
        System.out.println("Put the kettle on fire");
    }
}
