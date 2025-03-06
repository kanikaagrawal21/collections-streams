
interface MealPlan {
    void showMeal();
}


class VegetarianMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegetarian Meal: Grilled vegetables with quinoa.");
    }
}

class VeganMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegan Meal: Tofu stir-fry with brown rice.");
    }
}

class KetoMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Keto Meal: Grilled salmon with avocado salad.");
    }
}

class HighProteinMeal implements MealPlan {
    public void showMeal() {
        System.out.println("High-Protein Meal: Chicken breast with steamed broccoli.");
    }
}

class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void displayMeal() {
        mealType.showMeal();
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        vegMeal.displayMeal();

        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        veganMeal.displayMeal();

        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        ketoMeal.displayMeal();

        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal());
        proteinMeal.displayMeal();
    }
}
