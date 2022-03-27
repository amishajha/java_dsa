//Minimum deletions to make array beautiful
//Input: nums = [1,1,2,3,5]
//Output: 1
//Explanation: You can delete either nums[0] or nums[1] to make nums = [1,2,3,5] 
//		which is beautiful. 
//		It can be proven you need at least 1 deletion to make nums beautiful.

class MinimumDeletions{
	public static void main(String[] args) {
		
		int nums[] = {1,1,2,2,3,3};
		int ans = minDel(nums);
		System.out.print(ans);
		
		
		 
	}

	private static int minDel(int[] nums) {
         int cnt = 0 ;
         for(int i = 0;i<nums.length-1;i++) 
        	 if((i-cnt)%2==0 && nums[i]==nums[i+1]) 
        		 cnt++;
        	 
         
         
         if((nums.length-cnt)%2==1) 
        	 cnt++;
        	 
         
		return cnt;
	}
	
	
	
	
}