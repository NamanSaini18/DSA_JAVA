import java.util.Scanner;

public class BSTmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        BinarySearchTree tree = new BinarySearchTree();

        System.out.println("Hello, Welcome to Tree data Structure");
        System.out.println("Enter 0 to continue and -1 to break:");
        int ctr = sc.nextInt();
        while(ctr==0) {
            System.out.println("\n Enter your Choice: \n Press 1 for -> Insertion in the Tree \n Press 2 for -> Searching a Value in the tree \n Press 3 for -> Traversal of the tree \n Press 4 for -> Exit");

            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println();
                    System.out.println("Enter a value to insert in the tree: ");

                    root = tree.insertRecursively(root,sc.nextInt());
                    System.out.println(" Insertion done successfully");
                    break;

                case 2:
                    System.out.println(" Enter the value that you want to search in the tree");
                    int value = sc.nextInt();
                    boolean b = tree.searching(root, value);
                    if (b) {
                        System.out.println("Required Value is found successfully");
                    } else {
                        System.out.println("Required value is not found!!! Please try again later");
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Here Inorder Traversal will be Performed");
                    System.out.println("Left-Root-Right");
                    tree.InorderTraversal(root);
                    break;

                case 4:
                    if (choice < 0) {
                        System.exit(1);
                        break;
                    }

            }
            System.out.println(" Enter 0 to continue and -1 to break: ");
            ctr=sc.nextInt();


        }
    }
}
class BinarySearchTree
{
//     Node root;
    public Node insertRecursively(Node root, int value)
    {


        if(root == null)
        {
            root =  new Node(value);
            return root;
        }
        if(value < root.data)
        {
            root.left = insertRecursively(root.left,value);
        }
        else if(value > root.data)
        {
            root.right = insertRecursively(root.right,value);
        }
        return root;
    }
    public void InorderTraversal(Node root)
    {
        if(root == null)
            return;

        InorderTraversal(root.left);
        System.out.println(root.data);
        InorderTraversal(root.right);


    }
    public boolean searching(Node root, int data)
    {
        if(root == null )
        {
            return false;
        }
        if(root.data == data)
            return true;
        else if(root.data < data)
        {
            return searching(root.right, data);
        }
        else
            return searching(root.left,data);
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
        left = right = null;
    }
}
