class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            
            int val = nums[i] > 0 ? nums[i] : -nums[i];
            
            if(nums[val- 1] > 0) {
                nums[val- 1] = -nums[val - 1];
            }
            
            else {
                list.add(val);
            }
            
        }
        
        return list;
        
    }
}
