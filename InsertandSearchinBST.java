ackage com.Implementation.BST;

import java.util.Scanner;
import java.util.Stack;

public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        tree.insert(sc.nextInt());
        tree.insert(sc.nextInt());
        tree.insert(sc.nextInt());
        tree.insert(sc.nextInt());
        tree.insert(sc.nextInt());
        tree.InorderTraversal();

    }
}
class BST
{
    Node root;
    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(root == null)
        {
            root = newNode;
            return;
        }
        Node prev = null;
        Node temp = root;
        while(temp != null)
        {
            if(temp.data>data)
            {
                prev = temp;
                temp = temp.left;
            }
            else if(temp.data<data)
            {
                prev = temp;
                temp = temp.right;
            }
        }
        if(prev.data>data)
        {
            prev.left = newNode;
        }
        else
            prev.right = newNode;
    }

    public void InorderTraversal() {
        Node temp = root;
//        if (root == null) {
//            System.out.println("Tree is empty");
//        }
        Stack<Node> stack=new Stack<>();
        while (temp!=null||!stack.isEmpty()){
            if(temp!=null){
                stack.add(temp);
                temp=temp.left;
            }
            else {
                temp=stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }
}

class Node
{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data = data;
    }
}
