class Solution {
    public long maxRatings(int[][] units) {
        int m=units.length;
        int n=units[0].length;

        if(m==1){
            long minr=units[0][0];
            for(int j=1;j<n;j++){
                if(units[0][j]<minr)minr=units[0][j];
            }
            return minr;
        }

        if(n==1){
            long sum=0;
            for(int i=0;i<m;i++)sum+=units[i][0];
            return sum;
        }

        long gmin=Long.MAX_VALUE;
        long summin=0;
        long min=Long.MAX_VALUE;

        for(int i=0;i<m;i++){
            long fmin=Long.MAX_VALUE;
            long smin=Long.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(units[i][j]<fmin){
                    smin=fmin;
                    fmin=units[i][j];
                    
                }
                else if(units[i][j]<smin)smin=units[i][j];
            }

            if(fmin<gmin)gmin=fmin;

            summin+=smin;
            if(smin<min)min=smin;
        }
    
    return summin-min+gmin;
    }
}