class Solution {
    public List<List<String>> groupAnagrams(String[] st) {
         Map<String, List<String>> m=new HashMap<>();
        for(int i=0;i<st.length;i++){
          char[] a=st[i].toCharArray();
          Arrays.sort(a);
          String key=new String(a);
          m.computeIfAbsent(key, k->new ArrayList<>()).add(st[i]);
        }
        List<List<String>> l = new ArrayList<>(m.values());
        l.sort((list1, list2) -> Integer.compare(list1.size(), list2.size()));
        return l;
    }
}