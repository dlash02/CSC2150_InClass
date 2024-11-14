
    import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class BrowserNavigation {

            private Deque<String> backHistory = new ArrayDeque<>();
            private Deque<String> forwardHistory = new ArrayDeque<>();
            private String currentPage = "Home Page";
        // Visit a new page
        public void visitPage(String page) {
            if (currentPage != null) {
                backHistory.push(currentPage);  // Add current page to back history
            }
            currentPage = page;
            forwardHistory.clear();  // Clear forward history on new page visit
            System.out.println("Visited: " + page);
        }

        // Go back to the previous page
        public void goBack() {
            if (!backHistory.isEmpty()) {
                forwardHistory.push(currentPage);  // Add current page to forward history
                currentPage = backHistory.pop();
                System.out.println("Went back to: " + currentPage);
            } else {
                System.out.println("No pages in back history.");
            }
        }
        // Go forward to the next page
        public void goForward() {
            if (!forwardHistory.isEmpty()) {
                backHistory.push(currentPage);  // Add current page to back history
                currentPage = forwardHistory.pop();
                System.out.println("Went forward to: " + currentPage);
            } else {
                System.out.println("No pages in forward history.");
            }
        }
        // View the current page
        public void viewCurrentPage() {
            System.out.println("Current page: " + currentPage);
        }
        // View full history (back and forward stacks)
        public void viewFullHistory() {
            System.out.println("Back History: " + backHistory);
            System.out.println("Current Page: " + currentPage);
            System.out.println("Forward History: " + forwardHistory);
        }
}
