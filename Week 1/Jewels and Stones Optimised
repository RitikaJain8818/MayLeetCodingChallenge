class Solution {
        public int numJewelsInStones(String j, String s) {
        boolean[] jewels = new boolean[128];
        for (int i = 0; i < j.length(); i++) {
            jewels[j.codePointAt(i)] = true;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (jewels[s.codePointAt(i)]) {
                count++;
            }
        }
        return count;
    }
}