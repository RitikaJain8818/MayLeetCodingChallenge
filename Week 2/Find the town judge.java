class Solution {
  public int findJudge(int N, int[][] trust) {
        int[] arr = new int[N+1];
        for (int[] temp: trust) {
            arr[temp[0]]--;
            arr[temp[1]]++;
        }
        for (int i = 1; i <= N; i++) {
            if (arr[i] == N - 1) 
                return i;
        }
        return -1;
    }
}