package Shape;

import java.util.List;

public class ShapeUtils <T> {
    List<T> shapesList;

    public ShapeUtils(List<T> shapesList){
        this.shapesList = shapesList;
    }

    public void getShapes(){
        System.out.println(shapesList.stream().map();
    }
}
