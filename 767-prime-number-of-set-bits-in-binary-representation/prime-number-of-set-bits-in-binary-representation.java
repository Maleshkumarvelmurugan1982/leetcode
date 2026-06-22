class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
          for (int i = left; i <= right; i++) {
    if (isprime(Integer.bitCount(i))) {
        count++;
    }
}
        return count;
    }
    static boolean isprime(int n){
        int start=2;
        if(n<=1){
            return false;
        }
        for(int i=start;i*i<=n;i++){
            if((n%i)==0){
                return false;
            }
        }
        return true;
    }
}