public class Node
{
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int value)
    {
        this.data = value;
        leftChild = null;
        rightChild = null;
    }

    public void insert(int value)
    {
        if (data == value)
        {
            return;
        }

        if (value > data)
        {
            if (rightChild == null)
            {
                rightChild = new Node(value);
            }
            else
            {
                rightChild.insert(value);
            }
        }
        else
        {
            if (leftChild == null)
            {
                leftChild = new Node(value);
            }
            else
            {
                leftChild.insert(value);
            }
        }
    }

    public void inOrderTraverse()
    {
        //left child
        if (leftChild != null)
        {
            leftChild.inOrderTraverse();
        }

        System.out.println("Node: " + data);

        //right child
        if (rightChild != null)
        {
            rightChild.inOrderTraverse();
        }
    }

    //TRAVERSES TREE IN DESCENDING ORDER
    public void traverseInOrderDescending()
    {
        //right child
        if (rightChild != null)
        {
            rightChild.traverseInOrderDescending();
        }

        System.out.println("Node: " + data);

        //left child
        if (leftChild != null)
        {
            leftChild.traverseInOrderDescending();
        }
    }

    //GETS SMALLEST VALUE IN TREE
    public Node getMin()
    {

        if (rightChild != null) //Checks if child node is not null to avoid nullptr exception
        {
            if(rightChild.data < data) //Checks if child node is lesser than current node
            {
                return rightChild.getMin();
            }
        }

        if (leftChild != null) //Checks if child node is not null to avoid nullptr exception
        {
            if(leftChild.data < data) //Checks if child node is lesser than current node
            {
                return leftChild.getMin();
            }
        }

        System.out.println("Lowest Value Node: " + data); //Will execute when if statements above do not continue

        return null;
    }

    //GETS LARGEST VALUE IN TREE
    public Node getMax()
    {

        if (rightChild != null) //Checks if child node is not null to avoid nullptr exception
        {
            if(rightChild.data > data) //Checks if child node is greater than current node
            {
                return rightChild.getMax();
            }
        }

        if (leftChild != null) //Checks if child node is not null to avoid nullptr exception
        {
            if(leftChild.data > data) //Checks if child node is greater than current node
            {
                return leftChild.getMax();
            }
        }

        System.out.println("Highest Value Node: " + data); //Will execute when if statements above do not continue

        return null;
    }

    public Node get(int value)
    {
        if (value == data)
        {
            return this;
        }

        if (value > data)
        {
            if (rightChild != null)
            {
                return rightChild.get(value);
            }
        }
        else
        {
            if (leftChild != null)
            {
                return leftChild.get(value);
            }
        }

        return null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
