public class Runme {

    public static void main (String [] args){

        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle();

        r2.setLength(5.7);
        r2.setWidth(8.1);

        Circle c1 = new Circle(3.2);
        Circle c2 = new Circle();

        c2.setRadius(4);


        System.out.println(" Rectangle with sides " + r1.getLength() + " and " + r1.getWidth() + " and has area "+ r1.computeArea() );
        System.out.println(" Rectangle with sides " + r2.getLength() + " and " + r2.getWidth() + " and has area "+ r2.computeArea() );
        System.out.println(" Circle with radius " + c1.getRadius() + " and has area " + c1.computeArea() );
        System.out.println(" Circle with radius " + c2.getRadius() + " and has area " + c2.computeArea() );



    }
}
