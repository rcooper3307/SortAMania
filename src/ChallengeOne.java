public abstract class ChallengeOne extends Team3SortCompetition {
    public ChallengeOne(int[] Arr)
    {
        challengeOne(Arr);
    }
    @Override
    public int challengeOne(int[] arr) {
       Sorts.insertionSort(arr);
       return SortingUtil.FindMed(arr);
    }
}
