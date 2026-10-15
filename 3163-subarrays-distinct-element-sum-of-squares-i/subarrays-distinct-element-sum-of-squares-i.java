class Solution {
    public int sumCounts(List<Integer> nums) {
        int s=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            Set<Integer> a=new HashSet<>();
            for(int j=i;j<n;j++){
                a.add(nums.get(j));
                int c=a.size();
                s+=c*c;
            }
        }
        return s;
    }
}