/* 14. Check if Array is Sorted
Given:
{10, 20, 30, 40, 50}
Check whether the array is sorted in ascending order.
Expected output:
Array is sorted
For:
{10, 30, 20, 40, 50}
Expected output:
Array is not sorted */

public class CheckShortedArray {
    public static void main(String[] args) {

        int[] arr = {10, 70, 30, 40, 50};

        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
}