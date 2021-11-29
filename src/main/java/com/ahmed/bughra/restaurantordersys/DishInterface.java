package com.ahmed.bughra.restaurantordersys;

import java.util.List;

/**
 * Project:     myJavaProject
 * Package:     com.ahmed.bughra.restaurantordersys
 * Created:     11/29/2021 21:25
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * CreatedWith: IntelliJ IDEA
 */
public interface DishInterface {
    /**
     * دەسلەپكى تاماق تىىزملىكى
     *
     * @return
     */
    public List<Dish> initMenu();

    /**
     * تىزىملىك كۆرسىتىدۇ
     *
     * @param dishList
     */
    public void showMenu(List<Dish> dishList);


    /**
     * تاللىغان تاماق تىزىملىكى
     *
     * @param orderedList
     */
    public void showOrderedMenu(List<Dish> orderedList);

    /**
     * تاماق بىكار قىلىش
     *
     * @param id
     * @param dishList
     * @param orderedList
     */
    public void deleteDish(int id, List<Dish> dishList, List<Dish> orderedList);

    /**
     * ھېسابات قىلىش
     *
     * @param orderedList
     */
    public void checkout(List<Dish> orderedList);
}
