public class ChallengeOne extends SortCompetition {
    public ChallengeOne(int[] Arr) {
        challengeOne(Arr);
    }
    @Override
    public int challengeOne(int[] arr) {
       Sorts.insertionSort(arr);
       if(arr.length%2 == 1) {
           return (arr.length + 1)/2;
       } else {
           int h = arr.length/2;
           return (arr[h] + arr[h - 1])/2;
       }
    }
}
