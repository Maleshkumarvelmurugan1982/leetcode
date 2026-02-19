import java.util.HashMap;
import java.util.Map;
class Solution{
    public int subarraySum(int [] nums,int k){
        Map<Integer,Integer>PrefixMap=new HashMap<>();
        PrefixMap.put(0,1);
        int prefixSum=0;
        int count=0;
        for(int num:nums){
            prefixSum+=num;
            if(PrefixMap.containsKey(prefixSum-k)){
                count+=PrefixMap.get(prefixSum-k);
            }
            PrefixMap.put(prefixSum,PrefixMap.getOrDefault(prefixSum,0)+1);
        }
        return count;

    }

}