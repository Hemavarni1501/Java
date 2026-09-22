class Solution {
    public int[] minOperations(String b) {
        int n=b.length();
        int[] res=new int[n];
        char[] a=b.toCharArray();
        for(int i=0;i<n;i++){
            if(a[i]=='1'){
            for(int j=0;j<n;j++){
                res[j]+=Math.abs(j-i);
            }
        }
        }
        return res;
    }
}