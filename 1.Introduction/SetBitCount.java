class SetBitCount{
    static int counter(int i){
        int count = 0;
        while( i > 0){
            if((i&1) != 0) count++;
            i = i >> 1;
        }
        return count;
    }
    
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            System.out.println(i+" count is  "+ counter(i));
        }
    }
}
