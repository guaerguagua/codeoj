public class Solution {
    public int removeDuplicates(int[] nums) {
    	if(nums.length==0)return 0;
    	int answer = 1;
        int length = nums.length;
        int flag=nums[0];
        boolean flag_twice=false;
        int index=0;
        for(int i=1;i<length;i++){
        	if(flag!=nums[i]){
        		answer++;
        		flag=nums[i];
        		nums[++index]=nums[i];
        		flag_twice=false;
        	}
        	else{
        		if(!flag_twice){
        			flag_twice=true;
        			answer++;
        			nums[++index]=nums[i];
        		}
        	}
        }
        return answer;
    }
}