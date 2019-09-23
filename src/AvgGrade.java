import java.util.Scanner;

public class AvgGrade {
    public static void main(String[] args)
    {
        //have the user input 3 grades
        Scanner keyboard = new Scanner (System.in);
        System.out.printf("Enter a grade: ");
        int grade1 = keyboard.nextInt();

        System.out.printf("Enter a grade: ");
        int grade2 = keyboard.nextInt();

        System.out.printf("Enter a grade: ");
        int grade3 = keyboard.nextInt();

        System.out.printf("The average grade is %.1f %% %n",
                                avgGrade(grade1,grade2,grade3));

        System.out.printf("The average of 100,15,99 is %.1f%n",
                avgGrade(100,15,99));

        System.out.printf("The average of 20,15,66 is %.1f%n",
                avgGrade(20,15,66));
    }

    /**
     * This method accepts 3 integers as an input and returns
     * their average as a double
     */
    public static double avgGrade(int num1, int num2, int num3)
    {
        //(87+99+100)/3
        return (double) (num1+num2+num3)/3;
    }

}
