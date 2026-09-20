import java.util.*;

public class Jump {
    
    public static int oddEvenJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return n;
        
        boolean[] odd = new boolean[n];
        boolean[] even = new boolean[n];
        odd[n-1] = true;
        even[n-1] = true;
        
        // Create tree maps for finding next greater and next smaller
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(arr[n-1], n-1);
        
        for (int i = n-2; i >= 0; i--) {
            // Find for odd jump (next greater or equal)
            Map.Entry<Integer, Integer> nextGreater = map.ceilingEntry(arr[i]);
            if (nextGreater != null) {
                odd[i] = even[nextGreater.getValue()];
            }
            
            // Find for even jump (next smaller or equal)
            Map.Entry<Integer, Integer> nextSmaller = map.floorEntry(arr[i]);
            if (nextSmaller != null) {
                even[i] = odd[nextSmaller.getValue()];
            }
            
            map.put(arr[i], i);
        }
        
        // Count indices that can reach the end starting with an odd jump
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (odd[i]) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(oddEvenJumps(a));
    }
}