class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length/2;
        Map<Integer,Integer> m=new HashMap<>();
        for(int x:nums){
            m.put(x,m.getOrDefault(x,0)+1);
        }
            for(int x:m.values()){
                if(x%2!=0){
                    return false;
                }
            }
        return true;
    }
}