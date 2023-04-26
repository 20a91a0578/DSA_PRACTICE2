class Solution {
    public double myPow(double x, int n) {
        double s = Math.pow(x, n);
        return (double) Math.round(s * 100000d) / 100000d;
    }
}