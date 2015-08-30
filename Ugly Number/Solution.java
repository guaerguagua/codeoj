/*通过判断是否含有2，3，5以为的质数
*/
public class Solution {
    public boolean isUgly(int num) {
 		int div = 2*3*5;
 		while(num>0 && div >1){
 			if(num%div == 0)num /=div;
 			else if(div%2==0 && num%2!=0) div/=2;
 			else if(div%3==0 && num%3!=0) div/=3;
 			else if(div%5==0 && num%5!=0) div/= 5;
 		}
 		return num==1;      
    }
}