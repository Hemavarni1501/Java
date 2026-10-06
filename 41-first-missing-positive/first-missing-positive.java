class Solution {
    public int firstMissingPositive(int[] nums) {
       Set<Integer> s=new HashSet<>();
       for(int x:nums){
        s.add(x);
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