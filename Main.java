package Mystore;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        String user, password;
        int check = 2;
        Scanner scanner = new Scanner(System.in);

        Login user1 = new Login();
        do {
            System.out.println("Silahkan Login");
            System.out.println("=======LOGIN=======");
            System.out.print("masukkan username : ");user = scanner.nextLine();
            System.out.print("masukkan password : ");password = scanner.nextLine();
            System.out.println("===================");

            if (user.equals(user1.getUsername_user()) && password.equals(user1.getPassword_user()) || user.equals(user1.getUsername_admin()) && password.equals(user1.getPassword_admin())) {
             check = 0;
             if (user.equals(user1.getUsername_user())) {
                 System.out.println("Selamat datang " + user);
             } else if (user.equals(user1.getUsername_admin())) {
                System.out.println("Selamat datang admin " + user);
             }
            }else{
                System.out.println("Username atau Password anda salah");
            }
        }while(check > 1);
    }
}
