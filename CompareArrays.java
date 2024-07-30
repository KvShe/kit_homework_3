package homerorks_kit.homework_3;

/**
 * Напишите обобщенный метод compareArrays(), который принимает два массива
 * и возвращает true, если они одинаковые, и false в противном случае.
 * Массивы могут быть любого типа данных,
 * но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
 */
public class CompareArrays {
    public <T> boolean compareArrays(T[] one, T[] two) {
        if (one.length != two.length) return false;

        for (int i = 0; i < one.length; i++) {
            if (!one[i].getClass().equals(two[i].getClass())) {
                return false;
            }
        }

        return true;
    }
}
