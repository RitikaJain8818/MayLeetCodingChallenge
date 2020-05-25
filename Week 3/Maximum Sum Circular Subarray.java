class Solution{
    public int maxSubarraySumCircular(int[] A) {
        int localMax = -30001, globalMax = -30001, localMin = 30001, globalMin  = 30001, sum = 0;
        for(int e : A) {
            sum += e;
            localMax = Math.max(localMax + e, e);
            localMin = Math.min(localMin + e, e);
            globalMax = Math.max(globalMax, localMax);
            globalMin = Math.min(globalMin, localMin);
        }
        return globalMax > 0 ? Math.max(globalMax, sum - globalMin) : globalMax;
    }
}