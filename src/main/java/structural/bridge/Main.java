package structural.bridge;

public class Main
{
    public static void main(String[] args)
    {
        Shape triangleRed = new Triangle(new RedColor());
        Shape triangleYellow = new Triangle(new YellowColor());

        triangleRed.paint();
        triangleYellow.paint();
    }
}
