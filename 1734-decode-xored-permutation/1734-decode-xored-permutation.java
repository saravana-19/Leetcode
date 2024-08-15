 class Solution {

    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int totalXor = 0;
        for (int i = 1; i <= n; i++) {
            totalXor ^= i;
        }
        int oddIndexXor = 0;
        for (int i = 1; i < n - 1; i += 2) {
            oddIndexXor ^= encoded[i];
        }

        // Determine the first element of the permutation
        int first = totalXor ^ oddIndexXor;

        // Construct the permutation array
        int[] perm = new int[n];
        perm[0] = first;
        for (int i = 0; i < n - 1; i++) {
            perm[i + 1] = perm[i] ^ encoded[i];
        }

        return perm;
    }

}
