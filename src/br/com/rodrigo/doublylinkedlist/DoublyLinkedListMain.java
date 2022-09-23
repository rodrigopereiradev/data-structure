package br.com.rodrigo.doublylinkedlist;

import javax.swing.*;

public class DoublyLinkedListMain {

    public static void main(String[] args) {

        var list = new DoublyLinkedList();

        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);
        list.append(10);
        list.append(11);
        list.append(13);

        list.print();

        list.push(4);

        list.print();

        list.remove(4);

        list.print();

        list.remove(9);

        list.print();

        var node = list.findByData(8);

        if (node != null)
            System.out.println(node.data);

        System.out.println(list.size());

        list.push(3);
        list.push(2);
        list.push(1);

        list.print();

        list.removeFirst();

        list.print();

        list.removeLast();

        list.print();

        list.pushAt(8, 13);

        list.print();

        list.pushAt(8, 12);

        list.print();

        list.pushAt(0, 1);

        list.print();

        list.reverse();

        list.print();

    }

}
