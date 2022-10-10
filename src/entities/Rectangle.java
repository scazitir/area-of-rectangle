package entities;

public class Rectangle {

    public Double lenght;
    public Double width;

    public double area(){
        return lenght * width;
    }

    public double perimeter(){
        return 2 * (lenght + width);
    }

    public double diagonal(){
        return Math.sqrt(width * width + lenght * lenght);
    }
}
