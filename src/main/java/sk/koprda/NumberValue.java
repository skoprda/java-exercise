package sk.koprda;


import lombok.Getter;

public class NumberValue {

    @Getter
    private final String value;

    public NumberValue(int number){
        value = calculateValue(number);
    }

    private String calculateValue(int number) {
        return odd(number) +
                divisibleBy2(number) +
                divisibleBy4(number);
    }

    private String odd(int number) {
        if(!isDivisibleBy(number, 2)){
            return Integer.toString(number);
        }
        return "";
    }

    private String divisibleBy2(int number) {
        String result = "";
        if(isDivisibleBy(number, 2)){
            result = "foo";
        }
        return result;
    }

    private String divisibleBy4(int number) {
        String result = "";
        if(isDivisibleBy(number, 4)){
            result = "fuu";
        }
        return result;
    }

    private boolean isDivisibleBy(int number, int divisibleBy){
        return number % divisibleBy == 0;
    }
}
