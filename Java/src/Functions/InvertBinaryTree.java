package Functions;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree 
{
    //Class with data, and pointers to the left and right child.
    private static class Node
    {
        int data;   //Received Number
        Node left;  //Left Pointer
        Node right; //Right Pointer
    };

    //Function to allocate a new node with the given data and null left and right pointers.
    private static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    private static void inOrder(Node node)
    {
        if(node == null)
        {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data + " ");
        inOrder(node.right);
    }

    private static void mirror(Node root)
    {
        if(root == null)
        {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(q.size() > 0)
        {
            Node curr = q.peek();
            q.remove();

            Node temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            if(curr.left != null)
            {
                q.add(curr.left);
            }
            
            if(curr.right != null)
            {
                q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) 
    {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        inOrder(root);
        mirror(root);
        inOrder(root);
    }
}
