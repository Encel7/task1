package by.task.first.readers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReader  {
    final static Logger logger = LogManager.getLogger();

    public List<String> readData(String filePath) {
        List<String> list;
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            list = stream.collect(Collectors.toList());
        } catch (IOException e) {
            logger.fatal("file cant be opened");
            throw new RuntimeException("fatal", e);
        }
        return list;
    }
}
