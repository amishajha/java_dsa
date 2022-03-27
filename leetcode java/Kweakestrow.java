import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Kweakestrow {
	
	public static void main(String [] args) {
		
		int [][]mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
	    int [] ls = new int[3];
		ls = kWeak(mat,3);
//		for(int i = 0;i<ls.length;i++) {
//			System.out.println(ls[i]);
//		}
		
		
		System.out.println(Arrays.toString(ls));
		
		
		
	}

	private static int[] kWeak(int[][] mat, int k) {
		int rows = mat.length;
		int cols= mat[0].length;
		int arr[] = new int[rows];
		for(int i = 0;i<rows;i++) {
			int count1 = 0;
			for(int j = 0;j<cols;j++) {
				if(mat[i][j]==1) {
					count1++;
				}
			}
			
			arr[i]=count1;
		}
		
		
		int ans[] =  new int[k];
		for(int i = 0;i<k;i++  ) {
			
			int min = Integer.MAX_VALUE;
			int minindex = 0;
			for(int j = 0;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minindex=j;
				}
			}
			
			ans[i]=minindex;
			arr[minindex]=Integer.MAX_VALUE;
			
			
			
		}
		
		return ans;
	}
	

	
	
	
	
	
	
	
}