import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchBinaryTreeTest {
    SearchBinaryTree tree;
    BinaryTreeNode root, node1, node2, node3, node4, node5;

    @BeforeEach
    void setUp() {
        tree = new SearchBinaryTree();
        root = new BinaryTreeNode(100);
        node1 = new BinaryTreeNode(20);
        node2 = new BinaryTreeNode(200);
        node3 = new BinaryTreeNode(30);
        node4 = new BinaryTreeNode(50);
        node5 = new BinaryTreeNode(10);


    }

    @Test
    void addElement() {
        tree.addElement(root, root.getElement());
        tree.addElement(root, node1.getElement());
        tree.addElement(root, node2.getElement());
        tree.addElement(root, node3.getElement());

        String order= tree.traverseInOrder(root);
        String myOrder= Integer.toString(node1.element) +" " +Integer.toString(node3.element) +" " +Integer.toString(root.element)+" " +Integer.toString(node2.element)+" ";

        assertEquals(myOrder, order);
    }

    @Test
    void removeFromEmpty(){
        tree.removeElement(root, 20);
        String order= tree.traverseInOrder(root);
        String myOrder= Integer.toString(root.element) +" ";

        assertEquals(myOrder, order);

    }

    @Test
    void removeLeafElement() {
        tree.addElement(root, root.getElement());
        tree.addElement(root, node1.getElement());
        tree.addElement(root, node2.getElement());
        tree.addElement(root, node3.getElement());
        tree.addElement(root, node4.getElement());
        tree.addElement(root, node5.getElement());

        tree.removeElement(root, node4.getElement());
        String order= tree.traverseInOrder(root);
        String myOrder= Integer.toString(node5.element) +" " +Integer.toString(node1.element)
                +" " +Integer.toString(node3.element)+" " +Integer.toString(root.element)+" " +Integer.toString(node2.element)+" ";



    }
    @Test
    void removeElementWithOneChild(){
        tree.addElement(root, root.getElement());
        tree.addElement(root, node1.getElement());
        tree.addElement(root, node2.getElement());
        tree.addElement(root, node3.getElement());
        tree.addElement(root, node4.getElement());
        tree.addElement(root, node5.getElement());

        tree.removeElement(root, node3.getElement());
        String order= tree.traverseInOrder(root);
        String myOrder= Integer.toString(node5.element) +" " +Integer.toString(node1.element)
                +" " +Integer.toString(node4.element)+" " +Integer.toString(root.element)+" " +Integer.toString(node2.element)+" ";


    }
    @Test
    void removeElementWithTwoChildren(){

        tree.addElement(root, root.getElement());
        tree.addElement(root, node1.getElement());
        tree.addElement(root, node2.getElement());
        tree.addElement(root, node3.getElement());
        tree.addElement(root, node4.getElement());
        tree.addElement(root, node5.getElement());

        tree.removeElement(root, node1.getElement());
        String order= tree.traverseInOrder(root);
        String myOrder= Integer.toString(node5.element) +" " +Integer.toString(node3.element)
                +" " +Integer.toString(node4.element)+" " +Integer.toString(root.element)+" " +Integer.toString(node2.element)+" ";


    }

    @Test
    void minValue() {
        tree.addElement(root, root.getElement());
        tree.addElement(root, node1.getElement());
        tree.addElement(root, node2.getElement());

        assertEquals(20, tree.minValue(root));
    }

    @Test
    void minValueIfEmpty() {
        assertEquals(root.getElement(), tree.minValue(root));
    }

    @Test
    void maxValueIfEmpty() {
        assertEquals(root.getElement(), tree.minValue(root));
    }


    @Test
    void searchMaxNode() {
        tree.addElement(root, root.getElement());
        tree.addElement(root, node1.getElement());
        tree.addElement(root, node2.getElement());

        assertEquals(node2.getElement(), tree.maxValue(root).getElement());
    }

    @Test
    void searchMinNode() {
        tree.addElement(root, root.getElement());
        tree.addElement(root, node1.getElement());
        tree.addElement(root, node2.getElement());

        assertEquals(node1.getElement(), tree.minValue(root).getElement());
    }
}