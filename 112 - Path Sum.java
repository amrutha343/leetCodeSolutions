/*
This is the direct answer added into leetcode. I am trying to code the behind the scene logic of the traversal so that we can see end to end flow.
*/
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.val == targetSum && root.left == null && root.right ==null)
            return true;
        boolean boo =  hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
                    
        return boo;
    }
}
