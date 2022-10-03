class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length; // length of array
        int res[] = new int[n - k + 1]; // initialising the answer array
        int idx = 0; // pointer for filling the answer array
        Deque<Integer> queue = new ArrayDeque<Integer>(); 
        // traverse the given array
        for(int hi = 0; hi < n; hi++){  
            // starting index of our window
            int start = hi - k + 1; 
            // if our index does not lie in window then remove
            if(!queue.isEmpty() && queue.peek() < start){ 
                queue.poll();
         
            }   
            // since current index has larger value, we do not need previous indices
            while(!queue.isEmpty() && nums[hi] >= nums[queue.peekLast()]){
                queue.pollLast();
            }
            // add the current index in array
            queue.offer(hi);
            // if we can make a window of size k, then insert into answer array
            if(start >= 0){
                res[idx++] = nums[queue.peek()];
            }
        }
        // return answer array
        return res;
    }
}
