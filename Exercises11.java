/**
*Java 1. Exercises11
*
*@author Lazarev Alexei
*@version 2021
*/

public class Exercises11 {
   public static void main(String[] args) {
      drawSquare();      
      checkHomework();
      howIsTheWeatherThere();
   }

   public static void drawSquare() {
      System.out.println("-----");
      System.out.println("|   |");
      System.out.println("-----");
   }

   public static void checkHomework() {
      int tasksCount = 3;

      if (tasksCount == 6) {
         System.out.println("yyyyyyyyyyyyyy");
      }
      if (tasksCount > 3 && tasksCount < 6) {
         System.out.println("jjjjjjjjjjjjjjjjjjjj");
      }
      if (tasksCount <= 3) {
         System.out.println("kkkkkkkkkkkkkkkkkkk!!");
      }

      System.out.println("llllllllllllllll");
   }

   public static void howIsTheWeatherThere() {
      int temperature = 15;

      if (temperature > 10) {
         System.out.println("bbbbbbbbbbbbbbbb");
      } else if (temperature > -5) {
         System.out.println("nnnnnnnnnnnnnnnnnnnn");
      } else {
         System.out.println("mmmmmmmmmmmmmmmmmmmmmm");
      }
   }
}
