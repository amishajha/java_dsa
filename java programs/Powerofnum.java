public class Powerofnum {
    public static void main(String[] args) {
        class Solution{
            long m= 1000000007;
            long power(long n,int r){
                if(r==0) return 1;
                long ans=power(n,r/2);
                ans=(ans*ans)%m;
                if(r%2==0) return ans;
                return ans*n%m;
            }
        }
    }
}
