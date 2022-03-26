import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {

        String name = "amisha";
        System.out.println(reversestring(name));


    }

    private static String reversestring(String name) {
        Stack<Character> s = new Stack<Character>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            s.push(ch);
        }

        while (!s.isEmpty()) {
            sb.append(s.peek());

        }

        return sb.toString();
    }
}
