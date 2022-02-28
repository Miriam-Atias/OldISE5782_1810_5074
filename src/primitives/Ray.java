package primitives;

import java.util.Objects;

public class Ray {
    private Point _p0;
    private Vector _dir;

    /**
     * c-tor: gets point and vector
     * @param _p0- the head
     * @param _dir- the direction
     */

    public Ray(Point p0,Vector dir) {
        this._p0 = p0;
        Vector normVec= dir.normalize();
        _dir=normVec;
    }

    public Point get_p0() {
        return _p0;
    }

    public Vector get_dir() {
        return _dir;
    }

    @Override
    public String toString() {
        return "Ray{" +
                "_p0=" + _p0 +
                ", _dir=" + _dir +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ray ray = (Ray) o;
        return _p0.equals(ray._p0) && _dir.equals(ray._dir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_p0, _dir);
    }
}
