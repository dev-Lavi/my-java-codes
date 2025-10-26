package leetcode;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class LLBinarytoint {

    public static int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp.next != null ){
            count++;
            temp = temp.next;
        }

        ListNode curr = head;
        int result = 0;
        while(curr != null){
            if(curr.val == 1){
                result = result + (int)Math.pow(2,count);
                count--;
            }
            curr = curr.next;
        }
        return result;
    }

    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1};

        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);

        int result = getDecimalValue(head);

        printLL(head);
        System.out.println(result);
    }
}
