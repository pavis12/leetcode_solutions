class Solution {
    public int countGoodNumbers(long n) {
        int MOD = 1000000007;
        long evenCount = (n + 1) / 2; 
        long oddCount = n / 2;  

        // Modular exponentiation to compute (base^exp) % MOD
        long evenWays = modularExponentiation(5, evenCount, MOD); // Ways for even indices
        long oddWays = modularExponentiation(4, oddCount, MOD);  // Ways for odd indices

       
        return (int)((evenWays * oddWays) % MOD);
    }

    // Function to perform modular exponentiation
    private long modularExponentiation(long base, long exp, int mod) {
        long result = 1;
        base = base % mod; // Handle large bases

        while (exp > 0) {
            // If exp is odd, multiply the current base with the result
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            // Square the base and reduce the exponent by half
            base = (base * base) % mod;
            exp /= 2;
        }

        return result;
    }
}
