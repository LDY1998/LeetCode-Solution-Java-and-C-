package StringPractice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {

	
	
	public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> list=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for(String cpdomain:cpdomains){
            String[] d=cpdomain.split(" ");
            
            String s1=d[1];
            if(!map.containsKey(s1)) {
            	map.put(s1, Integer.valueOf(d[0]));
            }
            else {
            	map.put(s1, map.get(s1)+Integer.valueOf(d[0]));
            }
            while(s1.contains(".")){
                 s1=s1.substring(s1.indexOf(".")+1);
                 if(!map.containsKey(s1)) {
                 	map.put(s1, Integer.valueOf(d[0]));
                 }
                 else {
                 	map.put(s1, map.get(s1)+Integer.valueOf(d[0]));
                 }
                
            }
        }
        
        for(String key:map.keySet()) {
        	list.add(map.get(key)+" "+key);
        }
        
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		List<String> list=subdomainVisits(s);
		for(String s1:list) {
			System.out.println(s1);
		}
	}

}
