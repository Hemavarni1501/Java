import java.util.*;
public class String_freq {
    public static String countLetters(String s) {
        LinkedHashMap<Character, Integer> counts = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String result = countLetters(input);
        System.out.println(result); // Output: a2b3c2d1e1
    }
}