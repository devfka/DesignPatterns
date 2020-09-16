package structural.flyweight;

import java.util.HashMap;

public class VehicleFactory
{
    private static HashMap<String, Vehicle> hm =
        new HashMap<String, Vehicle>();


    public static Vehicle getVehicle(String type)
    {
        Vehicle h = null;

        if (hm.containsKey(type))
        {
            h = hm.get(type);
        }
        else
        {
            h = new Car();
            hm.put(type, h);
        }

        return h;
    }
}
