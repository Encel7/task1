package by.task.first.action;

import by.task.first.entities.Sphere;
import by.task.first.exceptions.WrongDataException;

public class SphereMethod {
    public static double calculateVolume(Sphere sphere) throws WrongDataException{
        if(isSphere(sphere)){
        return (double)4/3 * Math.pow(sphere.getRadius(), 3) * Math.PI; }
        else{
            throw new WrongDataException("wrong data! set positive radius");
        }
    }

    public static double calculateSquare(Sphere sphere) throws WrongDataException{
        if(isSphere(sphere)){
        return 4 * Math.PI * Math.pow(sphere.getRadius(),2);}
        else{
            throw new WrongDataException("wrong data! set positive radius");
        }
    }

    public static boolean isSphere(Sphere sphere){
        return sphere.getRadius() > 0;
    }

}
