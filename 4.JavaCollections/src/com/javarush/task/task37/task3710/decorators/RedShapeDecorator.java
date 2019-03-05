package com.javarush.task.task37.task3710.decorators;

import com.javarush.task.task37.task3710.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setBorderColor(Shape shape){
        System.out.println(String.format("Setting border color for %1s to red.", shape.getClass().getSimpleName()));
    }

    @Override
    public void draw() {
        setBorderColor(super.decoratedShape);
        super.draw();
    }
}
