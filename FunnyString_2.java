// Question 2 //

import java.util.Scanner;
public class FunnyString_2 {
   public static void main(String[] args){ 
      Scanner sc = new Scanner(System.in);
      
      //variable for favourite colour, food, animal & first name of your friend
      String favcolour, food, animal, fr_1stname;
      
      //asks for favourite colour
      System.out.print("Your favourite colour? ");
      favcolour = sc.next();
      
      //asks for favourite food
      System.out.print("Your favourite food? ");
      food = sc.next();
      
      //asks for favourite animal
      System.out.print("Your favourite animal? ");
      animal = sc.next();
      
      //asks for friend's first name
      System.out.print("Your friend's first name? ");
      fr_1stname = sc.next();
      
      //supposed output of this source code
      System.out.println("I had a dream that " + fr_1stname + " ate a " + favcolour + " "
                      + animal + " and it tasted like " + food + "!");
                      
   }
}
