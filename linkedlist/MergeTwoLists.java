package linkedlist;


class ListNode {

    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoLists {

    public static ListNode merge(ListNode l1, ListNode l2) {

        // Dummy node create
        ListNode dummy = new ListNode(0);

        // Current points to dummy
        ListNode current = dummy;

        // Compare both lists
        while (l1 != null && l2 != null) {

            if (l1.data <= l2.data) {

                current.next = l1;
                l1 = l1.next;

            } else {

                current.next = l2;
                l2 = l2.next;

            }

            current = current.next;
        }

        // Remaining nodes
        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }

    // Print Linked List
    public static void print(ListNode head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // First List
        ListNode l1 = new ListNode(10);
        l1.next = new ListNode(20);
        l1.next.next = new ListNode(40);

        // Second List
        ListNode l2 = new ListNode(15);
        l2.next = new ListNode(30);
        l2.next.next = new ListNode(50);

        System.out.println("First List");
        print(l1);

        System.out.println("Second List");
        print(l2);

        ListNode result = merge(l1, l2);

        System.out.println("Merged List");
        print(result);
    }
}
