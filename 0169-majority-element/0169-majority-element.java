class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            // If count becomes 0,
            // choose the current number as candidate
            if (count == 0) {
                candidate = num;
            }

            // Same number -> increase strength
            // Different number -> cancel strength
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}

