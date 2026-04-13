class MyHashMap {
    private static final int SIZE = 1000;  
    private LinkedList<Node>[] buckets; 
    
    private class Node {
        int key;
        int value;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    public MyHashMap() {
        buckets = new LinkedList[SIZE];
    }
    
    private int hash(int key) {
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        
        for (Node node : buckets[index]) {
            if (node.key == key) {
                node.value = value; 
                return;
            }
        }
        
        buckets[index].add(new Node(key, value));
    }
    
    public int get(int key) {
        int index = hash(key);
        
        if (buckets[index] == null) {
            return -1;
        }
        
        for (Node node : buckets[index]) {
            if (node.key == key) {
                return node.value;
            }
        }
        
        return -1;  
    }
    
    public void remove(int key) {
        int index = hash(key);
        
        if (buckets[index] == null) {
            return;
        }
        
        for (Node node : buckets[index]) {
            if (node.key == key) {
                buckets[index].remove(node);
                return;
            }
        }
    }  
}