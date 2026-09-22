class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        for(int i:nums1){
            a.add(i);
        }
        for(int i:nums2){
            if(a.contains(i)){
                b.add(i);
                a.remove(Integer.valueOf(i));
            }
        }
        int[] c=new int[b.size()];
        int p=0;
        for(int i:b){
            c[p++]=i;
        }
        return c;
	}
}