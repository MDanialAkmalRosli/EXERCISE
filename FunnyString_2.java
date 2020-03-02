import java.util.Scanner;
public class FunnyString_2 {
   public static void main(String[] args){ 
      Scanner sc = new Scanner(System.in);
   
      String favcolour, food, animal, fr_1stname;
   
      System.out.print("Your favourite colour? ");
      favcolour = sc.next();
      
      System.out.print("Your favourite food? ");
      food = sc.next();
      
      System.out.print("Your favourite animal? ");
      animal = sc.next();
      
      System.out.print("Your friend's first name? ");
      fr_1stname = sc.next();
      
      System.out.println("I had a dream that " + fr_1stname + " ate a " + favcolour + " "
                      + animal + " and it tasted like " + food + "!");
                      
   }
}