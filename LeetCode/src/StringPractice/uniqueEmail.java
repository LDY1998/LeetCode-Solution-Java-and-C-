package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class uniqueEmail {

	public static int numUniqueEmails(String[] emails) {
        Set<String> set=new HashSet<>();
        for(String s: emails){
            String[] x=s.split("@");
            String y=x[0];
            if(y.contains("+")) y=y.substring(0,y.indexOf("+"));
            for(int i=0;i<y.length();i++) {
            	if(y.charAt(i)=='.') {
            		y=y.substring(0,i)+y.substring(i+1);
            	}
            }
            set.add(y+"@"+x[1]);
        
            
        }
        return set.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails={"test.emailalex@leetcode.com","test.e.mailbob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(numUniqueEmails(emails));
	}

}
