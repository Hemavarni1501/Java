class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        a1.add(nums[0]);
        a2.add(nums[1]);
        int j=0,k=0;
        for(int i=2;i<n;i++){
            if(a1.get(j)>a2.get(k)){
                a1.add(nums[i]);
                j++;
            }else{
                a2.add(nums[i]);
                k++;
            }
        } int in=0;
        for(int i=0;i<a1.size();i++){
            nums[in++]=a1.get(i);
        }
        for(int i=0;i<a2.size();i++){
            nums[in++]=a2.get(i);
        }
        return nums;
    }
}