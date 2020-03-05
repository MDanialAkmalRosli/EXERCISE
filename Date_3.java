// Question 3 //

import java.util.Scanner;
public class Date_3 {
   public static void main(String[] args){ 
   Scanner sc = new Scanner(System.in);
   
   String tarikh;
   
   //asks for input date
   System.out.print("Tarikh pada hari ini ialah ");
      tarikh = sc.next();
           
   //replaces "/" with "." for the date   
   tarikh = tarikh.replace("/", ".");
   System.out.print(tarikh);
   
   }
}
