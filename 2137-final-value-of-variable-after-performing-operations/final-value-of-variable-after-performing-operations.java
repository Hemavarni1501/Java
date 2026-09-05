class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a=0;
        for(int i=0;i<operations.length;i++){
            char c=operations[i].charAt(1);
            if(c=='+'){
                a++;
            }else {
                a--;
            }
        }
        return a;
    }
}