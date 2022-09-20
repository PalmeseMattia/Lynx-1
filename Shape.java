package Shape;

abstract class Shape{
    private String colore;

    Shape(String colore){
        this.colore = colore;
    }

    public String getColore(){
        return this.colore;
    }

    abstract public double getArea();

    public String toString(){
        return ("colore: " + colore);
    }
}