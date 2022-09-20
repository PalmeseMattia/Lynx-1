package Shape;

public class Square extends Rectangle{

    private double lato;
    
    Square(String colore, double lato1, double lato2) {
        super(colore, lato1, lato2);
         //controllo altezza
        if(lato1 <= 0) {  
            throw new ArithmeticException("lato non può essere negativo");    
        }
        else if(lato1 != lato2){
            throw new ArithmeticException("Inserisci due lati uguali per istanziare un quadrato"); 
        }
        else{
            this.lato = lato1;
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
