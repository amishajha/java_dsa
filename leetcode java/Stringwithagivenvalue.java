class Stringwithagivenvalue{
	
	public static void main(String[] args) {
		System.out.print(totalMoney(5));
	}
	
	
	public static  int totalMoney(int n) {
		
		int ans = 0 ;
		int day = 0;
		int num = 1;
		int currentamount = 1;
		while(n>0) {
			
			ans  = ans + currentamount;
			currentamount++;
			day++;
			n--;
			if(day==7) {
				day=0;
				num++;
				currentamount=num;
				
			}
			
			
			
			
			
			
			
		}
		
		
		
		return ans;
		
		
		
		
		
	}
	
	
	
	
}