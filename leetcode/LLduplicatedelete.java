package leetcode;
import java.util.*;
import leetcode.ListNode;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class LLduplicatedelete {

    public static ListNode Duplicatedelete(ListNode head) {        ListNode prev = head;
        ListNode temp = head;

        while(temp != null && temp.next != null){
            temp = prev.next;
            if(temp.val == prev.val){
                prev.next = temp.next;
            }
            prev = prev.next;
        }
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
        int[] arr = {1, 1, 2};

        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);

        head = Duplicatedelete(head);

        printLL(head);
    }
}
