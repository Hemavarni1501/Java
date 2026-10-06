class Solution {
    public int firstMissingPositive(int[] nums) {
      int n=nums.length;
     boolean[] a=new boolean[n+1];
      for(int x:nums){
        if(x>0&&x<=n){
            a[x]=true;
        }
      }
      for(int i=1;i<=n;i++){
        if(!a[i])
        return i;
      }
      return n+1;
    }
}