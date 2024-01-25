package lo_generics;

public class MyList {

    Node head;

    public MyList() {
        this.head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addData(int data) {
        this.head = add(this.head, data);
    }

    private Node add(Node current, int data) {

        // base case
        if( current == null ){
            return new Node(data);
        } else {
            current.setNext(add(current.getNext(), data));
            return current;
        }

    }

    @Override
    public String toString() {
        return nodeToString(this.head);
    }

    public String nodeToString(Node current) {
        if(current == null){
            return "";
        }
        else {
            return current + " : " + nodeToString(current.getNext());
        }
    }

    public int dequeue(){
        // removes and returns the node at head of the list

        return 0;
    }

    public boolean search(int dataToSearch) {
        // return the status of the value to search from the list

        return false;
    }

    public void remove(int dataToRemove) {
        // remove the node which contains the data to remove
    }
}
