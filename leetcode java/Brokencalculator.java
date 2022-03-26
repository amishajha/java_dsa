public class Brokencalculator{
	public static void main(String[] args) {
		System.out.print(brokencal(2,3));
		
		
	}
	
	
	public static int brokencal(int val ,int target) {
		
		
	//recursive approach 
		
	if(val>=target) {
		return val-target;
		
	}
	
	
	if(target%2==0) {
		return 1+brokencal(val,target/2);
		
	}
	
	
return 1+brokencal(val,target+1);
		
		
		
		
		
	}
	
	
	
	
	
	
	
}