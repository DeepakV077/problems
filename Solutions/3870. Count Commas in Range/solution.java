import java.util.*;
class Solution{
    public int countCommas(int n){
        return Math.max(0,n-999);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
                System.out.print("Enter the Value:");

        int n=s.nextInt();
        Solution sol = new Solution();
        int result=sol.countCommas(n);
        System.out.print(result);

    }
}