public class LinkedMain {


    public static void main(String args[]) {

        ILinkedBinaryTree linkedBinaryTree = new LinkedBinaryTree();

        BinaryTreeNode root = new BinaryTreeNode(100);

        BinaryTreeNode node20 = new BinaryTreeNode(20);
        BinaryTreeNode node10 = new BinaryTreeNode(10);
        BinaryTreeNode node30 = new BinaryTreeNode(30);
        BinaryTreeNode node200 = new BinaryTreeNode(200);

        linkedBinaryTree.setRoot(root);

        root.addLeftChild(node20);
        root.addRightChild(node10);

        node20 = root.leftChild;

        node20.addLeftChild(node30);
        node20.addRightChild(node200);

        System.out.print("\nPreOrder traversal of binary tree is: " + linkedBinaryTree.traversePreOrder(root));
        System.out.print("\nInorder traversal of binary tree is: " + linkedBinaryTree.traverseInOrder(root));
        System.out.print("\nPostorder traversal of binary tree is: " + linkedBinaryTree.traversePostOrder(root));
        System.out.print("\nLevelOrder traversal of binary tree is: " + linkedBinaryTree.traverseLevelOrder(root));
        System.out.print("\n height of the tree is: " + linkedBinaryTree.height(root));
        System.out.print("\n size of the tree is: " + linkedBinaryTree.size(root));
        System.out.print("\n root of the tree is: " + linkedBinaryTree.getRoot());
        System.out.print("\n the tree is empty is: " + linkedBinaryTree.isEmpty());


    }
}
