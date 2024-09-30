/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise316;

import exercise38.Node;

/**
 *
 * @author hungt
 */
public class DoublyLinkedList {
    Node head, tail;
    
    static DoublyLinkedList lista = new DoublyLinkedList();
    static DoublyLinkedList listb = new DoublyLinkedList();

    public DoublyLinkedList() {
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
    
    int size() {
        int count = 0;
        Node temp = new Node(null, 0 , head);
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
        }
        
    boolean equals(DoublyLinkedList listb) {
        Node temp1 = this.head;
        Node temp2 = listb.head;
        int count = 0;

        if (this.isEmpty() || listb.isEmpty()) {
            System.err.println("One of the lists is empty!");
            return false;
        } else if (this.size() != listb.size()) {
            return false;
        } else {
            while (count != this.size()) {
                if (temp1.data != temp2.data) {
                    return false;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
                count++;
            }
        }
        return true;

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
    
    
    public static void main(String[] args) {
        
        lista.addFirst(2);
        lista.addFirst(6);
        lista.addFirst(7);
        lista.addFirst(8);
        lista.addFirst(9);
        lista.addFirst(15);
        
        listb.addFirst(2);
        listb.addFirst(6);
        listb.addFirst(7);
        listb.addFirst(8);
        listb.addFirst(9);
        // listb.addFirst(15);
        
        lista.traverseForward();
        lista.traverseBackward();
        System.out.println("List A size: " + lista.size());
        
        System.out.println("List A = List B: " + lista.equals(listb));
        
    }
}
