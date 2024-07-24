package org.example;

public class Wall {
    double width;
    double height;

    public  Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double setWidth(double newWidth) {
        if (newWidth <= 0) {
            this.width = 0.0;
        } else {
            this.width = newWidth;
        }
        return this.width;
    }

    public double setHeight(double newHeight) {
        if (newHeight <= 0) {
            this.height = 0.0;
        } else {
            this.height = newHeight;
        }
        return this.height;
    }

    public double getArea() {
        return width*height;
    }

    public String toString() {
        return "Width: " + width + "\n" +
                "Height: " + height;
    }
}
