class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        List<Integer> num=new ArrayList<>();
        for(int x:nums){
            num.add(x);
        }
        int k=0;
        while(num.size()>0){
            Set<Integer> s=new TreeSet<>();
            int i=0;
            while(i<num.size()){
                if(!s.contains(num.get(i))){
                    s.add(num.get(i));
                    num.remove(i--);
                }
                i++;
            }
            for(int x:s){
                a[k++]=x;
            }
        }
        return a;
    }
}