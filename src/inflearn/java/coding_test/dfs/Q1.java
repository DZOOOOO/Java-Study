package inflearn.java.coding_test.dfs;

// 전위 순회. 부모 - 왼쪽 - 오른쪽
// 중위 순회. 왼쪽 - 부모 - 오른쪽
// 후위 순회. 왼쪽 - 오른쪽 - 부모
public class Q1 {
    Node root;

    public void DFS(Node root) {
        if (root == null) {
            return;
        } else {
//            System.out.print(root.data + " "); // 전위 순회.
            DFS(root.lt); // 왼쪽
//            System.out.print(root.data + " "); // 중위 순회.
            DFS(root.rt); // 오른쪽
            System.out.print(root.data + " "); // 후위 순회.
        }
    }

    public static void main(String[] args) {
        Q1 tree = new Q1();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}

class Node {
    int data;
    Node lt;
    Node rt;

    // 초기화
    public Node(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}