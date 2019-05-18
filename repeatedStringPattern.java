package StringPractice;

public class repeatedStringPattern {

	
	public static boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        if(s==null||s.length()<=1)	return false;
        for(int i=len/2;i>=1;i--) {
        	if(len%i==0) {
        		int start=0;int next=i;
        		while(next<len) {
        			if(s.charAt(start)==s.charAt(next)) {
        				start++;
        				next++;
        			}
        			else {
        				break;
        			}
        		}
        		if(next==len) return true;
        	}
        }
        return false;
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabcabcabc";
		
		System.out.println(repeatedSubstringPattern(s));
		
	}

}
