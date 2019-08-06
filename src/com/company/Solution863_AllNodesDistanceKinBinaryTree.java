package src.com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution863_AllNodesDistanceKinBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    int t_depth=0;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> ret = new ArrayList<>();
        List<List<Integer>> levels = new ArrayList<>();
        travel(root,levels,0,K,target);
        for (int i=0;i<levels.size();++i) {
            for (int j = 0; j < levels.get(i).size(); ++j) {
                if (t_depth - i == K || i - t_depth == K || (i == t_depth && i + t_depth == K)) {
                    if (levels.get(i).get(j) != target.val) ret.add(levels.get(i).get(j));
                }
            }
        }
        return ret;
    }
    public void travel(TreeNode root,List<List<Integer>> levels, int depth,int K,TreeNode target ){
        if (root==null )return;
        if (levels.size()<=depth) levels.add(new ArrayList<>());
        if (root.val==target.val) t_depth = depth;
        levels.get(depth).add(root.val);
        travel(root.left,levels,depth+1,K,target);
        travel(root.right,levels,depth+1,K,target);
    }
}
