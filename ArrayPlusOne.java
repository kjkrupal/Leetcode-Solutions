class Solution {
    public int[] plusOne(int[] digits) {
        
        int [] add = new int[digits.length];
        int carry = 0;
        
        add[digits.length - 1] = digits[digits.length - 1] + 1;
        
        if(add[digits.length - 1] > 9){
            carry = 1;
            add[digits.length - 1] = 0;
        }
            
        
        for(int i = digits.length - 2; i >= 0; i--){
            if(carry == 0){
                add[i] = digits[i];
            }
            else{
                add[i] = digits[i] + 1;
                if(add[i] > 9){
                    add[i] = 0;
                    carry = 1;
                }
                else{
                    carry = 0;
                }
            }
        }
        if(carry == 1){
            int [] add2 = new int[digits.length + 1];
            add2[0] = 1;
            System.arraycopy(add, 0, add2, 1, digits.length);
            add = add2;
            add2 = null;
        }
        return add;
    }
}
