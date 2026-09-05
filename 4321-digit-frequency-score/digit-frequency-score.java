class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer, Integer> m=new HashMap<>();
        for(;n>0;){
            int d=n%10;
            m.put(d,m.getOrDefault(d,0)+1);
            n/=10;
        }
        int s=0;
        for(Map.Entry<Integer, Integer> e:m.entrySet()){
            s+=e.getKey()*e.getValue();
        }
        return s;
    }
}