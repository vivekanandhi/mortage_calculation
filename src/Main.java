
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        final byte month_In_Year =12;
        final byte percent =100;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Principal: ");
        int principal =scanner.nextInt();

        System.out.println("Annual interest rate: ");
        float annual_Interest_Rate = scanner.nextFloat();
        float monthly_Interest_Rate=annual_Interest_Rate/percent/month_In_Year;

        System.out.println("Periods in years: ");
        int years = scanner.nextInt();
        int number_of_periods = years * month_In_Year;

        double mortgage = principal*
                monthly_Interest_Rate*(Math.pow(1+monthly_Interest_Rate,number_of_periods))
                        /(Math.pow(1+monthly_Interest_Rate,number_of_periods)-1);
        System.out.println("Your Mortgage Monthly amount: " + NumberFormat.getInstance().format(mortgage));

    }
}