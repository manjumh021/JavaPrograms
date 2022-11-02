public class MoodAnalyser {
    String mood_swing ;
    MoodAnalyser(String mood_swing){
        this.mood_swing = mood_swing;
    }
    //Method of Exception for Invalid Input.
    public static void validate (String str) throws InvalidAgeException{
        // throw an object of user defined exception
        throw new InvalidAgeException("Invalid Mood");
    }
    public void analyseMood(String mood){
        System.out.println("Current Mood is:"+mood);
    }
    public static void main(String[] args)
    {
        System.out.println("Mood Analyser to analyze Haappy or Sad Mood.");
        MoodAnalyser obj = new MoodAnalyser();
        obj.analyseMood("Happy");
        MoodAnalyser obj_swing = new MoodAnalyser("Sad");
        System.out.println("My Mood is:"+obj_swing);

        //Code for Exception for Invalid Input.
        try
        {
            // calling the method
            validate("Enjoying");
        }
        catch (InvalidAgeException ex)
        {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

        // Checking and throwing Null Pointer Exception.
        try {
            validate(" ");
        } catch (NullPointerException npe) {
            // printing the message from NullPointerException for Invalid Input.
            System.out.println("NullPointer Exception occured: " + npe);
        }
    }
}

// class representing custom exception
class InvalidAgeException  extends Exception
{
    public InvalidAgeException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}