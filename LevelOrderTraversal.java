package com.BST;



import java.util.Scanner;

public class LevelOrderTraversalMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter the values to insert in your Binary Search Tree");
        for (int i = 0; i <= 5; i++) {
            root = insert(root, sc.nextInt());
        }
        System.out.println("Preorder Traversal is:");
        preorderTraversal(root);
        System.out.println();
        System.out.println("\nInorder Traversal is:");
        inorderTraversal(root);
        System.out.println();
        System.out.println("\nPostOrder Traversal is: ");
        PostorderTraversal(root);
        System.out.println();

        System.out.println("\nLevel Order Traversal is : ");
        for (int i = 1; i <=height(root); i++)
        {
            LevelorderTraversal(root,i);
        }


    }

    public static Node insert(Node root, int value)
    {
        Node newNode = new Node(value);
        if (root == null)
        {
            root = newNode;
            return root;
        }
        else
        {
            if (value < root.data)
            {
                root.left = insert(root.left, value);
            }
            else if (value > root.data)
            {
                root.right = insert(root.right, value);
            }
            return root;
        }
    }

    public static void preorderTraversal(Node root)
    {
        if (root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void inorderTraversal(Node root)
    {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void PostorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        PostorderTraversal(root.left);
        PostorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static int height(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }


    public static void LevelorderTraversal(Node root,int level) {
        if (root == null)
        {
            return;
        }
        if(level == 1)
        {
            System.out.print(root.data + " ");
        }
        else if(level>1)
        {
            LevelorderTraversal(root.left,level-1);
            LevelorderTraversal(root.right,level-1);

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
        left=right=null;
    }
}
