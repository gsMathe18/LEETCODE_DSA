class Solution {
    public boolean canAliceWin(int n) {
        return play(n, 10, true);
    }
    private boolean play(int n, int remove, boolean aliceTurn) {

        if (n < remove) {
            return !aliceTurn;
        }

        return play(n - remove, remove - 1, !aliceTurn);
    }
}