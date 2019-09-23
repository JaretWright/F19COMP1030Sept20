import java.util.Scanner;

public class StringVsInt {
    public static void main(String[] args)
    {
        String num1 = "15";
        String num2 = "35";
        int num3 = 15;
        int num4 = 35;

        System.out.printf("the String 15+35=%s%n",num1+num2);
        System.out.printf("the integers 15+35=%d%n",num3+num4);

        System.out.printf("The tax on $90 is $%.2f%n%n", calcSalesTax(90));

        System.out.printf("Enter the cost of your lunch before taxes: ");
        Scanner walagod = new Scanner(System.in);
        double beforeTaxTotal = walagod.nextDouble();

        System.out.printf("Your $%.2f lunch would require $%.2f in tax",
                                beforeTaxTotal, calcSalesTax(beforeTaxTotal) );
    }

    /**
     * This method will return the tax amount based on the input
     * @param preTaxCost
     * @return
     */
    public static double calcSalesTax(double preTaxCost)
    {
        double salesTax = 0.15;
        return preTaxCost * salesTax;
    }
}
