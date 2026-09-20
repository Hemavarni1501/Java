import java.util.*;

public class candidate_target {

    public static List<List<Integer>> find(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] arr, int target, int start,
                                  List<Integer> current,
                                  List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) return;

        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            backtrack(arr, target - arr[i], i, current, result);
            current.remove(current.size() - 1); // backtrack
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        List<List<Integer>> res = find(a, tar);
        System.out.println(res);
    }
}