public interface IBinaryTreeNode {

    int getElement();
    void setElement(int element);
    void addLeftChild(BinaryTreeNode leftChild);
    void addRightChild(BinaryTreeNode rightChild);
    BinaryTreeNode getLeftChild();
    BinaryTreeNode getRightChild();
}
