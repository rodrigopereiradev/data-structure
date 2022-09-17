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
    }
}