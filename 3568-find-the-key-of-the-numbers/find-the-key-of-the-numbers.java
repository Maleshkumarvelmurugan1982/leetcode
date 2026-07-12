class Solution{
    public int generateKey(int num1, int num2, int num3){
        int ans = 0, x = 1;
        while(num1 > 0 || num2 > 0 || num3 > 0){
            int a = Math.min((num1 % 10),(num2 % 10));
            a = Math.min((num3 % 10),a);
            ans+=x*a;
            x*=10;
            num1/=10;
            num2/=10;
            num3/=10;
        }
        return ans;
    }
}