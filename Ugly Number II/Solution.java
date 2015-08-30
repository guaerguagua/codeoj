/*考虑从最小的数乘以2，3，5来构造。通过PriorityQueue来保存最小堆
PriorityQueue又叫优先队列，不同于一般队列的先进先出，而是根据一定的优先级来判断，先poll出优先级别高的。
默认情况下，是按照最小堆的顺序来排的。
如果想自定义优先级别规则，需要实现Comparator接口。在solution1里面看例子。
*/

import java.util.PriorityQueue;

public class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        minheap.offer(1);
        int uglyNumber = 1;
        for(int i = 0;i<n;i++){
        	uglyNumber = minheap.poll();
        	if(uglyNumber<=Integer.MAX_VALUE/2 && !minheap.contains(uglyNumber*2))
        		minheap.offer(uglyNumber*2);
        	if(uglyNumber<= Integer.MAX_VALUE/3 && !minheap.contains(uglyNumber*3))
        		minheap.offer(uglyNumber*3);
        	if(uglyNumber<= Integer.MAX_VALUE/5 && !minheap.contains(uglyNumber*5))
        		minheap.offer(uglyNumber*5);
        } 
        return uglyNumber;
    }
}