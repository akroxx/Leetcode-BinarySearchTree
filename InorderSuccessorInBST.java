/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode res = null;
        TreeNode curr = root;

        while(curr != null){
            if(p.val >= curr.val){  //go-right
                curr = curr.right;
            }
            else{   //p.val < curr.val  -> go-left
                res = curr; //potential answer since curr.val > p.val
                curr = curr.left;
            }
        }

        return res;
    }
}