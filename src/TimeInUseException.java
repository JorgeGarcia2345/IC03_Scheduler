public class TimeInUseException extends Exception
{
    // Constructor - default
    // No Parameters
    public TimeInUseException ()
    {
        // call the constructor in Exception
        // send it a custom message
        super("The time slot has already been use. Please try another.");
    }
}
