package Shape;

public class Square extends Shape{

    private double lato;
    
    Square(String colore, double lato) {
        super(colore);
         //controllo altezza
         if(lato < 0) {  
            throw new ArithmeticException("lato non può essere negativo");    
        }
        else{
            this.lato = lato;
        }  
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

    public String toString(){
        return (super.toString() 
        + "\nlato: " + this.lato 
        + "\nperimetro: " + this.getPerimetro()
        + "\narea: " + this.getArea());
    }
}
