/**
*Java 1. Exercises25
*
*@author Lazarev Alexei
*@version 2021
*/

public class Exercises25 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.name = "tom";
        cat1.color = "wite";
        cat1.age = 4;
        cat2.name = "bill";
        cat2.color = "bleck";
        cat2.age = 6;
        System.out.println("cat1 name: " + cat1.name + " color: " + cat1.color + " age: " + cat1.age);
        System.out.println("cat2 name: " + cat2.name + " color: " + cat2.color + " age: " + cat2.age);
    }
}