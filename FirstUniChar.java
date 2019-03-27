class Solution {
    public int firstUniqChar(String s) {
        
        int [] arr = new int[26];
        char[] str = s.toCharArray();
        
        for(int i = 0; i < str.length; i++) {
            arr[str[i] - 'a'] = arr[str[i] - 'a'] + 1; 
        }
        
        for(int i = 0; i < str.length; i++) {
            if(arr[str[i] - 'a'] == 1) {
                return i;
            } 
        }
        return -1;
    }
}
