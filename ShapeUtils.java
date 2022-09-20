package Shape;

import java.util.Comparator;
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

    public double getLargestArea(){
        return shapesList.stream().max(Comparator.comparing(T::getArea)).get().getArea();
    }

    public double getLargestAreaImperative(){
        double result = shapesList.get(0).getArea();
        for (int i = 1; i < shapesList.size(); i++){
            if (shapesList.get(i).getArea() > result){
                result = shapesList.get(i).getArea();
            }
        }
        return result;
    }
}
