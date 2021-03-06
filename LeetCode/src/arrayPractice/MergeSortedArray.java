package arrayPractice;

//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//
//Note:
//
//The number of elements initialized in nums1 and nums2 are m and n respectively.
//You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
//Example:
//
//Input:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//Output: [1,2,2,3,5,6]

public class MergeSortedArray {
	
	
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 if(nums1==null||nums2==null||nums1.length<m||nums2.length<n)    return;
	        
	        int l1=m-1;int l2=n-1;int finished=m+n-1;
	        while(l1>=0&&l2>=0){
	            nums1[finished--]=(nums1[l1]>nums2[l2]?nums1[l1--]:nums2[l2--]);
	            
	        }
	        
	        while(l2>=0){
	            nums1[finished--]=nums2[l2--];
	        }
	        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {1,2,3,0,0,0,0};int[] a2= {2,5,6};
		merge(a1,3,a2,3);
		for(int i:a1) {
		System.out.println(i);}
	}

}
