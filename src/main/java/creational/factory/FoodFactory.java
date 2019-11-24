package creational.factory;

import sun.security.krb5.internal.crypto.Des;

public class FoodFactory {

    public static Food getFood(String type) {
        if (type.equals(Dessert.type)) {
            return new Dessert();
        } else if (type.equals(MainCourse.type)) {
            return new MainCourse();
        }
        return null;
    }
}
