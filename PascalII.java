class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        int previous = 1;
        
        for(int i = 1; i <= rowIndex; i++) {
            for(int j = 1; j < i; j++) {
                int current = ans.get(j);
                ans.set(j, current + previous);
                previous = current;
            }
            ans.add(1);
        }
        
        return ans;
        
    }
}
