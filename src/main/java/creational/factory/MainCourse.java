package creational.factory;

public class MainCourse extends Food {

    private String ingredients;
    private String name;
    public static String type = "MainCourse";

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
