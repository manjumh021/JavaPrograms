package BinarySearchTree;

public class BinarySearchTreeUC3 {
    Node root;

    // Function to return the size of binary tree
    int size() {
        return size(root);
    }

    public static Node insert(Node node, int value) {
        if (node == null) {
            return createNewNode(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public static Node createNewNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        display(node.left);
        display(node.right);
    }

    int size(Node node) {
        if (node == null)
            return 0;
        else {
            return size(node.left) + 1 + size(node.right);
        }
    }

    public Node search(Node root, int key) {
        if (root == null)
            return null;

        if (root.data == key)
            return root;
        if (root.data > key)
            return search(root.right, key);
        return search(root.left, key);
    }

    public static void main(String[] args) {
        BinarySearchTreeUC3 binarySearchTree = new BinarySearchTreeUC3();
        Node root = null;
        root = binarySearchTree.insert(root, 56);
        root = binarySearchTree.insert(root, 30);
        root = binarySearchTree.insert(root, 40);
        root = binarySearchTree.insert(root, 22);
        root = binarySearchTree.insert(root, 11);
        root = binarySearchTree.insert(root, 16);
        root = binarySearchTree.insert(root, 3);
        root = binarySearchTree.insert(root, 70);
        root = binarySearchTree.insert(root, 95);
        root = binarySearchTree.insert(root, 60);
        root = binarySearchTree.insert(root, 65);
        root = binarySearchTree.insert(root, 63);
        root = binarySearchTree.insert(root, 67);
        binarySearchTree.display(root);
        System.out.println("Size is : " + binarySearchTree.size(root));
        System.out.println("Element is present in the list at the position : " + binarySearchTree.search(root, 95));

    }
}