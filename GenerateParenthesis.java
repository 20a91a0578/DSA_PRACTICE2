import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> v = new ArrayList<>();
        genera(n, 0, 0, v, "");
        return v;
    }

    void genera(int n, int o, int c, List<String> v, String s) {
        if (n == o && n == c) {
            v.add(s);
            return;
        }
        if (o < n) {
            genera(n, o + 1, c, v, s + '(');
        }
        if (c < o) {
            genera(n, o, c + 1, v, s + ')');
        }
    }
}