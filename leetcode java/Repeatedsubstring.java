

public class Repeatedsubstring {
    public static void main(String[] args) {

        String s = "abab";
     System.out.println(  repeatedpattern(s));

        
    }

    private static boolean repeatedpattern(String s) {
     String a = s+s;
     boolean ans;
     ans= (a.substring(1,a.length()-1).contains(s));
     return ans;
    }



}
