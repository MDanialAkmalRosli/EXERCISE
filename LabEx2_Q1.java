// Question 1 //

import java.util.Scanner;
public class LabEx2_Q1 {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int num;
   int square, cube;
   
   //display the word "Number", "Square", "Cube"
   System.out.println("Number\t\tSquare\t\tCube");
   
   for (num = 1; num <= 10; num++) {   // process from numbers 1 to 10
     square = (int) Math.pow(num,2);   // calculate square of the numbers
     cube = (int) Math.pow(num,3);     // calculate cube of the numbers
     
    //supposed output for this code
     System.out.println(num + "\t\t\t\t" + square + "\t\t\t\t" + cube );  }
   
   }
}
