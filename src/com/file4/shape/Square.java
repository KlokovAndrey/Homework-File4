package com.file4.shape;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        this.length = side;
    }

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.length = side;
    }

    double getSide(){
        return this.length;
    }

    void setSide(double side){
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square[" +
                "side=" + length +
                ", color='" + color +
                ", filled=" + filled +
                ']';
    }
}
