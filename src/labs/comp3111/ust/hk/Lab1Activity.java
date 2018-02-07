package labs.comp3111.ust.hk;

public class Lab1Activity {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }

        System.out.println(String.format("Sum of the numbers is %d", sum));

        int max = getMax(arr);
        int min = getMin(arr);

        System.out.println(String.format("Min = %d", min) + "; " + String.format("Max = %d", max));
    }

    // Method for getting the maximum value
    private static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // Method for getting the minimum value
    private static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
