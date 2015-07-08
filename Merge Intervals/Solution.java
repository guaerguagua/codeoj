import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
	public class Comparator implements Comparable<Comparator>{
		int index;
		int start;
		
		public Comparator(int index, int start) {
			super();
			this.index = index;
			this.start = start;
		}

		@Override
		public int compareTo(Comparator comparator) {
			// TODO Auto-generated method stub
			return start - comparator.start;
		}
		
	}
    public List<Interval> merge(List<Interval> intervals) {
    	int length = intervals.size();
    	
    	if(length==1||intervals==null||length==0)return intervals;
    	Comparator[] comparators = new Comparator[length];
    	for (int i = 0; i < length; i++) {
			comparators[i]= new Comparator(i,intervals.get(i).start);
		}
    	Arrays.sort(comparators);
    	List<Interval> answers = new ArrayList<Interval>();
    	answers.add(intervals.get(comparators[0].index));
    	int index=0;
    	for (int i = 1; i <length; i++) {
			int a = answers.get(index).end;
			int b = intervals.get(comparators[i].index).start;
			if(a>=b){
				int end = intervals.get(comparators[i].index).end;
				if(end>answers.get(index).end){
				answers.get(index).end = end;
				}
			}else {
				answers.add(intervals.get(comparators[i].index));
				index++;
			}
		}
		return answers;
        
    }
}