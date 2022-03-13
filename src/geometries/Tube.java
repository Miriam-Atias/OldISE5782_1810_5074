package geometries;

import primitives.Point;
import primitives.Ray;
import primitives.Vector;

public class Tube implements Geometry{
     protected Ray _axisRay;
     protected double _radius;

    public Tube(Ray axisRay, double rad) {
        this._axisRay = axisRay;
        this._radius = rad;
    }

    @Override
    public Vector getNormal(Point point) {
        return null;
    }
}
