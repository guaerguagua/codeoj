/*
优先级队列是不同于先进先出队列的另一种队列。每次从队列中取出的是具有最高优先权的元素。
　　PriorityQueue是从JDK1.5开始提供的新的数据结构接口。
　　如果不提供Comparator的话，优先队列中元素默认按自然顺序排列，也就是数字默认是小的在队列头，字符串则按字典序排列。*/
/*
如果想实现按照自己的意愿进行优先级排列的队列的话，需要实现Comparator接口。下面的方法，实现了根据某个变量，来进行优先级队列的建立。*/
import java.util.*;

public class Solution1{
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>(){
            public int compare(Integer o1,Integer o2){
                return o2.intValue()-o1.intValue();
            }
        };
        PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(11,comparator);
        maxheap.add(1);
        maxheap.add(2);
        maxheap.add(3);
        System.out.println(maxheap.poll());
        System.out.println(maxheap.poll());
        
    }
}