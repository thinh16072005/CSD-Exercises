package exercise38;

public class Node {
    public Node prev, next;
    public int data;
    
    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
