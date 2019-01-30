public class sortAManiaTestRunner {
    public static void main(String[] args){
        SortCompetition team1 = new Team1SortCompetition(); // create an instance of your class
        int[] randIntArr = SortingUtil.randomIntArr(10000); // initialize a random int array
        String[] randStringArr = SortingUtil.randomStringArr(10000,5); //init a random string array

        System.out.println("Unsorted");
        SortingUtil.printArr(randIntArr); //print out the unsorted int array

        long time = System.currentTimeMillis(); //start the timer
        int median = team1.challengeOne(randIntArr); //run your challenge one code
        time = System.currentTimeMillis() - time; // stop the timer
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median); //print the median you found

        System.out.println("Sorted");
        SortingUtil.printArr(randIntArr); //check if the array was sorted correctly

    }
}
