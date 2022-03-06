import java.util.HashSet;
import java.util.Set;

public class VowelOccurances {
    public static void main(String[] args) {
        String word = " aeiouu";
        int ans ;
         ans = countVowelSubstrings(word);
         System.out.println(ans);
    }

private static int  countVowelSubstrings(String word) {
   int count = 0;
  for(int i = 0;i<word.length();i++){
      StringBuilder sb = new StringBuilder();
      for(int j = i ;j<word.length();j++){
          sb.append(word.charAt(j));
          if(Check(sb.toString())){
              count++;
          }
      }
  }







        return count;
    }

private static boolean Check(String s) {
   Set <Character> sb = new HashSet<Character>();

   for ( int i = 0 ;i <s.length();i++){
       sb.add(s.charAt(i));
       if(sb.contains('a') && sb.contains('e') && sb.contains('i') && sb.contains('o') && sb.contains('u')&& sb.size()==5){
           return true;
       }
   }
   


    return false;
}
}
