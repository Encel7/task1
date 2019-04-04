package by.task.first.generators;

public class IdGenerator {
    final static long MAX_ID = 100_000_000;
    static long id = 999_999;

    private IdGenerator(){}

    public static long generateId (){
        if(id < MAX_ID){
            id++;
        }
        else{
            id = 0;
        }
        return id;
    }
}
