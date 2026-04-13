class MyHashSet {
    private static final int SIZE = 1000;  
    private LinkedList<Integer>[] buckets; 
    
    public MyHashSet() {
        buckets = new LinkedList[SIZE];
    }
    
   
    private int hash(int key) {
        return key % SIZE;
    }
    
    public void add(int key) {
        int index = hash(key);
        
      
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        

        if (buckets[index].contains(key)) {
            return;  
        }
        buckets[index].add(key);
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        if (buckets[index] == null) {
            return false;
        }
        
        return buckets[index].contains(key);
    }
    
    public void remove(int key) {
        int index = hash(key);
        
        if (buckets[index] == null) {
            return;
        }
        buckets[index].remove(Integer.valueOf(key));
    }
}