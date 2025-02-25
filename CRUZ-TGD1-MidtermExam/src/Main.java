public class Main
{

    public static void main(String[] args)
    {
        CardStack cardReserve = new CardStack(30);
        CardStack playerHand = new CardStack(30);
        CardStack cardDiscarded = new CardStack(30);


        //Tarot Cards
        cardReserve.push(new Card(1, "The Fool"));
        cardReserve.push(new Card(2,"The Magician"));
        cardReserve.push(new Card(3,"The High Priestess"));
        cardReserve.push(new Card(4, "The Empress"));
        cardReserve.push(new Card(5, "The Emperor"));
        cardReserve.push(new Card(6, "The Hierophant"));
        cardReserve.push(new Card(7, "The Lovers"));
        cardReserve.push(new Card(8, "The Chariot"));
        cardReserve.push(new Card(9, "Strength"));
        cardReserve.push(new Card(10, "The Hermit"));
        cardReserve.push(new Card(11, "Wheel of Fortune"));
        cardReserve.push(new Card(12, "Justice"));
        cardReserve.push(new Card(13, "The Hanged Man"));
        cardReserve.push(new Card(14, "Death"));
        cardReserve.push(new Card(15, "Temperance"));
        cardReserve.push(new Card(16, "The Devil"));
        cardReserve.push(new Card(17, "The Tower"));
        cardReserve.push(new Card(18, "The Star"));
        cardReserve.push(new Card(19, "The Moon"));
        cardReserve.push(new Card(20, "The Sun"));
        cardReserve.push(new Card(21, "Judgement"));
        cardReserve.push(new Card(22, "The World"));
        //Egyptian Gods
        cardReserve.push(new Card(23, "Geb"));
        cardReserve.push(new Card(24, "Tohth"));
        cardReserve.push(new Card(25,"Anubis"));
        cardReserve.push(new Card(26, "Bastet"));
        cardReserve.push(new Card(27, "Sethan"));
        cardReserve.push(new Card(28, "Osiris"));
        cardReserve.push(new Card(29, "Horus"));
        cardReserve.push(new Card(30, "Atum"));

        //Loop
        while (true)
        {
            int randomTurn = (int)((Math.random() * 3) + 1);  // 0 to 5

            int randomAmount = (int)((Math.random() * 5) + 1);  // 0 to 5

            if (cardReserve.isEmpty())
            {
                break;
            }

            switch (randomTurn)
            {
                    //Drawing from Reserve

                case 1:
                    System.out.println("Drawing " + randomAmount + " Cards from the Reserve.");
                    if (!cardReserve.isEmpty())
                    {
                        for (int i = 0; i < randomAmount; i ++)
                        {
                        playerHand.push(cardReserve.pop());
                            if (cardReserve.isEmpty())
                            {
                                break;
                            }
                        }
                    }
                    break;

                    //Drawing from Player hand
                case 2:
                    System.out.println("Discarding " + randomAmount + " from Player hand.");
                    if (!playerHand.isEmpty())
                    {
                        for (int i = 0; i < randomAmount; i++)
                        {
                            cardDiscarded.push(playerHand.pop());
                            if (playerHand.isEmpty())
                            {
                                break;
                            }
                        }
                    }
                    break;

                    //Drawing from discard pile
                case 3:
                    System.out.println("Drawing " + randomAmount + " Cards from the Discarded Pile.");
                    if (!cardDiscarded.isEmpty()) {
                        for (int i = 0; i < randomAmount; i++)
                        {
                            playerHand.push(cardDiscarded.pop());
                            if (cardDiscarded.isEmpty())
                            {
                                break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Error!");
            }

            //Print out stacks
            System.out.println("\nCard Reserve: ");
            cardReserve.printStack();

            System.out.println("\nDiscarded: ");
            cardDiscarded.printStack();

            System.out.println("\nPlayer Hand: ");
            playerHand.printStack();

            //To pause for each round
            System.out.println("\nPress Enter to continue");
            try{System.in.read();}
            catch(Exception e){}

        }

        System.out.println("\nCard Reserve stack is depleted.");
    }
}