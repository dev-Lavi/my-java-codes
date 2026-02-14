package leetcode;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

class leet2 {

    public static ListNode LLaddition(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int carry = 0;

        ListNode a = l1;
        ListNode b = l2;

        while( a.next != null || b.next != null || carry != 0 ){
            carry = (a.val + b.val)/10;
            if( carry > 0){
                a.next.val = a.next.val + carry;
                a.val = (a.val + b.val)%10;
                a = a.next;
                b = b.next;
            }else{
                curr.val = a.val + b.val;
            }
        }
        return a;
    }

    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr1 = {3,4,2};
        int[] arr2 = {4,6,5};

        ListNode l1 = new ListNode(arr1[0]);
        l1.next = new ListNode(arr1[1]);
        l1.next.next = new ListNode(arr1[2]);

        ListNode l2 = new ListNode(arr2[0]);
        l2.next = new ListNode(arr2[1]);
        l2.next.next = new ListNode(arr2[2]);


        ListNode result = LLaddition(l1,l2);

        System.out.println(result);
    }

}
