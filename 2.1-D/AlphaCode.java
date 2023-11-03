import java.util.*;

/* Spoj - alpha code */

class AlphaCode {
    
    static int decrypt(String s, int index, int[] memo){
        if(index == s.length()){
            return 1;
        }
        if(memo[index] != -1){
            return memo[index];
        }
        int ans = 0;
        if(s.charAt(index) >= '1' && s.charAt(index) <= '9'){
            ans += decrypt(s, index+1, memo);
        }
        if(index+1 <= s.length() && s.charAt(index) == '1'){
            ans += decrypt(s, index+2, memo);
        }
        if(index+1 <= s.length() && s.charAt(index) == '2' && s.charAt(index+1) <= '6' ){
            ans += decrypt(s, index+2, memo);
        }
        return memo[index] = ans;
    }
    public static void main(String[] args) {
        String s = "25114";
        int  memo[] = new int[s.length()];
        Arrays.fill(memo, -1);
        int res = decrypt(s, 0, memo);
        System.out.print(res);
        
        
    }
}
