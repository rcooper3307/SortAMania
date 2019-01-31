public abstract class ChallengeThree extends Team3SortCompetition
{
    @Override
    public int challengeThree (int[] arr)
    {
        while(!(SortingUtil.isSorted(arr)))
        {
            Sorts.insertionSort(arr);
        }
        if(arr.length%2 == 1) {
            return (arr.length + 1)/2;
        } else {
            int h = arr.length/2;
            return (arr[h] + arr[h - 1])/2;
        }

    }


}
