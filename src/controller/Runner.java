package controller;

public class Runner {
   private int color=0;
   private double height=1;
   private  double width=1;
   private double depth=1;

    public Runner() {
    color=1;
    width=0;
    height=0;
    depth=0;
    }

    public Runner(int color, double depth, double width, double height) {
        this.color = color;
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    public int getColor() {
        return color;
    }

    public double getDepth() {
        return depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
