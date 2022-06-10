public class DishTools {

    final static int AVG_COST_DISH_CENTS = 13000;

    public static void shoutDishName(Dish dish) {
        System.out.println(dish.getNameOfDish().toUpperCase());
    }
    public static void analyzeDishCost(Dish dish) {

        String prefix = "Less";

        if(dish.getCostInCents() > AVG_COST_DISH_CENTS) {
            prefix = "More";
        }
        System.out.println(prefix + " expensive than average");
    }
    public static void flipRecommendation(Dish dish) {
        dish.isWouldRecommend(!dish.isWouldRecommend());
    }

}
