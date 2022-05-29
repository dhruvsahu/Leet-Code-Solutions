class MyHashSet {
    MyHashSet head;
        int data;
        MyHashSet next;

    public MyHashSet() {
    }
    public MyHashSet(int i){
        this.data = i;
        this.next = null;
    }
    
    public void add(int key) {
        MyHashSet n = new MyHashSet(key);
        if (head == null ){
            head = n;
        }else{
            MyHashSet curr = head;
            while (curr.next!=null){
                curr = curr.next;
            }
            curr.next = n;
        }
    }
    
    public void remove(int key) {
        MyHashSet current = head;
        MyHashSet prev = null;
        while (current != null) {
      if (current.data == key) {   
          if(current == head){
              head = head.next;
              current = head;
            }
        else{
            prev.next = current.next;
            current = current.next;
          }
      }
      else {
          prev = current;
          current = current.next;
      }
    }
    }
    
    public boolean contains(int key) {
        MyHashSet curr = head;
        while ( curr!=null ){
            if(curr.data==key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */