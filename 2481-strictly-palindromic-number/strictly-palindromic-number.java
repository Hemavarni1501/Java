class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<n-1;i++){
        int num=n;
        String str="";
        while(num>0){
        int rem=num%i;
        str=str+rem;
        num=num/i;
        }
        int left=0;
        int right=str.length()-1;
        boolean p=true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }  
    }
    return true;
    }
}
