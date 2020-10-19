import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCAtest {
    BinaryTree tree = new BinaryTree();
    @Test
    public void EmptyTreeTest(){
        assertEquals("Testing an Empty string",tree.findLCA(4, 5), null);
    }
    @Test
    public void LCATest(){
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        assertEquals("LCA should be 2",2, tree.findLCA(4,5).data);
        assertEquals("LCA should be 1",1, tree.findLCA(4,6).data);
        assertEquals("LCA should be 1",1, tree.findLCA(3,4).data);
        assertEquals("LCA should be 2",2, tree.findLCA(2,4).data);
    }
}
