public abstract class ChallengeTwo extends Team3SortCompetition {
    //Sorts list and determines if it contains a given string
    //returns the index of the first instance o that string or -1 if not found
    public int challengeTwo(String[] arr, String query){
        //uses bubbleSort to sort strings from 0-10, then alphabetical order
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
    //i cant tell if this works yet, haven't tested it
}
