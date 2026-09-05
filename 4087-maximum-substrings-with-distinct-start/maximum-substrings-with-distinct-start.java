class Solution {
    public int maxDistinct(String s) {
        Set<Character> a=new HashSet<>();
        for(char x:s.toCharArray()){
            a.add(x);
        }
        return a.size();
    }
}