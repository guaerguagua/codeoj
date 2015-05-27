import java.util.Arrays;

public class Solution {
   

    class Pair implements Comparable<Pair> {
        int index;
        int num;

        public Pair(int num, int index) {
            this.index = index;
            this.num = num;
        }

        public int compareTo(Pair sec_num) {
            return num - sec_num.num;
        }
    }

    int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Pair[] pairs = new Pair[length];
        for (int i = 0; i < length; i++) {
            pairs[i] = new Pair(nums[i], i + 1);
        }
        Arrays.sort(pairs);
        int[] result = new int[2];
        int begin = 0;
        int end = length - 1;
        while (begin < end) {
            if (pairs[begin].num + pairs[end].num < target) {
                begin++;
            } else if (pairs[begin].num + pairs[end].num > target) {
                end--;
            } else {
                if (pairs[begin].index < pairs[end].index) {
                    result[0] = pairs[begin].index;
                    result[1] = pairs[end].index;
                } else {
                    result[0] = pairs[end].index;
                    result[1] = pairs[begin].index;

                }
                break;
            }
        }
        return result;
    }
}