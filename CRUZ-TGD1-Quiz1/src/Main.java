public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Submitted by: Jedidiah B. Cruz\n");
        System.out.print("Section: TGD1\n");
        System.out.print("Deliverable: Quiz 1\n");
        System.out.print("=================================\n\n\n");

        int[] numbers = new int[10];

        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 20;
        numbers[7] = -8;
        numbers[8] = 173;
        numbers[9] = 65;

        // before Bubble sort
        System.out.print("Before Bubble Sort: ");
        printArrayElements(numbers);

        bubbleSort(numbers);


        // after Bubble sort
        System.out.print("\n\nAfter Bubble Sort: ");
        printArrayElements(numbers);

        System.out.print("\n\n--------------------------------------------------------------------------------------");
        numbers[0] = 72;
        numbers[1] = -32;
        numbers[2] = 6;
        numbers[3] = 1;
        numbers[4] = 27;
        numbers[5] = 42;
        numbers[6] = 102;
        numbers[7] = -71;
        numbers[8] = 189;
        numbers[9] = 69;


        // before Selection sorting
        System.out.print("\n\nBefore Selection Sort: ");
        printArrayElements(numbers);

        selectionSort(numbers);

        // after Selection sorting
        System.out.print("\n\nAfter Selection Sort: ");
        printArrayElements(numbers);
    }

    //Bubble Sort
    //Organizes array in descending order
    private static void bubbleSort(int[] nums)
    {
        for (int unsortedPartitionIndex = nums.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--)
        {
            for (int i = 0; i < unsortedPartitionIndex; i++)
            {
                //Swaps the 2 adjacent elements
                if (nums[i] < nums[i + 1])
                {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }

    //Selection Sort
    //Looks for smallest value and places it at end of array
    private static void selectionSort(int[] nums) {
        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {

            int smallest = 0;

            for (int i = smallest + 1; i <= lastUnsortedIndex; i++)
            {
                if (nums[i] < nums[smallest])
                {
                    smallest = i;
                }
            }

            // swap the value of the smallest with the value of lastUnsortedInd
            if (smallest != lastUnsortedIndex)
            {
                int temp = nums[smallest];
                nums[smallest] = nums[lastUnsortedIndex];
                nums[lastUnsortedIndex] = temp;
            }
        }
    }

    private static void printArrayElements(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]);
            if (i < nums.length - 1) //Detect if at end of array so it does not print
            {
                System.out.print(", ");
            }
        }
    }
}