package test.task.my.readertest;

import by.task.first.readers.DataReader;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReaderTest {
    @Test(dataProvider = "dataProvider")
    public void readeTest(List<String> expected, String path){
        DataReader reader = new DataReader();
        List<String> actual = reader.readData(path);
        Assert.assertEquals(expected,actual);

    }

    @DataProvider(name = "dataProvider")
    public Object[][] createData1() {
        List<String> expected = new ArrayList<>(Arrays.asList("1 2 3 4", "a s f d","kek","lol"));
        return new Object[][] {
                {expected, "data\\DataTest.txt"}
        };
    }
}
