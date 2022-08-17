import java.util.ArrayList;

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
class BSTIterator {

    public ArrayList<Integer> sorted;
    public int index = -1;

    public BSTIterator(TreeNode root) {
        sorted = new ArrayList<>();

        inorder(root);
    }

    public void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        sorted.add(root.val);
        inorder(root.right);
    }
    
    public int next() {
        return sorted.get(index++);
    }
    
    public boolean hasNext() {
        return index+1 < sorted.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */