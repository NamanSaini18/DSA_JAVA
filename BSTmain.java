class BinarySearchTree2 {
    public static Nodee insert(Nodee root, int value)
    {
        Nodee newnode = new Nodee(value);
        if(root == null)
        {
            root = newnode;
            return root;
        }
        else
        {
            Nodee current = root;
            Nodee parent = null;
            while(true)
            {
                parent = current;
                if(value>current.data)
                {
                    current=current.right;
                    if(current == null)
                    {
                        parent.right = newnode;
                    }
                    return root;
                }
                if(value< current.data)
                {
                    current = current.left;
                    if(current == null)
                    {
                        parent.left = newnode;
                    }
                    return root;
                }
            }
        }
    }
    public static void PreorderTraversal(Nodee root)
    {
        if(root == null)
        {
//            System.out.println();
            return;
        }

        System.out.println(root.data + " ");
        PreorderTraversal(root.left);
        PreorderTraversal(root.right);
    }
    public static void InorderTraversal(Nodee root)
    {
        if(root == null)
        {
            return;
        }

        InorderTraversal(root.left);
        System.out.println(root.data);
        InorderTraversal(root.right);
    }
    public static void PostorderTraversal(Nodee root)
    {
        if(root == null)
        {
            return;
        }

        PostorderTraversal(root.left);
        PostorderTraversal(root.right);
        System.out.println(root.data);
    }


    public static void main(String[] args) {
        Nodee root = insert(null,50);
        insert(root,20);
        insert(root,75);
        insert(root,10);
        insert(root,60);
        insert(root,80);
        insert(root,15);
        insert(root,25);
        System.out.println("Preorder Traversal is: ");
        PreorderTraversal(root);
        System.out.println("Inorder Traversal is: ");
        InorderTraversal(root);
        System.out.println("PostOrder Traversal is: ");
        PostorderTraversal(root);

    }
}
class Nodee
{
    int data;
    Nodee left;
    Nodee right;
    public Nodee(int data)
    {
        this.data = data;
    }
}
