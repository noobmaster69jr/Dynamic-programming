
import java.util.Arrays;
class Fibonacci {
    static int count = 0;
    static int fun( int n){
        count++;
        if(n <= 2) return 1;
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fun(6));
        System.out.print(count);
        
    }
}
