import java.util.*;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	if(s==null||s.length() ==0) return 0;
    	int max=0;
    	int walker=0;
    	int runner=0;
    	HashSet<Character> hashSet = new HashSet<Character>();
    	int length = s.length();
    	while(runner<length){
    		if(hashSet.contains(s.charAt(runner))){
    			while(s.charAt(walker)!=s.charAt(runner)){
    				hashSet.remove(s.charAt(walker));
    				walker++;
    			}
    			walker++;
    			runner++;
    		}else{
    			hashSet.add(s.charAt(runner));
    			runner++;
    			max = Math.max(max,runner-walker);
    		}
    	}
    	return max;       
    }
}