import java.util.Scanner;

public class Calculator {

    private static final double rateForLegalEntities = 0.08;
    private static final double rateForIndividuals = 0.10;
    private final double fixedInterestRate = 0.03;



    public static void calculateDeposit( double money, int years, double fixedBankReward) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of money: ");
         money = scanner.nextDouble();
        System.out.print("Enter years of deposit: ");
        years = scanner.nextInt();
        double sum = 0;
        int choice = -1;
        while (choice != 0) {
            System.out.println("press 0 to exit");
            System.out.println("press 1 if you are LegalEntity");
            System.out.println("press 2 if you are Individual");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    sum = money+money*rateForLegalEntities+money*fixedBankReward*years;
                    money += sum;
                    System.out.println("You will get " + money + " at the end, if you will get deposit for " + years+ " years");
                    break;
                case 2:
                    sum = money+money*rateForIndividuals+money*fixedBankReward*years;
                    money += sum;
                    System.out.println("You will get " + money + " at the end, if you will get deposit for " + years+ " years");
                    break;
            }
            break;
        }

    }

    public double calculateCredit(int years, double money) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of money you need: ");
         money = scanner.nextDouble();
        System.out.print("Enter years of credit: ");
         years = scanner.nextInt();
        double sum = 0;
        int choice = -1;
        while (choice != 0) {
            System.out.println("press 0 to exit");
            System.out.println("press 1 if you are LegalEntity");
            System.out.println("press 2 if you are Individual");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:

                    sum = money+money*rateForLegalEntities+money*fixedInterestRate*years;
                    money += sum;
                    System.out.println("You will pay " + money + " at the end, if you will get credit for " + years+ " years");
                    break;
                case 2:
                    sum = money+money*rateForIndividuals+money*fixedInterestRate*years;
                    money += sum;
                    System.out.println("You will pay " + money + " at the end, if you will get credit for " + years+ " years");
                    break;
            }
            break;
        }

        return money;
    }



}
