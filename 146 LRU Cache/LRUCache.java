import java.util.LinkedHashMap;
public class LRUCache {
	LinkedHashMap<Integer,Integer> map;
	int MAX_CACHE;
    
    public LRUCache(int capacity) {

    	MAX_CACHE = capacity;
    	/*//内部将会按照hash表和双链表的形式实现lru。
    	//LinkedHashMap的一个构造函数，当参数accessOrder为true时，即会按照访问顺序排序，最近访问的放在最前，最早访问的放在后面
    	public LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) {
    	        super(initialCapacity, loadFactor);
    	        this.accessOrder = accessOrder;
    	}

    	//LinkedHashMap自带的判断是否删除最老的元素方法，默认返回false，即不删除老数据
    	//我们要做的就是重写这个方法，当满足一定条件时删除老数据
    	protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
    	        return false;
    	}*/
        map = new LinkedHashMap<Integer, Integer>(capacity,1,true){
        	
        @Override
        protected boolean removeEldestEntry(java.util.Map.Entry eldest) {
        	// TODO Auto-generated method stub
        	return size() >MAX_CACHE;
        }
        };

    }
    
    public int get(int key) {
    	if(map.containsKey(key)){
        return map.get(key);}
    	else return -1;
    }
    
    public void set(int key, int value) {
        map.put(key,value);
    }
}