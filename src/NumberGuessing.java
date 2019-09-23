import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args)
    {
        System.out.printf("Enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();

        if (number < 10)
            System.out.printf("That is a small number");
        else
            System.out.printf("nice number");
    }
}
