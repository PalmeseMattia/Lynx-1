package Shape;

public class Circle extends Shape{
    private double raggio;


    Circle(String colore, double raggio) {
        super(colore);
        this.raggio = raggio;
    }

    public double getCirconferenza(){
        return (2 * 3.14 * this.raggio);
    }
    
    public double getArea(){
        return (this.raggio * this.raggio) * 3.14;
    }
}
