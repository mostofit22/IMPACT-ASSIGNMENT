# Definition for a binary tree node.
class TreeNode:
    def _init_(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def maxDepth(self, root):  # Only self and root are required
        if not root:
            return 0
        
        # Recursively find the depth of the left and right subtrees
        left_depth = self.maxDepth(root.left)
        right_depth = self.maxDepth(root.right)
        
        # The depth of the tree is the maximum of the left and right depths plus 1 for the root
        return max(left_depth, right_depth) + 1