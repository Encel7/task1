package test.task.my.creatortest;

import by.task.first.create.SphereCreator;
import by.task.first.entities.Point;
import by.task.first.entities.Sphere;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatorTest {
        @DataProvider
        public Object[][] createTestData() {
            List<List<Double>> data = new ArrayList<>();
            data.add(Arrays.asList(1.0, 1.0, 1.0, 4.0));
            data.add(Arrays.asList(0.0, 1.0, 3.0, 1.0));
            data.add(Arrays.asList(1.0, 2.0, 3.0, 3.0));
            List<Sphere> expected = new ArrayList<>();
            expected.add(new Sphere(new Point(1.0, 1.0, 1.0), 4.0));
            expected.add(new Sphere(new Point(0, 1, 3), 1));
            expected.add(new Sphere(new Point(1, 2, 3), 3));
            return new Object[][]{{data, expected}};
        }

        @Test(dataProvider = "createTestData")
        public void createSphereTest(List<List<Double>> data, List<Sphere> expected) {
            SphereCreator creator = new SphereCreator();
            List<Sphere> actual = creator.createSpheres(data);
            Assert.assertEquals(actual, expected);
        }
    }
