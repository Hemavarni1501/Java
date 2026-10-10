class Solution {
    public int longestSubarray(int[] a) {
        int c=0,m=Integer.MIN_VALUE;
      boolean z=false;
      int n=a.length;
      int i=0,j=0;
      while(j<n){
        if(a[j]==1){
          c++; j++;
        }else if(!z){
          i=j;
          z=true; j++;
        }else{
          z=false; j=i+1;
          c=0;
        }
        m=Math.max(m,c);
      }
      return m==n?m-1:m;
    }
}