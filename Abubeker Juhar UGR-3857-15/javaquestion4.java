public class BubbleSort {
    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    ]
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] alphabets = {'d', 'b', 'a', 'c', 'f', 'e'};
        bubbleSort(alphabets);
        System.out.print("Sorted array: ");
        for (char c : alphabets) {
            System.out.print(c + " ");
        }
    }
}