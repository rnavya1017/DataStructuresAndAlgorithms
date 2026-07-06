

public class BinarySearchTree<K extends Comparable<K>> {

    private INode<K> root;

    // Add node
    public void add(K key) {
        root = addRecursive(root, key);
    }

    private INode<K> addRecursive(INode<K> node, K key) {

        if (node == null) {
            return new BSTNode<>(key);
        }

        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(addRecursive(node.getLeft(), key));
        } else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(addRecursive(node.getRight(), key));
        }

        return node;
    }

    // Count total nodes
    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(INode<K> node) {

        if (node == null)
            return 0;

        return 1 + sizeRecursive(node.getLeft()) + sizeRecursive(node.getRight());
    }

    // Inorder Traversal
    public void inorder() {
        inorderRecursive(root);
    }

    private void inorderRecursive(INode<K> node) {

        if (node == null)
            return;

        inorderRecursive(node.getLeft());

        System.out.print(node.getKey() + " ");

        inorderRecursive(node.getRight());
    }
}