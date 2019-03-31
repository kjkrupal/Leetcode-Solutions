class Solution {
    public String reverseOnlyLetters(String S) {
        
        char[] s = S.toCharArray();
        
        reverse(s, 0, s.length - 1);
        
        return new String(s);
    }
    
    public void reverse(char[] c, int s, int e) {
        
        while(s < e) {
            if(Character.isLetter(c[s]) && Character.isLetter(c[e])) {
                char temp = c[s];
                c[s] = c[e];
                c[e] = temp;
                s++;
                e--;
            }
            else if(!Character.isLetter(c[s]) && !Character.isLetter(c[e])) {
                s++;
                e--;
            }
            else if(!Character.isLetter(c[s])) {
                s++;
            }
            else {
                e--;
            }
            
        }
        
    }
}
