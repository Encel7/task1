package test.task.my.parsertest;

import by.task.first.parsers.DataParser;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParserTest {
    @BeforeClass
    public void testBeforeSuite() {
        System.out.println("testBeforeSuite()");

    }
    @Test
    public void parseTest() {
        DataParser parser = new DataParser();
        List<String> data = new ArrayList<>(Arrays.asList("1 3 4 5", "4 2 1 5", "a 2 5 1"));
        List<List<Double>> actual = new ArrayList<>();
        actual.add(Arrays.asList(1.0,3.0,4.0,5.0));
        actual.add(Arrays.asList(4.0,2.0,1.0,5.0));
        List<List<Double>> expected = parser.parseData(data);
        Assert.assertEquals(actual,expected);

    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("testAfterTest()");
    }

}
