import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int i = 0;
        int j[]=new int[set.size()];
        for (int num : set) {
            j[i++] = num;
        }
        Arrays.sort(j);
        i=0;
        for(int num:j)
        {
            nums[i++]=num;
        }
        return set.size();
    }
}
