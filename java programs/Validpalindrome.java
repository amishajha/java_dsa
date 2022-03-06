public class Validpalindrome {
    public static void main(String[] args) {
        String [] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));

    }

    private static String firstPalindrome(String[] words) {
        for (int i = 0 ; i< words.length ;i++){

            String p = words[i];
            String s =reverse(words[i]);
            if(p.equals(s)){
                return p;
                
            }

        }


        return "";
    }

    private static String reverse(String s) {
         char temparray[] = s.toCharArray();
         int n = s.length();
             int i, k;
             char t;
        for (i = 0; i < n / 2; i++) {
            t = temparray[i];
            temparray[i] = temparray[n - i - 1];
            temparray[n - i - 1] = t;
        }
        return  toString(temparray);
        
    }

    private static String toString(char[] temparray) {
       String string = String.valueOf(temparray);
       return string;
    }      
    
}
