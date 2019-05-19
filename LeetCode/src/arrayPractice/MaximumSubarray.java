package arrayPractice;



//Given an integer array nums, find the contiguous subarray (containing at least one number) 
//which has the largest sum and return its sum.
//
//Example:
//
//Input: [-2,1,-3,4,-1,2,1,-5,4],
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//Follow up:
//
//If you have figured out the O(n) solution, try coding another solution 
//using the divide and conquer approach, which is more subtle.





public class MaximumSubarray {

	
	public static int maxSubarray(int[] nums) {
		int sum=0;int max=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			if(sum>max)	max=sum;
			if(sum<=0)	sum=0;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={-2,1,-3,4,-1,2,1,-5,4};
		int[] num2= {0,0,0,0,0,0,0,0,0,1};
		System.out.println(maxSubarray(num));
		System.out.println(maxSubarray(num2));
	}

}
