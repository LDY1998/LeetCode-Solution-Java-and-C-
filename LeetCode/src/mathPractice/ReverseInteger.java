package mathPractice;

/*
 * Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could 
only store integers within the 32-bit signed integer range: 
[−2^31,  2^31 − 1]. For the purpose of this problem, 
assume that your function returns 0 when the reversed integer 
overflows.
 */



public class ReverseInteger {
	
	public static int reverse(int num) {
		int result=0;
		while(num!=0) {
			int tail=num%10;
			int	newResult=result*10+tail;
			num=num/10;
			//Check for overflow
			if((newResult-tail)/10!=result)	return 0;
			result=newResult;
			
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1=123;int t2=-123;int t3=120;
		System.out.println(reverse(t1));
		System.out.println(reverse(t2));
		System.out.println(reverse(t3));
	}

}
