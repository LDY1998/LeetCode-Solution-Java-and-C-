package listPractice;


//Merge two sorted linked lists and return it as a new list. 
//The new list should be made by splicing together the nodes of the first two lists.
//
//Example:
//
//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3->4->4


public class MergeTwoSortedListIterative {

	
	
	public static ListNode mergeTwoLists(ListNode l1,ListNode l2) {
			ListNode head=new ListNode(-1);ListNode curr=head;
			
			while(l1!=null&&l2!=null) {
				if(l1.val<=l2.val) {
					curr.next=new ListNode(l1.val);
					l1=l1.next;
				}
				else {
					curr.next=new ListNode(l2.val);
					l2=l2.next;
				}
				curr=curr.next;
			}
			
			while(l1!=null) {
				curr.next=new ListNode(l1.val);
				l1=l1.next;curr=curr.next;
			}
			while(l2!=null) {
				curr.next=new ListNode(l2.val);
				l2=l2.next;curr=curr.next;
			}
			
			return head.next;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1=new ListNode(1);l1.next=new ListNode(2);l1.next.next=new ListNode(4);
		ListNode l2=new ListNode(1);l2.next=new ListNode(3);l2.next.next=new ListNode(4);
		ListNode l3=mergeTwoLists(l1,l2);
		while(l3!=null) {
			System.out.println(l3.val);
			l3=l3.next;
		}
		
	}

}
