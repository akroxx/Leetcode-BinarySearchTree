import java.util.ArrayList;

class Solution{
    ArrayList<Integer> res = new ArrayList<>();

    public boolean isValidBST(TreeNode root){
        if(root == null)
            return true;

        helper(root);
        for(int i = res.size() - 1; i >= 1; i--){
            if(res.get(i) <= res.get(i-1))
                return false;
        }

        return true;
    }

    void helper(TreeNode curr){
        if(curr == null) return;

        helper(curr.left);
        res.add(curr.val);
        helper(curr.right);
    }
}