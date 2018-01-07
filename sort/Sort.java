/**
 *
 * Created by Administrator on 2018/1/7.
 */
public class Sort {
    public static void main(String[] args) {
        int arr[] = {2, 64, 23, 12, 54};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for ( int i = 0; i < arr.length - 1; i++ ) {
            for ( int j = 0; j < arr.length - 1 - i; j++ ) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }
        }
        for ( int i : arr ) {
            System.out.println(i);
        }
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
