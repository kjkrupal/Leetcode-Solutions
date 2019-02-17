class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0)
            return "";
        
        if(strs.length == 1)
            return strs[0];
        
        String lcp = strs[0];
        boolean found = false;
        
        
        for(int i = 0; i < strs[0].length(); i++){
            int j = 1;
            for(j = 1; j < strs.length; j++){
                if(strs[j].length() >= lcp.length() && strs[j].substring(0, lcp.length()).equals(lcp)){
                    continue;
                }
                else{
                    lcp = lcp.substring(0, lcp.length() - 1);
                    if(lcp.length() == 0){
                        found = true;
                        lcp = "";
                        break;
                    }
                    break;
                }
                
            }
            if(j == strs.length)
                break;
            if(found)
                break;
            
        }
        return lcp;
        
    }
}
