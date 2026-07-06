
public class BinarySearchTree<K extends Comparable<K>> {

    private INode<K> root;

    // Insert Node
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

    // Search Method
    public boolean search(K key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(INode<K> node, K key) {

        if (node == null) {
            return false;
        }

        if (node.getKey().compareTo(key) == 0) {
            return true;
        }

        if (key.compareTo(node.getKey()) < 0) {
            return searchRecursive(node.getLeft(), key);
        } else {
            return searchRecursive(node.getRight(), key);
        }
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