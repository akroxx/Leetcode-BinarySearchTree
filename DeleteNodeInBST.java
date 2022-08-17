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
class Solution {

    public TreeNode findSuccessor(TreeNode root){
        TreeNode curr = root.right;
        while(curr != null && curr.left != null){
            curr = curr.left;
        }

        return curr;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }

        //delete curr node if root is target
        if(root.val == key){
            if(root.left == null){
                return root.right;
            }

            if(root.right == null){
                return root.left;
            }

            //replace root with its successor if root has two children
            TreeNode s = findSuccessor(root);
            root.val = s.val;
            root.right = deleteNode(root.right,s.val);
            return root;
        }

        if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else{
            root.left = deleteNode(root.left, key);
        }

        return root;
    }
    
}