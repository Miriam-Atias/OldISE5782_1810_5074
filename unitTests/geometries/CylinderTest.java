package geometries;
import org.junit.*;
import geometries.Cylinder;
import org.junit.jupiter.api.Test;
import primitives.Point;
import primitives.Ray;
import primitives.Vector;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Unit test for geometries.Cylinder class
 * @author Shiraz&Miriam
 *
 */

class CylinderTest {
    /**
     * Test method for {@link geometries.Cylinder#getNormal(primitives.Point)}.
     */
    @Test
    public void testGetNormal() {

        Point begin=new Point(0,0,1);
        Vector direc=new Vector(0,0,2);

        Ray r=new Ray(begin,direc);
        Cylinder c= new Cylinder(r,1,5);// radius=1, ray=r, hieght=5,
        Vector v=c.getNormal(new Point(1,0,2));
        assertEquals(new Vector(1,0,0),c.getNormal(new Point(1,0,2)),"getNormal wrong result");


    }
}
