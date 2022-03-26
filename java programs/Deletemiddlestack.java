import java.util.Stack;

public class Deletemiddlestack {
	
	
	   public static void main(String[] args) {
		   
		   
		   Stack<Integer>st = new Stack<Integer>();
		   st.push(10);
		   st.push(22);
		   st.push(90);
		   int n = st.size();
		   
		   
		   deletemiddle(st,n);
		   
		   while(!st.isEmpty()) {
			   System.out.print(st.peek());
			   st.pop();
			   
		   }
		   
		   
		   
		   
		   
		   
	   }

public static void deletemiddle(Stack<Integer> st, int n) {
	    int count  = 0;
	    solve(st,count,n);
		
	}

public  static void solve(Stack<Integer> st, int count, int n) {
           if(count==n/2) {
        	   st.pop();
        	   return;
           }
           
           int num = st.peek();
           st.pop();
           
           solve(st,count+1,n);
           st.push(num);
           
           
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}