public class Sorts {
    public static void insertionSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j-1] > arr[j])
                {
                    SortingUtil.swap(arr,j-1,j);
                }
                else
                {
                    j = 0;
                }
            }
        }
    }
}
