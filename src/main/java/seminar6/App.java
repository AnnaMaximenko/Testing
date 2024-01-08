package seminar6;

//Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
//a. Рассчитывает среднее значение каждого списка.
//b. Сравнивает эти средние значения и выводит соответствующее сообщение:
//        - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
//        - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
//        - ""Средние значения равны"", если средние значения списков равны.


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ListService listService = new ListService();

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);



        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        //Выводим сообщения со значениями ср.ариф.по спискам
        System.out.println("Cреднее значение list1 = " + listService.getArgNumOfList(list1));
        System.out.println("Cреднее значение list2 = " + listService.getArgNumOfList(list2));

        //Выводим результат сравнения
        String str = listService.gripTwoNumberLists(list1, list2);
        System.out.println(str);



    }

}
