package by.task.first.validators;

import by.task.first.exceptions.WrongDataException;
import java.util.List;
import java.util.ListIterator;

public class DataValidator  {
    final static private int LIST_SIZE = 4;

    public void validate (List<List<String>> data){
        ListIterator<List<String>> iterator = data.listIterator();
        while (iterator.hasNext()) {
            List<String> list = iterator.next();
            if (list.size() != LIST_SIZE) {
                iterator.remove();
                continue;
            }
            for(String l : list){
                if(!tryParse(l)){
                    iterator.remove();
                }
            }
        }
    }

    private boolean tryParse(String value){
        double temp;
        try {
            temp = Double.parseDouble(value);
            if (temp >= 0){
                return true;
            }
            else {
                throw new WrongDataException();
            }
        } catch (NumberFormatException|WrongDataException e) {
            return false;
        }
    }
}
