package seminar3.task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalTest {
    @BeforeEach
    void setUp() {
        System.out.println("Before all tests");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After all tests");
    }


    //    Тест проверяет, попадает ли переданное число в интервал (25;100) включительно.
    @Test
    @DisplayName("Тест, проверяет, попадает ли переданное число в интервал (25;100)")
    void numberInInterval() {
        Interval interal = new Interval();
        int number1=26;
        assertTrue(interal.numberInInterval(number1));
        int number2=20;
        assertFalse(interal.numberInInterval(number2));
        int number3=25;
        assertTrue(interal.numberInInterval(number3));
        int number4=100;
        assertTrue(interal.numberInInterval(number4));}
}