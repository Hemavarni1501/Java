class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> a=new HashSet<>();
        for(int i:nums){
            a.add(i);
        }
        int j=2,l=k;
        for(int i=1;i<=nums.length;i++){
            if(!a.contains(l)){
                return l;
            }
            l=k;
            l*=j++;
        }
        return l;
    }
}