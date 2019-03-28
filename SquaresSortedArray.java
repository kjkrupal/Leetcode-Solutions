lass Solution {
    public int[] sortedSquares(int[] A) {
        
        int negative_count = 0;
        
        while(negative_count < A.length && A[negative_count] < 0) {
            negative_count++;
        }
        
        int j = negative_count;
        int i = negative_count - 1;
        int t = 0;
        
        int arr[] = new int[A.length];
        
        while(i >= 0 && j < A.length) {
            
            if(A[i] * A[i] < A[j] * A[j]) {
                arr[t++] = A[i] * A[i];
                i--;
            }
            else {
                arr[t++] = A[j] * A[j];
                j++;
            }
        }
        
        while(i >= 0) {
            arr[t++] = A[i] * A[i];
            i--;
        }
        
        while(j < A.length) {
            arr[t++] = A[j] * A[j];
            j++;
        }
        
        return arr;
        
    }
}
