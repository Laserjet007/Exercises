/**
*Java 1. Exercises26
*
*@author Lazarev Alexei
*@version 2021
*/

public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat() {
        System.out.println("Это конструктор класса Cat") ;
        name = "Барсик";
        color = "Белый";
        age = 2;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
    }
}
