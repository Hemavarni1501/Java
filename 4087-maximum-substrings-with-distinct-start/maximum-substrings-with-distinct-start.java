class Solution {
       public int maxDistinct(String s) {
    boolean[] arr = new boolean[26];
    int count = 0; 
    
    for (char ch : s.toCharArray()) {
        int x = ch - 'a';
        if (!arr[x]) { 
            arr[x] = true;
            count++;
        }
    }
    return count;
}
}