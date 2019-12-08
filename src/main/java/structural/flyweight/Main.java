package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        List<Car> vehicleList = new ArrayList<Car>();

        Vehicle car1 = VehicleFactory.getPlayer("Car");
        car1.assignColor("Red");
        vehicleList.add((Car) car1);

        vehicleList.forEach(x -> System.out.println(x.getColor()));

        Vehicle car2 = VehicleFactory.getPlayer("Car");
        car2.assignColor("Blue");
        vehicleList.add((Car) car2);
        vehicleList.forEach(x -> System.out.println(x.getColor()));

        Vehicle car3 = VehicleFactory.getPlayer("Car");
        car3.assignColor("Black");
        vehicleList.add((Car) car3);
        vehicleList.forEach(x -> System.out.println(x.getColor()));

    }
}
