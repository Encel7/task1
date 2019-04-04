package by.task.first.parsers;

import by.task.first.validators.DataValidator;
import java.util.*;

public class DataParser {
    private static String REGEX_DELIMITER = "\\s+";
    private List<List<String>> listOfLines = new ArrayList<>();
    private List<List<Double>> listOfDoubles = new ArrayList<>();
    private DataValidator validator = new DataValidator();

    public List<List<Double>> parseData(List<String> data){
        List<List<String>> parsedStringList = parseToList(data);
        validator.validate(parsedStringList);
        for(List<String> line : parsedStringList) {
            List<Double> doubles = new ArrayList<>();
            for (String number : line){
                doubles.add(Double.parseDouble(number));
            }
            listOfDoubles.add(doubles);
        }
        return listOfDoubles;
    }

    private List<List<String>> parseToList(List<String> lines){
        for(String line : lines) {
            line = line.trim();
            List<String> lineToParse = Arrays.asList(line.split(REGEX_DELIMITER));
            listOfLines.add(lineToParse);
        }
         return   listOfLines;
    }
}

