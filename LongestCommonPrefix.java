import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String k = strs[0];
        String j = strs[strs.length - 1];
        String l = "";
        int p = Math.min(k.length(), j.length());
        for (int i = 0; i < p; i++) {
            if (k.charAt(i) != j.charAt(i)) {
                break;
            } else {
                l += k.charAt(i);
            }
        }
        return l;
    }
}
