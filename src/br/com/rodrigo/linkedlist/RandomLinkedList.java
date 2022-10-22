package br.com.rodrigo.linkedlist;

public class RandomLinkedList {

    RandomNode head;

    public RandomNode cloneLinkedList() {

        RandomNode temp = this.head;

        while (temp != null) {
            RandomNode newNode = new RandomNode(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        RandomNode itr = this.head;
        while (itr != null) {
            if (itr.random != null)
                itr.next.random = itr.random.next;
            itr = itr.next.next;
        }

        RandomNode dummy = new RandomNode(0);
        itr = this.head;
        temp = dummy;
        RandomNode fast = null;

        while (itr != null) {
            fast = itr.next.next;
            temp.next = itr.next;
            itr.next = fast;
            temp = temp.next;
            itr = fast;
        }

        return dummy.next;
    }

    void printList(RandomNode head) {
        while(head != null) {
            System.out.print(head.data+":");
            if(head.next != null)
                System.out.print(head.next.data);
            else
                System.out.print("NULL");
            if(head.random != null)
                System.out.print(","+head.random.data);
            else
                System.out.print(",NULL");
            System.out.println();
            head = head.next;
        }
    }
}
