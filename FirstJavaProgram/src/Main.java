import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int p = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annR = scanner.nextFloat();
        System.out.print("Period (Years): ");
        int years = scanner.nextInt();

        // Now we need to get the monthly interest rate
        float r = annR/1200;
        //Now we need to get the total number of payments
        int n = years*12;

        // The formula for Mortgage is M=(P*r*(1+r)^n)/(((1+r)^n) - 1)

        double M = (p*r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1);
        M = (double) Math.round(M*100)/100;

        System.out.print("Mortgage: $" +M);

        }
    }
