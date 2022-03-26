import java.util.ArrayList;
import java.util.Stack;


public class Nextsmallelement{
	
	     public static void main(String[] args) {
	    	 
	    	 
	    	 
	    	  ArrayList<Integer> arrli = new ArrayList<Integer>();
	    	  arrli.add(11);
	    	  arrli.add(22);
	    	  arrli.add(44);
	    	
	    	  ArrayList<Integer> arr = new ArrayList<Integer>();

	    	  
	    	  arr =getsmallele(arrli,3);
	    	  for(int i = 0;i<arr.size();i++) {
	    		  System.out.print(arr);
	    		  
	    	  }
	    	   
	     }

		private static ArrayList<Integer> getsmallele(ArrayList<Integer>arr,int n) {
			
			Stack<Integer>s1 = new Stack<Integer>();
			s1.push(-1);
			ArrayList<Integer>ans =  new ArrayList<>(n);
			for(int i = n-1;i>=0;i--) {
				int curr = arr.get(i);
				while(s1.peek()>=curr) {
					s1.pop();
					
				}
				
				ans.add(arr.get(i));
				s1.push(curr);
				
				
			}
			
			
			return ans;
		}
	
	
	
	
}