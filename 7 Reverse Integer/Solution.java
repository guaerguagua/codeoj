public class Solution {
    public int reverse(int x) {
    	StringBuilder sb = new StringBuilder();
    	String s = String.format("%s", x);
    	if(s.charAt(0)=='-'){
    		sb.append(s.charAt(0));
    		for(int i =s.length()-1;i>=1;i--){
    		sb.append(s.charAt(i));
    		}
    	}else{
    		for(int i =s.length()-1;i>=0;i--){
    			sb.append(s.charAt(i));
    		}
    	}
    	long ll=Long.valueOf(sb.toString());
    	
    	if(ll<Integer.MIN_VALUE||ll>Integer.MAX_VALUE)return 0;
    	return Integer.valueOf(sb.toString());
    	
    }
}