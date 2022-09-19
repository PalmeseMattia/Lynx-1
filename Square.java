package Shape;

public class Square extends Shape{

    private double lato;
    
    Square(String colore, double lato) {
        super(colore);
        this.lato = lato;
    }

    public double getPerimetro(){
        return (this.lato * 4);
    }

    public double getArea(){
        return (this.lato * this.lato);
    }
  
    public double getLato(){
        return this.lato;
    }
}
