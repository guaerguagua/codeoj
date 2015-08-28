import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 *主要通过二分树的中序遍历，但是判断hasnext的时间复杂度是O(n)不符合题目的要求，在BSTIterator1里面实现O(h)的时间复杂度。
 */
public class BSTIterator {
	
	private Queue<TreeNode> queue =new ArrayDeque<TreeNode>();
    private Stack<TreeNode> stack = new Stack<TreeNode>();
	public BSTIterator(TreeNode root) {
        TreeNode p = root;
        while(p!=null||!stack.empty()){
        	if(p!=null){
        		p=p.left;
        		stack.push(p);
        	}else{
        		p=stack.pop();
        		queue.add(p);
        		p=p.right;
        	}
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        return queue.poll().val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */