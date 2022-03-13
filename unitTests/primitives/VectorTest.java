package primitives;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;
import static primitives.Util.isZero;

class VectorTest {

    /**
     * Test method for {@link primitives.Vector#lengthSquared()} )} (primitives.Point)}.
     */
    @Test
    void testLengthSquared() {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(-2, -4, -6);
        Vector v3 = new Vector(0, 3, -2);

        // test length..
        assertEquals(14.0,v1.lengthSquared(),"ERROR: lengthSquared() wrong value");

    }
    /**
     * Test method for {@link primitives.Vector#length()} )} (primitives.Point)}.
     */
    @Test
    void testLength() {
        Vector v1=new Vector(1,2,2);
        //============== Equivalence Partitions Tests============
        double ExpRes=3;
        double Result=v1.length();
        assertEquals(ExpRes, Result,0.00001,"Length wrong result");
        //===============Boundary Values Tests===================
        //checks if an exception is thrown when length is zero
        try {
            (new Vector(0,0,0)).length();
            fail("Length doesn't throw an exception when length is zero");
        }
        catch(IllegalArgumentException e)
        {
            assertTrue(true);
        }

    }
    /**
     * Test method for {@link primitives.Vector#lengthSquared()} )} (primitives.Point)}.
     */
    @Test
    void testDotProduct() {

        Vector v1=new Vector(1,2,3);
        Vector v2=new Vector(4,5,6);
        Vector v3=new Vector(0,1,0);
        Vector v4=new Vector(0,0,1);
        //============== Equivalence Partitions Tests============
        //checks if dot product works
        double test1=32;
        double DP1=v1.dotProduct(v2);

        double test2=0;
        double DP2=v3.dotProduct(v4);
        assertEquals(test1, DP1,0.00001, "Vectotr DotProduct wrong result");
        assertEquals(test2, DP2, 0.00001, "Vector DotProduct doesn't return zero");

    }

    /**
     * Test method for {@link primitives.Vector#crossProduct(primitives.Vector)}.
     */
    @Test
     void testCrossProduct() {
        Vector v1 = new Vector(1, 2, 3);

        // ============ Equivalence Partitions Tests ==============
        Vector v2 = new Vector(0, 3, -2);
        Vector vr = v1.crossProduct(v2);

        // TC01: Test that length of cross-product is proper (orthogonal vectors taken
        // for simplicity)
        assertEquals( v1.length() * v2.length(), vr.length(), 0.00001,"crossProduct() wrong result length");

        // TC02: Test cross-product result orthogonality to its operands
        assertTrue(isZero(vr.dotProduct(v1)),"crossProduct() result is not orthogonal to 1st operand");
        assertTrue(isZero(vr.dotProduct(v2)),"crossProduct() result is not orthogonal to 2nd operand");

        // =============== Boundary Values Tests ==================
        // TC11: test zero vector from cross-productof co-lined vectors
        Vector v3 = new Vector(-2, -4, -6);
        assertThrows(IllegalArgumentException.class, () -> v1.crossProduct(v3),
                "crossProduct() for parallel vectors does not throw an exception");
    }
    /**
     * Test method for {@link Vector#normalize()} ()} )} (primitives.Point)}.
     */
    @Test
    void testNormalize() {
        Vector v = new Vector(0, 0, 4);
        Vector Result = v.normalize();
        double number = 1;
        //============== Equivalence Partitions Tests============
        //checks if the vector has been normalized
        assertEquals(1, Result.length(), 1e-10, "wrong result of normalize Vectors");
        //===============Boundary Values Tests===================
        //test zero vector from normalize vectors

        try {
            v = new Vector(0, 0, 0);
            //v.normalize();
        } catch (IllegalArgumentException e) {
            assertTrue(true);//if it's throw exception it's good
        }
    }

    /**
     * Test method for {@link primitives.Vector#scale(double)}.
     */
    @Test
    public void testScale() {
        Vector v1=new Vector(1,2,3);
        double num=2;
        //============== Equivalence Partitions Tests============
        //checks if vector scaling works
        Vector ExpRes=new Vector(2,4,6);
        Vector Result=v1.scale(num);
        assertEquals(ExpRes, Result, "Vector scale() wrong result");

        //===============Boundary Values Tests===================
        //checks if when scaling by zero an exception is thrown
        try {
            v1.scale(0);
            fail("Didnt throw 'can not scale by zero' Exception");
        }
        catch(IllegalArgumentException e)
        {
            assertTrue(true);
        }
    }




}