package Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {
     class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static void main(String[] args) {

    }
    List<Integer> l=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return l;
    }

    void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
    }
}
