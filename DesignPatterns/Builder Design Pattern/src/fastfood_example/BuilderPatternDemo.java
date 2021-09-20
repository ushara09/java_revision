package fastfood_example;

public class BuilderPatternDemo {
    public static void main(String args[]){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showitems();
        System.out.println("Total Cost is : "+vegMeal.getCost());

        System.out.println("========================================");

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non veg meal");
        nonVegMeal.showitems();
        System.out.println("Total cost is : "+nonVegMeal.getCost());

    }
}
