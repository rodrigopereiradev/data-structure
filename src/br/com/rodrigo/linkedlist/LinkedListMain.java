package br.com.rodrigo.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {

        var llist = new LinkedList();

        llist.push(3);
        llist.push(5);
        llist.push(7);
        llist.push(8);
        llist.push(9);
        llist.push(10);
        llist.push(11);
        llist.push(12);
        llist.push(15);
        llist.push(16);
        llist.push(17);


        llist.print();

        llist.insertAfter(new Node(5), 6);

        llist.print();

        llist.append(10);

        llist.print();

        llist.delete(3);

        llist.print();

        llist.deleteFirst();

        llist.print();

        llist.deleteLast();

        llist.print();

        llist.deleteByPosition(1);

        llist.print();

        llist.deleteByPosition(3);

        llist.print();

        llist.deleteByPosition(0);

        llist.print();

        llist.deleteByPosition(6);

        llist.print();

        System.out.println("Tamanho: " + llist.size());

        System.out.println("Tamanho: " + llist.count());

        llist.reverse();

        llist.print();

        llist.clear();

        llist.print();

        System.out.println("Tamanho: " + llist.count());

        var merge1 = new LinkedList();
        merge1.append(-5);
        merge1.append(15);
        merge1.append(10);

        merge1.print();

        var merge2 = new LinkedList();
        merge2.append(2);
        merge2.append(3);
        merge2.append(20);

        merge2.print();

        merge1.merge(merge2);

        merge1.print();

        System.out.println();

        RandomNode randomNode = null;
        RandomLinkedList randomLinkedList = new RandomLinkedList();

        var node1 = new RandomNode(1);
        var node2 = new RandomNode(2);
        var node3 = new RandomNode(3);
        var node4 = new RandomNode(4);

        randomNode = node1;
        randomNode.next = node2;
        randomNode.next.next = node3;
        randomNode.next.next.next = node4;

        randomNode.random = node4;
        randomNode.next.random = node1;
        randomNode.next.next.random = null;
        randomNode.next.next.next.random = node2;

        randomLinkedList.head = node1;
        var clone = randomLinkedList.cloneLinkedList();

        randomLinkedList.printList(randomLinkedList.head);
        System.out.println();
        randomLinkedList.printList(clone);

    }
}
