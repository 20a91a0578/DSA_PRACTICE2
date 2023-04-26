class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> v = new ArrayList<>();
        subsets(0, c, c.length, new ArrayList<>(), t, v);
        return v;
    }

    void subsets(int i, int[] c, int n, List<Integer> k, int t, List<List<Integer>> v) {
        if (i == n) {
            if (t == 0) {
                v.add(new ArrayList<>(k));
            }
            return;
        }
        if (c[i] <= t) {
            k.add(c[i]);
            subsets(i, c, n, k, t - c[i], v);
            k.remove(k.size() - 1);
        }
        subsets(i + 1, c, n, k, t, v);
    }
}
