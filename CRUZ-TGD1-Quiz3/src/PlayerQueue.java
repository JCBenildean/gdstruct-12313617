import java.util.NoSuchElementException;

public class PlayerQueue
{
    private Player[] queue;
    private int front;
    private int size;

    public PlayerQueue(int capacity)
    {
        queue = new Player[capacity];
        front = 0;
        size = 0;
    }

    public void enqueue(Player player)
    {
        if (size == queue.length)
        {
            Player[] largerQueue = new Player[queue.length * 2];
            System.arraycopy(queue, 0, largerQueue, 0 , queue.length);
            queue = largerQueue;
        }

        queue[size] = player;
        size++;
    }

    public Player dequeue()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }

        Player removePlayer = queue[front];

        for (int i = 1; i < size; i++)
        {
            queue[i - 1] = queue[i];
        }

        size--;
        queue[size] = null;

        return removePlayer;
    }

    public Player peak()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    //Used to detect the size of the queue if it reaches the required ammount in queue
    public boolean requirement()
    {
        if (size >= 5)
        {
            return true;
        }
        return false;
    }

    public void printQueue()
    {
        for (int i = front; i < size; i++)
        {
            System.out.print(queue[i]);

            if (i < size - 1)
            {
                System.out.print(" -> ");
            }
        }

        //Print instead if no players in queue
        if (size == 0)
        {
            System.out.print("NO PLAYERS QUEUED");
        }
    }

}
