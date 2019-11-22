import java.util.ArrayList;

public class LinkedBinaryTree implements ILinkedBinaryTree{

    BinaryTreeNode root;
    String result;

    public LinkedBinaryTree() {
        root = null;
    }

    @Override
    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    @Override
    public int getRoot() {
        return root.element;
    }

    @Override
    public boolean isEmpty() {
        return root == null;

    }

    @Override
    public int size(BinaryTreeNode node) {
        if (node == null) return 0;
        return 1 + size(node.leftChild) + size(node.rightChild);
    }

    @Override
    public boolean contains(BinaryTreeNode currentNode, int searchedNode) {
        if (currentNode == null) {
            return false;
        }
        if (searchedNode == currentNode.element) {
            return true;
        }
        return searchedNode < currentNode.element
                ? contains(currentNode.leftChild, searchedNode)
                : contains(currentNode.rightChild, searchedNode);
    }

    @Override
    public String traverseInOrder(BinaryTreeNode node) {
        result="";
        if (node != null) {
            result += traverseInOrder(node.leftChild);
            result += (node.element +" " );
            result += traverseInOrder(node.rightChild);
        }
        return result;
    }

    @Override
    public String traversePreOrder(BinaryTreeNode node) {

        result="";
        if (node != null) {
            result += (node.element +" " );
            result += traversePreOrder(node.leftChild);
            result += traversePreOrder(node.rightChild);
        }
        return result;
    }

    @Override
    public String traversePostOrder(BinaryTreeNode node) {
        result="";
        if (node != null) {
            result += traversePostOrder(node.leftChild);
            result += traversePostOrder(node.rightChild);
            result += (node.element +" " );
        }
        return result;
    }


    public String PrintGivenLevel(BinaryTreeNode root, int level) {
        result="";
        if (root == null)
            return "";
        if (level == 1)
            result += (root.element + " ");
        else if (level > 1) {
            result += PrintGivenLevel(root.leftChild, level - 1);
            result += PrintGivenLevel(root.rightChild, level - 1);
        }
        return result;
    }

    @Override
    public String traverseLevelOrder(BinaryTreeNode node) {
        result="";
        int h = height(node);

        for (int i = 0; i <= h; i++)
            result += PrintGivenLevel(node, i);
        return result;
    }

    @Override
    public int height(BinaryTreeNode root) {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.leftChild);
            int rheight = height(root.rightChild);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else return (rheight + 1);
        }
    }


}