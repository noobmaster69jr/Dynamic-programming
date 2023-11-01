import java.util.Arrays;
class SUPWTabulation{
    public static void main(String[] args){
        int arr[] = {3, 2, 3, 2, 3, 5, 1, 3};
        int n = arr.length;
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];
        dp[2] = arr[2];
        for(int i = 3; i < n; i++){
            dp[i] = Math.min(dp[i-1], Math.min(dp[i-2], dp[i-3]))+arr[i];
        }
        System.out.println(Arrays.toString(dp));
        System.out.print(Math.min(dp[n-1], Math.min(dp[n-2], dp[n-3])));
    }
}

/*
o/p: 
[3, 2, 3, 4, 5, 8, 5, 8]
5
*/
