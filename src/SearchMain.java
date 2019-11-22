public class SearchMain {

    public static void main(String args[]) {

        SearchBinaryTree searchBinaryTree = new SearchBinaryTree();

        BinaryTreeNode root = new BinaryTreeNode(100);

        BinaryTreeNode node20 = new BinaryTreeNode(20);
        BinaryTreeNode node200 = new BinaryTreeNode(200);
        BinaryTreeNode node30 = new BinaryTreeNode(30);
        BinaryTreeNode node50 = new BinaryTreeNode(50);
        BinaryTreeNode node10 = new BinaryTreeNode(10);

        searchBinaryTree.addElement(root, root.getElement());
        searchBinaryTree.addElement(root, node20.getElement());
        searchBinaryTree.addElement(root, node200.getElement());
        searchBinaryTree.addElement(root, node30.getElement());
        searchBinaryTree.addElement(root, node50.getElement());
        searchBinaryTree.addElement(root, node10.getElement());

        System.out.println("Inorder traversal of binary tree is: " + searchBinaryTree.traverseInOrder(root));

        System.out.println("delete 20");
        searchBinaryTree.removeElement(root, 20);

        searchBinaryTree.removeElement(root, 20);

        System.out.println("Inorder traversal of binary tree is: " + searchBinaryTree.traverseInOrder(root));

        System.out.println("smallest element in tree is: " + searchBinaryTree.minValue(root).getElement());

        System.out.println("delete min");
        searchBinaryTree.removeMin(root);

        System.out.println("smallest element in tree is: " + searchBinaryTree.minValue(root).getElement());

        System.out.println("biggest element in tree is: " + searchBinaryTree.maxValue(root).getElement());

        System.out.println("delete max");
        searchBinaryTree.removeMax(root);

        System.out.println("biggest element in tree is: " + searchBinaryTree.maxValue(root).getElement());
    }
}
