package structural.flyweight;

public class Car implements Vehicle
{
    // Intrinsic Attribute
    private final int numberOfSeat = 5;

    // Extrinsic Attribute
    private String color;

    public void assignColor(String color)
    {
        this.color = color;
    }

    public void fullSpec()
    {
        System.out.println("This is full spec of Car");
    }


    public String getColor()
    {
        return color;
    }
}
