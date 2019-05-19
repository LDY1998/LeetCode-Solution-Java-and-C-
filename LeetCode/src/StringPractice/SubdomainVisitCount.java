package StringPractice;


import java.util.ArrayList;
import java.util.List;

public class SubdomainVisitCount {

	
	
	public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> list=new ArrayList<>();
        for(String cpdomain:cpdomains){
            list.add(cpdomain);
            String[] d=cpdomain.split(" ");
            
            String s1=d[1];
            while(s1.contains(".")){
                 s1=s1.substring(s1.indexOf(".")+1);
                list.add(d[0]+" "+s1);
            }
            
            
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"9001 discuss.leetcode.com"};
		List<String> list=subdomainVisits(s);
		for(String s1:list) {
			System.out.println(s1);
		}
	}

}
