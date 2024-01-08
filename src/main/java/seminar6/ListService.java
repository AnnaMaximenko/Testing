package seminar6;


import java.util.List;

public class ListService {


    public double getArgNumOfList(List<Integer> list) {
        double result = 0;
        for (Integer el : list) {
            result += el;
        }
        if (list.isEmpty()) {
            throw new ArithmeticException("Деление на 0 невозможно");
        }
        return result / list.size();
    }


    public String gripTwoNumberLists(List<Integer> list1, List<Integer> list2) {
        double avrg1 = 0;
        double avrg2 = 0;

        try {
            avrg1 = getArgNumOfList(list1);
            avrg2 = getArgNumOfList(list2);
        } catch (ArithmeticException e) {
            System.out.println("Невозможно");
        }
        if (avrg1 > avrg2) {
            return "Первый список имеет большее среднее значение";
        } else if (avrg1 < avrg2) {
            return "Второй список имеет большее среднее значение";
        } else if (avrg1 == avrg2) {
            return "Средние значения равны";
        } else {
            return "Невозможно выполнить задачу";
        }
    }
}
