


public class Reversevowel {
	public static  void main(String[] args) {
		
		String s  = "hello";
	
		System.out.print(Reversevowels(s));
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static String Reversevowels(String s) {
		
		int len  = s.length();
		char []r = new char[len];
		int start = 0;
		int end = len - 1;
		while(start<=end) {
			
			while(start<len && !isVowel(s.charAt(start)))
			{
				
				r[start] = s.charAt(start);
				++start;
			}
			
			
			while(end>-1 && !isVowel(s.charAt(end))) {
				r[end] = s.charAt(end);
				--end;
				
			}
			
			if(start<=end) {
				r[start] = s.charAt(end);
				r[end] = s.charAt(start);
				++start;
				--end;
				
				
				
			}
			
			
        	
        }
		
		
		return String.valueOf(r);
        
		
	}

	private static boolean isVowel(char ab) {
		if(ab =='a' || ab=='e' ||ab =='o'||ab=='i' ||ab =='u') {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}