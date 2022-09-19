package Shape;

public class TestShape {
 
    public static void main(String[] args){
        Circle cerchio1 = new Circle("red", 3.0);
        Circle cerchio2 = new Circle("blue", 5.3);
 
    Rectangle rettangolo1 = new Rectangle("green", 3.0, 6.0);
    Rectangle rettangolo2 = new Rectangle("orange", 60.0, 100.0);
 
    Square quadrato1 = new Square("gray", 8.0);
    Square quadrato2 = new Square("yellow", 25.0);
 
    System.out.println("Cerchio 1:");
    System.out.println("\n");
 
        System.out.println("Area: " + cerchio1.getArea());
        System.out.println("Colore: " + cerchio1.getColore());
        System.out.println("Circonferenza: "+ cerchio1.getCirconferenza());
 
    System.out.println("\n");
    System.out.println("Cerchio 2:");
    System.out.println("\n");
 
    System.out.println("Area: "+ cerchio2.getArea());
        System.out.println("Colore: "+ cerchio2.getColore());
        System.out.println("Circonferenza: "+ cerchio2.getCirconferenza());
 
    System.out.println("\n");
    System.out.println("Rettangolo 1:");
    System.out.println("\n");
 
        System.out.println("Area: "+ rettangolo1.getArea());
        System.out.println("Colore: "+ rettangolo1.getColore());
        System.out.println("Perimetro: "+ rettangolo1.getPerimetro());
    System.out.println("Altezza: "+ rettangolo1.getAltezza());
    System.out.println("Lunghezza: "+ rettangolo1.getLunghezza());
 
    System.out.println("\n");
    System.out.println("Rettangolo 2:");
    System.out.println("\n");
 
    System.out.println("Area: "+ rettangolo2.getArea());
        System.out.println("Colore: "+ rettangolo2.getColore());
        System.out.println("Perimetro: "+ rettangolo2.getPerimetro());
    System.out.println("Altezza: "+ rettangolo2.getArea());
    System.out.println("Lunghezza: "+ rettangolo2.getLunghezza());
 
    System.out.println("\n");
    System.out.println("Quadrato 1:");
    System.out.println("\n");
 
        System.out.println("Area: "+ quadrato1.getArea());
        System.out.println("Colore: "+ quadrato1.getColore());
        System.out.println("Perimetro: "+ quadrato1.getPerimetro());
    System.out.println("Lato: "+ quadrato1.getLato());
 
    System.out.println("\n");
    System.out.println("Quadrato 2:");
    System.out.println("\n");
 
        System.out.println("Area: "+ quadrato2.getArea());
        System.out.println("Colore: "+ quadrato2.getColore());
        System.out.println("Perimetro: "+ quadrato2.getPerimetro());
    System.out.println("Lato: "+ quadrato2.getLato());
 
    }
}
