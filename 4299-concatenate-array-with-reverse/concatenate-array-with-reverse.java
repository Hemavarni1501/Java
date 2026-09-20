class Solution {
    public int[] concatWithReverse(int[] n) {
        int[] a=new int[2*n.length];
        for(int i=0;i<n.length;i++){
            a[i]=n[i];
        } int j=n.length-1;
        for(int i=n.length;i<a.length;i++){
            a[i]=n[j--];
        }
        return a;
    }
}