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
    public static void ArrRowSort(int[][] arr, int r) {
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[r][i];
        }
        insertionSort(temp);
        for(int j = 0; j < arr.length; j++) {
            arr[r][j] = temp[j];
        }
    }
}
