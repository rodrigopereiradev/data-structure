package br.com.rodrigo.doublylinkedlist;

public class DoublyLinkedList {
    DoublyNode head;

    public void push(int data) {
        var newNode = new DoublyNode(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }

        newNode.next = this.head;
        this.head = newNode;

    }

    public void append(int data) {

        if(this.head == null) {
            this.push(data);
            return;
        }

        var newNode = new DoublyNode(data);
        var temp = this.head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.previous = temp;
    }

    public void pushAt(int position, int data) {

        if (this.head == null)
            throw new IllegalArgumentException("The list is empty and the given position does not exists.");

        if (position == 0) {
            this.push(data);
            return;
        }

        var newNode = new DoublyNode(data);

        var temp = this.head;
        int count = 1;

        while (count != position) {
            count++;
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.previous = temp;
        temp.next = newNode;

    }

    public void pushAfter(DoublyNode previous, int data) {

        if (previous == null)
            throw new IllegalArgumentException("The previous node can not be null.");

        var newNode = new DoublyNode(data);

        newNode.next = previous.next;
        previous.next = newNode;
        newNode.previous = previous;

        if (newNode.next != null)
            newNode.next.previous = newNode;

    }

    public void remove(int data) {

        if (this.head == null)
            return;

        if (this.head.data == data) {
            this.head = this.head.next;
            return;
        }


        var temp = this.head;

        while (temp.data != data)
            temp = temp.next;

        temp.next.previous = temp.previous;
        temp.previous.next = temp.next;

    }

    public void removeFirst() {
        if (this.head == null)
            return;

        this.head = this.head.next;
        this.head.previous = null;
    }

    public void removeLast() {
        if (this.head == null)
            return;

        DoublyNode temp = this.head;

        while (temp.next != null)
            temp = temp.next;

        temp.previous.next = null;

    }

    public DoublyNode findByData(int data) {

        if (this.head == null)
            return null;

        DoublyNode node = this.head;

        while (node.data != data)
            node = node.next;

        return node;

    }

    public void reverse() {
        DoublyNode temp = null;
        DoublyNode current = this.head;

        while (current != null) {
            temp= current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }

        if (temp != null)
            this.head = temp;

    }

    public int size() {

        if (this.head == null)
            return 0;

        DoublyNode temp = this.head;
        int count = 0;

        do {
            count++;
            temp = temp.next;
        } while (temp != null);

        return count;
    }

    public void print() {
        var node = this.head;

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

        System.out.println();
    }

}
