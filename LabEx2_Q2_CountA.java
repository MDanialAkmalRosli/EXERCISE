public class LabEx2_Q2_CountA {
public static void main(String[] args){

   String word = "Kalau kena tampar biar tangan bercincin";
   
   int A = 0;
   for (int i=0; i < word.length(); i++){
      if (word.charAt(i) == 'a') // count how many character 'a' in the sentence above
         A = A + 1;
   }
   
   System.out.print("The number of character 'a' in the sentence " +
                    "above is "+ A);

   }
}