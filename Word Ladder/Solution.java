import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        int answer =0;
    	if(beginWord==null||endWord==null||beginWord.equals(endWord)||beginWord.length()!=endWord.length())
        	return 0;
    	Queue<String> queue =new LinkedList<String>();
        Map<String, Integer> map= new HashMap<String, Integer>();
        queue.add(beginWord);
        map.put(beginWord,1);
        while(!queue.isEmpty()){
        	String node =queue.poll();
        	int dist = map.get(node);	
        	for(int index=0;index<node.length();index++){
        		for(char x='a';x<='z';x++){
        			if(node.charAt(index)==x)continue;
        			StringBuilder sb = new StringBuilder(node);
        			sb.setCharAt(index, x);
        			if(sb.toString().equals(endWord)) return dist+1;
        			if(wordDict.contains(sb.toString())&&!map.containsKey(sb.toString())){
        				queue.add(sb.toString());
        				map.put(sb.toString(), dist+1);
        			}
        		}
        	}
        }
		return answer;
    }
}