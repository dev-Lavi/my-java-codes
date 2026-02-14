package leetcode;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class LLNthNode {

    public static ListNode LLNthNode(ListNode head, int n) {
        ListNode prev = head;
        ListNode curr = head;

        while(n>0 && curr.next != null){
            curr = curr.next;
            n--;
        }

        while(curr != null && curr.next != null){
            curr = curr.next;
            prev = prev.next;
        }

        prev.next = prev.next.next;
        return head;
    }

    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);
        head.next.next.next.next = new ListNode(arr[4]);

        int n = 2;

        ListNode result = LLNthNode(head, n);

        printLL(head);
        System.out.println(result);
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head;

        while(curr != null){
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
