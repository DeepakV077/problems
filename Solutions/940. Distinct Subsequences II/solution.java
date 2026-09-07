class solution{
    public int distinctSubseqII(String s){
        int mod=1_000_000_007;
        int[] end=new int[26];
        int total=0;
        for(char c:s.toCharArray()){
            int index=c-'a';
            int oldtotal=total;
            int sub=(oldtotal+1-end[index]+mod)%mod;
            total=(oldtotal+sub)%mod;
            end[index]=(end[index]+sub)%mod;
        }
        return total;
    }

    public static void main(String[] args) {
        solution sol = new solution();
        String s = "abc";
        int result = sol.distinctSubseqII(s);
        System.out.println("The number of distinct subsequences is: " + result);
    }
}