public class PlayerLinkedList
{
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode newNode = new PlayerNode(player);
        newNode.setNextPlayerNode(head);
        head = newNode;
    }

    // 1) Method to remove the first element
    public void removeFirstElement()
    {
        PlayerNode headNode = head;
        head = headNode.getNextPlayerNode();
    }

    // 2) Show size of linked list
    public void getSize()
    {
        int countLinkedList = 0;
        PlayerNode current = head;

        while (current != null)
        {
            countLinkedList++;
            current = current.getNextPlayerNode();
        }

        System.out.print("\nTotal in Linked List: " + countLinkedList);

    }

    // 3-1) Contains
    public boolean listContainsPlayer(PlayerNode existingNode)
    {
        PlayerNode current = head;


        System.out.print("\nFinding player: " + existingNode + "\n");
        System.out.print("current: " + current + "\n");

        while (current != null)
        {
            if (current == existingNode)
            {
                return true;
            }
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayerNode();
        }

        System.out.print("NULL");

        return false;
    }

    // 3-2) In index...
    public void listAtIndex()
    {

    }

    public void printLinkedList()
    {
        System.out.print("[HEAD] -> ");
        PlayerNode current = head;

        while (current != null)
        {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayerNode();
        }

        System.out.print("NULL");
    }


}
