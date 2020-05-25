class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> list=new ArrayList<int[]>();
        int i=0;
        int j=0;
        while(i<A.length&&j<B.length){
            int firstValue=Math.max(A[i][0],B[j][0]);
            int secondValue=Math.min(A[i][1],B[j][1]);
            if(firstValue<=secondValue){
                int[] a=new int[2];
                a[0]=firstValue;
                a[1]=secondValue;
                list.add(a);
            }
            int next=Math.max(A[i][1],B[j][1]);
            if(next==A[i][1])
                j++;
            else
                i++;
        }
        int[][] arr=new int[list.size()][2];
        for(int k=0;k<list.size();k++){
            arr[k]=list.get(k);
        }
        return arr;
    }
}