package com.ahmed.bughra.restaurantordersys;

import java.util.ArrayList;
import java.util.List;

/**
 * Project:     myJavaProject
 * Package:     com.ahmed.bughra.restaurantordersys
 * Created:     11/29/2021 21:23
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * CreatedWith: IntelliJ IDEA
 */

public class Dish implements DishInterface {
    /**
     * تاماق نومۇرى
     */
    private int id;
    /**
     * تاماق ئىسمى
     */
    private String name;
    /**
     * باھاسى
     */
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Dish() {
    }

    public Dish(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     *   دەسلەپكى تىزىملىك
     *
     * @return كېيىنكى تىزىملىك
     */
    @Override
    public List<Dish> initMenu() {
        List<Dish> dishList = new ArrayList<>();
        dishList.add(new Dish(1, "لەغمەن", 38));
        dishList.add(new Dish(2, "قورداق", 58));
        dishList.add(new Dish(3, "سامسا", 68));
        dishList.add(new Dish(4, "شورپا", 28));
        dishList.add(new Dish(5, "كاۋاپ", 18));
        dishList.add(new Dish(6, "سومەن", 38));
        return dishList;
    }

    /**
     * تىزىملىكنى چىقىرىش
     *
     * @param dishList
     */
    @Override
    public void showMenu(List<Dish> dishList) {
        System.out.println("------------تاماق تىزىملىكىمىز------------");
        System.out.println("نومۇر\t\tتاماقلار\t\t\t\tباھاسى");
        for (int i = 0; i < dishList.size(); i++) {
            System.out.format("%d\t\t\t%s\t\t\t%.2f\n", dishList.get(i).getId(), dishList.get(i).getName(), dishList.get(i).getPrice());
        }
        System.out.println("---------------------------");
    }


    /**
     * ئۆچۈرۈش
     *
     * @param id
     * @param dishList
     * @param orderedList
     */
    @Override
    public void deleteDish(int id, List<Dish> dishList, List<Dish> orderedList) {
        if (!orderedList.isEmpty()) {
            orderedList.remove(dishList.get(id - 1));
        }
    }


    /**
     * تىزىملاتقان تاماقنى كۆرۈش
     */
    @Override
    public void showOrderedMenu(List<Dish> orderedList) {
        if (orderedList.isEmpty()) {
            System.out.println("سىز تېخى تاماق بۇيرۇتماپسىز، تىزىملىكتىن بۇيرۇتسىڭىز بولىدۇ.");
        } else {
            System.out.println("بۇيرۇتقان تاماقلار تۆۋەندىكىچە");
            for (int i = 0; i < orderedList.size(); i++) {
                System.out.println(orderedList.get(i).getName());
            }
        }

    }

    /**
     * ھېسابات قىلىش
     */
    @Override
    public void checkout(List<Dish> orderedList) {
        double money = 0.0d;
        if (orderedList.isEmpty()) {
            System.out.println("سىز تېخى تاماق بۇيرۇتماپسىز، قايتىدىن بۇيرۇتسىڭىز بولىدۇ");
        } else {
            System.out.println("بىردەم ساقلاڭ، ھېسابلاۋاتىدۇ...");
            for (int i = 0; i < orderedList.size(); i++) {
                money += orderedList.get(i).getPrice();
            }
            System.out.format("توپلام ھېسابات:  %.2f\n", money);
        }
    }
}
