import java.util.EmptyStackException;

public class CardStack
{
    private Card[] cardHands;
    private int top;

    public CardStack(int capacity)
    {
        cardHands = new Card[capacity];
        top = -1;
    }

    public void push(Card card)
    {
        if (top == cardHands.length - 1)
        {
            Card[] increaseCardHand = new Card[cardHands.length * 2];
            System.arraycopy(cardHands, 0, increaseCardHand, 0, cardHands.length);
            cardHands = increaseCardHand;
        }

        cardHands[++top] = card;
    }

    public Card pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return cardHands[top--];
    }

    public Card peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return cardHands[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public void printStack()
    {
        for (int i = top; i >= 0; i--)
        {
            System.out.println(cardHands[i]);
        }
    }
}
