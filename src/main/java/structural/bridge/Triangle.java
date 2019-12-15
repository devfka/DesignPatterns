package structural.bridge;

public class Triangle extends Shape
{

    public Triangle(Color color)
    {
        super(color);
    }

    @Override
    public void paint()
    {
        System.out.print("Triangle ");
        color.paint();
    }
}
