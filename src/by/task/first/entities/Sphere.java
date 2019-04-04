package by.task.first.entities;

import by.task.first.exceptions.WrongDataException;
import by.task.first.generators.IdGenerator;
import java.util.HashSet;
import java.util.Set;

public class Sphere{
    private Point center;
    private double radius;
    private long sphereId;

    public Sphere(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        this.sphereId = IdGenerator.generateId();
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) throws WrongDataException{
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws WrongDataException{
        this.radius = radius;
    }

    public long getSphereId() {
        return sphereId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sphere sphere = (Sphere) o;

        if (Double.compare(sphere.radius, radius) != 0) return false;

        return center.equals(sphere.center);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = center.hashCode();
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (sphereId ^ (sphereId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "center=" + center +
                ", radius=" + radius +
                ", sphereId=" + sphereId +
                '}';
    }
}
