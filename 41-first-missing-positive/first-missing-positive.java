class Solution {
    public int firstMissingPositive(int[] nums) {
       Set<Integer> s=new HashSet<>();
       for(int x:nums){
        s.add(x);
       }
       if(nums.length==1){
        if(nums[0]!=1)
        return 1;
        else
        return 2;
       }
       int i=1;
       while(i<=nums.length){
        if(!s.contains(i)){
        return i;}
        i++;
       } 
      return i;
    }
}