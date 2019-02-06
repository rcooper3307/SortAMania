public class sortAManiaTestRunner
{
    public static void main(String[] args){
        Team3SortCompetition team3 = new Team3SortCompetition() {
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

            @Override
            public int challengeTwo(String[] arr, String query) {
                return 0;
            }

            @Override
            public int challengeThree(int[] arr) {
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

            @Override
            public int challengeFour(int[][] arr) {
                return 0;
            }

            @Override
            public int challengeFive(Comparable[] arr, Comparable query) {
                return 0;
            }

            @Override
            public String greeting() {
                return null;
            }
        }; // create an instance of your class
        int[] randIntArr = SortingUtil.randomIntArr(10000); // initialize a random int array
        String[] randStringArr = SortingUtil.randomStringArr(10000,5); //init a random string array



        System.out.println("Unsorted");
        SortingUtil.printArr(randIntArr); //print out the unsorted int array

        long time1 = System.currentTimeMillis(); //start the timer
        int median1 = team3.challengeOne(randIntArr); //run your challenge one code
        time1 = System.currentTimeMillis() - time1; // stop the timer
        System.out.println("Challenge One Time Taken: " + time1 * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median1); //print the median you found

        System.out.println("Sorted");
        SortingUtil.printArr(randIntArr); //check if the array was sorted correctly

        System.out.println("Unsorted");
        SortingUtil.printArr(randIntArr); //print out the unsorted int array

        long time2 = System.currentTimeMillis(); //start the timer
        int median2 = team3.challengeTwo(randStringArr,"b"); //run your challenge one code
        time2 = System.currentTimeMillis() - time2; // stop the timer
        System.out.println("Challenge One Time Taken: " + time2 * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median2); //print the median you found

        System.out.println("Sorted");
        SortingUtil.printArr(randIntArr); //check if the array was sorted correctly

    }
}
