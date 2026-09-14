class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Thread t1 = new Thread(() -> {
            Arrays.sort(g);
        });
        Thread t2 = new Thread(() -> {
            Arrays.sort(s);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
        }

        int i=0;
        int j=0;
        while(i<s.length && j< g.length) {
            
            if(s[i]>=g[j]){
                j++;
            }
            i++;
        }
        return j++;
    }
}