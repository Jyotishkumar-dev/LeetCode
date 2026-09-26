class Solution {
    public int countPrimes(int n) {
        // Base case: There are no primes strictly less than 2
        if (n <= 2) {
            return 0;
        }

        // Create a boolean array where 'false' means prime, and 'true' means NOT prime
        // By default, Java initializes boolean arrays with 'false'
        boolean[] isNotPrime = new boolean[n];
        int count = 0;

        // Loop from 2 up to the square root of n
        for (int i = 2; i * i < n; i++) {
            // If the number is still marked false, it is a prime
            if (!isNotPrime[i]) {
                // Mark all multiples of i as NOT prime, starting from i * i
                for (int j = i * i; j < n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        // Count how many numbers are still marked as prime (false)
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
