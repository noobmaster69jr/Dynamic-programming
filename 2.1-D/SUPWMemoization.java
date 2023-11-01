import java.util.Arrays;
class SUPWMemoization{
    static int minMinutes(int idx , int arr[], int memo[]){
      if(idx == 0 || idx == 1 || idx == 2){
          memo[idx] = arr[idx];
          return memo[idx];
      }
      if(memo[idx] != -1){
          return memo[idx];
      }
      return memo[idx] = Math.min(minMinutes(idx-1, arr, memo), Math.min(minMinutes(idx-2, arr, memo), minMinutes(idx-3, arr, memo))) + arr[idx];
    }
    
    public static void main(String[] args){
      int arr[] = {3, 2, 3, 2, 3, 5, 1, 3};
      int n = arr.length;
      int memo[] = new int[n];
      Arrays.fill(memo, -1);
      int res = minMinutes(n-1,arr, memo);
      System.out.println(Arrays.toString(memo)+" ");
      System.out.print(Math.min(memo[n-1], Math.min(memo[n-2], memo[n-3])));
    }
}

/*
O/p:
[3, 2, 3, 4, 5, 8, 5, 8] 
5
*/

 
