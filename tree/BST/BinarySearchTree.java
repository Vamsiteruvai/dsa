package com.tree.BST;

class BinarySearchTree {
    Node root;

    // Node class
    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert method for BST
    Node insert(Node node, int value) {
        // If the current node is null, create a new node
        if (node == null) {
            return new Node(value);
        }
        // Recur down the tree for left and right insertions
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    // In-order traversal (Left, Root, Right)
    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Find the minimum value node in the right subtree
    Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Delete a node from the BST
    Node delete(Node node, int value) {
        if (node == null) {
            return null;  // If the tree is empty
        }

        // Traverse to the correct node to delete
        if (value < node.data) {
            node.left = delete(node.left, value);
        } else if (value > node.data) {
            node.right = delete(node.right, value);
        } else {
            // Node found, now handle 3 cases of deletion:

            // Case 1: Node has no children (leaf node)
            if (node.left == null && node.right == null) {
                return null;
            }

            // Case 2: Node has only one child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Case 3: Node has two children
            // Find the minimum node in the right subtree (in-order successor)
            Node minNode = findMin(node.right);
            node.data = minNode.data;  // Replace the current node's data with the successor's data
            node.right = delete(node.right, minNode.data);  // Delete the successor
        }
        return node;
    }

    // Update a node in the tree (delete old value and insert new value)
    void update(Node node, int oldValue, int newValue) {
        node = delete(node, oldValue);  // Delete the old value
        node = insert(node, newValue);  // Insert the new value
        System.out.println("Updated value from " + oldValue + " to " + newValue);
    }

    // Driver code
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert nodes into the tree
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

//        // Perform in-order traversal before operations
//        System.out.println("In-order before operations:");
//        tree.inorder(tree.root);
//        System.out.println();

        // Delete node with value 20
        tree.root = tree.delete(tree.root, 30);
        System.out.println("In-order after deleting 30:");
        tree.inorder(tree.root);
        System.out.println();

//        // Update node with value 30 to 35
//        tree.update(tree.root, 30, 35);
//        System.out.println("In-order after updating 30 to 35:");
//        tree.inorder(tree.root);
//        System.out.println();
//
//        // Delete node with value 50 (the root node)
//        tree.root = tree.delete(tree.root, 50);
//        System.out.println("In-order after deleting 50 (root node):");
//        tree.inorder(tree.root);
    }
}
