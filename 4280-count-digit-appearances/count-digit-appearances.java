class Solution {
    public int countDigitOccurrences(int[] n, int d) {
        int c=0;
        for(int i=0;i<n.length;i++){
            c+=dc(n[i],d);
        }
        return c;
    }
    static int dc(int num, int dig){
        int c=0;
        while(num>0){
            int d=num%10;
            if(d==dig){
                c++;
            }
            num/=10;
        }
        return c;
    }
}