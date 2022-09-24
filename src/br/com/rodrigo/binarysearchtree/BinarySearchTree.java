package br.com.rodrigo.binarysearchtree;

public class BinarySearchTree {

    Node root;

    public void insert(int key) {
        this.root  = this.insert(this.root, key);
    }

    private Node insert(Node node, int key) {
        var newNode = new Node(key);

        if (node == null)  {
            return newNode;
        }

        if (key < node.key)
            node.left = insert(node.left, key);

        if (key > node.key)
            node.right = insert(node.right, key);

        return node;

    }

    public Node search(int key) {
        return search(this.root, key);
    }

    private Node search(Node node, int key) {

        if (node == null || node.key == key)
            return node;

        if (node.key < key)
            return search(root.right, key);

        return search(node.left, key);
    }


    public void printInOrder() {
        if (this.root == null)
            return;

        this.printInOrder(this.root);
    }

    public void printInOrder(Node node) {

        if (node.left != null)
            printInOrder(node.left);

        System.out.print(node.key + " ");

        if (node.right != null)
            printInOrder(node.right);
    }
}
