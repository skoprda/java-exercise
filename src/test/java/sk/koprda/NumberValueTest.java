package sk.koprda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberValueTest {

    @Test
    void numberValueTest() {
        NumberValue numValue1 = new NumberValue(1);
        assertEquals("1", numValue1.getValue());

        NumberValue numValue2 = new NumberValue(2);
        assertEquals("foo", numValue2.getValue());

        NumberValue numValue3 = new NumberValue(4);
        assertEquals("foofuu", numValue3.getValue());

        NumberValue numValue4 = new NumberValue(1024);
        assertEquals("foofuu", numValue4.getValue());

        NumberValue numValue5 = new NumberValue(-5);
        assertEquals("-5", numValue5.getValue());

        NumberValue numValue6 = new NumberValue(0);
        assertEquals("foofuu", numValue6.getValue());

    }
}