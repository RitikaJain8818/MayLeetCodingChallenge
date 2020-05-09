class Solution {
    public boolean isPerfectSquare(int num) {
        double sqrt=Math.sqrt(num);
        if((int)sqrt==sqrt){
            return true;
        }
        return false;
    }
}