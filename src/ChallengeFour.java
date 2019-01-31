public abstract class ChallengeFour extends Team3SortCompetition {
    public ChallengeFour(int[][] Arr) {
        challengeFour(Arr);
    }
    @Override
    public int challengeFour(int[][] arr) {

    }
    public void ArraySort(int[][] arr1) {
        int[] temp = new int[1000];
        for(int i = 0; i < 1000; i++) {
            for(int j = 0; j < 1000; j++) {
                temp[j] = arr1[j][i];
            }
            Sorts.insertionSort(temp);
        }
    }
}
