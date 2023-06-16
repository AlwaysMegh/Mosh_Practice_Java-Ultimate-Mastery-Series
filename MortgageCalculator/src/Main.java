import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        int p;
        float annR;
        int years;


        while (true) {
            System.out.print("Principal($1K - $1M): ");
            p = scanner.nextInt();
            if (p>=1000 && p<=1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            }


        while (true) {
            System.out.print("Annual Interest Rate: ");
            annR = scanner.nextFloat();
            if (annR>0 && annR<=30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");

        }
         while(true) {
            System.out.print("Period (Years): ");
            years = scanner.nextInt();
            if (years>0 && years<=30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

        // Now we need to get the monthly interest rate
        float r = annR/1200;
        //Now we need to get the total number of payments
        int n = years*12;

        // The formula for Mortgage is M=(P*r*(1+r)^n)/(((1+r)^n) - 1)

        double M = (p*r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1);
        M = (double) Math.round(M*100)/100;

        System.out.print("Mortgage: " + currency.format(M));
        }
    }
