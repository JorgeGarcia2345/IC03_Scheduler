import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	// write your code here
        String [] appointments = new String[6];
        // {null, null, null, null, null, null}
        String name;
        Scanner keyboard = new Scanner (System.in);
        int time, count = 0;

        do
        {
            try
            {
                System.out.print("What time (1-6PM) would you like to schedule and appointment: ");
                time = keyboard.nextInt();
                //Integer.parseInt(time);

                if (time > appointments.length || time < 1)
                    throw new InvalidTimeException();

                // If the appointment time is NOT null, generate a TimeInUseException
                if (appointments[time - 1] != null)
                    // throw = generate this exception
                    throw new TimeInUseException();

                // clear buffer
                keyboard.nextLine();
                System.out.print("Enter the name of the person reserving this appointment: ");
                name = keyboard.nextLine();

                // how would we "book" the appointment?
                appointments[time - 1] = name;
                // increment count of appointment by 1
                count++;

                System.out.println("Here are the current appointments: ");
                for(int i = 0; i <appointments.length; i++)
                {
                    System.out.print( (i+1) + ":00 PM: ");
                    if (appointments[i] == null)
                        System.out.println("[empty]");
                    else
                        System.out.println(appointments[i]);
                }
            }

            catch (TimeInUseException | InvalidTimeException e)
            {
                System.out.println(e.getMessage());
            }

        } while (count < appointments.length);
        // as long as
    }
}
