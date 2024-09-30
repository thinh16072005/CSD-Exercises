/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercise335;
import exercise38.Node;
/**
 *
 * @author hungt
 */
public class DoublyLinkedList {
    // Attributes of DoublyLinkedList
    Node head, tail;
    
    boolean isEmpty() {
        return head == null;
    }
    
    void addFirst(int x) {
       if (isEmpty()) {
           head = tail = new Node(null, x, null);
       }
       else {
           Node newNode = new Node(null, x, head);
           head.prev = newNode;
           head = newNode;   
    }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DoublyLinkedList newList = new DoublyLinkedList();
        
        if (isEmpty()) {
            return newList;
        }
        
        newList.head = new Node(null, head.data, null);
        Node current = head.next;
        Node newCurrent = newList.head;
        
        // Check if the list has only one element, if not, return the tail = return the head itself:
        while (current != null) {
            Node newNode = new Node(newCurrent, current.data, null);
            newCurrent.next = newNode;
            newCurrent = newNode;
            current = current.next;
        }
        
        newList.tail = newCurrent;
        return newList;
    }
        
        
    
    void traverseForward() {
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

    public static void main(String[] args) throws CloneNotSupportedException  {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.addFirst(2);
        dl.addFirst(4);
        dl.addFirst(5);
        dl.addFirst(10);
        
        dl.traverseForward();
        dl.clone();
        dl.traverseForward();
    }
    
}

