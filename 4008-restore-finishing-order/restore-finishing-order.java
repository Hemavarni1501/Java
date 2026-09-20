class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] a=new int[friends.length];
        int x=0; boolean f=false;
        for(int i=0;i<order.length;i++){
            f=false;
            for(int j=0;j<friends.length&&!f;j++){
                if(order[i]==friends[j]){
                    a[x++]=order[i];
                    f=true;
                }
            }
        }
        return a;
    }
}