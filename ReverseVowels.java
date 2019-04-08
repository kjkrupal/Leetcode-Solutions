class Solution {
    public String reverseVowels(String s) {
        
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        
        while(i < j) {
            if(isVowel(c[i]) && isVowel(c[j])) {
                swap(c, i, j);
                i++;
                j--;
            }
            
            if(!isVowel(c[i]))
                i++;
            if(!isVowel(c[j]))
                j--;
        }
        
        return new String(c);
        
    }
    
    private boolean isVowel(char c) {
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
            return true;
        return false;
    }
    
    private void swap(char[] c, int i, int j) {
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }
}
