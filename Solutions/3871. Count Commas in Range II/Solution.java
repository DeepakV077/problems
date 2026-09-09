import java.util.*;
class  Solution {
    public long countCommas(long n){
        long ans=0;
        for(long i=1000;i<=n;){
            ans+=n-i+1;
            if (i > n / 1000) {
                break;
            }
            i*=1000;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Value:");
        long n=s.nextLong();
        Solution sol = new Solution();
        long result=sol.countCommas(n);
        System.out.print(result);
        s.close();
    }
    
}