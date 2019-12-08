package structural.decorator.decorators;

import structural.decorator.Shape;
import structural.decorator.ShapeDecorator;

public class NameDecorator extends ShapeDecorator
{
    public NameDecorator(Shape decoratedShape)
    {
        super(decoratedShape);
    }

    @Override
    public void draw()
    {
        super.draw();
        setName();
    }


    private void setName()
    {
        System.out.println("Shape has a name");
    }

}
