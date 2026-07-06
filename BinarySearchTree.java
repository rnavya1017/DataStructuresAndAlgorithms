
public class BinarySearchTree<K extends Comparable<K>> {

    private INode<K> root;

    // Add Node
    public void add(K key) {
        root = addRec(root, key);
    }

    // Recursive Insert
    private INode<K> addRec(INode<K> node, K key) {

        if (node == null) {
            return new BSTNode<>(key);
        }

        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(addRec(node.getLeft(), key));
        } else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(addRec(node.getRight(), key));
        }

        return node;
    }

    // Inorder Traversal
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(INode<K> node) {

        if (node == null)
            return;

        inorderRec(node.getLeft());

        System.out.print(node.getKey() + " ");

        inorderRec(node.getRight());
    }
}