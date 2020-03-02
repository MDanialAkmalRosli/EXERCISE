public class StringExample{  
   public static void main(String args[]){ 
  
      String s1 = "Najib\t"; //creating string by java string literal  
      String sA = new String ("anak\t");  
      String s2 = new String(sA);  //converting char array to string  
      String s3 = new String("Razak"); //creating java string by new keyword  
      
      System.out.print(s1);  
      System.out.printf(s2);  
      System.out.println(s3);  }
}  