class MinStack {
    MinStack top;
    MinStack next;
    int data;
    public MinStack() {
        top= null;
    }
    public MinStack(int d){
        this.data=d;
    }
    public void push(int val) {
        MinStack temp=  new MinStack(val);
        temp.next = top;
        top = temp;
    }
    
    public void pop() {
        top = top.next;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        int min = top.data;
        MinStack temp = top;
        while(temp!=null){
            if(temp.data<min){
                min=temp.data;
            }
            temp= temp.next;
        }
        return min;
    }
}