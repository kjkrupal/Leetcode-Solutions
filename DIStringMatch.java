class Solution {
    public int[] diStringMatch(String S) {
       
        int[] arr = new int[S.length() + 1];
        int low = 0;
        int high = S.length();
        
        for(int i = 0; i < arr.length - 1; i++){
            if(S.charAt(i) == 'I'){
               arr[i] = low++;
               //low++;
            }
            else{
                arr[i] = high--;
                //high--;
            }
        }
        
        //if(S.charAt(S.length() - 1) == 'D') 
            arr[S.length()] = low;
        //else arr[S.length()] = high;
        
        return arr;
        
    }
}
