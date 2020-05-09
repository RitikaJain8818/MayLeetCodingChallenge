class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==1)
            return true;
        int x1=coordinates[0][0];
        int y1=coordinates[0][1];
        int x2=coordinates[1][0];
        int y2=coordinates[1][1];
        float m=(float)(y2-y1)/(x2-x1);
        //System.out.println(m);
        int px=x2;
        int py=y2;
        for(int i=2;i<coordinates.length;i++){
            int x=coordinates[i][0];
            int y=coordinates[i][1];
            float new_m=(float)(y-py)/(x-px);
            //System.out.println(m);
            if(m!=new_m)
                return false;
            px=x;
            py=y;
        }
        return true;
    }
}