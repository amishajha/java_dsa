import java.util.HashMap;
import java.util.Map;

class Sumofunique{
	
	public static void main (String[] args) {
		int nums[]= {1,1,2,3,5};
		int ans = 0;
		ans = sumofunique(nums);
		System.out.print(ans);
		
		
		
		
		
		
		
	}
	
	
	public static int sumofunique( int[] nums) {
		 Map<Integer, Integer> map = new HashMap<>();
	        
	        for (int i = 0; i < nums.length; i++) {
	            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
	        }
	        
	        int total = 0;
	        
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (entry.getValue() == 1) {
	                total = total + entry.getKey();
	            }
	        }
		return total;
	}
	
	
	
	
	
}