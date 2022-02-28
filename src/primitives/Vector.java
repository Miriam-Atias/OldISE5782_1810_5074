package primitives;

public class Vector extends Point {
    /**
     *
     * @param x-double d1
     * @param y- double d2
     * @param z- double d3
     */
    public Vector(double x, double y, double z) {
//        super(x,y,z);
//        if(_xyz.equals(Double3.ZERO)){
//            throw new IllegalArgumentException("Vector(0,0,0) is not allowed");
//        }
        this(new Double3(x, y, z));
    }

    /**
     * primary  constructor for Vector class
     *
     * @param xyz head of vector starting from origin Point(0.0.0)
     */
    public Vector(Double3 xyz) {
        super(xyz);
        if (get_xyz().equals(Double3.getZERO())) {
            throw new IllegalArgumentException("Vector(0,0,0) is not allowed");
        }
    }

    /**
     * @return the length Squared of this vector
     */
    public double lengthSquared() {
        return get_xyz().get_d1() * get_xyz().get_d1()
                + get_xyz().get_d2() * get_xyz().get_d2()
                + get_xyz().get_d3() * get_xyz().get_d3();
    }

    /**
     * @return
     */
    public double length() {
        return Math.sqrt(lengthSquared());
    }

    /**
     * dot product between two vectors (scalar product)
     *
     * @param other the right vector of U.V
     * @return scalar value of the dot product
     * @link https://www.mathsisfun.com/algebra/vectors-dot-product.html
     */
    public double dotProduct(Vector other) {
        return get_xyz().get_d1() * other.get_xyz().get_d1()
                + get_xyz().get_d2() * other.get_xyz().get_d2()
                + get_xyz().get_d3() * other.get_xyz().get_d3();
    }

    /**
     * cross product between two vectors (vectorial product)
     * @param other other the right vector of U.V
     * @return the vector resulting from the cross product (Right-hand rule)
     * @link https://www.mathsisfun.com/algebra/vectors-cross-product.html
     */
    public Vector crossProduct(Vector other) {
        double ax = get_xyz().get_d1();
        double ay = get_xyz().get_d2();
        double az = get_xyz().get_d3();

        double bx = other.get_xyz().get_d1();
        double by = other.get_xyz().get_d2();
        double bz = other.get_xyz().get_d3();

        double cx = ay * bz - az * by;
        double cy = az * bx - ax * bz;
        double cz = ax * by - ay * bx;


        return new Vector(cx, cy, cz);
    }

    public Vector normalize() {
        double len = length();
        return new Vector(get_xyz().reduce(len));
    }

    @Override
    public String toString() {
        return "Vector{}";
    }
}