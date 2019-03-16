class Solution {
    public String toLowerCase(String str) {
        
        String lower = "";
        for(int i = 0; i < str.length(); i++) {
            if(65 <= (int) str.charAt(i) && (int) str.charAt(i) < (65 + 26)){
                lower = lower + Character.toString((char)((int) str.charAt(i) + 32));
            }
            else {
                lower = lower + Character.toString(str.charAt(i));
            }
        } 
        return lower;
    }
}
