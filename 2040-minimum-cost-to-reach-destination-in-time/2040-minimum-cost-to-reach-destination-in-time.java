class Four {
    int n;
    int w;
    int t;
    Four(int n, int w, int t) {
        this.n = n;
        this.w = w;
        this.t = t;
    }
}

class Solution {
    public int minCost(int m, int[][] e, int[] p) {
        int n = p.length;
        List<List<Four>> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(new ArrayList<>());
        }
        
        for (int i = 0; i < e.length; i++) {
            int st = e[i][0];
            int en = e[i][1];
            int ti = e[i][2];
            l.get(st).add(new Four(en, ti, p[en]));
            l.get(en).add(new Four(st, ti, p[st]));    
        }
        
        int[] d = new int[n];
        int[] time = new int[n];
        Arrays.fill(d, Integer.MAX_VALUE);
        Arrays.fill(time, Integer.MAX_VALUE);
        
        PriorityQueue<Four> pq = new PriorityQueue<>(Comparator.comparingInt((Four f) -> f.w)
                                                                .thenComparingInt(f -> f.t)
                                                                .thenComparingInt(f -> f.n));
        pq.add(new Four(0, p[0], 0));
        d[0] = p[0];
        time[0] = 0;
        
        while (!pq.isEmpty()) {
            Four f = pq.poll();
            int cn = f.n;
            int wi = f.w;
            int t = f.t;
            
            if (cn == n - 1) return wi;
            
            for (Four k : l.get(cn)) {
                int kn = k.n;
                int kw = k.w;
                int kt = k.t;
                int newTime = t + kw;
                int newCost = wi + kt;
                
                if (newTime <= m && (newCost < d[kn] || newTime < time[kn])) {
                    d[kn] = newCost;
                    time[kn] = newTime;
                    pq.add(new Four(kn, newCost, newTime));
                }
            }
        }
        return -1;
    }
}
