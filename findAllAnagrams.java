package StringPractice;

import java.util.ArrayList;
import java.util.List;

public class findAllAnagrams {

	
	 public static List<Integer> findAnagrams(String s, String p) {
	        List<Integer> list=new ArrayList<>();
	        if(s==null||p==null||s.length()<p.length()) return list;
	        
	        
	        int len=p.length();
	        
	        int[] count1=new int[26];
	        for(int i=0;i<p.length();i++){
	            count1[p.charAt(i)-'a']--;
	        }
	        
	        for(int i=0;i<s.length();i++){
	           
	            count1[s.charAt(i)-'a']++;
	            if(i>=len-1){
	                if(isAnagrams(count1)){
	                    list.add(i-len+1);
	                }
	            count1[s.charAt(i-len+1)-'a']--;
	            }  
	            
	            
	                                                                                                                                         
	        }
	        
	        return list;
	    }
	    public static boolean isAnagrams(int[] counts){
	        for(int i:counts){
	            if(i!=0)    return false;
	        }
	        
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cbaebabacd";String p="abc";
		System.out.println(findAnagrams(s,p));
		
	}

}
