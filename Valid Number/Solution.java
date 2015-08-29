public class Solution{
public boolean isNumber(String s){
    s = s.trim();
    if(s.endsWith("f")||s.endsWith("D"))
        return false;
    try{
    	//必须除去f和D结尾的，因为是浮点数会直接转化成功
        Float.parseFloat(s);
    }catch(NumberFormatException e){
        return false;
    }
    return true;
}
}