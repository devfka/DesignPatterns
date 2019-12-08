package structural.decorator.decorators;

import structural.decorator.Shape;
import structural.decorator.ShapeDecorator;

public class RedBorderDecorator extends ShapeDecorator
{

    public RedBorderDecorator(Shape decoratedShape)
    {
        super(decoratedShape);
    }

    public void draw()
    {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    public void setRedBorder(Shape decoretedShape)
    {
        System.out.println("Border set Red");
    }
}
