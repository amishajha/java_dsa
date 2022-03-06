import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
static boolean isAnagramm(String firstword,String secondword){
    char [] word1=firstword.toLowerCase().replaceAll("[\\s]"," ").toCharArray();
    char[] word2 = secondword.toLowerCase().replaceAll("[\\s]", " ").toCharArray();

    Arrays.sort(word1);
    Arrays.sort(word2);
    return Arrays.equals(word1,word2);
}


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String A=sc.next();
       String B=sc.next();
       boolean rel=isAnagramm(A,B);
       if(rel){
System.out.println("anagrams");
       }

       else{

        System.out.print("not anagrams");

       }
       

        
    }
    
}
