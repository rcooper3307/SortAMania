public abstract class ChallengeFive implements Comparable<ChallengeFive>{
    //an array of 10,000 objects that implement the comparable interface
    //sort the array by compareto method and determine if it contains element given
    //return position of object or -1 if not found
    private int value;
    public ChallengeFive ()
    {
        this.value = (int)(Math.random()*10000);
    }

    @Override
    public int compareTo(ChallengeFive other)
    {
        return this.value - other.value;
    }

    public ChallengeFive[] randomThingArr(int num)
    {
        ChallengeFive[] things = new ChallengeFive[num];
        for (int i = 0; i < num; i++)
        {
            things[i] = new ChallengeFive() {
                @Override
                public int compareTo(ChallengeFive other) {
                    return super.compareTo(other);
                }
            };
        }
        return things;
    }
}
