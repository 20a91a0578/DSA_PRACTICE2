import java.util.*;
class Solution {
    List<String> s = new ArrayList<>();
    String[] l = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        comb(0, digits, digits.length(), "");
        return s;
    }

    void comb(int i, String d, int n, String k) {
        if (i == n) {
            s.add(k);
            return;
        }
        int x = d.charAt(i) - '0';
        for (char c : l[x].toCharArray()) {
            comb(i + 1, d, n, k + c);
        }
    }
}

