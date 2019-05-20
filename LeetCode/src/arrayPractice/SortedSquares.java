package arrayPractice;



/*
 * Given an array of integers A sorted in non-decreasing order, 
 * return an array of the squares of each number, also in sorted non-decreasing order.

 

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Note:

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.
 */





public class SortedSquares {

	
	public static int[] sortedSquares(int[] A) {
		if(A==null||A.length==0)	return null;
		int n=A.length;
		int[] ret=new int[n];
		int left=0;int right=n-1;
		
		for(int i=n-1;i>=0;i--) {
			if(Math.abs(A[left])>Math.abs(A[right])) {
				ret[i]=A[left]*A[left];
				left++;
			}
			else {
				ret[i]=A[right]*A[right];
				right--;
			}
		}
		return ret;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test= {-4,-3,1,3,5};
		int[] result=sortedSquares(test);
		for(int i:result) {
			System.out.println(i);
		}
	}

}
