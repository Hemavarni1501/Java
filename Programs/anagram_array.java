import java.util.*;
import java.util.HashMap;

public class anagram_array {

    public static List<List<String>> groupAnagrams(String[] str) {
        HashMap<String, ArrayList<String>>map=new HashMap<>();
        for(String word:str){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String k=new String(ch);
            if(!map.containsKey(k)){map.put(k,new ArrayList<>());}
            map.get(k).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] ip={"eat", "tea", "tan","ate","nat","bat"};
        List<List<String>> res=groupAnagrams(ip);
        System.out.println(res);
    }
}