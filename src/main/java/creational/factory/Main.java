package creational.factory;

public class Main {

    public static void main(String[] args) {

        Food dessert = FoodFactory.getFood(Dessert.type);
        Food mainCourse = FoodFactory.getFood(MainCourse.type);


    }
}
