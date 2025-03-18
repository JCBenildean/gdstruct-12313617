public class SimpleHastable
{
    private SavedPlayer[] hashtable;

    public SimpleHastable()
    {
        hashtable = new SavedPlayer[10];
    }

    public int hashKey (String key)
    {
        return key.length() % hashtable.length;
    }

    public boolean isOccupied(int index)
    {
        return hashtable[index] != null;
    }

    public void put(String key, Player player)
    {
        int index = hashKey(key);

        if (isOccupied(index))
        {
            int stoppingIndex = index;

            if (index == hashtable.length - 1)
            {
                index = 0;
            }
            else
            {
                index++;
            }

            while (index != stoppingIndex && isOccupied(index))
            {
                index = (index + 1) % hashtable.length;
            }
        }

        hashtable[index] = new SavedPlayer(key, player);
    }

    public int findIndex(String key)
    {
        int index = hashKey(key);
        SavedPlayer savedPlayer = hashtable[index];

        if (savedPlayer == null)
        {
            return -1;
        }

        if (!key.equals(savedPlayer.getKey()))
        {
            int stoppingIndex = index;
            boolean found = false;

            if (index == hashtable.length - 1)
            {
                index = 0;
            }
            else
            {
                index++;
            }

            while (index != stoppingIndex && !found)
            {
                savedPlayer = hashtable[index];

                if (isOccupied(index))
                {
                    savedPlayer = hashtable[index];

                    if (key.equals(savedPlayer.getKey()))
                    {
                        found = true;
                        break;
                    }
                }

                index = (index + 1) % hashtable.length;
            }

            if (!found)
            {
                index = -1;
            }
        }

        return index;
    }

    //QUIZ 4 ----------------- Remove Function-------------------
    public void remove(String key)
    {
        int index = findIndex(key);

        hashtable[index] = null;
    }

    public Player get(String key)
    {
        int index = findIndex(key);

        if (index == -1)
        {
            return null;
        }

        return hashtable[index].getValue();
    }

    public void printHashtable()
    {
        for (int i = 0; i < hashtable.length; i++)
        {
            if (isOccupied(i))
            {
                System.out.println(i + " - " + hashtable[i]);
            }
            else
            {
                System.out.println(i + " - NULL");
            }
        }
    }
}
