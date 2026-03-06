class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0) return false;
        int root=(int) Math.sqrt(num);
        return (root*root==num);
        
    }
}