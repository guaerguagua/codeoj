public class Solution {
	public String longestPalindrome(String s) {
		int a = 0, b = 0;
		int max = 1;
		for (int i = 0; i < s.length(); i++) {
			// System.out.println("i:"+i);
			for (int k = 1; i - k >= 0 && i + k < s.length(); k++) {
				// System.out.println("i-k,i+k:"+(i-k)+(i+k));
				if (s.charAt(i - k) == s.charAt(i + k)) {
					if (max < 2 * k + 1) {
						max = 2 * k + 1;
						a = i - k;
						b = i + k;
					}
				} else
					break;
			}
			for (int k = 0; i - k >= 0 && i + k + 1 < s.length(); k++) {
				// System.out.println("i-k,i+k+1:"+(i-k)+(i+k+1));
				if (s.charAt(i - k) == s.charAt(i + k + 1)) {
					if (max < 2 * (k + 1)) {
						max = 2 * (k + 1);
						a = i - k;
						b = i + k + 1;
						// System.out.println("max"+max);
						// System.out.println("a"+a);
						// System.out.println("b"+b);
					}
				} else
					break;
			}
		}
		return s.substring(a, b + 1);
	}
}