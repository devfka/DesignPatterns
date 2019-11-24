package creational.factory;

public class Dessert extends Food {

    private String ingredients;
    private String name;
    public static String type = "Dessert";

    public String getIngredients() {
        return this.ingredients;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return type;
    }
}
