package test.task.my.actiontests;

import by.task.first.action.SphereMethod;
import by.task.first.entities.Point;
import by.task.first.entities.Sphere;
import by.task.first.exceptions.WrongDataException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActionTest {
    Sphere testSphere1;
    Sphere testSphere2;
    Sphere testSphere3;

    @BeforeClass()
    public void setUp() {
        testSphere1 = new Sphere(new Point(1.0,1.0,1.0), 3);
        testSphere2 = new Sphere(new Point(1.0,2.0,1.0), 5);
        testSphere3 = new Sphere(new Point(0,0,0), 1);
    }

    @AfterClass()
    public void tearDown() {
        testSphere1 = null;
        testSphere2 = null;
        testSphere3 = null;
    }

    @DataProvider
    public Object[][] SquareTestData() {
        return new Object[][]{{testSphere1, 113.097312},
                {testSphere2, 314.1592},
                {testSphere3, 12.566368}
        };
    }

    @DataProvider
    public Object[][] VolumeTestData() {
        return new Object[][]{{testSphere1, 113.09733},
                {testSphere2, 523.59877},
                {testSphere3, 4.18879}
        };
    }

    @Test(dataProvider = "SquareTestData")
    public void calculateSquareTest(Sphere testSphere, double expected) throws WrongDataException {
        double actual = SphereMethod.calculateSquare(testSphere);
        Assert.assertEquals(actual, expected,0.0001);
    }

    @Test(dataProvider = "VolumeTestData")
    public void calculateVolumeTest(Sphere testSphere, double expected) throws WrongDataException {
        double actual = SphereMethod.calculateVolume(testSphere);
        Assert.assertEquals(actual, expected,0.0001);
    }
}
