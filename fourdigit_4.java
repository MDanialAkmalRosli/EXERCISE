// Question 4 //

import java.util.Scanner;
public class fourdigit_4 {
   public static void main(String[] args){    
   Scanner sc = new Scanner(System.in);  
   
   int sum = 0;
   String cha = "";
     
   //asks for 4 int digits    
   System.out.println("Enter 4 digits here...");
      String num4 = sc.next();

   //the code will be displayed vertically
   for (int a=0; a < num4.length(); a++) {
      System.out.println(num4.charAt(a));
      cha = String.valueOf(num4.charAt(a));
      sum = sum + Integer.parseInt(cha);
      } 
   
   //sum of the 4 digits entered by user
   System.out.println("Sum of the 4 digits is "+ sum);
  
   }
}

