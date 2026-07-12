class Solution {
    public int pivotInteger(int n) {
        double sumof1tox = Math.sqrt(n*(n+1)/2);
        if((sumof1tox - (int)sumof1tox) == 0){
            return (int)sumof1tox;
        }
        else{
            return -1;
        }
    }
}