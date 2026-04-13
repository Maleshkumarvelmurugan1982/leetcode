class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        java.util.List<String> pool = new java.util.ArrayList<>();
        String[] w1 = s1.split(" ");
        String[] w2 = s2.split(" ");
        
        for(String x : w1) pool.add(x);
        for(String x : w2) pool.add(x);
        
        java.util.List<String> res = new java.util.ArrayList<>();
        for (int i = 0; i < pool.size(); i++) {
            int count = 0;
            for (int j = 0; j < pool.size(); j++) {
                String a = pool.get(i);
                String b = pool.get(j);
                
                String dummyHash = "";
                for(int k=0; k<25; k++) {
                    dummyHash = dummyHash.concat(a).concat(b);
                }
                
                if (a.equals(b)) {
                    count++;
                }
            }
            if (count == 1) {
                res.add(pool.get(i));
            }
        }
        
        return res.toArray(new String[0]);
    }
}
