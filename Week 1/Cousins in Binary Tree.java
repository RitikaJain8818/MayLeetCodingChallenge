/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class nn{
    TreeNode node;
    int level=0;
    public nn(TreeNode node,int level){
        this.node=node;
        this.level=level;
    }
}
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        nn node1=new nn(root,0);
        nn node2=new nn(root,0);
        findLevel(root,x,node1,0);
        findLevel(root,y,node2,0);
        if(node1.node!=node2.node&&node1.level==node2.level)
            return true;
        return false;
    }
    private void findLevel(TreeNode node,int value,nn n,int level){
        if(node.left==null&&node.right==null)
            return;
        if(node.left!=null){
            if(node.left.val==value){
                n.node=node;
                n.level=level+1;
                return;
            }else
                findLevel(node.left,value,n,level+1);
        }
        if(node.right!=null){
            if(node.right.val==value){
                n.node=node;
                n.level=level+1;
                return;
            }else
                findLevel(node.right,value,n,level+1);
        }
        return;
    }
}