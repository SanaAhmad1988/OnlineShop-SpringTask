package com.OnlineShopping;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserService userService = new UserService();
    private static final ProductService productService = new ProductService();
    private static final OrderService orderService = new OrderService();

    public static void main(String[] args) {
        // Initial data entries
        userService.createUser(new User("1", "George", "george.orwell@example.com"));
        productService.createProduct(new Product("1", "Laptop", 10.99));
        orderService.createOrder(new Order("1"));

        while (true) {
            System.out.println("1. Create User");
            System.out.println("2. View User");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Create Product");
            System.out.println("6. View Product");
            System.out.println("7. Update Product");
            System.out.println("8. Delete Product");
            System.out.println("9. Create Order");
            System.out.println("10. View Order");
            System.out.println("11. Add Product to Order");
            System.out.println("12. Remove Product from Order");
            System.out.println("13. Delete Order");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    viewUser();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    createProduct();
                    break;
                case 6:
                    viewProduct();
                    break;
                case 7:
                    updateProduct();
                    break;
                case 8:
                    deleteProduct();
                    break;
                case 9:
                    createOrder();
                    break;
                case 10:
                    viewOrder();
                    break;
                case 11:
                    addProductToOrder();
                    break;
                case 12:
                    removeProductFromOrder();
                    break;
                case 13:
                    deleteOrder();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    private static void createUser() {
        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter User Email: ");
        String email = scanner.nextLine();

        User user = new User(id, name, email);
        userService.createUser(user);
        System.out.println("User created: " + user);
    }

    private static void viewUser() {
        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();
        User user = userService.getUser(id);
        System.out.println("User: " + user);
    }

    private static void updateUser() {
        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter User Email: ");
        String email = scanner.nextLine();

        User user = new User(id, name, email);
        userService.updateUser(user);
        System.out.println("User updated: " + user);
    }

    private static void deleteUser() {
        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();
        userService.deleteUser(id);
        System.out.println("User deleted.");
    }

    private static void createProduct() {
        System.out.print("Enter Product ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        Product product = new Product(id, name, price);
        productService.createProduct(product);
        System.out.println("Product created: " + product);
    }

    private static void viewProduct() {
        System.out.print("Enter Product ID: ");
        String id = scanner.nextLine();
        Product product = productService.getProduct(id);
        System.out.println("Product: " + product);
    }

    private static void updateProduct() {
        System.out.print("Enter Product ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        Product product = new Product(id, name, price);
        productService.updateProduct(product);
        System.out.println("Product updated: " + product);
    }

    private static void deleteProduct() {
        System.out.print("Enter Product ID: ");
        String id = scanner.nextLine();
        productService.deleteProduct(id);
        System.out.println("Product deleted.");
    }

    private static void createOrder() {
        System.out.print("Enter Order ID: ");
        String id = scanner.nextLine();
        Order order = new Order(id);
        orderService.createOrder(order);
        System.out.println("Order created: " + order);
    }

    private static void viewOrder() {
        System.out.print("Enter Order ID: ");
        String id = scanner.nextLine();
        Order order = orderService.getOrder(id);
        System.out.println("Order: " + order);
    }

    private static void addProductToOrder() {
        System.out.print("Enter Order ID: ");
        String orderId = scanner.nextLine();
        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();
        Product product = productService.getProduct(productId);
        orderService.addProductToOrder(orderId, product);
        System.out.println("Product added to order.");
    }

    private static void removeProductFromOrder() {
        System.out.print("Enter Order ID: ");
        String orderId = scanner.nextLine();
        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();
        Product product = productService.getProduct(productId);
        orderService.removeProductFromOrder(orderId, product);
        System.out.println("Product removed from order.");
    }

    private static void deleteOrder() {
        System.out.print("Enter Order ID: ");
        String id = scanner.nextLine();
        orderService.deleteOrder(id);
        System.out.println("Order deleted.");
    }
}
