package com.file4.point.movable;

import com.file4.point.Point2D;

import java.util.Objects;

public class MovablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    float[] getSpeed(){
        float arr[] = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Speed=(" + xSpeed +
                ySpeed +
                ')';
    }

    public MovablePoint move(){
        MovablePoint another = new MovablePoint();
        another.setX(this.getX()+this.getXSpeed());
        another.setY(this.getY()+this.getYSpeed());
        return another;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MovablePoint that = (MovablePoint) o;
        return Float.compare(that.xSpeed, xSpeed) == 0 &&
                Float.compare(that.ySpeed, ySpeed) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31*result + Float.floatToIntBits(xSpeed);
        result = 31*result + Float.floatToIntBits(ySpeed);
        return result;
    }
}
