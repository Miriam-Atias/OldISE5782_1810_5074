package geometries;

import primitives.Point;
import primitives.Ray;
import primitives.Vector;

public class Tube implements Geometry{
     protected Ray axisRay;
     protected double radius;

    @Override
    public Vector getNormal(Point point) {
        return null;
    }
}
