// Question 3 //

public class LabEx2_Q3_PrintReverse {
public static void main(String[] args){

   String ayat = new String ("DANIAL AKMAL,273046");   
   StringBuilder rev = new StringBuilder(); //use for the reverse of the word above
   
   System.out.println(ayat);
   rev.append(ayat);       // append the String ayat to StringBuilder rev
   rev = rev.reverse();    // reverse the StringBuilder rev
   System.out.println("The above sentence if reversed will be..."+ rev);  // display the reversed String ayat
         
   }
}
