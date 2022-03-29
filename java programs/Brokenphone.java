import java.util.Scanner;

class  Brokenphone
{
	public static void main (String[] args) 
	{
        Scanner sc = new Scanner (System.in);
	int t  = sc.nextInt();
	
	int l = 0;
		int res[] = new int[t];
	while(t-->0) {
		  int flag  = 0;
		  int count = 0;
		int n  = sc.nextInt();
		int arr[] = new int[n];
	
		for(int i = 0;i < arr.length;i++) 
			arr[i]=sc.nextInt();
			
			
		
		
	
		for(int i = 0;i<arr.length-1;i++) {
		   if(arr[i]==arr[i+1]){
		       flag = 0;
		   }
		   else if(arr[i]!=arr[i+1] && flag==0){
		       count=count+2;
		       flag = 1;
		   }
		   
		   else {
		       count++;
		   }
		}

		res[l]=count;
		l++;
	
		
		
		
		
		
	}
	
		for(int a :res){
		   System.out.println(a);
		}
		
	
	}
}
