class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        int[] hash = new int[26];
        
        char [] ss = s.toCharArray();
        char [] tt = t.toCharArray();
        
        for(int i = 0; i < ss.length; i++) {   
            hash[ss[i] - 'a']++;
            hash[tt[i] - 'a']--;
        }
        
        for(int i = 0; i < hash.length; i++) {   
            if(hash[i] != 0)
                return false;
        }
        
        return true;
        
    }
}
