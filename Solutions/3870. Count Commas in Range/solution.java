import java.util.*;
class solution{
    public int distinct(int n){
        return Math.max(0,n-999);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
                System.out.print("Enter the Value:");

        int n=s.nextInt();
        solution sol = new solution();
        int result=sol.distinct(n);
        System.out.print(result);
    }
}