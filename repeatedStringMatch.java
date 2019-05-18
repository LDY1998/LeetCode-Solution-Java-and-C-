package StringPractice;

public class repeatedStringMatch {

	public static int repeatedStringMatch(String A,String B) {
		
		int count=1;String a=new String(A);
        while(A.length()<=B.length()){
            A+=a;
            count++;
            if(A.equals(B))	count--;
        }
       
        
        if(A.contains(B))   return count;
        else return -1;
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="a";String b="aaaa";
		System.out.println(repeatedStringMatch(a,b));
	}

}
