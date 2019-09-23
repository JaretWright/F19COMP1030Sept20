import java.util.Scanner;

public class JavaComfortLevel {
    //add in the main method
    public static void main(String[] args)
    {
        //prompt the user on a scale of 1-5 for their comfort level
        System.out.printf("Enter your Java comfort level (1-5) " +
                          "5=very comfortable:");

        //store the user's answer
        Scanner keyboard = new Scanner(System.in);
        int comfortLevel = keyboard.nextInt();

        //if the answer is 4 or 5 give a positive message
        System.out.printf("comfortLevel >= 4 is %b%n", comfortLevel >= 4);
        System.out.printf("comfortLevel == 3 is %b%n", comfortLevel == 3);

        if (comfortLevel >= 4)
        {
            System.out.printf("That is great - keep it up!");
        }

        //if the answer is 3 display a "keep going" message
        else if (comfortLevel == 3)
            System.out.printf("3 is normal for getting started, keep working");

        //if the answer is less than 3, display a get support message
        else
            System.out.printf("It's normal to struggle at the beginning " +
                               "ask for support");
    }
}
