class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a=0;
        for(String x:operations){
            if(x.contains("+")){
                a++;
            }else if(x.contains("-")){
                a--;
            }
        }
        return a;
    }
}