class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        solution(result,resultList,0,nums.length-1,nums,used);
        return result;
    }
    
    public void solution(List<List<Integer>> result,List<Integer> resultList,int k,int N,int [] nums,boolean[] used){
        
        if(k == N + 1){
            result.add(new ArrayList<>(resultList));
        }
        
        for(int i = 0; i <= N; i++) {
            if(!used[i]) {
                resultList.add(nums[i]);
                used[i] = true;
                solution(result, resultList, k + 1, N, nums, used);
                used[i] = false;
                resultList.remove(resultList.size() - 1);
            }

        }

    }
}
