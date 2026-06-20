class Solution {
    public int commonFactors(int a, int b) {
        int hcf=gcd(a,b);
        int count=0;
        for(int i=1;i*i<=hcf;i++){
            if(hcf%i==0){
                count++;
                if(i*i!=hcf){
                    count++;
                }
            }
        }
        return count;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}