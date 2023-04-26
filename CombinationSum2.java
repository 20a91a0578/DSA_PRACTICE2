class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        List<List<Integer>> v = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        subsets(0, c, c.length, v, ds, t);
        return v;
    }

    void subsets(int ind, int[] c, int n, List<List<Integer>> v, List<Integer> ds, int t) {
        if (t == 0) {
            v.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i < n; i++) {
            if (i > ind && c[i] == c[i - 1]) {
                continue;
            }
            if (c[i] > t) {
                break;
            }
            ds.add(c[i]);
            subsets(i + 1, c, n, v, ds, t - c[i]);
            ds.remove(ds.size() - 1);
        }
    }
}