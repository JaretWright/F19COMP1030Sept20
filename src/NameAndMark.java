import java.util.Scanner;

//    Create a class called NameAndMark
public class NameAndMark {

    //    Create a main method
    public static void main(String[] args)
    {
        //    Prompt the user for their name
        System.out.printf("What is your name: ");

        //    Store their name in a variable of type String
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();

        //    Prompt the user for their highest mark
        System.out.printf("Hi %s, what is your highest mark?: ",name);

        //    Store their highest mark as an int
        int highestMark = keyboard.nextInt();

        //    Display “Hi [name], your highest mark was [mark]%”
        System.out.printf("Hi %s, your highest mark was %d%%",name,highestMark);
    }
}
