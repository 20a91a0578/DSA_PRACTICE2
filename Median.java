import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int ne[]=new int[n1.length+n2.length];
        double d=0;
        System.arraycopy(n1, 0, ne, 0,n1.length);
        System.arraycopy(n2, 0, ne, n1.length, n2.length);
        Arrays.sort(ne);
      
        if(ne.length%2!=0)
        {
            d=ne[(ne.length)/2];
        }
        else{
            d=(double)(ne[(ne.length)/2]+ne[((ne.length)/2)-1])/2;
        }
return d;
    }
}