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
        if (_xyz.equals(Double3.getZERO())) {
            throw new IllegalArgumentException("Vector(0,0,0) is not allowed");
        }
    }

    /**
     * @return the length Squared of this vector
     */
    public double lengthSquared() {
        return _xyz.get_d1() * _xyz.get_d1()
                + _xyz.get_d2() * _xyz.get_d2()
                + _xyz.get_d3() * _xyz.get_d3();
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
        return _xyz.get_d1() * other._xyz.get_d1()
                + _xyz.get_d2() * other._xyz.get_d2()
                + _xyz.get_d3() * other._xyz.get_d3();
    }

    /**
     * cross product between two vectors (vectorial product)
     * @param other other the right vector of U.V
     * @return the vector resulting from the cross product (Right-hand rule)
     * @link https://www.mathsisfun.com/algebra/vectors-cross-product.html
     */
    public Vector crossProduct(Vector other) {
        double ax = _xyz.get_d1();
        double ay = _xyz.get_d2();
        double az = _xyz.get_d3();

        double bx = other._xyz.get_d1();
        double by = other._xyz.get_d2();
        double bz = other._xyz.get_d3();

        double cx = ay * bz - az * by;
        double cy = az * bx - ax * bz;
        double cz = ax * by - ay * bx;


        return new Vector(cx, cy, cz);
    }
    /**
     * scaling by number
     * @param scalar-double
     * @return the new Vector
     */
    public Vector scale(double scalar)
    {
        double x=this._xyz.get_d1()*scalar;
        double y=this._xyz.get_d2()*scalar;
        double z=this._xyz.get_d3()*scalar;
        Vector result=new Vector(x,y,z);
        return result;
    }

    public Vector normalize() {
        if (_xyz.equals(Double3.getZERO()))
            throw new IllegalArgumentException("Vector(0,0,0) is not allowed");
        double len = length();
        return new Vector(_xyz.reduce(len));
    }

    @Override
    public String toString() {
        return "Vector{}";
    }
}