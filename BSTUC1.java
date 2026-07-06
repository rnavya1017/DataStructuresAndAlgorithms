
public class BSTUC1 {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Add nodes
        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println("Inorder Traversal:");

        bst.inorder();
    }
}