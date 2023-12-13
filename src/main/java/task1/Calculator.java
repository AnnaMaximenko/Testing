package task1;



public class Calculator {
    public static void main(String[] args) {
        int calculation = calculation(3, 0, '=');
        System.out.println(calculation);
    }
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи


    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double result;
        if (discountAmount<0){
            throw new ArithmeticException("Скидка не может быть меньше нуля");
        } else if (discountAmount>100){
            throw new ArithmeticException("Скидка не может быть больше 100%");
        } else if (purchaseAmount<0) {
            throw new ArithmeticException("Цена не может быть меньше 0");
        } else {
        result = purchaseAmount - (purchaseAmount * discountAmount) / 100;
        return result;} // Метод должен возвращать сумму покупки со скидкой
    }
}
