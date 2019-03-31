class Solution {
    public String addBinary(String A, String B) {
        
        StringBuilder sum = new StringBuilder();
        
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        
        int i = a.length - 1;
        int j = b.length - 1;
        
        char carry = '0';
        
        while(i >= 0 && j >= 0) {
            if(a[i] == b[j] && carry == '0') {
                if(a[i] == '1') {
                    // 1, 1, 0
                    carry = '1';
                    sum.append("0");
                }
                else {
                    // 0, 0, 0
                    sum.append("0");
                }
            }
            else if(a[i] == b[j] && carry == '1') {
                if(a[i] == '1') {
                    // 1, 1, 1
                    carry = '1';
                    sum.append("1");
                }
                else {
                    // 0, 0, 1
                    carry = '0';
                    sum.append("1");
                }
            }
            else if(a[i] != b[j] && carry == '0') {
                // 0, 1, 0
                carry = '0';
                sum.append("1");
            }
            else if(a[i] != b[j] && carry == '1') {
                // 0, 1, 1
                carry = '1';
                sum.append("0");
            }
            i--;
            j--;
        }
         
        while(i >= 0) {
            if(carry == '0') {
                if(a[i] == carry) {
                    sum.append("0");
                }
                else {
                    sum.append("1");
                }
            } 
            else {
                
                if(a[i] == carry) {
                    carry = '1';
                    sum.append("0");
                }
                else {
                    carry = '0';
                    sum.append("1");
                }
            }
            i--;
        }
        
        while(j >= 0) {
            if(carry == '0') {
                if(b[j] == carry) {
                    sum.append("0");
                }
                else {
                    sum.append("1");
                }
            } 
            else {
                
                if(b[j] == carry) {
                    carry = '1';
                    sum.append("0");
                }
                else {
                    carry = '0';
                    sum.append("1");
                }
            }
            j--;
        }
        
        if(carry == '1') {
            sum.append("1");
        }
        return sum.reverse().toString();
    }
}
