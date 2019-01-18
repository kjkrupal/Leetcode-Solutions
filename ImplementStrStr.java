class Solution {
    public int strStr(String haystack, String needle) {
        
        int soln = 0;
        
        if(!haystack.contains(needle)){
            return -1;
        }
        
        return haystack.indexOf(needle);
    }
}
