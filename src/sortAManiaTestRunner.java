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
                int swap = 1;
                String temp;
                while (swap > 0){
                    swap = 0;
                    for (int i = 1; i < arr.length; i++){
                        if ((arr[i-1].compareTo(arr[i])) > 0){
                            temp = arr[i];
                            arr[i] = arr[i-1];
                            arr[i-1] = temp;
                            swap++;
                        }
                    }
                }
                // checks if string query is in arr
                // returns the index of the first instance of that string or -1 if not found
                int indexOfString = -1;
                int i = 0;
                while (i < arr.length || !(arr[i].equals(query)))
                {
                    i++;
                }
                if (arr[i].equals(query))
                {
                    indexOfString = i;
                }
                return indexOfString;
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
        int[] randIntArr2 = SortingUtil.randomIntArr(100000);
        int[][] randBigArr = SortingUtil.randomBigArr(1000,1000); // initialize a random Big array
        String[] randStringArr = SortingUtil.randomStringArr(10000,5); //init a random string array
        ChallengeFive[] randThingArr = SortingUtil.randomThingArr(10000);



        System.out.println("Unsorted");
        SortingUtil.printArr(randIntArr); //print out the unsorted int array

        long time1 = System.currentTimeMillis(); //start the timer
        int median1 = team3.challengeOne(randIntArr); //run your challenge one code
        time1 = System.currentTimeMillis() - time1; // stop the timer
        System.out.println("Challenge One Time Taken: " + time1 * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median1); //print the median you found

        System.out.println("Sorted");
        SortingUtil.printArr(randIntArr); //check if the array was sorted correctly



        //testing challenge2



        System.out.println("Unsorted");
        SortingUtil.printArr(randStringArr); //print out the unsorted int array

        long time2 = System.currentTimeMillis(); //start the timer
        int strIndex = team3.challengeTwo(randStringArr,"b"); //run your challenge two code
        time2 = System.currentTimeMillis() - time2; // stop the timer
        System.out.println("Challenge Two Time Taken: " + time2 * 0.001 + " Seconds"); //print the time
        System.out.println("Index equals: " + strIndex); //print the index you found

        System.out.println("Sorted");
        SortingUtil.printArr(randStringArr); //check if the array was sorted correctly

        //method 3


        System.out.println("Unsorted");
        SortingUtil.printArr(randIntArr2); //print out the unsorted int array

        long time3 = System.currentTimeMillis(); //start the timer
        int median3 = team3.challengeThree(randIntArr2); //run your challenge one code
        time3 = System.currentTimeMillis() - time3; // stop the timer
        System.out.println("Challenge One Time Taken: " + time3 * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median3); //print the median you found

        System.out.println("Sorted");
        SortingUtil.printArr(randIntArr2); //check if the array was sorted correctly

        //method 4

        System.out.println("Unsorted");
        SortingUtil.printArr(randBigArr); //print out the unsorted int array

        long time4 = System.currentTimeMillis(); //start the timer
        int median4 = team3.challengeFour(randBigArr); //run your challenge one code
        time4 = System.currentTimeMillis() - time4; // stop the timer
        System.out.println("Challenge One Time Taken: " + time4 * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median4); //print the median you found

        System.out.println("Sorted");
        SortingUtil.printArr(randBigArr); //check if the array was sorted correctly

        //method 5

        System.out.println("Unsorted");
        SortingUtil.printArr(randThingArr); //print out the unsorted int array

        long time5 = System.currentTimeMillis(); //start the timer
        int median5 = team3.challengeFive(randThingArr,"g"); //run your challenge one code
        time5 = System.currentTimeMillis() - time5; // stop the timer
        System.out.println("Challenge One Time Taken: " + time5 * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median5); //print the median you found

        System.out.println("Sorted");
        SortingUtil.printArr(randThingArr); //check if the array was sorted correctly






    }
}
