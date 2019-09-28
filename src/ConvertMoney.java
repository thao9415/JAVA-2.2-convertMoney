import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double vnd,usd;
        do {
            System.out.println("Menu: ");
            System.out.println("1. VND => USD");
            System.out.println("2. USD => VND");
            System.out.println("0. Exit");
            System.out.print("Please enter your choice: ");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.print("VND = ");
                    vnd=input.nextDouble();
                    usd=vndToUsd(vnd);
                    System.out.println("USD ="+ usd);
                    break;
                case 2:
                    System.out.print("USD = ");
                    usd=input.nextDouble();
                    vnd=usdToVnd(usd);
                    System.out.println("VND = "+vnd);
                    break;
                case 0:
                    System.exit(0);
            }


        } while (choice!=0);

    }
    public static double vndToUsd(double vnd) {
        double usd=vnd/23000;
        return usd;
    }
    public static double usdToVnd(double usd) {
        double vnd=usd*23000;
        return vnd;
    }
}
