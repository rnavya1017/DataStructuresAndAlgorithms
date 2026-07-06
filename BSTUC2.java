

public class BSTUC2 {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(65);
        bst.add(3);
        bst.add(16);
        bst.add(63);
        bst.add(67);

        System.out.println("Inorder Traversal:");
        bst.inorder();

        System.out.println("\n\nSize of BST: " + bst.size());
    }
}