class Solution {
    public String longestCommonPrefix(String[] strs) {
        int c=0,p=0;
        if(strs.length==1){
            return strs[0];
        }
        StringBuilder r=new StringBuilder();
        int minLen = Math.min(strs[0].length(), strs[1].length());
        for(int i=0;i<minLen;i++){
            if(strs[0].charAt(i)==strs[1].charAt(i)){
                r.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        if(strs.length>=2){
            for(int i=2;i<strs.length;i++){
                int matchLen = 0;
                int limit = Math.min(r.length(), strs[i].length());
                for(int j=0;j<limit;j++){
                    if(r.charAt(j)==strs[i].charAt(j)){
                        matchLen++;
                    } else {
                        break;
                    }
                }
                r = new StringBuilder(r.substring(0, matchLen));
            }
        }
        return r.toString();
    }
}