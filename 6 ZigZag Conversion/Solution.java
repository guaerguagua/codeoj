public class Solution {
	public String convert(String s,int numRows){
		
		int length = s.length();
		if(length == 0) return s;
		if(numRows == 1) return s;
		if(numRows == 2) {
			StringBuilder result = new StringBuilder();
			for(int k = 0;2*k<length;k++){
				result.append(s.charAt(k*2));
			}
			for(int k = 0;2*k+1<length;k++){
				result.append(s.charAt(2*k+1));
			}
			return result.toString();
		}
		int p = 2*numRows-2;
		int n = (length-1)/p;
		
		StringBuilder result = new StringBuilder();
		for(int k = 0;k<=n;k++){
			result.append(s.charAt(p*k));
		}
		for(int i = 1;i<=numRows-2;i++){
		for(int k = 0;k<=n;k++){
			if(p*k+i<length) result.append(s.charAt(p*k+i));
			if(p*k+(2*numRows-2-i)<length) result.append(s.charAt(p*k+(2*numRows-2-i)));
		}
	}
		for(int k = 0;k<=n;k++){
			if(p*k+numRows-1<length) result.append(s.charAt(p*k+numRows-1));
		}
		return result.toString();
	}
}