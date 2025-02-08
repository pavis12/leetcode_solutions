import java.util.*;

class NumberContainers {
    Map<Integer, Integer> a;
    Map<Integer, TreeSet<Integer>> m; // Use TreeSet for efficient min index retrieval

    public NumberContainers() {
        a = new HashMap<>();
        m = new HashMap<>();
    }

    public void change(int index, int number) {
        if (a.containsKey(index)) {
            int h = a.get(index);
            if (m.containsKey(h)) {
                TreeSet<Integer> l = m.get(h);
                l.remove(index); // Ensure removing by value
                if (l.isEmpty()) {
                    m.remove(h);
                }
            }
        }

        a.put(index, number);

        m.putIfAbsent(number, new TreeSet<>());
        m.get(number).add(index);
    }

    public int find(int number) {
        if (!m.containsKey(number)) {
            return -1;
        }
        return m.get(number).first(); // Retrieves the smallest index efficiently
    }
}
