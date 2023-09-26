public class TesteGeometric {

    public static void main (String[] args){

        Circle c1 = new Circle (3);

        Rectangle r1 = new Rectangle (8, 16);

        System.out.println(c1);
        System.out.println(r1);

        System.out.println ("Area do círculo: " + c1.getArea());
        System.out.println ("Perimetro do círculo: " + c1.getPerimeter());

        System.out.println ("Area do retângulo: " + r1.getArea());
        System.out.println ("Perimetro do retângulo: " + r1.getPerimeter());

        

    }
}