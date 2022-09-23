package br.com.rodrigo.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    public void insert(int key) {

        var newNode = new Node(key);
        var temp = this.root;

        Queue<Node> queue = new LinkedList<>();

        if (this.root == null) {
            this.root = newNode;
            return;
        }

        queue.add(temp);

        while (!queue.isEmpty()) {

            temp = queue.peek();
            queue.remove();

            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                queue.add(temp.right);
            }

        }

    }

    public void delete(int key) {

        Queue<Node> queue = new LinkedList<>();
        Node temp = null, KeyNode = null;

        if (this.root == null)
            return;

        if (this.root.left == null && this.root.right == null) {
            if (this.root.key == key) {
                this.root = null;
            } else {
                return;
            }
        }

        queue.add(this.root);

        while (!queue.isEmpty()) {

            temp = queue.peek();
            queue.remove();

            if (temp.key == key)
                KeyNode = temp;

            if (temp.left != null)
                queue.add(temp.left);

            if (temp.right != null)
                queue.add(temp.right);

        }

        if (KeyNode != null) {
            int tempKey = temp.key;
            deleteDeeperst(temp);
            KeyNode.key = tempKey;

        }

    }

    private void deleteDeeperst(Node delNode) {
        Node temp = null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);

        while (!queue.isEmpty()) {

            temp = queue.peek();
            queue.remove();

            if(temp == delNode) {
                temp = null;
                return;
            }

            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else {
                    queue.add(temp.right);
                }
            }
        }

        if (temp.left != null) {
            if (temp.left == delNode) {
                temp.left = null;
            } else {
                queue.add(temp.left);
            }
        }

    }

    public int size() {
        return size(this.root);
    }

    private int size(Node node) {
        if (node == null)
            return 0;

        return size(node.left) + 1 + size(node.right);
    }

    public int height() {
        return maxDepth(this.root);
    }

    public int maxDepth(Node node) {
        if (node == null)
            return -1;

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }

    public void printInOrder() {
        if (this.root == null)
            return;

        this.printInOrder(this.root);
    }

    private void printInOrder(Node node) {

        if (node.left != null)
            printInOrder(node.left);

        System.out.print(node.key + " ");

       if (node.right != null)
           printInOrder(node.right);

    }
}
