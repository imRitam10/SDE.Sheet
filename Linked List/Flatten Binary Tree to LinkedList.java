/************************************************************

    Following is the TreeNode class structure.

	class TreeNode<T>{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data){
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/

public class Solution {
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root){
        // Write your code here.
        TreeNode curr = root;
        while (curr != null){
            if(curr.left != null){
                TreeNode prev = curr.left;
                while(prev.right != null){
                    prev = prev.right;
                }
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
        return root;
    }
}
