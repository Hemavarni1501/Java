class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer, Integer> m=new HashMap<>();
        while(n>0){
            int d=n%10;
            m.put(d,m.getOrDefault(d,0)+1);
            n/=10;
        } int s=0;
        for(Map.Entry<Integer, Integer>e:m.entrySet()){
            int k=e.getKey();
            int v=e.getValue();
            s+=k*v;
        }
        return s;
    }
}