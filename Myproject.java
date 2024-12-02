import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DessertMenu {

    public static void main(String[] args) {
        
        Map<String, Double> menu = new HashMap<>();
        menu.put("Chocolate Cake", 5.99);
        menu.put("Strawberry Shortcake", 4.99);
        menu.put("Cheesecake", 6.99);
        menu.put("Ice Cream Sundae", 3.99);
        menu.put("Apple Pie", 4.50);
        menu.put("Brownie", 2.50);
        menu.put("Tiramisu", 7.50);
        menu.put("Crème brûlée", 6.00);
        menu.put("Fruit Tart", 5.50);
        menu.put("Muffin", 2.00);


        Scanner scanner = new Scanner(System.in);
        double totalBill = 0;

        System.out.println("Welcome to our Dessert Menu!");
        displayMenu(menu);

        while (true) {
            System.out.print("Enter the dessert you want (or type 'done'): ");
            String dessert = scanner.nextLine().trim().toLowerCase(); 
            if (dessert.equals("done")) {
                break;
            }

            
            String matchingDessert = null;
            for (String item : menu.keySet()) {
                if (item.toLowerCase().contains(dessert)) {
                    matchingDessert = item;
                    break;
                }
            }


            if (matchingDessert != null) {
                System.out.print("Enter quantity: ");
                int quantity;
                try {
                    quantity = Integer.parseInt(scanner.nextLine());
                    if (quantity <= 0) {
                        System.out.println("Invalid quantity. Please enter a positive number.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number for quantity.");
                    continue;
                }
                double price = menu.get(matchingDessert);
                double itemTotal = price * quantity;
                totalBill += itemTotal;
                System.out.println(quantity + " " + matchingDessert + "(s) added. Current total: $" + String.format("%.2f", totalBill));
            } else {
                System.out.println("Dessert not found.");
            }
        }

        System.out.println("Your Bill Total ");
        System.out.println("Total: $" + String.format("%.2f", totalBill));
        scanner.close();
    }


    static void displayMenu(Map<String, Double> menu) {
        System.out.println("\nDessert Menu:");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + ": $" + String.format("%.2f", entry.getValue()));
        }
    }
}
