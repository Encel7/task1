package by.task.first.create;

import by.task.first.entities.*;
import java.util.*;

import by.task.first.exceptions.WrongDataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SphereCreator  {
    final static Logger logger = LogManager.getLogger();

    public List<Sphere> createSpheres (List<List<Double>> data){
        List<Sphere> spheres = new ArrayList<>();
        for(List<Double> line : data){
            Point tempPoint = new Point(line.get(0),line.get(1),line.get(2));
            Sphere tempSphere = new Sphere(tempPoint, line.get(3));
            spheres.add(tempSphere);
            logger.info("sphere " + tempSphere.getSphereId() + " created");
        }
        return spheres;
    }
}
