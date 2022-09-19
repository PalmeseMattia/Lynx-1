package Shape;

public class Circle extends Shape{
    private double raggio;

    Circle(String colore, double raggio) {
        super(colore);
        //controllo che il raggio non sia negativo
        if(raggio < 0) {  
            throw new ArithmeticException("raggio non può essere negativo");    
        }
        else{
            this.raggio = raggio;
        }  
    }

    public double getCirconferenza(){
        return (2 * 3.14 * this.raggio);
    }

    public double getArea(){
        return ((this.raggio * this.raggio) * 3.14);
    }

    public String toString(){
        return (super.toString() 
            + "\nraggio: " + this.raggio 
            + "\narea " + this.getArea() 
            + "\ncirconferenza " 
            + this.getCirconferenza());
    }
}
