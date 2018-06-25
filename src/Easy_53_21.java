import java.util.List;

/**
 * Created by akapandaroad on 2018-06-22.
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.

 Example:

 Input: 1->2->4, 1->3->4
 Output: 1->1->2->3->4->4
 */

 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Easy_53_21 {

    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        head1.next=new ListNode(2);
        head1.next.next=new ListNode(4);


        ListNode head2=new ListNode(1);
        head2.next=new ListNode(3);
        head2.next.next=new ListNode(4);

        ListNode head=mergeTwoLists(head1,head2);

        head=head.next;
        while(head.next!=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.println(head.val);

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result=new ListNode(0);
        ListNode finalResult=result;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                result.next=l2;
                l2=l2.next;
            }else{
                result.next=l1;
                l1=l1.next;
            }
            result=result.next;
        }
        if (l1 != null) {
            result.next=l1;
        }
        if (l2 != null) {
            result.next = l2;
        }
        return finalResult;
    }
}
