class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[]arr=new int[n];
        k%=n;
        if(k>0){
            for(int i=0;i<n;i++){
                arr[i]=helper(code,k,i+1);
            }
        }else if(k<0){
            code=revArr(code);
            for(int i=0;i<n;i++){
                arr[i]=helper(code,Math.abs(k),i+1);
            }
        }else{
            return arr;
        }
        return k<0?revArr(arr):arr;
    }
    public int helper(int[]code,int limit,int start){
        int sum=0,count=0,n=code.length; 
        while(count<limit){
            start%=n;
            sum+=code[start++];
            count++;
        }
        return sum;
    }
    public int[]revArr(int[]code){
        int start=0,end=code.length-1;
        while(start<end){
            int temp=code[start];
            code[start++]=code[end];
            code[end--]=temp;
        }
        return code;
    }
}