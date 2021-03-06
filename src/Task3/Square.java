package Task3;

public class Square {

    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter(){
        return length*2+width*2;
    }

    public double getArea(){
        return length*width;
    }

    public void printSquareInformation(){
        System.out.println(" length: "+ length+ " ,width: "+ width+ " ,Perimeter: "+ getPerimeter()+ " ,Area: "+ getArea());
    }
}
