public class Main
{

    //Switch case of multiple players to queue, randomly selected
    public static Player toQueue(int chosen)
    {
        return switch (chosen) {
            case 1 -> new Player(1, "Boggo", 199);
            case 2 -> new Player(2, "Doggae", 64);
            case 3 -> new Player(3, "Juansome", 84);
            case 4 -> new Player(4, "Epicman", 213);
            case 5 -> new Player(5, "YouseffTheGoat", 123);
            case 6 -> new Player(6, "PipFromPaladins", 345);
            case 7 -> new Player(7, "He-Man the Invincible", 90);
            case 8 -> new Player(8, "Holo-Offline", 4);
            case 9 -> new Player(9, "Jensons", 12);
            case 10 -> new Player(10, "Best Player in the Match", 1);
            case 11 -> new Player(11, "Muselk", 999);
            case 12 -> new Player(12, "VentureOverwatch", 990);
            case 13 -> new Player(13, "Utah", 23);
            case 14 -> new Player(14, "Gilgamesh", 49);
            case 15 -> new Player(15, "Meaning of Life", 42);
            case 16 -> new Player(16, "WilsonDontStarve", 606);
            case 17 -> new Player(17, "Snoop Dog", 420);
            case 18 -> new Player(18, "wallmart", 3);
            case 19 -> new Player(19, "Rochelle", 480);
            case 20 -> new Player(20, "Vault-Tech", 111);
            case 21 -> new Player(21, "Catcoon", 89);
            case 22 -> new Player(22, "kickall", 9999);
            case 23 -> new Player(23, "unbindall", 9999);
            case 24 -> new Player(24, "Bruno Mars", 444);
            case 25 -> new Player(25, "Cruzmaker", 10000);
            case 26 -> new Player(26, "iron59", 100000);
            case 27 -> new Player(27, "V of V's", 92);
            case 28 -> new Player(28, "jose.gonzales@gmail.com.ph", 940);
            case 29 -> new Player(29, "hansolo", 7);
            case 30 -> new Player(30, "Deku", 999);
            default -> new Player(404, "MissingNo.", 404);
        };
    }

    public static void main(String[] args)
    {
        PlayerQueue players = new PlayerQueue(15);

        //Initializing variables for queue
        int round = 1;
        int gamesStarted = 0;
        Player removePlayer;

        while (true)
        {
            int randPlayersEnqueued = (int)(Math.random() * 7 + 1);

            System.out.println("=====================================================================");
            System.out.println("Wave of Queued Player's: " + round);
            round++;

            System.out.println("\nCurrently Active Games: " + gamesStarted);

            System.out.println("\nInitial Queue:");
            players.printQueue();


            //Removes players when it detects 5 or more players in queue
            if (players.requirement())
            {
                System.out.println("\n\nGame found! Removing players from queue");
                for (int i = 0; i < 5; i++)
                {
                    removePlayer = players.dequeue();
                    System.out.println("Removed " +  removePlayer);
                }
                gamesStarted++;
            }

            System.out.println("\n\nIncoming Players: " + randPlayersEnqueued);

            for (int i = 0; i < randPlayersEnqueued; i++)
            {
                int randSpecificPlayer = (int)(Math.random() * 30 + 1);
                players.enqueue(toQueue(randSpecificPlayer));
            }

            System.out.println("Added Player's in Queue: ");
            players.printQueue();



            if (gamesStarted == 10)
            {
                System.out.println("\n\nALL AVAILABLE GAMES ARE FULL");
                break;
            }

            //To pause for each round
            System.out.println("\nPress Enter to continue");
            try{System.in.read();}
            catch(Exception e){}

        }
    }
}