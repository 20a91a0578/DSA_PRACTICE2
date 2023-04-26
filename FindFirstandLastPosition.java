class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int[] v = new int[2];
        v[0]=-1;
        v[1]=-1;
        while (i < nums.length) {
            if (nums[i] != target) {
                i++;
            } else {
                v[0] = i;
                break;
            }
        }
        while (j >= 0) {
            if (nums[j] != target) {
                j--;
            } else {
                v[1] = j;
                break;
            }
        }
        
        return v;
    }
}
