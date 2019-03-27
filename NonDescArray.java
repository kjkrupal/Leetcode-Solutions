class Solution {
    public boolean checkPossibility(int[] nums) {
        
        int p = -1;
        
        for(int i = 0; i < nums.length - 1; i++) {
            
            if(nums[i] > nums[i+1]) {
                if(!(p < 0)) {
                    return false;
                }
                p = i;
            }
            
        }
        return (p < 0 || p == 0 || p == nums.length - 2 || 
               nums[p-1] <= nums[p+1] || nums[p] <= nums[p+2]);
        
    }
}
