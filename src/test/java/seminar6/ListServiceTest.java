package seminar6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListServiceTest {
    private ListService listService = new ListService();
    private List<Integer> list1;
    private List<Integer> list2;

    @BeforeEach
    void setUp() {
        list1 = List.of(1, 2, 3);
        list2 = List.of(2, 2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getArgNumOfList() {
        assertEquals(2, listService.getArgNumOfList(list1));
        assertEquals(2, listService.getArgNumOfList(list2));
    }

    /**
     * Проверка на возврат значения не равного Null в результате работы метода comparisonTwoNumberLists()
     * Проверка на возврат одного и того же значения от разных входных параметров, но одинаковых
     * результатных знгачениях
     * */
    @Test
    @DisplayName("Test not Null in return")
    void gripTwoNumberLists() {
        String str = listService.gripTwoNumberLists(list1, list2);
        assertNotNull(str);
        assertEquals(listService.getArgNumOfList(list1), listService.getArgNumOfList(list2));
    }

    /**
     * Проверка корректной обработки ошибки ArithmeticException
     * */
    @Test
    @DisplayName("Test division by zero")
    void testDivideByZero() {
        List<Integer> list = new ArrayList<>();
        assertThrows(ArithmeticException.class, () -> listService.getArgNumOfList(list), "Division by zero should"
                + " throw ArithmeticException");
    }
}