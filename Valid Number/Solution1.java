import java.util.ArrayList;
import java.util.List;
/*
很诡异因为.1这样的案例居然都是数字化的
*/
public class Solution {
    public boolean isNumber(String s) {
        List<String> r = new ArrayList<String>();
        String pureshu1= "(-?[1-9]\\d*)";
        String pureshu= "("+pureshu1+"|"+"0"+")";
        String xiaoshu1 = "("+pureshu1+"\\.\\d+"+")";
        String xiaoshu2 = "(-?0\\.\\d*[1-9])";
        String xiaoshu = "("+xiaoshu1 +"|" +xiaoshu2+")";
        String shu = "("+pureshu+"|"+xiaoshu+")";
        String withe ="("+shu+"e"+shu+")";
        r.add(pureshu);
        r.add(xiaoshu);
        r.add(withe);
        //除去两端的空格
        s = s.trim();
    	for(int i=0;i<r.size();i++){
    		if(s.matches(r.get(i)))return true;
    	}
    	return false;
    }
}