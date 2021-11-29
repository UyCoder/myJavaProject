package com.ahmed.bughra.restaurantordersys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Project:     myJavaProject
 * Package:     com.ahmed.bughra.restaurantordersys
 * Created:     11/29/2021 21:24
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * CreatedWith: IntelliJ IDEA
 */
public class DishApp {

    public static void main(String[] args) {
        Dish dish = new Dish();

        List<Dish> dishList = dish.initMenu();

        Scanner scanner = new Scanner(System.in);

        List<Dish> orderedList = new ArrayList<>();
        while (true) {
            System.out.println("..........تاماق سىستېمىسىنى قوللانغىنىڭىزغا كۆپ رەھمەت........");
            System.out.println("=============================================================");
            System.out.println("-------------------------【1】تىزىملىك------------------------");
            System.out.println("-------------------------【2】بۇيرۇتقان تاماقلارنى كۆرۈش-------");
            System.out.println("-------------------------【3】تاماقنى بىكار قىلىش-------------");
            System.out.println("-------------------------【4】ھېسابات قىلىش-------------------");
            System.out.println("-------------------------【0】چېكىنىش-------------------------");

            System.out.println("مەلۇم بىر ساننى تاللاڭ");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    while (true) {
                        dish.showMenu(dishList);
                        System.out.println("تاماق نومۇرى كىرگۈزۈڭ تاماق تاللاڭ. 0 نى كىرگۈزۈپ ئالدىنقى تىزىملىككە قايتىڭ.");
                        int id = scanner.nextInt();
                        if (id == 0) {
                            break;
                        }

                        System.out.println("تاماق نومۇرى كىرگۈزۈڭ:" + id);

                        System.out.println("سىز تاللىغان تاماق：" + dishList.get(id - 1).getName());
                        // يېڭى تاللىغان تاماقنى تزىملىككە قوشىدۇ
                        orderedList.add(dishList.get(id - 1));
                    }
                    break;
                case "2":
                    dish.showOrderedMenu(orderedList);
                    break;
                case "3":
                    if (orderedList.isEmpty()) {
                        System.out.println("تېخى تاماق تاللىمىدىڭىز، نومۇرنى يېزىپ تاماق تاللاڭ");
                    } else {
                        System.out.println("بىكار قىلىدىغان تاماق نومۇرىنى كىرگۈزۈڭ");
                        int id = scanner.nextInt();
                        dish.deleteDish(id, dishList, orderedList);
                    }
                    break;
                case "4":
                    dish.checkout(orderedList);
                    break;

                case "0":
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
