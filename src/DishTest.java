public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish();

        dish1.setCostInCents(1000);
        dish1.setNameOfDish("Chop Suey");
        dish1.isWouldRecommend(true);

        Dish dish2 = new Dish(2000, "Peking Duck", true);

        Dish dish3 = new Dish(15000, "Dog food", false);

        DishTools.analyzeDishCost(dish1);
        DishTools.analyzeDishCost(dish2);
        DishTools.analyzeDishCost(dish3);

        DishTools.flipRecommendation(dish1);
        DishTools.flipRecommendation(dish2);
        DishTools.flipRecommendation(dish3);

        dish1.printSummary();
        dish2.printSummary();
        dish3.printSummary();
    }

}
