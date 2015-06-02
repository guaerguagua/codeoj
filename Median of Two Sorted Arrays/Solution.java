import java.util.*;

public class Solution {
	public double findKth(int[] nums1,int a,int[] nums2,int b,int k){
		if(nums1.length-a>nums2.length-b) return findKth(nums2,b,nums1,a,k);
		if(nums1.length-a==0) return nums2[k-1-b];
		if(k==1) return Math.min(nums1[a], nums2[b]);
		int pa = Math.min(k/2,nums1.length-a);
		int pb = k-pa;
		if(nums1[a+pa-1]<nums2[b+pb-1]){
			return findKth(nums1,a+pa,nums2,b,k-pa);
		}else if(nums1[a+pa-1]>nums2[b+pb-1]){
			return findKth(nums1,a,nums2,b+pb,k-pb);
		}else{
			return nums2[b+pb-1];
		}
		
	}
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k = nums1.length+nums2.length;
        if(k%2==1){
      	return findKth(nums1,0,nums2,0,k/2+1);
        }else {
        	//System.out.println("even");
        	double a = findKth(nums1,0,nums2,0,k/2);
        	double b = findKth(nums1,0,nums2,0,k/2+1);
        	//System.out.println("a:"+a);
        	//System.out.println("b:"+b);
        	return (a+b)/2;
        	//return (findKth(nums1,0,nums2,0,k/2)+findKth(nums1,0,nums2,0,k/2+1))/2;
        }
    }

}
