
class TimeColourfulBaloons {
    public int minCost(String colours, int[] time) {
        // after removing a colour, we need to remove that balloon from the array
        int ans = 0;
        int min = 0;
        for(int i=1; i<time.length; i++){
            if(colours.charAt(i) == colours.charAt(i-1)){
                
                // finding which baloon to remove by checking thier times. once removed, that balloon must take the time of the other balloon, as that is the next available balloon with the same colour.
                
                if(time[i]<time[i-1]){ 
                    min = time[i];
                    time[i] = time[i-1];
                }
                else{
                    min = time[i-1];
                    time[i-1] = time[i];
                }
                
                ans += min; // just add the minimum time to the answer
            }
        }
        return ans;
    }
}