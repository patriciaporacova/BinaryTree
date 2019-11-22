public interface ILinkedBinaryTree {

    void setRoot(BinaryTreeNode root);
    int getRoot();
    boolean isEmpty();
    int size(BinaryTreeNode node);
    boolean contains (BinaryTreeNode currentNode, int searchedNode);
    String traverseInOrder(BinaryTreeNode node);
    String traversePreOrder(BinaryTreeNode node);
    String traversePostOrder(BinaryTreeNode node);
    String traverseLevelOrder(BinaryTreeNode node);
    int height(BinaryTreeNode root);
}
