package sk.koprda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

class NumberValueGeneratorTest {

    @Test
    void getValuesTest() {
        List<String> actualValues = NumberValueGenerator.generateValues(1, 10);
        List<String> expectedValues = Arrays.asList("1", "foo", "3", "foofuu", "5", "foo", "7","foofuu", "9", "foo");
        assertEquals(expectedValues, actualValues);
    }
}