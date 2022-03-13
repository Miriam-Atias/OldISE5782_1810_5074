package primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for primitives.Point class
 * @author Miriam & Shiraz
 */
class PointTest {
    /**
     * Test method for {@link primitives.Point#distanceSquared(Point)} (primitives.Point)}.
     */
    @Test
    void testDistanceSquared() {
        Point p1=new Point(1,2,3);
        Point p2=new Point(1,6,6);
        double ExpRes=25;
        double Result=p2.distanceSquared(p1);
        assertEquals(ExpRes, Result,"DistanceSquared function wrong result");
    }
    /**
     * Test method for {@link primitives.Point#distance(Point)} (primitives.Point)}.
     */

    @Test
    void testDistance() {
        Point p1=new Point(1,2,3);
        Point p2=new Point(1,6,6);
        double ExpRes=5;
        double Result=p2.distance(p1);


        assertEquals(ExpRes, Result, "Distance function wrong result");
    }
    /**
     * Test method for {@link primitives.Point#add(Vector)} (primitives.Point)}.
     */

    @Test
    void testAdd() {
        Point p1=new Point(1.0,1.0,1.0);
        Vector p2=new Vector(2.0,2.0,2.0);
        Point ExpRes=new Point(3,3,3);
        Point Result=p1.add(p2);
        assertEquals(ExpRes._xyz,Result._xyz,"addtion in Point3D wrong result");
    }
    /**
     * Test method for {@link primitives.Point#subtract(Point)} (primitives.Point)}.
     */

    @Test
    void testSubtract() {
        Point p1 = new Point(1.0, 1.0, 1.0);
        Point p2 = new Point(2.0, 2.0, 2.0);
        Point ExpRes = new Point(1, 1, 1);
        Vector Result = p2.subtract(p1);//(1,1,1)
        assertEquals(ExpRes._xyz, Result._xyz,"subtrction in Point3D wrong result");
    }
}
