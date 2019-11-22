import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LinkedBinaryTreeTest {

    LinkedBinaryTree tree;
    BinaryTreeNode root, node1, node2, node3, node4, node5;

    @BeforeEach
    void setUp() {
        tree = new LinkedBinaryTree();
        root = new BinaryTreeNode(100);
        node1 = new BinaryTreeNode(20);
        node2 = new BinaryTreeNode(200);
        node3 = new BinaryTreeNode(30);
        node4 = new BinaryTreeNode(50);
        node5 = new BinaryTreeNode(80);


    }

    @Test
    void getRoot() {
        tree.root = root;
        assertEquals(root.getElement(), tree.getRoot());
    }

    @Test
    void isEmpty() {
        assertTrue(tree.isEmpty());
    }

    @Test
    void isEmptyFalse() {
        tree.root = root;
        assertFalse(tree.isEmpty());
    }

    @Test
    void sizeRootAndTwoNodes() {
        tree.root = root;
        root.addLeftChild(node1);
        root.addRightChild(node2);
        assertEquals(3, tree.size(root));
    }

    @Test
    void sizeRootAndFourNodes() {
        tree.root = root;
        root.addLeftChild(node1);
        root.addRightChild(node2);

        node1 = root.leftChild;
        node1.addRightChild(node4);
        node1.addLeftChild(node5);

        assertEquals(5, tree.size(root));
    }

    @Test
    void contains() {
        tree.root = root;
        root.addLeftChild(node1);
        root.addRightChild(node2);

        assertTrue(tree.contains(root, node1.getElement()));
    }

    @Test
    void traverseInOrder() {

        tree.root = root;
        root.addLeftChild(node1);
        root.addRightChild(node2);

       String inOrder= tree.traverseInOrder(root);
       String myOrder=Integer.toString(node1.element) +" " +Integer.toString(root.element) +" " +Integer.toString(node2.element)+" ";

        assertEquals(inOrder, myOrder);

    }

    @Test
    void traversePreOrder() {

        tree.root = root;
        root.addLeftChild(node1);
        root.addRightChild(node2);

        String inOrder= tree.traversePreOrder(root);
        String myOrder=Integer.toString(root.element) +" " +Integer.toString(node1.element) +" " +Integer.toString(node2.element) +" ";

        assertEquals(inOrder, myOrder);
    }

    @Test
    void traversePostOrder() {
        tree.root = root;
        root.addLeftChild(node1);
        root.addRightChild(node2);

        String inOrder= tree.traversePostOrder(root);
        String myOrder=Integer.toString(node1.element) +" " +Integer.toString(node2.element) +" " +Integer.toString(root.element) +" ";

        assertEquals(inOrder, myOrder);
    }

    @Test
    void printGivenLevel() {
    }

    @Test
    void traverseLevelOrder() {
        tree.root = root;
        root.addLeftChild(node1);
        root.addRightChild(node2);

        String inOrder= tree.traverseLevelOrder(root);
        String myOrder= Integer.toString(root.element) +" " +Integer.toString(node1.element) +" " +Integer.toString(node2.element) +" ";

        assertEquals(inOrder, myOrder);
    }

    @Test
    void height() {
        tree.root = root;
        root.addLeftChild(node1);
        root.addRightChild(node2);

        node1 = root.leftChild;
        node1.addRightChild(node4);
        node1.addLeftChild(node5);

        assertEquals(3, tree.height(root));
    }
}