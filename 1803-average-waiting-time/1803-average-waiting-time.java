class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currentTime = 0;
        long totalwaitTime = 0;  // Use long to avoid overflow
        
        for (int[] customer : customers) {
            int arrival = customer[0];
            int time = customer[1];
            
            if (currentTime < arrival) {
                currentTime = arrival;
            }
            
            int waitTime = currentTime + time - arrival;
            totalwaitTime += waitTime;
            
            currentTime += time;
        }
        
        return (double) totalwaitTime / customers.length;
    }
}
