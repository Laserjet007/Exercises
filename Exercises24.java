/**
*Java 1. Exercises24
*
*@author Lazarev Alexei
*@version 2021
*/

class Exercises24 {
   public static void main(String args[]){
      //char grade = args[0].charAt(0);
      char grade = 'C';

      switch(grade)
      {
         case 'A' :
            System.out.println("Great!"); 
            break;
         case 'B' :
         case 'C' :
            System.out.println("Perfectly executed");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Incorrect rating");
      }
      System.out.println("our score " + grade);
   }
}