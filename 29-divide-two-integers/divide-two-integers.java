class Solution{
    public int divide(int a,int b){
        if(b==1) return a;
        if(b==-1) return a==Integer.MIN_VALUE?Integer.MAX_VALUE:-a;
        long x=Math.abs((long)a),y=Math.abs((long)b),r=0;
        for(int i=31;i>=0;i--)
            if((x>>i)>=y){
                x-=y<<i;
                r+=1L<<i;
            }
        r=(a^b)<0?-r:r;
        return (int)r;
    }
}