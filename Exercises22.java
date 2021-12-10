/**
*Java 1. Exercises22
*
*@author Lazarev Alexei
*@version 2021
*/

//Например, последовательность if-else-if-...
public class Exercises22 {
public static void main(String[] args) {
    int a = 9;
    if (a == 1) {
        System.out.println("a = 1");
    } else if (a == 3) {
        System.out.println("a = 3");
    } else {
        System.out.println("no work");
    }
//может быть заменена на следующее.
    int b = 3;
    switch (a) {
        case 1:
            System.out.println("b = 1");
            break;
        case 3:
            System.out.println("b = 3");
            break;
        default:
            System.out.println("no work");
        }
    }

}