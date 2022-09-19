package Shape;
public class Rectangle extends Shape{
    private double altezza;
    private double lunghezza;
    Rectangle(String colore, double altezza, double lunghezza) {
        super(colore);
        this.altezza = altezza;
        this.lunghezza = lunghezza;
    }
    public double getAltezza(){
        return this.altezza;
    }
    public double getLunghezza(){
        return this.lunghezza;
    }
    public double getArea(){
        return (this.lunghezza * this.altezza);
    }
   
    public double getPerimetro(){
        return (this.lunghezza + this.altezza) * 2;
    }
}
