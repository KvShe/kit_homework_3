package homerorks_kit.homework_3;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 * Методы должны возвращать результат своей работы.
 */
public class Calculator {
    public static <T extends Number> double sum(T number1, T number2) {
        return number1.doubleValue() + number2.doubleValue();
    }

    public static <T extends Number> double multiply(T number1, T number2) {
        return number1.doubleValue() * number2.doubleValue();
    }

    public static <T extends Number> double divide(T number1, T number2) {
        if (number2.doubleValue() == 0) {
            throw new ArithmeticException("divide by zero");
        }

        return number1.doubleValue() / number2.doubleValue();
    }

    public static <T extends Number> double subtract(T number1, T number2) {
        return number1.doubleValue() - number2.doubleValue();
    }
}
