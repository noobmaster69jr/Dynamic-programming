/* No of ways to fill an array with 0s and 1s such that there are no consecutive 1s */

class NonConsecutiveOnes {
    
    static int noOfWays(int idx, int n, boolean previousOne){
        if(idx == n+1){
            return 1;
        }
        int ans = 0;
        //we place either 0 here
        ans += noOfWays(idx+1, n, false);
        
        //or we place 1 here
        if(previousOne == false){
            ans += noOfWays(idx+1, n, true);
        }
        return ans;
        // basically returns the count of [i....n]
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
             System.out.print(noOfWays(1, i, false)+" ");
        }
       
    }
}
