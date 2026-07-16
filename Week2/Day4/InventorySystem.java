package Week2.Day4;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class InventorySystem {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        HashMap<String, Integer> inventory = new HashMap<>();

        int choice;


        do {
            System.out.println("1. Add Product");
            System.out.println("2. Add Stock");
            System.out.println("3. Sell Product");
            System.out.println("4. Check Quantity");
            System.out.println("5. Remove Product");
            System.out.println("6. Display Inventory");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product Code: ");
                    String productCode = scanner.nextLine();

                    if (productCode.isEmpty()) {
                        System.out.println("Product code cannot be empty.");
                        break;
                    }

                    if (inventory.containsKey(productCode)) {
                        System.out.println("Product already exists.");
                        break;
                    }

                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();

                    if (quantity < 0) {
                        System.out.println("Quantity cannot be negative.");
                        break;
                    }

                    inventory.put(productCode, quantity);
                    System.out.println("Product added successfully.");
                    break;

                case 2:

                    System.out.print("Enter Product Code: ");
                    productCode = scanner.nextLine();

                    if (!inventory.containsKey(productCode)) {
                        System.out.println("Product not found.");
                        break;
                    }

                    System.out.print("Enter Quantity to Add: ");
                    quantity = scanner.nextInt();

                    if (quantity <= 0) {
                        System.out.println("Quantity must be greater than 0.");
                        break;
                    }

                    int currentQuantity = inventory.get(productCode);
                    inventory.put(productCode, currentQuantity + quantity);

                    System.out.println("Stock updated successfully.");
                    break;

                case 3:

                    System.out.print("Enter Product Code: ");
                    productCode = scanner.nextLine();

                    if (!inventory.containsKey(productCode)) {
                        System.out.println("Product not found.");
                        break;
                    }

                    System.out.print("Enter Quantity to Sell: ");
                    quantity = scanner.nextInt();

                    currentQuantity = inventory.get(productCode);

                    if (quantity <= 0) {
                        System.out.println("Quantity must be greater than 0.");
                    } else if (quantity > currentQuantity) {
                        System.out.println("Insufficient stock.");
                    } else {

                        inventory.put(productCode, currentQuantity - quantity);

                        System.out.println("Product sold successfully.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Product Code: ");
                    productCode = scanner.nextLine();

                    if (inventory.containsKey(productCode)) {
                        System.out.println("Current Stock: " + inventory.get(productCode));
                    } else {
                        System.out.println("Product not found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Product Code: ");
                    productCode = scanner.nextLine();

                    if (inventory.containsKey(productCode)) {
                        inventory.remove(productCode);
                        System.out.println("Product removed successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }

                    break;

                case 6:

                    if (inventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } else {

                        System.out.println("\n------ Inventory ------");
                        System.out.printf("%-15s %-10s%n", "Product Code", "Quantity");

                        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                            System.out.printf("%-15s %-10d%n",
                                    entry.getKey(),
                                    entry.getValue());
                        }

                        System.out.println("-----------------------");
                        System.out.println("Total Products: " + inventory.size());
                    }

                    break;

                case 7:
                    System.out.println("Exiting Inventory System...");
                    break;

                default:
                    System.out.println("Invalid choice.");

            }


        } while (choice !=7);

        scanner.close();


    }

}