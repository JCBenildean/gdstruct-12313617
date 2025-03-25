public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Submitted by: Jedidiah B. Cruz\n");
        System.out.print("Section: TGD1\n");
        System.out.print("Deliverable: Quiz 5\n");
        System.out.print("=================================\n\n\n");

        int[] nums = { -50, -25, -9, 8, 12, 42, 47, 50};

        int searchValue;
        int index;

        //region TEST 1 - If value is in Array
        System.out.println("==================================================================");
        System.out.println("TEST 1 - If value is in Array");

        System.out.println(); //Search value -9
        searchValue = -9;
        index = loadingBarSearch(nums, searchValue);
        System.out.println("Loading Bar Search: " + searchValue + " is in index " + index);

        System.out.println(); // Search value 42
        searchValue = 42;

        index = loadingBarSearch(nums, searchValue);
        System.out.println("Loading Bar Search: " + searchValue + " is in index " + index);
        //endregion  s

        //region TEST 2 - If value is in Array (start and end)
        System.out.println("==================================================================");
        System.out.println("TEST 2 - If value is in Array (start and end)");

        System.out.println(); //Search value -9
        searchValue = -50;
        index = loadingBarSearch(nums, searchValue);
        System.out.println("Loading Bar Search: " + searchValue + " is in index " + index);

        System.out.println(); // Search value 42
        searchValue = 50;

        index = loadingBarSearch(nums, searchValue);
        System.out.println("Loading Bar Search: " + searchValue + " is in index " + index);
        //endregion TEST 2 - If value is in Array

        //region TEST 3 - If value is NOT in Array (within sorted array range)
        System.out.println("==================================================================");
        System.out.println("TEST 3 - If value is NOT in Array (within sorted array range)");

        System.out.println(); //Search value -9
        searchValue = -47;
        index = loadingBarSearch(nums, searchValue);
        System.out.println("Loading Bar Search: " + searchValue + " is in index " + index);

        System.out.println(); // Search value 42
        searchValue = 14;

        index = loadingBarSearch(nums, searchValue);
        System.out.println("Loading Bar Search: " + searchValue + " is in index " + index);
        //endregion

        //region TEST 4 - If value is NOT in Array (outside sorted array range)
        System.out.println("==================================================================");
        System.out.println("TEST 4 - If value is NOT in Array (outside sorted array range)");

        System.out.println(); //Search value -9
        searchValue = -51;
        index = loadingBarSearch(nums, searchValue);
        System.out.println("Loading Bar Search: " + searchValue + " is in index " + index);

        System.out.println(); // Search value 42
        searchValue = 75;
        index = loadingBarSearch(nums, searchValue);
        System.out.println("Loading Bar Search: " + searchValue + " is in index " + index);
        //endregion

    }

    private static int loadingBarSearch(int[] nums, int value)
    {
        int percentNone = 0;
        int percentQuarter = (int) (nums.length * 0.25);
        int percentHalf = (int) (nums.length * 0.50);
        int percentThreeQuarter = (int) (nums.length * 0.75);
        int percentFull = nums.length - 1;

        int start = percentNone;
        int end = percentFull;

       if (value <= nums[percentQuarter])
       {
           while (value != nums[percentNone])
           {
               percentNone += 1;
               if (percentNone > percentQuarter)
               {
                   return -1;
               }
           }
           return percentNone;
       }

       else if (value <= nums[percentHalf])
       {
            while (value != nums[percentQuarter])
            {
                percentQuarter += 1;
                if (percentQuarter > percentHalf)
                {
                    return -1;
                }
            }
            return percentQuarter;
       }

       else if (value <= nums[percentThreeQuarter])
       {
           while (value != nums[percentHalf])
           {
               percentHalf += 1;
               if (percentHalf > percentThreeQuarter)
               {
                   return -1;
               }
           }
           return percentHalf;
       }

       else if (value <= nums[percentFull])
       {
           while (value != nums[percentThreeQuarter])
           {
               percentThreeQuarter += 1;
               if (percentThreeQuarter > percentFull)
               {
                   return -1;
               }
           }
           return percentThreeQuarter;
       }

        return -1;
    }

    private static int linearSearch(int[] nums, int value)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (value == nums[i])
            {
                return i;
            }
        }

        return -1;
    }

    private static int binarySearch(int[] nums, int value)
    {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;

            if (value == nums[middle])
            {
                return middle;
            }
            else if (value < nums[middle])
            {
                end = middle -1;
            }
            else if (value > nums[middle])
            {
                start = middle + 1;
            }
        }

        return -1;
    }

}