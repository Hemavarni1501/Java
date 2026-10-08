class Solution {
    public int maxArea(int[] a) {
        int i=0,j=a.length-1;
      int c=0;
      while(i<j){
        int min=Math.min(a[i],a[j]);
        c=Math.max(min*(j-i),c);
        if(min==a[i]){
          i++;
        }else{
          j--;
        }
      }
      return c;
    }
}