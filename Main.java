package Mystore;

import Mystore.Login;
import Mystore.Order;
import Mystore.Restaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        Order order = new Order();
        Login login = new Login();
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("===== Login =====");
            System.out.print("Username: ");
            String username = scanner.next();
            System.out.print("Password: ");
            String password = scanner.next();
            System.out.println("=================");

            if (login.login(username, password)) {
                System.out.println("Welcome " + username);
                loggedIn = true;
                if (login.isAdmin(username)) {
                    boolean adminMenu = true;
                    while (adminMenu) {
                        System.out.println("\n===== Admin Menu =====");
                        System.out.println("1. View Restaurant");
                        System.out.println("2. Add Restaurant");
                        System.out.println("3. Remove Restaurant");
                        System.out.println("4. Exit");
                        System.out.print("Choose option: ");
                        int adminOption = scanner.nextInt();
                        System.out.println("======================");
                        switch (adminOption) {
                            case 1:
                                restaurant.viewRestaurant();
                                break;
                            case 2:
                                restaurant.addRestaurant();
                                break;
                            case 3:
                                restaurant.removeRestaurant();
                                break;
                            case 4:
                                adminMenu = false;
                                break;
                            default:
                                System.out.println("Invalid option, please try again!");
                        }
                    }
                } else {
                    boolean customerMenu = true;
                    while (customerMenu) {
                        System.out.println("\n===== Customer Menu =====");
                        System.out.println("1. View Menu");
                        System.out.println("2. Order");
                        System.out.println("3. Exit");
                        System.out.print("Choose option: ");
                        int customerOption = scanner.nextInt();
                        System.out.println("=========================");
                        switch (customerOption) {
                            case 1:
                                restaurant.viewMenu();
                                break;
                            case 2:
                                order.placeOrder();
                                break;
                            case 3:
                                customerMenu = false;
                                break;
                            default:
                                System.out.println("Invalid option, please try again!");
                        }
                    }
                }
            } else {
                System.out.println("Invalid username or password!");
            }
        }
    }
}
