class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> a=new HashSet<>();
        for(int i=0;i<s.length();i++){
            a.add(s.charAt(i));
        }
        return a.size();
    }
}