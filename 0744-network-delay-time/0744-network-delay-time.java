import java.util.*;

class Pair {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int networkDelayTime(int[][] t, int n, int k) {
        List<List<Pair>> l = new ArrayList<>();
        for (int i = 0; i <= n; i++) { // Nodes are 1-based
            l.add(new ArrayList<>());
        }

        for (int i = 0; i < t.length; i++) {
            int st = t[i][0];
            int e = t[i][1];
            int we = t[i][2];
            l.get(st).add(new Pair(e, we)); // Directed graph
        }

        int d[] = new int[n + 1];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[k] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            Comparator.comparingInt((Pair p) -> p.second)
                      .thenComparingInt(p -> p.first)
        );
        
        pq.add(new Pair(k, 0));

        while (!pq.isEmpty()) {
            Pair c = pq.poll();
            int ni = c.first;
            int w = c.second;

            for (Pair p : l.get(ni)) {
                int np = p.first;
                int wp = p.second;

                if (w + wp < d[np]) {
                    d[np] = w + wp;
                    pq.add(new Pair(np, d[np]));
                }
            }
        }

        int maxTime = Arrays.stream(d, 1, n + 1).max().getAsInt();
        return (maxTime == Integer.MAX_VALUE) ? -1 : maxTime;
    }
}
