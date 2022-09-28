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

    public int size() {
        return size(this.root);
    }

    private int size(Node node) {

        if (node == null)
            return 0;

        return size(node.left) + 1 + size(node.right);
    }

    public int maxHeight() {
        return maxHeight(this.root);
    }

    private int maxHeight(Node node) {

        if (node == null)
            return -1;

        var leftDepth = maxHeight(node.left);
        var rightDepth = maxHeight(node.right);

        return leftDepth < rightDepth ? rightDepth + 1 : leftDepth + 1;
    }

    public Node findTheLowersCommonAncestor(int val1, int val2) {
        var lca = new LowestCommonAncestor();
        return lca.findTheLowersCommonAncestorWithOneTraversal(this.root, val1, val2);
    }

    public void clear() {
        this.root = null;
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
