public class Tree
{
    private Node root;

    public void insert(int value)
    {
        //tree is empty
        if (root == null)
        {
            root = new Node(value);
            return;
        }

        root.insert(value);
    }
    
    public void inOrderTraverse()
    {
        //tree is empty
        if (root == null)
        {
            System.out.println("Tree is empty.");
            return;
        }

        root.inOrderTraverse();
    }

    public void traverseInOrderDescending()
    {
        //tree is empty
        if (root == null)
        {
            System.out.println("Tree is empty.");
            return;
        }

        root.traverseInOrderDescending();
    }

    public Node getMin ()
    {
        //tree is empty
        if (root == null)
        {
            return null;
        }

        return root.getMin();
    }

    public Node getMax ()
    {
        //tree is empty
        if (root == null)
        {
            return null;
        }

        return root.getMax();
    }

    public Node get (int value)
    {
        //tree is empty
        if (root == null)
        {
            return null;
        }

        return root.get(value);
    }
}
