/**
*Java 1. Exercises2.0
*
*@author Lazarev Alexei
*@version 2021
*/

public class Exercises20 {
    public static void main(String[] args) {
            //для вызова метода необходимо передать ему 2 аргумента типа int, 
			//результатом работы будет целое число, которое напечатается в консоль
            System.out.println(summ(5, 5));
			
			// для вызова метода ему не нужно передавать аргументы, 
            // и он не возвращает данные (метод объявлен как void)    
            printSomeText();
	        // для вызова метода передаем ему в качестве аргумента строку "Java",
            // которую он выведет в консоль 
            printMyText("Java");
			
			// метод возвращает целое число, принимает на вход два целых числа
    public static int summ(int a, int b) {
		    // возвращаем сумму чисел
        return a + b;
	}
            // метод ничего не возвращает, не требует входных данных
    public static void printSomeText() {
            // печатаем Hello в консоль
			System.out.print("Hay");
    }
            // метод ничего не возвращает, принимает на вход строку
    public static void printMyText(String txtToPrint) {
            // выводим строку txtToPrint в консоль
            System.out.println(txtToPrint);
	}
}