class Solution {
    
    public boolean rotateString(String A, String B) {
        
        if(A.equals(B))
            return true;
        
        int alen = A.length();
        int blen = B.length();
        
        if(alen != blen)
            return false;
        
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        
        char first = a[0];
        
        int j = 0;
        
        boolean found = true;
        
        for(; j < b.length; j++) {
            int temp = j;
            
            if(first == b[j]) {
                found = true;
                for(int i = 0; i < a.length; i++, j++) {
                    if(j == b.length)
                        j = 0;
            
                    if(a[i] != b[j]) {
                        found = false;
                        break;
                    }
                }
                if(found) {
                    return true;
                }
                j = temp;
            }
                
        }
        
        
        
        return false;
        
    }
    
}
