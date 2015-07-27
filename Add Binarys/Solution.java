public class Solution {
    public String addBinary(String a, String b) {//a>b
    	if(a.length()<b.length())return addBinary(b, a);
    	int lengtha = a.length();
    	int lengthb = b.length();
    	char[] answer= new char[lengtha+1];
    	for(int i=0;i<answer.length;i++){
    		if(i==0)answer[i]='0';
    		else answer[i]=a.charAt(i-1);
    	}
    	int c =0;
    	for(int i=1;i<=lengthb;i++){
    		int pa= a.charAt(lengtha-i)-'0';
    		int pb= b.charAt(lengthb-i)-'0';
    		int sum= c+pa+pb;
    		if(sum>=2){
    			answer[lengtha-i+1]=String.valueOf(sum-2).charAt(0);
    			c=1;
    		}else{
    			answer[lengtha-i+1]=String.valueOf(sum).charAt(0);
    			c=0;
    		}
    	}
    	int lengtha_sub=lengtha-lengthb;
    	for(int i=1;i<=lengtha_sub;i++){
    		int pa = a.charAt(lengtha_sub-i)-'0';
    		int sum = c+pa;
    		if(sum>=2){
    			answer[lengtha_sub-i+1]=String.valueOf(sum-2).charAt(0);
    			c=1;
    		}else{
    			answer[lengtha_sub-i+1]=String.valueOf(sum).charAt(0);
    			c=0;
    		}
    	}
    	if(c==1){answer[0]='1';return new String(answer);}
    	else{return new String(answer).substring(1,lengtha+1);}
        }
}
