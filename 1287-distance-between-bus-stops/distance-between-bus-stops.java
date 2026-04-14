class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwiseDistance = 0;
        int totalDistance = 0;
        
       
        int s = Math.min(start, destination);
        int d = Math.max(start, destination);
        
        for (int i = 0; i < distance.length; i++) {
          
            if (i >= s && i < d) {
                clockwiseDistance += distance[i];
            }
            
            totalDistance += distance[i];
        }
        
        
        return Math.min(clockwiseDistance, totalDistance - clockwiseDistance);
    }
}
