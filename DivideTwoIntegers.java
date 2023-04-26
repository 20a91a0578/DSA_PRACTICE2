class Solution {
    public int divide(int d, int b) {
        int h = d / b;
        if(d==Integer.MIN_VALUE && b==-1)
        return Integer.MAX_VALUE;
        if (h < Integer.MIN_VALUE) {
            
            return Integer.MIN_VALUE;
        }
        if (h > Integer.MAX_VALUE) {
            
            return Integer.MAX_VALUE;
        }
        
        return h;
    }
}