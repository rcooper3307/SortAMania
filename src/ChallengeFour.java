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
    }
}
