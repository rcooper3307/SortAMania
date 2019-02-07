public class SortingUtil {
    public static void swap(int[]arr, int x, int y)
    {
        int temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    //swaps two rows of a two dimensional array
    public static void rowSwap(int[][]arr, int x, int y) {
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[x][i];
            arr[x][i] = arr[y][i];
            arr[y][i] = temp[i];
        }
    }
    public static int[] randomIntArr(int count)
    {
        int arr[] = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random()*count+1);
        }
        return arr;
    }
    public static int[][] randomBigArr(int count1,int count2)
    {
        int arr[][] = new int[count1][count2];
        for(int i = 0; i < count1; i++)
        {
            for(int j = 0; j < count2; j++)
            {
                arr[i][j] = (int)(Math.random()*count1+1);
            }
        }
        return arr;
    }
    public static String[] randomStringArr(int num, int length)
    {
        String [] arr = new String [num];
        while (num > 0)
        {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
    public static void printArr(int[] arr)
    {
        for (int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void printArr(String[] arr)
    {
        for (String num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void printArr(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }
    public static void printArr(ChallengeFive[] arr)
    {
        for (ChallengeFive num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static boolean isSorted(int[]arr)
    {
        for(int i = 0; i < (arr.length-1); i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    //Finds the median of a 1D array. Assumes the array has already been sorted
    public static int FindMed(int[] arr) {
        if(arr.length%2 == 1) {
            return (arr.length + 1)/2;
        } else {
            int h = arr.length/2;
            return (arr[h] + arr[h - 1])/2;
        }
    }
    //Finds the median of a row in a 2D array. Assumes the row has already been sorted.
    public static int FindRowMed(int[][] arr, int r) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[r][i];
        }
        return FindMed(temp);
    }
    public static ChallengeFive[] randomThingArr(int num)
    {
        ChallengeFive[] things = new ChallengeFive[num];
        for (int i = 0; i < num; i++)
        {
            things[i] = new ChallengeFive() {
                @Override
                public int compareTo(ChallengeFive other) {
                    return super.compareTo(other);
                }
            };
        }
        return things;
    }
}
