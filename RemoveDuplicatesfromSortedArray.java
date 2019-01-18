class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        int sum = 0;
        int prev = nums[0];
        int pointer = 1;
        
        for(int i = 1; i < nums.length; ++i){
            
            if(prev == nums[i]){
                continue;
            }
            else{
                nums[pointer] = nums[i];
                prev = nums[i];
                sum ++;
                pointer ++;
            }
            
        }
        return ++sum;
    }
}
