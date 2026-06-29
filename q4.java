package day29;
import java.util.*;


class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    double totalValue() {
        return quantity * price;
    }

    void display() {
        System.out.println("--------------------------------------");
        System.out.println("Product ID    : " + productId);
        System.out.println("Product Name  : " + productName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : ₹" + price);
        System.out.println("Total Value   : ₹" + totalValue());
    }
}

public class q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n========== INVENTORY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Calculate Total Inventory Value");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;

                    for (Product p : products) {
                        if (p.productId == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Product ID Already Exists.");
                        break;
                    }

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    products.add(new Product(id, name, quantity, price));

                    System.out.println("Product Added Successfully.");
                    break;

                case 2:

                    if (products.isEmpty()) {
                        System.out.println("No Products Available.");
                    } else {
                        for (Product p : products) {
                            p.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (Product p : products) {
                        if (p.productId == search) {
                            p.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Product ID to Update: ");
                    int update = sc.nextInt();
                    sc.nextLine();

                    boolean updated = false;

                    for (Product p : products) {

                        if (p.productId == update) {

                            System.out.print("Enter New Product Name: ");
                            p.productName = sc.nextLine();

                            System.out.print("Enter New Quantity: ");
                            p.quantity = sc.nextInt();

                            System.out.print("Enter New Price: ");
                            p.price = sc.nextDouble();

                            System.out.println("Product Updated Successfully.");

                            updated = true;
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Product Not Found.");

                    break;

                case 5:

                    System.out.print("Enter Product ID to Delete: ");
                    int delete = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < products.size(); i++) {

                        if (products.get(i).productId == delete) {

                            products.remove(i);

                            System.out.println("Product Deleted Successfully.");

                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Product Not Found.");

                    break;

                case 6:

                    double totalInventoryValue = 0;

                    for (Product p : products) {
                        totalInventoryValue += p.totalValue();
                    }

                    System.out.println("Total Inventory Value = ₹" + totalInventoryValue);

                    break;

                case 7:

                    System.out.println("Thank You for Using Inventory Management System❤️.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
