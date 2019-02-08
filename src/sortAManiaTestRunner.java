public class sortAManiaTestRunner
{
    public static void main(String[] args){
        Team3SortCompetition team3 = new Team3SortCompetition(); // create an instance of your class
        int[] randIntArr = SortingUtil.randomIntArr(100); // initialize a random int array
        int[] randIntArr2 = SortingUtil.randomIntArr(100);
        int[][] randBigArr = SortingUtil.randomBigArr(100,100); // initialize a random Big array
        String[] randStringArr = SortingUtil.randomStringArr(100,5); //init a random string array
        //ChallengeFive[] randThingArr = SortingUtil.randomThingArr(10000);



        System.out.println("Unsorted Challenge One");
        SortingUtil.printArr(randIntArr); //print out the unsorted int array

        long time1 = System.currentTimeMillis(); //start the timer
        int median1 = team3.challengeOne(randIntArr); //run your challenge one code
        time1 = System.currentTimeMillis() - time1; // stop the timer
        System.out.println("Challenge One Time Taken: " + time1 * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median1); //print the median you found

        System.out.println("Sorted Challenge One");
        SortingUtil.printArr(randIntArr); //check if the array was sorted correctly



        //testing challenge2



        System.out.println("Unsorted Challenge Two");
        SortingUtil.printArr(randStringArr); //print out the unsorted int array

        long time2 = System.currentTimeMillis(); //start the timer
        int strIndex = team3.challengeTwo(randStringArr,"b"); //run your challenge two code
        time2 = System.currentTimeMillis() - time2; // stop the timer
        System.out.println("Challenge Two Time Taken: " + time2 * 0.001 + " Seconds"); //print the time
        System.out.println("Index equals: " + strIndex); //print the index you found

        System.out.println("Sorted Challenge Two");
        SortingUtil.printArr(randStringArr); //check if the array was sorted correctly

        //method 3


        System.out.println("Unsorted Challenge Three");
        SortingUtil.printArr(randIntArr2); //print out the unsorted int array

        long time3 = System.currentTimeMillis(); //start the timer
        int median3 = team3.challengeThree(randIntArr2); //run your challenge one code
        time3 = System.currentTimeMillis() - time3; // stop the timer
        System.out.println("Challenge Three Time Taken: " + time3 * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median3); //print the median you found

        System.out.println("Sorted Challenge Three");
        SortingUtil.printArr(randIntArr2); //check if the array was sorted correctly

        //method 4

        System.out.println("Unsorted Challenge Four");
        SortingUtil.printArr(randBigArr); //print out the unsorted int array

        long time4 = System.currentTimeMillis(); //start the timer
        int median4 = team3.challengeFour(randBigArr); //run your challenge one code
        time4 = System.currentTimeMillis() - time4; // stop the timer
        System.out.println("Challenge Four Time Taken: " + time4 * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median4); //print the median you found

        System.out.println("Sorted Challenge Four");
        SortingUtil.printArr(randBigArr); //check if the array was sorted correctly

        //method 5

        //System.out.println("Unsorted Challenge Five");
        //SortingUtil.printArr(randThingArr); //print out the unsorted int array

        //long time5 = System.currentTimeMillis(); //start the timer
       // int thingIndex = team3.challengeFive(randThingArr,"g"); //run your challenge one code
       // time5 = System.currentTimeMillis() - time5; // stop the timer
       // System.out.println("Challenge Five Time Taken: " + time5 * 0.001 + " Seconds"); //print the time
        //System.out.println("Index equals: " + thingIndex); //print the median you found

       // System.out.println("Sorted Challenge Five ");
        //SortingUtil.printArr(randThingArr); //check if the array was sorted correctly






    }
}
