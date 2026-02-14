package leetcode;
import java.util.*;

public class leetcomb3 {

    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        List<List<Integer>> ans = new ArrayList<>();
        findcomb3(1, k, n, ans, new ArrayList<>());

        System.out.println(ans);
    }

    public static void findcomb3(int num, int k, int target, List<List<Integer>> ans, List<Integer> db) {

        if (target == 0 && k == 0) {
            ans.add(new ArrayList<>(db));
            return;
        }

        if (k == 0) return;

        for (int i = num; i <= 9; i++) {

            if (i > target) break;

            db.add(i);  // ✅ choose

            findcomb3(i + 1, k - 1, target - i, ans, db);

            db.remove(db.size() - 1);  // ✅ backtrack
        }
    }
}
