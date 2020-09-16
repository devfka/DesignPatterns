package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    //Bu patternin amaci, ortak kullanilan nesne veya alanlar icin, ayni objeyi tekrar kullanarak, memory'den save etmece


    public static void main(String[] args)
    {
        List<Car> vehicleList = new ArrayList<Car>();

        Vehicle car1 = VehicleFactory.getVehicle("Red");
        car1.assignColor("Red");
        vehicleList.add((Car) car1);

        vehicleList.forEach(x -> System.out.println(x.getColor()));

        Vehicle car2 = VehicleFactory.getVehicle("Blue");
        car2.assignColor("Blue");
        vehicleList.add((Car) car2);
        vehicleList.forEach(x -> System.out.println(x.getColor()));

        Vehicle car3 = VehicleFactory.getVehicle("Black");
        car3.assignColor("Black");
        vehicleList.add((Car) car3);
        vehicleList.forEach(x -> System.out.println(x.getColor()));

    }
}
