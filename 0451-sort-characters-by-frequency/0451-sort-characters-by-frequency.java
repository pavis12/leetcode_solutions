class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>m=new HashMap<>();
        for(char a:s.toCharArray()){
            m.put(a,m.getOrDefault(a,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> p=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        p.addAll(m.entrySet());
        StringBuilder r=new StringBuilder();
        while(!p.isEmpty()){
            Map.Entry<Character,Integer> l=p.poll();
            r.append(String.valueOf(l.getKey()).repeat(l.getValue()));

        }
        return r.toString();

    }
}