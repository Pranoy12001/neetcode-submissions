class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int empty = flowerbed[0] == 0 ? 1 : 0;

        for (int spot : flowerbed) {
            if (spot == 1) {
                n-= (empty - 1) / 2;
                empty = 0;
            } else {
                empty++;
            }

            if (n <= 0) {
                return true;
            }
        }

        n-= empty / 2;

        return n <= 0;
    }
}