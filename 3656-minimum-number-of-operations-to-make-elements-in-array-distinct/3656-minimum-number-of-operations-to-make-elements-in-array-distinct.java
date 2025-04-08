import java.util.*;

class Solution {
    public int minimumOperations(int[] n) {
        if (isd(n)) return 0;
        int c = 0;
        while (!isd(n)) {
            n = rm(n);
            c++;
        }
        return c;
    }

    public boolean isd(int[] n) {
        Set<Integer> set = new HashSet<>();
        for (int val : n) {
            if (!set.add(val)) return false;
        }
        return true;
    }

    public int[] rm(int[] n) {
        if (n.length <= 3) return new int[]{};
        int[] p = new int[n.length - 3];
        for (int i = 3; i < n.length; i++) {
            p[i - 3] = n[i];
        }
        return p;
    }
}
