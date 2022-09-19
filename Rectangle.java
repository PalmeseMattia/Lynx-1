package Shape;
public class Rectangle extends Shape{
    
    private double altezza;
    private double lunghezza;
    
    Rectangle(String colore, double altezza, double lunghezza) {
        super(colore);
        //controllo altezza
        if(altezza < 0) {  
            throw new ArithmeticException("altezza non può essere negativo");    
        }
        else{
            this.altezza = altezza;
        }  
        //controllo lunghezza
        if(lunghezza < 0) {  
            throw new ArithmeticException("lunghezza non può essere negativo");    
        }
        else{
            this.lunghezza = lunghezza;
        }  
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

    public String toString(){
        return (super.toString() 
        + "\naltezza: " + this.altezza 
        + "\nlunghezza: " + this.lunghezza 
        + "\narea: " + this.getArea()
        + "\nperimetro: " + this.getPerimetro());
    }
}
