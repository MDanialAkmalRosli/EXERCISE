// Question 4 //

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LabEx2_Q4_RandomInRange {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   int start, finish, count = 0;
   
   // first number 
   System.out.print("Starting number?: ");
      start = sc.nextInt();
      
   // second number   
   System.out.print("Finishing number?: ");
      finish = sc.nextInt();
   
   // determines whether the first number is greater or otherwise   
   if (start >= finish){
      count = 0; } //number will be 0 if subjected on this condition
   else {
      count = ThreadLocalRandom.current().nextInt(start-1, finish+1); }
      
   //supposed output   
   System.out.println("The number in range of "+ start +" and "+ finish + " is "+ count); 
   
   }
}
