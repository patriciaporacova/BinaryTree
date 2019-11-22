public class SearchBinaryTree extends LinkedBinaryTree implements ISearchBinaryTree{

    String result;
    @Override
    public void addElement(BinaryTreeNode node, int value) {
        if (value < node.getElement()) {
            if (node.getLeftChild() != null) {
                addElement(node.getLeftChild(), value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.getElement());
                node.addLeftChild(new BinaryTreeNode(value));
            }
        } else if (value > node.getElement()) {
            if (node.getRightChild() != null) {
                addElement(node.getRightChild(), value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.getElement());
                node.addRightChild(new BinaryTreeNode(value));
            }
        }
    }
    @Override
    public BinaryTreeNode removeElement (BinaryTreeNode root, int value)
    {
        /* Base Case: If the tree is empty */
        if (root == null)  return root;

        /* Otherwise, recur down the tree */
        if (value < root.getElement())
            root.addLeftChild(removeElement(root.getLeftChild(), value));
        else if (value > root.getElement())
            root.addRightChild(removeElement(root.getRightChild(), value));

            // if key is same as root's key, then This is the node to be deleted
        else
        {
            // node with only one child or no child
            if (root.getLeftChild() == null)
                return root.getRightChild();
            else if (root.getRightChild() == null)
                return root.getLeftChild();

            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.setElement(minValue(root.getRightChild()).getElement());

            // Delete the inorder successor
            root.addRightChild(removeElement(root.getRightChild(), root.getElement()));
        }

        return root;
    }


    @Override
    public BinaryTreeNode removeMin(BinaryTreeNode node) {
        if(node == null){
            return node;
        }
        return removeElement(node,minValue(node).getElement());

    }

    @Override
    public BinaryTreeNode removeMax(BinaryTreeNode node){

        if(node == null){
            return node;
        }
        return removeElement(node,maxValue(node).getElement());
    }



    @Override
    public BinaryTreeNode minValue(BinaryTreeNode node){

        if(node.getLeftChild() == null){
            return node;
        }
        return minValue(node.getLeftChild());

    }

    @Override
    public BinaryTreeNode maxValue(BinaryTreeNode node){

        if(node.getRightChild() == null){
            return node;
        }
        return maxValue(node.getRightChild());

    }



    @Override
    public void removeAllOccurences(BinaryTreeNode node) {

    }
}
