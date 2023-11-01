import java.util.Arrays;
class SetBitCountMemoize{  // O(N)

    public static int Counter(int i, int dp[]){
        if(i == 0){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        return dp[i] = Counter(i/2, dp) + (i%2);
    }
    public static void main(String[] args){
        int dp[] = new int[11];
        Arrays.fill(dp, -1);
        for(int i = 1; i <= 10; i++){
            System.out.print(Counter(i, dp ) + " ");
        }
    }
}
