package geometries;

import primitives.Ray;

public class Cylinder extends Tube{
     private double _height;

     public Cylinder(Ray axisRay, double rad,double he ) {
          super(axisRay, rad);
          this._height = he;
     }
}
