package Shape;

public class TestShape {
 
    public static void main(String[] args){
        Circle cerchio1 = new Circle("red", 3.0);
        Circle cerchio2 = new Circle("blue", 5.3);
 
        Rectangle rettangolo1 = new Rectangle("green", 3.0, 6.0);
        Rectangle rettangolo2 = new Rectangle("orange", 60.0, 100.0);
 
        Square quadrato1 = new Square("gray", 8.0);
        Square quadrato2 = new Square("yellow", 25.0);
        
        System.out.println(cerchio1.toString() + "\n");
        System.out.println(cerchio2.toString() + "\n");

        System.out.println(rettangolo1.toString() + "\n");
        System.out.println(rettangolo2.toString() + "\n");

        System.out.println(quadrato1.toString() + "\n");
        System.out.println(quadrato2.toString() + "\n");
    }
}
