public abstract class ChallengeFour extends Team3SortCompetition {
    public ChallengeFour(int[][] Arr) {
        challengeFour(Arr);
    }
    @Override
    public int challengeFour(int[][] arr) {
        int[] meds = new int[arr[0].length];
        for(int i = 0; i < arr[0].length; i++) {
            Sorts.ArrRowSort(arr,i);
            meds[i] = SortingUtil.FindRowMed(arr,i);
        }
        Sorts.insertionSort(meds);
        for(int j = 0; j < arr[0].length; j++) {
            
        }
        return SortingUtil.FindMed(meds); //delete this line if you're working on the challenge4,
        // i put it here just to make the runner work
    }
}
