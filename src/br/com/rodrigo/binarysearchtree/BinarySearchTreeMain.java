package br.com.rodrigo.binarysearchtree;

public class BinarySearchTreeMain {

    public static void main(String[] args) {

        var tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.printInOrder();
        System.out.println();

        var node = tree.search(70);

        tree.printInOrder(node);
        System.out.println();

        node = tree.search(30);

        tree.printInOrder(node);
        System.out.println();

        System.out.println(tree.maxHeight());


    }

}
