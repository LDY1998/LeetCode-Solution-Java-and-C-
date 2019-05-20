package listPractice;



/*
 * Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
 */


//Recursive reverse version





public class ReverseLinkedListRecursive {

	
	public static ListNode reverseList(ListNode head) {
		if(head==null)	return null;
		if(head.next==null)	return head;
		
		ListNode newHead=reverseList(head.next);
		head.next.next=head;
		head.next=null;
		
		return newHead;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);l1.next=new ListNode(2);
		l1.next.next=new ListNode(3);l1.next.next.next=new ListNode(4);
		
		ListNode l3=reverseList(l1);
		while(l3!=null) {
			System.out.println(l3.val);
			l3=l3.next;
		}
	}

}
