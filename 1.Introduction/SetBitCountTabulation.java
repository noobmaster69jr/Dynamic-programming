class SetBitCountTabulation{  // O(N)
    public static void main(String[] args){
        int dp[] = new int[11];
        dp[0] = 0;
        for(int i = 1; i <= 10; i++){
            dp[i] = dp[i/2] + (i%2);
            System.out.print(dp[i] + " ");
        }
    }
}
