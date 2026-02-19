class MyStack {
     private Queue<Integer> inputQueue;
     private Queue<Integer> outputQueue;
    public MyStack() {
        inputQueue=new LinkedList<>();
        outputQueue=new LinkedList<>();

        
    }
    
    public void push(int x) {
        outputQueue.add(x);
        while(!inputQueue.isEmpty()){
            outputQueue.add(inputQueue.poll());
        }
        Queue<Integer> temp =inputQueue;
        inputQueue=outputQueue;
        outputQueue=temp;

        
    }
    
    public int pop() {
        return inputQueue.poll();
        
    }
    
    public int top() {

        return inputQueue.peek();
        
    }
    
    public boolean empty() {
        return inputQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */