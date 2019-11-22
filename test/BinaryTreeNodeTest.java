import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.fail;

class BinaryTreeNodeTest {

    BinaryTreeNode root, node1, node2, node3;

    @BeforeEach
    void setUp() {

        root= new BinaryTreeNode(100);
        node1= new BinaryTreeNode(20);
        node2= new BinaryTreeNode(200);
        node3= new BinaryTreeNode(10);

    }

    //following tests test BinaryTreeNode class
    @Test
    void getElement(){
        assertTrue(root.getElement()==100);
    }
    @Test
    void setElement(){
        root.setElement(20);
        assertTrue(root.getElement()==20);
    }
    @Test
    void addLeftChild(){
        root.addLeftChild(node1);
        assertEquals(node1.element, root.leftChild.element);
    }

    @Test
    void addRightChild(){
        root.addRightChild(node3);
        assertEquals(node3.element, root.rightChild.element);
    }

    @Test
    void getLeftChild(){
        root.addLeftChild(node1);
        assertEquals(node1, root.getLeftChild());
    }

    @Test
    void getRightChild(){
        root.addRightChild(node2);
        assertEquals(node2, root.getRightChild());
    }





   /* @Test
    void addValidLeftChild(){
        root.addLeftChild(root, node1.element);
        assertEquals(node1.element, root.leftChild.element);
    }

    @Test
    void addInvalidLeftChild(){
        Assertions.assertThrows(NullPointerException.class, () -> {
           root.addLeftChild(root, node2.element);
        });

    }



    @Test
    void containsTrue() {
        //assertTrue(tree.contains(root,30));
    }*/
}