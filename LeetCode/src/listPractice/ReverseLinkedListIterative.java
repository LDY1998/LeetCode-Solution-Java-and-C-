package listPractice;


/*
 * Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
 */


//Iterative reverse version


public class ReverseLinkedListIterative {

	
	public static ListNode reverseList(ListNode head) {
		if(head==null)	return null;
		if(head.next==null)	return head;
		if(head.next.next==null) {
			ListNode newHead=head.next;
			head.next.next=head;
			head.next=null;
			return newHead;
		}
		ListNode next1=head.next;ListNode next2=head.next.next;
		head.next=null;
		while(next2!=null) {
			next1.next=head;
			head=next1;
			next1=next2;next2=next2.next;
			
		}
		next1.next=head;head=next1;
		return head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);l1.next=new ListNode(2);
		
		ListNode l3=reverseList(l1);
		while(l3!=null) {
			System.out.println(l3.val);
			l3=l3.next;
		}
		
	}

}
