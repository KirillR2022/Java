package ModelElements;

import Stuff.Point3D;
import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public Poligon(List<Point3D> points) {
        this.points = new ArrayList<>();
    }
    public List<Point3D> points;


    public Poligon(Point3D point){
        points.add(point);
    }

}