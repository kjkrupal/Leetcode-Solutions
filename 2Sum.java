class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] sol = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            
            if(map.containsKey(comp)) {
                sol[0] = map.get(comp);
                sol[1] = i;
                return sol;
            }
            
            map.put(nums[i], i);
                
        }
        return sol;
        
    }
}
