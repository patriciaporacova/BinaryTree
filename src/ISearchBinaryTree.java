public interface ISearchBinaryTree {

    void addElement(BinaryTreeNode node, int value);
    BinaryTreeNode removeElement (BinaryTreeNode root, int value);
    BinaryTreeNode minValue(BinaryTreeNode root);
    BinaryTreeNode maxValue(BinaryTreeNode root);
    BinaryTreeNode removeMin(BinaryTreeNode root);
    BinaryTreeNode removeMax(BinaryTreeNode root);
    void removeAllOccurences(BinaryTreeNode node);
}
