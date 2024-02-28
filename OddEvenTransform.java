import java.util.Arrays;

public class OddEvenTransform {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0};
        int transformations = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));

//        for (int i = 0; i < transformations; i++) {
            arr = performOddEvenTransform(arr);
            System.out.println(Arrays.toString(arr));
//        }
    }

    private static int[] performOddEvenTransform(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                // Odd integer
                result[i] = arr[i] + 3;
            } else {
                // Even integer
                result[i] = arr[i] - 3;
            }
        }

        return result;
    }
}
