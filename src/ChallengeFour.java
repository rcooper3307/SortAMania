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
        MedSort(meds, arr);
        return SortingUtil.FindMed(meds);
    }
    //Sorts arr based on the values in med. assumes that med is already sorted
    public void MedSort(int[] med, int[][] arr) {
        for(int i = 0; i < med.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(SortingUtil.FindRowMed(arr,j) == med[i]) {
                    SortingUtil.rowSwap(arr, i, j);
                }
            }
        }
    }
}
