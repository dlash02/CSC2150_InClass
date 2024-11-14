import java.util.Scanner;

public class DriveBrowser {
    public static void main(String[] args) {
        BrowserNavigation browser = new BrowserNavigation();
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("\n1. Visit Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. View Current Page");
            System.out.println("5. View Full History");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter page URL: ");
                    String page = scanner.nextLine();
                    browser.visitPage(page);
                    break;
                case "2":
                    browser.goBack();
                    break;
                case "3":
                    browser.goForward();
                    break;
                case "4":
                    browser.viewCurrentPage();
                    break;
                case "5":
                    browser.viewFullHistory();
                    break;
                case "6":
                    System.out.println("Exiting browser.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!option.equals("6"));

        scanner.close();
    }
}

