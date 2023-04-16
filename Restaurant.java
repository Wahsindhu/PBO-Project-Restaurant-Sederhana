package Mystore;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<Menu> menus;

    public Restaurant() {
        this.name = name;
        menus = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void removeMenu(int index) {
        menus.remove(index);
    }

    public void viewMenu() {
        System.out.println("Daftar Menu Restoran " + name);
        System.out.println("------------------------------");
        for (int i = 0; i < menus.size(); i++) {
            System.out.println((i+1) + ". " + menus.get(i).getName() + " - Rp. " + menus.get(i).getPrice());
        }
        System.out.println("------------------------------");
    }

    public void viewRestaurant() {
    }

    public void addRestaurant() {
    }

    public void removeRestaurant() {
    }
}

