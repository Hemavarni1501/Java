class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            a[i]=nums1[i];
        } int j=nums1.length;
        for(int i=0;i<nums2.length;i++){
            a[j++]=nums2[i];
        }
        Arrays.sort(a);
        int n=a.length/2;
        double an=a[n];
        if(a.length%2==0){
            an+=a[n-1];
            an/=2;
        }
        return an;
    }
}