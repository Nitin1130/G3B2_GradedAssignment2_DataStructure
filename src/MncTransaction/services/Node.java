package MncTransaction.services;

public class Node {
    public int data;
    public Node leftNode;
    public Node rightNode;

    public Node(int value) {
        data = value;
        leftNode = rightNode = null;
    }
}
