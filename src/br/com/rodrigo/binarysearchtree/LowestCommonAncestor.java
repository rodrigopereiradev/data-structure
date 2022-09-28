package br.com.rodrigo.binarysearchtree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class LowestCommonAncestor {

    List<Integer> path1;
    List<Integer> path2;
    boolean hasVal1;
    boolean hasVal2;

    LowestCommonAncestor() {
        this.path1 = new ArrayList<>();
        this.path2 = new ArrayList<>();
    }

    public int findTheLowersCommonAncestorWithMoreThanOneTraversals(Node node, int val1, int val2) {
        path1.clear();
        path2.clear();
        return findTheLowersCommonAncestorInternal(node, val1, val2);
    }

    private int findTheLowersCommonAncestorInternal(Node root, int n1, int n2) {

        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
            System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
            System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing");
            return -1;
        }

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {

            // System.out.println(path1.get(i) + " " + path2.get(i));
            if (!path1.get(i).equals(path2.get(i)))
                break;
        }

        return path1.get(i-1);
    }

    private boolean findPath(Node node, int val, List<Integer> path) {

        var t = new TreeMap<String, String>();

        if (node == null)
            return false;

        path.add(node.key);

        if (node.key == val)
            return true;

        if (findPath(node.left, val, path))
            return true;

        if (findPath(node.right, val, path))
            return true;

        path.remove(path.size() - 1);

        return false;
    }

    public Node findTheLowersCommonAncestorWithOneTraversal(Node node, int val1, int val2) {

        if (node == null)
            return null;

        if (node.key == val1 || node.key == val2)
            return node;

        var leftLowest = findTheLowersCommonAncestorWithOneTraversal(node.left, val1, val2);
        var rightLowest = findTheLowersCommonAncestorWithOneTraversal(node.right, val1, val2);

        if (leftLowest != null && rightLowest != null)
            return node;

        return leftLowest != null ? leftLowest : rightLowest;
    }

    public Node findTheLowersCommonAncestor(Node node, int val1, int val2) {
        hasVal1 = false;
        hasVal2 = false;

        var lowestNode = findTheLowersCommonAncestorUtil(node, val1, val2);

        if (hasVal1 && hasVal2)
            return lowestNode;

        return null;
    }

    public Node findTheLowersCommonAncestorUtil(Node node, int val1, int val2) {

        Node temp = null;

        if (node == null)
            return null;

        if (node.key == val1) {
            hasVal1 = true;
            temp = node;
        }

        if (node.key == val2) {
            hasVal2 = true;
            temp = node;
        }

        var leftLowest = findTheLowersCommonAncestorUtil(node.left, val1, val2);
        var rightLowest = findTheLowersCommonAncestorUtil(node.right, val1, val2);

        if (temp != null)
            return temp;

        if (leftLowest != null && rightLowest != null)
            return node;

        return leftLowest != null ? leftLowest : rightLowest;
    }
}
