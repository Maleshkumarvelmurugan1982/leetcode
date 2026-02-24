class Solution {
    public int addDigits(int n) {
                        while(n>9){
            int rev=0;
            while(n>0){
                int rem=n%10;
                rev=rev+rem;
                n=n/10;
            }
            n=rev;
        }
        return n;
    }
}