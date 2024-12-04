
/*
Practice Questions on Trees in Java

1. Write a program to create a binary tree and perform in-order traversal.
2. Write a function to calculate the height of a binary tree.
3. Write a program to check if two binary trees are identical.
4. Implement a function to find the lowest common ancestor (LCA) of two nodes in a binary tree.
*/

// Question 1: In-order Traversal
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;

    void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
}

// Question 2: Calculate Height of a Binary Tree
class TreeHeight {
    int height(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

// Question 3: Check if Two Binary Trees are Identical
class IdenticalTrees {
    boolean isIdentical(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return (a.val == b.val) && isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
    }
}

// Question 4: Find Lowest Common Ancestor (LCA)
class LowestCommonAncestor {
    TreeNode findLCA(TreeNode root, TreeNode n1, TreeNode n2) {
        if (root == null) return null;
        if (root == n1 || root == n2) return root;

        TreeNode leftLCA = findLCA(root.left, n1, n2);
        TreeNode rightLCA = findLCA(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) return root;
        return (leftLCA != null) ? leftLCA : rightLCA;
    }
}
