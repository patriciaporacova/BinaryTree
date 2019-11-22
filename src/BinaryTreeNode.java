public class BinaryTreeNode implements IBinaryTreeNode {

    int element;
    BinaryTreeNode leftChild, rightChild;

    BinaryTreeNode(int value) {
        this.element = value;
        leftChild = null;
        rightChild = null;
    }

    @Override
    public int getElement() {
        return element;
    }

    @Override
    public void setElement(int element) {
        this.element = element;
    }

    @Override
    public void addLeftChild(BinaryTreeNode leftChild) {
      this.leftChild=leftChild;
    }

    @Override
    public void addRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    @Override
    public BinaryTreeNode getRightChild() {
        return rightChild;
    }
    }
