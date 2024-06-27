import java.util.Arrays;

public class ArraysUtiExm {

    public static <T> void swap(T[] array, int i, int j) {
        if (i >= 0 && i < array.length && j >= 0 && j < array.length) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
    public static void main(String[] args) {
         Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original intArray: " + Arrays.toString(intArray));
        swap(intArray, 0, 4);
        System.out.println("Swapped intArray: " + Arrays.toString(intArray));

        String[] strArray = {"A", "B", "C", "D", "E"};
        System.out.println("Original strArray: " + Arrays.toString(strArray));
        swap(strArray, 1, 3);
        System.out.println("Swapped strArray: " + Arrays.toString(strArray));

        Pair<Integer, String>[] pairArray = new Pair[]{
            new Pair<>(1, "one"),
            new Pair<>(2, "two"),
            new Pair<>(3, "three")
        };
        System.out.println("Original pairArray: " + Arrays.toString(pairArray));
        swap(pairArray, 0, 2);
        System.out.println("Swapped pairArray: " + Arrays.toString(pairArray));
    }

    static class Pair<T, U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "Pair{" + "first=" + first + ", second=" + second + '}';
        }
    }

    }
