package com.file4.geometric;

public class ResizableCircle extends Circle {
    public ResizableCircle(double radius) {
        super(radius);
    }
    public void resize(int percent){
        radius = radius + radius*percent/100;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

