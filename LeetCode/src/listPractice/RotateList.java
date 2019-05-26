package listPractice;


/*
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL
Example 2:

Input: 0->1->2->NULL, k = 4
Output: 2->0->1->NULL
Explanation:
rotate 1 steps to the right: 2->0->1->NULL
rotate 2 steps to the right: 1->2->0->NULL
rotate 3 steps to the right: 0->1->2->NULL
rotate 4 steps to the right: 2->0->1->NULL
 */




public class RotateList {

	public static ListNode rotateList(ListNode head, int k) {
		if(head==null)	return null;
		ListNode oldTail=head;
		int n;
		for(n=1;oldTail.next!=null;n++) {
			oldTail=oldTail.next;
		}
		oldTail.next=head;
		
		ListNode newTail=head;
		for(int i=0;i<n-k%n-1;i++) {
			newTail=newTail.next;
		}
		ListNode newHead=newTail.next;
		newTail.next=null;
		
		return newHead;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);l1.next=new ListNode(2);l1.next.next=new ListNode(3);
		ListNode newHead=rotateList(l1,2);
		while(newHead!=null) {
			System.out.println(newHead.val);
			newHead=newHead.next;
		}
	}

}
