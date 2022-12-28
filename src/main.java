import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class main {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = 0;
        double money= 0;
        NationalBank nb = new NationalBank();
        SecondTierBank sb= new SecondTierBank();

        int choice = -1;
        while (choice != 0) {
            System.out.println("press 0 to exit");
            System.out.println("press 1 to calculate National Bank deposit");
            System.out.println("press 2 to calculate National Bank credit");
            System.out.println("press 3 to calculate Second Tier Bank credit");
            System.out.println("press 4 to calculate Second Tier Bank deposit");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    nb = new NationalBank();
                    nb.calculateDeposit();
                    break;

                case 2:
                    NationalBank credit=new NationalBank();
                    credit.calculateCredit();
                    break;
                case 3:
                    SecondTierBank s=new SecondTierBank();
                    s.calculateCredit();
                    break;
                case 4:
                    SecondTierBank z=new SecondTierBank();
                    z.calculateDeposit();
                    break;
                default:

            }
        }
    }
}

