import javax.sound.midi.SysexMessage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.print("Submitted by: Jedidiah B. Cruz\n");
        System.out.print("Section: TGD1\n");
        System.out.print("Deliverable: Quiz 2\n");
        System.out.print("=================================\n\n\n");

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addToFront(new Player(1, "Rochelle", 250));
        playerLinkedList.addToFront(new Player(2, "Ellis", 400));
        playerLinkedList.addToFront(new Player(3, "Couch", 400));
        playerLinkedList.addToFront(new Player(4, "Nick", 250));

        //Initial contents of the list
        System.out.println("Initial values");
        playerLinkedList.printLinkedList();

        //1) Removing first element
        System.out.println("\n\nRemoving first element");
        playerLinkedList.removeFirstElement();
        playerLinkedList.printLinkedList();

        //2) Counting amount in linked list
        System.out.println("\n\nCounting total elements in linked list");
        playerLinkedList.printLinkedList();
        playerLinkedList.getSize();

        //3-1) Contains
        System.out.println("\n\nChecking if player exists");
        PlayerNode existingNode = new PlayerNode(new Player(1, "Rochelle", 250));


        boolean found = playerLinkedList.listContainsPlayer(existingNode);
        System.out.println("\nIs player real? " + found);

        //3-2) Index Off
    }
}

