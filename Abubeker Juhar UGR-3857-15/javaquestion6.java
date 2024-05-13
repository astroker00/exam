public class Main {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int index = 2;
        int[] result = deleteElement(array, index);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] deleteElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return array;
        }

        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}