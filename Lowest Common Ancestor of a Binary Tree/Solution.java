import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*这个题主要就是找到最近的公共祖先，起初我以为是排好大小bst，于是就用这种方法，当前节点比p大，比q小，那个当前节点就是要找的lca了，
如果当前节点比p和q都小，那个lca必然在当前节点的右子树，如果当前节点比p和q都大，那么lca必然在当前节点的左子树。
但是这里有问题，没有说是按照大小排列的，所以后来改成，dps搜索出来节点的路径，用一个队列记录下来，然后从上往下
比较两个队列的数，找到lca。
*/
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	 if(root==null||p == null||q == null) return null;
    	 ArrayDeque<TreeNode> p_queue= new ArrayDeque<TreeNode>();
    	 ArrayDeque<TreeNode> q_queue= new ArrayDeque<TreeNode>();
    	 if(!find(root,p_queue,p)||!find(root,q_queue,q))return null;
    	 TreeNode lca = new TreeNode(1);
    	 while(true){
    	 	TreeNode pt = p_queue.pollLast();
    	 	TreeNode qt = q_queue.pollLast();
    	 	if(pt==qt) {
    	 		lca = pt;
    	 	}else {
    	 		return lca;
    	 	}
    	 }
    }
    private boolean find(TreeNode root,ArrayDeque<TreeNode> queue,TreeNode target){
    	if(root==null) return false;
    	if(root == target) {
    		queue.add(target);
    		return true;
    	}
    	if(find(root.left,queue,target)){
    		queue.add(root);
    		return true;
    	}else if(find(root.right,queue,target)){
    		queue.add(root);
    		return true;
    	}else return false;
    }
}