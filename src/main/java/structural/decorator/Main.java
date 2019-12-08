package structural.decorator;

import structural.decorator.decorators.NameDecorator;
import structural.decorator.decorators.RedBorderDecorator;

public class Main
{

    public static void main(String[] args)
    {
        Shape circle = new Circle();
        Shape circleRed = new NameDecorator(new RedBorderDecorator(new Circle()));

        circle.draw();
        circleRed.draw();


    }
}
