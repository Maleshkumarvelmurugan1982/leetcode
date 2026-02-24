class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
                if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int a=0;
        int b=1;
        int c=a+b;
        for(int i=3;i<=n+1;i++){
            c=a+b;
                        a=b;
            b=c;
        }
        return c;
        
    }
}