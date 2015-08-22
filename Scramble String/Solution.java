public class Solution {
    public boolean isScramble(String s1, String s2) {  
        // Note: The Solution object is instantiated only once.  
        if(s1.length() != s2.length()) return false;  
        if(s1.equals(s2)) return true;  
  
        int[] A =new int[26];
        for(int i=0; i<26;i++) A[i]=0;
        for(int i = 0; i < s1.length(); i++)  
            ++A[s1.charAt(i)-'a'];  
  
        for(int j = 0; j < s2.length(); j++)  
            --A[s2.charAt(j)-'a'];  
  
        for(int k = 0; k < 26; k++)  
            if(A[k] != 0) return false;  
  
        for(int i = 1; i < s1.length(); i++)  
        {  
            boolean result = isScramble(s1.substring(0,i), s2.substring(0,i))   
                && isScramble(s1.substring(i), s2.substring(i));  
            result = result || (isScramble(s1.substring(0,i), s2.substring(s2.length()-i))  
                && isScramble(s1.substring(i), s2.substring(0,s2.length()-i)));  
            if(result) return true;  
        }  
        return false;  
    } 
}