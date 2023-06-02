import model.ConvertRomanNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConvertRomanNumbersTest {

    ConvertRomanNumbers num;

    @BeforeEach
    public void init() {
        num = new ConvertRomanNumbers();
    }

    @Test
    public void convertRomanToInteger() {
        Assertions.assertEquals(3, num.romanToInt("III"));
        Assertions.assertEquals(4, num.romanToInt("IV"));
        Assertions.assertEquals(6, num.romanToInt("VI"));
        Assertions.assertEquals(15, num.romanToInt("XV"));
    }

    @Test
    public void convertIntegerToRoman() {
        Assertions.assertEquals("IX", num.intToRoman(9));
        Assertions.assertEquals("X", num.intToRoman(10));
        Assertions.assertEquals("XIII", num.intToRoman(13));
        Assertions.assertEquals("XVIII", num.intToRoman(18));
    }

    @Test
    public void shouldGiveErrorInvalidIntegerToRoman() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> num.intToRoman(22));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> num.intToRoman(-6));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> num.intToRoman(0));
    }

    @Test
    public void shouldGiveErrorInvalidRomanIsEmptyOrIsBlank() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> num.romanToInt(" "));
        Assertions.assertThrows(IllegalArgumentException.class, () -> num.romanToInt(""));
    }
}