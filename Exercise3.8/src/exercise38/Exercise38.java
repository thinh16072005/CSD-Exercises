package exercise38;


public class Exercise38 {
    Node head, tail;
    
    Exercise38() {
        head = tail = null;
    }
    
    boolean isEmpty() {
        return head == null;
    }
    
    void addFirst(int x) {
        if (isEmpty()) {
            head = tail = new Node(null, x, null);
        } else {
            Node q = new Node(null, x, head);
            head.prev = q;
            head = q;
        }
    }
    
    void traverseBackward() {
        if (isEmpty()) {
            System.out.println("List is empty.");
        }
        else {
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " ");
                p = p.next;
            }
            System.out.println("");
        }
    }
    
    void traverseForward() {
        if (isEmpty()) {
            System.out.println("List is empty.");
        }
        else {
            Node p = tail;
            while (p != null) {
                System.out.print(p.data + " ");
                p = p.prev;
            }
            System.out.println("");
        }
    }
    void middleElement() {
        if (isEmpty()) {
            System.err.println("List is empty!");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element: " + slow.data);
    }

        public static void main(String[] args) {
        Exercise38 ex = new Exercise38();
        ex.addFirst(2);
        ex.addFirst(5);
        ex.addFirst(10);
        ex.addFirst(7);
        ex.addFirst(0);
        ex.addFirst(11);
        
        ex.traverseForward();
        
        ex.middleElement();
    }
    
}
