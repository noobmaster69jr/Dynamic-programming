import java.util.Arrays;
class FibonacciTabulation {
    //bottom up approach
    static void fun(int[] tab){
        tab[1] = 1;
        tab[2] = 1;
        for(int i = 3; i <= 10; i++){
            tab[i] = tab[i-1]+tab[i-2];    
        }
    }
    public static void main(String[] args) {
        int tab[] = new int[11];
        fun(tab);
        for(int i : tab) System.out.print(i+" ");
    }
}
