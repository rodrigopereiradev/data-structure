package br.com.rodrigo.binarytree;

public class BinaryTreeMain {

    public static void main(String[] args) {

        var tree = new BinaryTree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);
        tree.insert(14);
        tree.insert(15);

        tree.printInOrder();
        System.out.println();

        tree.delete(11);

        tree.printInOrder();
        System.out.println();

        tree.delete(5);
        tree.printInOrder();
        System.out.println();


    }

}
