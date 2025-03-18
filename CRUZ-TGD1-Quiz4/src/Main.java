public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Submitted by: Jedidiah B. Cruz\n");
        System.out.print("Section: TGD1\n");
        System.out.print("Deliverable: Quiz 4\n");
        System.out.print("=================================\n\n\n");

        Player pikachu = new Player(1, "Pikachu", 10);
        Player celebi = new Player(2, "Celebi", 20);
        Player hitmonchan = new Player(3, "Hitmonchan", 30);
        Player mankey = new Player(4, "Mankey", 40);
        Player starmie = new Player(5, "Starmie", 50);
        Player togepi = new Player(6, "Togepi", 60);

        SimpleHastable players = new SimpleHastable();

        players.put(pikachu.getUsername(), pikachu);
        players.put(celebi.getUsername(), celebi);
        players.put(hitmonchan.getUsername(), hitmonchan);

        System.out.println("Before collision:");
        players.printHashtable();

        players.put(mankey.getUsername(), mankey);
        players.put(starmie.getUsername(), starmie);
        players.put(togepi.getUsername(), togepi);

        System.out.println("\nAfter collision:");

        players.printHashtable();

        String key = celebi.getUsername();
        System.out.println("\nPlayer at key " + key + " = " + players.get(key));

        //QUIZ 4 Remove function test

        System.out.println("Removing player");
        players.remove(key);

        System.out.println("\nAfter remove function:");
        players.printHashtable();
    }
}