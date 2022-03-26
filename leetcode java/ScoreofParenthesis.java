import java.util.Stack;

public class ScoreofParenthesis {


    public static void main(String[] args) {
        String s = "()";
        scoreofParenthesis(s);
    }

    private static int  scoreofParenthesis(String s) {
        int count = 0;
        Stack<Integer>stack=new Stack<Integer>();
        int total = 0;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(total);
                total = 0;
            }
            else {
                total = stack.pop()+Math.max(2*total,1);

            }


        }

        return total;

    }
}
