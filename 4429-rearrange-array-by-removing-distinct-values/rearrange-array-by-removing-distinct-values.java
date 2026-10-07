class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        Map<Integer,Integer> m=new TreeMap<>();
        for(int x:nums){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        int k=0;
        while(k<n){
        for(int x:m.keySet()){
            if(m.get(x)>0){
            a[k++]=x;
            m.put(x,m.get(x)-1);
            }
        }
        }
        /*List<Integer> num=new ArrayList<>();
        for(int x:nums){
            num.add(x);
        }
        int k=0;
        while(num.size()>0){
            Set<Integer> s=new TreeSet<>();
            int i=0;
            while(i<num.size()){
                if(!s.contains(num.get(i))){
                    s.add(num.get(i));
                    num.remove(i--);
                }
                i++;
            }
            for(int x:s){
                a[k++]=x;
            }
        }*/
        return a;
    }
}