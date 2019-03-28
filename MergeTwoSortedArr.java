class Solution {
    public void merge(int[] nums, int m, int[] nums2, int n) {
        
        int [] nums1 = new int[m];
        
        for (int i = 0; i < m; i++) {
            nums1[i] = nums[i];
        }
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(k != (m+n)) {
            if(i < m && j < n) {
                if(nums1[i] <= nums2[j]){
                    nums[k++] = nums1[i];
                    i++;
                }
                else if(nums1[i] > nums2[j]) {
                    nums[k++] = nums2[j];
                    j++;
                }
            }
            else if(i >=m) {
                nums[k++] = nums2[j];
                j++;
            }
            else {
                nums[k++] = nums1[i];
                i++;
            }
            
        }
    }
}
