package br.com.rodrigo.binarysearchtree;

public class BinarySearchTreeMain {

    public static void main(String[] args) {

        var tree = new BinarySearchTree();

//        tree.insert(50);
//        tree.insert(30);
//        tree.insert(20);
//        tree.insert(40);
//        tree.insert(70);
//        tree.insert(60);
//        tree.insert(80);
//
//        tree.printInOrder();
//        System.out.println();
//
//        var node = tree.search(70);
//
//        tree.printInOrder(node);
//        System.out.println();
//
//        node = tree.search(30);
//
//        tree.printInOrder(node);
//        System.out.println();
//
//        System.out.println("Size: " + tree.size());
//
//        System.out.println("Height: " + tree.maxHeight());
//
//        System.out.println(tree.findTheLowersCommonAncestor(20, 40));
//
//        tree.clear();
//
//        System.out.println("Size: " + tree.size());

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.printInOrder();

        System.out.println();

        System.out.println("LCA(4, 5): " + tree.findTheLowersCommonAncestor(4,5).key);
//        System.out.println("LCA(4, 6): " + tree.findTheLowersCommonAncestor(4,6));
//        System.out.println("LCA(3, 4): " + tree.findTheLowersCommonAncestor(3,4));
//        System.out.println("LCA(2, 4): " + tree.findTheLowersCommonAncestor(2,4));
//
//        System.out.println("LCA(2, 4): " + tree.findTheLowersCommonAncestor(2,60));


    }

}
