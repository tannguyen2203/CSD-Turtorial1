/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

/**
 *
 * @author duyta
 */
public class SLL<T> {

    protected SLLNode<T> head, tail;

    //Initialize an empty list
    public SLL() {
        head = tail = null;
    }

    // Getter Setter
    public SLLNode<T> getHead() {
        return head;
    }

    public void setHead(SLLNode<T> head) {
        this.head = head;
    }

    public SLLNode<T> getTail() {
        return tail;
    }

    public void setTail(SLLNode<T> tail) {
        this.tail = tail;
    }

    // check whether the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // add an element to the head of the list
    public void addToHead(T el) {
        head = new SLLNode<T>(el, head);
        if (tail == null) {
            tail = head;
        }
    }

    //Add an element to the end of the list
    public void addToTail(T el) {
        if (!isEmpty()) {
            tail.next = new SLLNode<T>(el);
            tail = tail.next;
        } else {
            head = tail = new SLLNode<T>(el);
        }
    }

    //Delete the head and return the deleted info
    public T deleteFromHead() {
        if (isEmpty()) {
            return null;
        }
        T el = head.info;
        if (head == tail) {
            head = tail = null; //if only one node on the List;
        } else {
            head = head.next;
        }
        return el;
    }

    //Delete the tail and return the deleted info
    public T deleteFromTail() {
        if (isEmpty()) {
            return null;
        }
        T el = tail.info;
        if (head == tail) {
            head = tail = null; // if only one node in the list;
        } else {                // if more than one node in the list;
            SLLNode<T> tmp;     // find the predecessor of tail;
            for (tmp = head; tmp.next != tail; tmp = tmp.next);
            tail = tmp;         //the predecessor of tail becomes tail;
            tail.next = null;
        }
        return el;
    }

    //Delete the node containing info = el
    public void delete(T el) {
        if (!isEmpty()) {
            if (head == tail && el.equals(head.info)) {// if only one
                head = tail = null;             //node on the list;
            } else if (el.equals(head.info)) {//if more than one node on the list;
                head = head.next;    // and el is in the head node;
            } else {                 //if more than one node in the list
                SLLNode<T> pred, tmp;// and el is in a nonhead node;
                for (pred = head, tmp = head.next;
                        tmp != null && !(tmp.info.equals(el));
                        pred = pred.next, tmp = tmp.next);
                if (tmp != null) { //if el was found;
                    pred.next = tmp.next;
                    if (tmp == tail) { // if el is in the last node;
                        tail = pred;
                    }
                }
            }
        }
    }

    // Print the list
    public void printAll() {
        for (SLLNode<T> tmp = head; tmp != null; tmp = tmp.next) {
            System.out.println(tmp.info);
        }
    }

    //Checking whether the el element is in the list
    public boolean isInList(T el) {
        SLLNode<T> tmp;
        for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next);
        return tmp != null;
    }
}
