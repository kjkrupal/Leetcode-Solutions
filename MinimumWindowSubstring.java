class Solution {
    public String minWindow(String S, String T) {
        
        
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        
        if(s.length < t.length) {
            return "";
        }
        
        int left = 0;
        int right = 0;
        int st = 0;        
        int minlen = Integer.MAX_VALUE;
        int en = 0;
        
        String ans = "";
        
        while(right < s.length) {
            
            boolean check = doesSatisfy(t, s, left, right);
            
            if(check) {
                int len = right - left + 1;
                System.out.println(len);
                if(len < minlen) {
                    minlen = len;
                    st = left;
                    en = right;
                }
                left ++;
            }
            else {
                right ++;
            }
        }
        
        if(minlen > 0 && minlen != Integer.MAX_VALUE) {
            return getString(s, st, en);
        }
            
        else
            return "";
    }
    
    public boolean doesSatisfy(char[] t, char[] s, int start, int end) {
        
        
        Set <Character> set = new HashSet<>();
        
        for(int i = start; i <= end; i++) {
            set.add(s[i]);
        }
        
        for(int i = 0; i < t.length; i++) {
            if(!set.contains(t[i])){
                set = null;
                return false;
            }
                
        }
        set = null;
        return true;
    }
    
    public String getString(char[] s, int start, int end) {
        
        String ans = "";
        
        for(int i = start; i <= end; i++) {
            ans += s[i];
        }
        return ans;
    }
    
}
