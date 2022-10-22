package br.com.rodrigo.linkedlist;

public class LinkedList {
    Node head;

    public void push(int data) {
        var newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node previous, int data) {

        if (previous == null)
            throw new IllegalArgumentException("The previous Node can not be null");

        var temp = head;

        while (temp.data != previous.data)
            temp = temp.next;

        var newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void append(int data) {

        var newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }

        Node last = head;

        while (last.next != null )
            last = last.next;

        last.next = newNode;
    }

    public void delete(int data) {

        if (this.head != null && this.head.data == data) {
            this.head = this.head.next;
            return;
        }

        Node temp = this.head;
        Node previous = null;

        if (temp == null) return;

        while (temp.data != data) {
            previous = temp;
            temp = temp.next;
        }

        if (previous != null)
            previous.next = temp.next;

    }

    public void deleteFirst() {

        if (this.head == null) return;

        this.head = this.head.next;

    }

    public void deleteLast() {
        if (this.head == null)
            return;

        if (this.head.next == null) {
            this.head = null;
            return;
        }

        Node temp = this.head;
        Node previous = null;

        while (temp.next != null) {
            previous = temp;
            temp = temp.next;
        }

        if (previous != null)
            previous.next = null;
    }

    public void deleteByPosition(int position) {

        if (this.head == null)
            return;

        if (position == 0) {
            this.head = this.head.next;
            return;
        }

        int count = 0;
        Node temp = this.head;
        Node previous = null;

        while (count != position) {
            previous = temp;
            temp = temp.next;
            count++;
        }

        previous.next = temp.next;

    }

    public int size() {

        int count = 0;
        Node node = this.head;

        while (node != null) {
            count++;
            node = node.next;
        }

        return count;
    }

    public int count() {
        return countRec(this.head);
    }

    private int countRec(Node node) {

        if (node == null)
            return 0;

        return 1 + countRec(node.next);
    }

    public void reverse() {
        Node previous = null;
        Node current = this.head;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        this.head = previous;
    }

    public void merge(LinkedList otherLinked) {

        if (otherLinked == null)
            return;

        var otherHead = otherLinked.head;

        System.out.println(Integer.MAX_VALUE);

        var temp = new Node(0);

        var tail = temp;


        while (true) {

            if (this.head == null) {
                tail.next = otherHead;
                break;
            }

            if (otherHead == null) {
                tail.next = this.head;
                break;
            }

            if (this.head.data <= otherHead.data) {
                tail.next = this.head;
                this.head = this.head.next;
            } else {
                tail.next = otherHead;
                otherHead = otherHead.next;
            }

            tail = tail.next;
        }

        this.head = temp.next;

    }

    public void clear() {
        this.head = null;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
