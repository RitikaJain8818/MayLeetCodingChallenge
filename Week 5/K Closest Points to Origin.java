class Solution {
    class Node{
        int index;
        int dist;
        Node(int index,int dist){
            this.index=index;
            this.dist=dist;
        }
    }
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<Node> list=new PriorityQueue<Node>(points.length, new NodeComparator());
        for(int i=0;i<points.length;i++){
            int sqDist=(int)Math.pow(points[i][0],2)+(int)Math.pow(points[i][1],2);
            Node nn=new Node(i,sqDist);
            list.add(nn);
        }
        int[][] result=new int[K][2];
        for(int i=0;i<K;i++){
            Node rn=list.poll();
            result[i][0]=points[rn.index][0];
            result[i][1]=points[rn.index][1];
        }
        return result;
        
    }
    class NodeComparator implements Comparator<Node>{
            public int compare(Node s1, Node s2) { 
                if (s1.dist > s2.dist ) 
                    return 1; 
                else if (s1.dist  < s2.dist ) 
                    return -1; 
                                return 0; 
                } 
        } 
}