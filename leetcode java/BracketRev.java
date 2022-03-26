import java.util.Stack;

public class BracketRev{
	
	public static void main(String[] args) {
		
		String str = "{{";
		System.out.print(minicost(str));
	}

	private static int  minicost(String str) {
		
		if(str.length()%2==1) {
			return -1;
		}
	        
		Stack<Character>st = new Stack<Character>();
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(str.charAt(i)=='{') {
				st.push(ch);			
		    }
			
			else {
				if(!st.empty()&& st.peek()=='{') {
					st.pop();
				}
				else {
					st.push(ch);
				}
				
				
				
			}
		}
		
		
		int a = 0,b=0;
		while(!st.empty()) {
			if(st.peek()=='{') {
				a++;
			}
			else {
				b++;
			}
			
			st.pop();
			
			
		}
		
		int ans = (a+1)/2+(b+1)/2;
		
		return ans;
	}
	
	
	
	
	
	
	
	
}