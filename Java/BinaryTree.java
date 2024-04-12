import java.util.*;

class Tree {
    int data;
    Tree leftNode;
    Tree rightNode;
}

public class BinaryTree {
    static Tree root = null;

    static Tree createNode() {
        Scanner scanner = new Scanner(System.in);
        Tree temp = new Tree();
        System.out.print("Enter the data:");
        temp.data = scanner.nextInt();
        temp.leftNode = null;
        temp.rightNode = null;
        return temp;
    }

    static void createTree() {
        root = createNode();
        root.leftNode = createNode();
        root.rightNode = createNode();
        Tree left = root.leftNode;
        Tree right = root.rightNode;
        left.leftNode = createNode();
        left.rightNode = createNode();
        right.leftNode = createNode();
        right.rightNode = createNode();
    }

    static void inOrderTraversal(Tree temp) {
        Stack<Tree> s = new Stack<>();
        Tree curr = temp;
        while (true) {
            while (curr != null) {
                s.push(curr);
                curr = curr.leftNode;
            }
            if (s.isEmpty()) {
                break;
            }
            Tree node = s.pop();
            System.out.print(node.data + " ");
            curr = node.rightNode;
        }
    }

    static void preOrderTraversal(Tree temp) {
        Stack<Tree> s = new Stack<>();
        Tree curr = temp;
        while (true) {
            while (curr != null) {
                s.push(curr);
                System.out.print(curr.data + " ");
                curr = curr.leftNode;
            }
            if (s.isEmpty()) {
                break;
            }
            Tree node = s.pop();
            curr = node.rightNode;
        }
    }

    static void postOrderTraversal(Tree temp) {
        Stack<Tree> s = new Stack<>();
        Stack<Integer> result = new Stack<>();
        s.push(temp);
        while (!s.isEmpty()) {
            Tree curr = s.pop();
            result.push(curr.data);
            if (curr.leftNode != null) {
                s.push(curr.leftNode);
            }
            if (curr.rightNode != null) {
                s.push(curr.rightNode);
            }
        }
        while (!result.isEmpty()) {
            System.out.print(result.pop() + " ");
        }
    }

    static void levelOrderTraversal(Tree temp) {
        Queue<Tree> curr = new LinkedList<>();
        curr.add(temp);
        while (!curr.isEmpty()) {
            Tree node = curr.poll();
            System.out.print(node.data + " ");
            if (node.leftNode != null) {
                curr.add(node.leftNode);
            }
            if (node.rightNode != null) {
                curr.add(node.rightNode);
            }
        }
    }

    public static void main(String[] args) {
        createTree();
        System.out.print("In order Traversal -> ");
        inOrderTraversal(root);
        System.out.print("\nPre order Traversal -> ");
        preOrderTraversal(root);
        System.out.print("\nPost order Traversal -> ");
        postOrderTraversal(root);
        System.out.print("\nLevel order Traversal -> ");
        levelOrderTraversal(root);
    }
}
