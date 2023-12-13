package task1;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void setup() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @AfterEach
    void cleanup() {
        calculator = null;
    }

    @AfterAll
    static void teardown() {
        System.out.println("After all tests");
    }

//    @Test
//    void main() {
//    }
//
//    @Test
//    @DisplayName("Тест сложения положительных чисел")
//    void calculation() {
//        int result = Calculator.calculation(2, 6, '+');
//        assertEquals(8, result, "2 + 6 should equal 8");
//    }

    @Test
    @DisplayName("Тест метода основной")
    void calculatingDiscount() {
        double result = Calculator.calculatingDiscount(100,20);
        assertEquals(80.0, result, "20% от 100 should equal 80");
    }

    @Test
    @DisplayName("Тест метода отрицательный процент")
    void calculatingDiscountPersent() {
        assertThatThrownBy( () -> Calculator.calculatingDiscount(80.0, -10)
        ).isInstanceOf(ArithmeticException.class);
    }

    @Test
    @DisplayName("Тест метода процент больше 100")
    void calculatingDiscountPersentlarge() {
        assertThatThrownBy( () -> Calculator.calculatingDiscount(80.0, 500)
        ).isInstanceOf(ArithmeticException.class);
    }

    @Test
    @DisplayName("Тест метода отрицательная цена")
    void calculatingDiscountAmount() {
        assertThatThrownBy( () -> Calculator.calculatingDiscount(-80.0, 20)
        ).isInstanceOf(ArithmeticException.class);
    }

}