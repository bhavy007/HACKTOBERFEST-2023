class Solution {
    public int largestRectangleArea(int[] nums) {
        int n = nums.length;
        int[] l_smaller = new int[n];
        int[] r_smaller = new int[n];
        
        Deque<Integer> stack = new ArrayDeque<>(); 
        l_smaller[0] = -1;
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]){
                stack.pop();
            }      
            if(!stack.isEmpty()){
                l_smaller[i] = stack.peek();
            }else{
                l_smaller[i] = -1;
            } 
            stack.push(i);
        }
        
        stack = new ArrayDeque<>();
        r_smaller[n - 1] = n;
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]){
                stack.pop();
            }      
            if(!stack.isEmpty()){
                r_smaller[i] = stack.peek();
            }else{
                r_smaller[i] = n;
            } 
            stack.push(i);
        }
        
        int maxArea = 0;
        for(int i = 0; i < n; i++){
            int area = nums[i] * (r_smaller[i] - l_smaller[i] - 1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}
