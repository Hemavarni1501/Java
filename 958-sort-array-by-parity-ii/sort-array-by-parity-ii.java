class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] a=new int[nums.length];
        int o=1,e=0;
        for(int i=0;i<a.length;i++){
            if((nums[i]&1)==0){
            a[e]=nums[i];
            e+=2;
            }
            else{
            a[o]=nums[i];
            o+=2;
            }
        }
        return a;
    }
}