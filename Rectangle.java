public class Rectangle implements GeometricObject{

    private double width;
    private double length;


public Rectangle (double width, double length) {
    this.width = width;
    this.length = length;
}

public String toString() {
    return "Retângulo com a largura:  " + width + " e o comprimento: " + length;
}

public double getPerimeter(){
    return 2 * (width + length);
}

public double getArea(){
    return width * length;
}
}