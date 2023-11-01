
import java.util.Arrays;
class FibonacciMemoization {
    static int count = 0;
    static int fun(int memo[], int n){
        count++;
        if(n <= 2) return 1;
        if(memo[n] != -1){
            return memo[n];
        }
        memo[n] = fun(memo, n-1)+fun(memo, n-2);
        return memo[n];
    }
    public static void main(String[] args) {
        int memo[] = new int[10];
        Arrays.fill(memo, -1);
        System.out.println(fun(memo, 6));
        System.out.print(count);
        
        
    }
}
