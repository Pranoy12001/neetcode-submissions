class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;

        return isNumberHappy(n);
    }

    private boolean isNumberHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            if (sum == 1) return true;
            n = sum;
        }

        return false;
    }
}
