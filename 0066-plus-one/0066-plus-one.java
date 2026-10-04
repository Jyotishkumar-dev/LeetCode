class Solution {
    public int[] plusOne(int[] digits) {
        // Step 1: Traverse the array from right to left
        for (int i = digits.length - 1; i >= 0; i--) {
           
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Return early
            }
            
            
            digits[i] = 0;
        }
        
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; 
        
        return newDigits;
    }
}
