package seminar3.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before all tests");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After all tests");
    }

//    тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
//    переданное число четным или нечетным
    @Test
    @DisplayName("Тест,  который проверяет, является ли переданное число четным или нечетным ")
    void evenOddNumberF() {
        Number number = new Number();
        int n=5;
        assertFalse(number.evenOddNumber(n));
        int n1=4;
        assertTrue(number.evenOddNumber(n1));
    }
}

