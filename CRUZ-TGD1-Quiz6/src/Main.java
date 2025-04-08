public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Submitted by: Jedidiah B. Cruz\n");
        System.out.print("Section: TGD1\n");
        System.out.print("Deliverable: Quiz 6\n");
        System.out.print("=================================\n\n\n");

        int searchValue;

        //region TEST 1 Normal randomized tree
        System.out.println("TEST 1 ----------");
        System.out.println("Normal randomized tree");

        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        System.out.println("\nTraversal in ascending order: ");
        tree.inOrderTraverse();

        System.out.println("\nTraversal in descending order: ");
        tree.traverseInOrderDescending();

        System.out.println("\nGetting Minimum value in tree: ");
        tree.getMin();

        System.out.println("\nGetting Maximum value in tree: ");
        tree.getMax();

        searchValue = 27;
        System.out.println("\nNode for value " + searchValue + " = " + tree.get(searchValue));
        //endregion

        //region TEST 2 Descending one branch
        System.out.println("\n\nTEST 2 ----------");
        System.out.println("Descending one branch");


        Tree tree_one = new Tree();

        tree_one.insert(25);
        tree_one.insert(20);
        tree_one.insert(15);


        System.out.println("\nTraversal in ascending order: ");
        tree_one.inOrderTraverse();

        System.out.println("\nTraversal in descending order: ");
        tree_one.traverseInOrderDescending();

        System.out.println("\nGetting Minimum value in tree: ");
        tree_one.getMin();

        System.out.println("\nGetting Maximum value in tree: ");
        tree_one.getMax();

        searchValue = 20;
        System.out.println("\nNode for value " + searchValue + " = " + tree_one.get(searchValue));
        //endregion

        //region TEST 3 Randomized with negative integers
        System.out.println("\n\nTEST 3 ----------");
        System.out.println("Randomized with negative integers");
        
        Tree tree_two = new Tree();

        tree_two.insert(2);
        tree_two.insert(25);
        tree_two.insert(15);
        tree_two.insert(-25);
        tree_two.insert(-47);
        tree_two.insert(7);



        System.out.println("\nTraversal in ascending order: ");
        tree_two.inOrderTraverse();

        System.out.println("\nTraversal in descending order: ");
        tree_two.traverseInOrderDescending();

        System.out.println("\nGetting Minimum value in tree: ");
        tree_two.getMin();

        System.out.println("\nGetting Maximum value in tree: ");
        tree_two.getMax();

        searchValue = 2;
        System.out.println("\nNode for value " + searchValue + " = " + tree_two.get(searchValue));
        //endregion
    }
}