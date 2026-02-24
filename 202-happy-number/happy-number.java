class Solution {
    public boolean isHappy(int n) {
        while(n>9){
            int rev=0;
            while(n>0){
                int rem=n%10;
                rev=rev+rem*rem;
                n=n/10;
            }
            n=rev;
        }
        if(n==1 || n==7){
            return true;
        }
     return false;   
    }
}