class MyHashSet {
    private HashSet<Integer> set; 
    
    public MyHashSet() {
        set = new HashSet<>();
    }
    
    public void add(int key) {
        set.add(key);
    }
    
    public boolean contains(int key) {
        return set.contains(key);
    }
    
    public void remove(int key) {
        set.remove(key);
    }
}