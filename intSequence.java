public class intSequence
{

    private int score;
    private double averageScore;
    private int totalScore;
    private int scoreCount;
    int v = 0;
    int f = 0;

    public intSequence() /*Constructer, constructor doesn't have a return type.
    The name of the constructor must be the same as the name of the class.
    Initializing newly instanted objects.*/
    {
        scoreCount = 0;
        score = 0;
        averageScore = 0;
        totalScore = 0;
        scoreCount = 0;
        v = 99999999; //smallscore just start w 99999999 to get something what will be smaller
        f = 0; //store our max value which we typed 
    }
    
    public void nextScore(int x)//Mutator
    //A mutator method is used to set a value of a private field.sets a class's variable or its value.
    //change the state of an object.
    {
        totalScore += x;
        scoreCount++;
    }

    public void smallScore(int x)//Mutator
    {
        if(v > x)
            v = x;
    }

    public double averageScore()//Accessor
    //Accesses an object but does not change it, returns a class's variable or its value.
    {
        return (double) totalScore / scoreCount;
    }

    public int smallScoreSmall()//Accessor
    {
        return v;
    }    

    public void largeScore(int x)//Mutator
    {
        if(f < x)
            f = x;
    }

    public int getCount() //Accessor
    {
        return scoreCount;
    } 

    public int largeScoreLarge()//Accessor
    {
        return f;
    }   

    public int range()//Accessor

    {
        return f - v;
    }

    
}
