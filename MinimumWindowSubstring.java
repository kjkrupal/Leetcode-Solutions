class Solution {
    
    Map <Character, Integer> mapb = new HashMap<>();
    
    public String minWindow(String S, String T) {
        
        
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        
        if(s.length < t.length) {
            return "";
        }
        
        populate(t);
        
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
    
    public void populate(char[] t) {
        for(int i = 0; i < t.length; i++) {
            mapb.put(t[i], mapb.getOrDefault(t[i], 0) + 1);
        }
    }
    
    public boolean doesSatisfy(char[] t, char[] s, int start, int end) {
        
        Map <Character, Integer> mapa = new HashMap<>();
        
        for(int i = start; i <= end; i++) {
            mapa.put(s[i], mapa.getOrDefault(s[i], 0) + 1);
        }
        
        for(char k : mapb.keySet()) {
            if(!(mapa.containsKey(k) && mapa.get(k) >= mapb.get(k)))
                return false;
        }
        
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
