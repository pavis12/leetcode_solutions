class Solution {
    public int[] deckRevealedIncreasing(int[] d) {
        Queue<Integer> q=new LinkedList<>();
        int r[]=new int[d.length];
        Arrays.sort(d);
        for(int i=0;i<d.length;i++){
            q.offer(i);
        }
        for(int i=0;i<d.length;i++){
            r[q.poll()]=d[i];
            q.offer(q.poll());
            
        }
        return r;
    }
}