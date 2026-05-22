import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String choice = "o";

        while (choice.equalsIgnoreCase("o")) {

            CheckingAccount checking = new CheckingAccount();

            System.out.println("\n=== Checking Account ===");

            while (true) {

                System.out.print("Entrez le numéro du compte : ");
                checking.account = scanner.nextLine();

                if (checking.account.matches("\\d+")) {
                    break;
                } else {
                    System.out.println("Erreur : entrez uniquement des chiffres.");
                }
            }

            while (true) {

                try {

                    System.out.print("Entrez le solde : ");
                    checking.balance = scanner.nextDouble();
                    break;

                } catch (Exception exception) {

                    System.out.println("Erreur : entrez un nombre valide.");
                    scanner.nextLine();
                }
            }

            while (true) {

                try {

                    System.out.print("Entrez la limite : ");
                    checking.limit = scanner.nextDouble();

                    if (checking.limit > checking.balance) {

                        System.out.println("La limite ne peut pas dépasser le solde.");

                    } else {

                        break;
                    }

                } catch (Exception exception) {

                    System.out.println("Erreur : entrez un nombre valide.");
                    scanner.nextLine();
                }
            }

            scanner.nextLine();

            SavingsAccount savings = new SavingsAccount();

            System.out.println("\n=== Savings Account ===");

            while (true) {

                System.out.print("Entrez le numéro du compte : ");
                savings.account = scanner.nextLine();

                if (savings.account.matches("\\d+")) {
                    break;
                } else {
                    System.out.println("Erreur : entrez uniquement des chiffres.");
                }
            }

            while (true) {

                try {

                    System.out.print("Entrez le solde : ");
                    savings.balance = scanner.nextDouble();
                    break;

                } catch (Exception exception) {

                    System.out.println("Erreur : entrez un nombre valide.");
                    scanner.nextLine();
                }
            }

            while (true) {

                try {

                    System.out.print("Entrez le taux d'intérêt : ");
                    savings.interestRate = scanner.nextDouble();
                    break;

                } catch (Exception exception) {

                    System.out.println("Erreur : entrez un nombre valide.");
                    scanner.nextLine();
                }
            }

            scanner.nextLine();

            COD cod = new COD();

            System.out.println("\n=== COD Account ===");


            while (true) {

                System.out.print("Entrez le numéro du compte : ");
                cod.account = scanner.nextLine();

                if (cod.account.matches("\\d+")) {
                    break;
                } else {
                    System.out.println("Erreur : entrez uniquement des chiffres.");
                }
            }


            while (true) {

                try {

                    System.out.print("Entrez le solde : ");
                    cod.balance = scanner.nextDouble();
                    break;

                } catch (Exception exception) {

                    System.out.println("Erreur : entrez un nombre valide.");
                    scanner.nextLine();
                }
            }


            while (true) {

                try {

                    System.out.print("Entrez la durée : ");
                    cod.duration = scanner.nextInt();
                    break;

                } catch (Exception exception) {

                    System.out.println("Erreur : entrez un nombre entier.");
                    scanner.nextLine();
                }
            }

            scanner.nextLine();

            System.out.println("\n===== INFORMATIONS =====");

            System.out.println("\nChecking Account");
            System.out.println("Compte : " + checking.account);
            System.out.println("Solde : " + checking.balance);
            System.out.println("Limite : " + checking.limit);

            System.out.println("\nSavings Account");
            System.out.println("Compte : " + savings.account);
            System.out.println("Solde : " + savings.balance);
            System.out.println("Taux : " + savings.interestRate);

            System.out.println("\nCOD Account");
            System.out.println("Compte : " + cod.account);
            System.out.println("Solde : " + cod.balance);
            System.out.println("Durée : " + cod.duration);

            System.out.print("\nVoulez-vous créer un nouveau compte ? (o/n) : ");
            choice = scanner.nextLine();
        }

        System.out.println("Programme terminé.");

        scanner.close();
    }
}