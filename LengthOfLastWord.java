class Solution {
    public int lengthOfLastWord(String s) {
        
        if(s.equals(""))
            return 0;
        
        String[] sarr = s.split(" ");
        
        if(sarr.length == 0)
            return 0;
        
        char[] word = sarr[sarr.length-1].toCharArray();
        
        int length = 0;
        
        for(int i = 0; i < word.length; i++){
            length++;    
        }
        return length;
        
        
    }
}
