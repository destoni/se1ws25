package org.hbrs.se1.ws25.tests.uebung1;

import org.hbrs.se1.ws25.exercises.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//package org.hbrs.se1.ws25.exercises.uebung1.tests;




public class GermanTranslatorTest {

    private final GermanTranslator translator = new GermanTranslator();
    @Test
    public void aTest() {
        //GermanTranslator translator = new GermanTranslator();

        assertEquals("null" , translator.translateNumber(0));
    }
    @Test
    void testValidNumbers() {
        assertEquals("eins", translator.translateNumber(1));
        assertEquals("zwei", translator.translateNumber(2));
        assertEquals("drei", translator.translateNumber(3));
        assertEquals("vier", translator.translateNumber(4));
        assertEquals("fünf", translator.translateNumber(5));
        assertEquals("sechs", translator.translateNumber(6));
        assertEquals("sieben", translator.translateNumber(7));
        assertEquals("acht", translator.translateNumber(8));
        assertEquals("neun", translator.translateNumber(9));
        assertEquals("zehn", translator.translateNumber(10));
    }

    @Test
    void testInvalidLowNumber() {
        String result = translator.translateNumber(0);
        assertTrue(result.contains("nicht möglich"));
        assertTrue(result.contains("Version"));
    }

    @Test
    void testInvalidHighNumber() {
        String result = translator.translateNumber(11);
        assertTrue(result.contains("nicht möglich"));
        assertTrue(result.contains("Version"));
    }

}