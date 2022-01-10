package sk.koprda;

import java.util.ArrayList;
import java.util.List;

public class NumberValueGenerator {

    public static List<String> generateValues(int from, int to){
        NumberValue numberValue;
        List<String> values = new ArrayList<>();
        for(int num = from; num <= to; num++){
            numberValue = new NumberValue(num);
            values.add(numberValue.getValue());
        }
        return values;
    }


}
