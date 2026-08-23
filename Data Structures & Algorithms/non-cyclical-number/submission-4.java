class Solution {
    public boolean isHappy(int n) {
        if (n == 0) return false;

        Set<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
             set.add(n);

             n = sumOfSquares(n);

             if (n == 1) {
                return true;
             }
        }

        return false;
    }

    private int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }
}
