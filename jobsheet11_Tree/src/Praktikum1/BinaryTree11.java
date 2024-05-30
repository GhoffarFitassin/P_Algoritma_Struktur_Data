package Praktikum1;

public class BinaryTree11 {
    Node11 root;

    public BinaryTree11() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if (isEmpty()) {// tree is empty
            root = new Node11(data);
        } else {
            Node11 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node11(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node11(data);
                        break;
                    }
                } else {// data is already exist
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node11 current = root;
        while (current == null) {
            if (current.data != data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node11 node) {
        if(node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    public void traversePostOrder(Node11 node) {
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    public void traverseInOrder(Node11 node) {
        if(node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public Node11 getSuccessor(Node11 del) {
        Node11 successor = del.right;
        Node11 successorParent = del;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data) {
        if(isEmpty()) {
            System.out.println("Tree masih kosong!");
            return;
        }
        //find node (current) that will be deleted
        Node11 parent = root;
        Node11 current = root;
        boolean isLeftChild = false;
        while(current != null) {
            if(current.data == data) {
                break;
            } else if(data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
    
        //deletion  
        if(current==null) {
            System.out.println("Data tidak ditemukan!");
            return;
        } else {
            // if there no child, simply delete it
            if(current.left==null && current.right==null) {
                if(current==root) {
                    root = null;
                } else {
                    if(isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if(current.left==null) { // if there is 1 child (right)
                if(current==root) {
                    root = current.right;
                } else {
                    if(isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right==null) { // if there is 1 child (left)
                if(current==root) {
                    root = current.left;
                } else {
                    if(isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // if there si 2 child
                Node11 successor = getSuccessor(current);
                if(current==root) {
                    root = successor;
                } else {
                    if(isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}
