import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ipList=new ArrayList<String>();
        int length = s.length();
        if(length>=16) return ipList;
        for(int i=1;i<=length-3;i++){
            for(int j=i+1;j<=length-2;j++){
                for(int k=j+1;k<=length-1;k++){
                    String t = s.substring(0,i)+'.'+s.substring(i,j)+'.'+s.substring(j,k)+'.'+s.substring(k,length);
                    if(t.matches("((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))")){
                        ipList.add(t);
                    }
                }
            }
        }
        return ipList;
    }
}
/*
正则表达式子
这里的不是唯一的，还有很多写法但是思路是分开谈论取并集合
*/