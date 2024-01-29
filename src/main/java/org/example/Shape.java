package org.example;

public abstract class Shape {
    public String shapeName;
    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
    
     public abstract void printShape();
}
