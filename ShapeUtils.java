package Shape;

import java.util.List;

public class ShapeUtils <T extends Shape> {
    List<T> shapesList;

    public ShapeUtils(List<T> shapesList){
        this.shapesList = shapesList;
    }

    public  double getSumOfArea(){
        return shapesList.stream().reduce(0.0, (accum, v) -> accum + v.getArea(), Double::sum);
    }

    public double getSumOfAreaImperative(){
        double result = 0;
        for (int i = 0; i < shapesList.size(); i++){
            result += shapesList.get(i).getArea();
        }
        return result;
    }
}
