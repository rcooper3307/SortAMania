public abstract class ChallengeTwo extends Team3SortCompetition {
    //Sorts list and determines if it contains a given string
    public int challengeTwo(String[] arr, String query){
        //uses bubbleSort to sort strings from 0-10, then alphabetical order
        //there might be a way to make this faster by using insertion sort
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
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(query)){
                indexOfString = i;
                break;
            }
        }
        return indexOfString;
    }
    //i cant tell if this works yet, haven't tested it

    //self note:
    //after all challenges are coded, merge all 5 into a new class named Team3SortCompetition
    //rename current Team3SortCompetition to SortAMania
}
