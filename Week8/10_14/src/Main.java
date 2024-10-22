import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 1. How to create
        HashMap<String, Double> prices = new HashMap<>();
        // 2. How to add items
        prices.put("Bread", 1.99);
        prices.put("Coffee", 10.99);
        prices.put("Cake", 5.99);
        prices.put("Hamburger", 15.99);
        // 3. How to check a key
        if ( prices.containsKey("Cake")){
            System.out.printf("\n Yes we got some cake");
            // 4 How to get
            Double v = prices.get("Cake");
            System.out.printf("\n Let them eat Cake:%s",
                    prices.get("Cake"));
        }
        showAllItems( prices );
    }

    private static void showAllItems(HashMap<String, Double> prices) {
        double total = 0.0;
        // Number 5 - how to loop through
        for( String item : prices.keySet()){
            System.out.printf("\n %s: %.2f",item,prices.get(item));
            total += prices.get(item);
        }
        System.out.printf("\n --------------------\n%s", total);
        //ToDo: Output the total of all prices
    }
}
