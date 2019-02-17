class Solution {
    public int addDigits(int num) {
        
        if(num == 0)
            return 0;
        
        int quotient = num / 9;
        
        if((num - 9 * quotient) == 0)
            return 9;
        
        return num - (9 * quotient);
        
    }
}
