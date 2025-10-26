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

public class LLcycle{
    public static ListNode middleNode(ListNode head) {
        ListNode j = head;
        ListNode i = head;
        int count = 0;
        while(j.next != null ){
            j = j.next;
            count++;
        }
        int half = count/2;

        while(half != 0){
            i = i.next;
            half--;
        }

        return i;
    }

    public static void printLL(ListNode head){
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,8,7};

        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);

        head = middleNode(head);

        printLL(head);
    }
}