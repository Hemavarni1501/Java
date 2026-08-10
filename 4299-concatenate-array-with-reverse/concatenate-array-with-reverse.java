class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] a=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
        }
        int k=nums.length-1;
        for(int i=nums.length;i<a.length;i++){
            a[i]=nums[k--];
        }
        return a;
    }
}