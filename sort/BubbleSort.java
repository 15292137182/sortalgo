/**
 * 冒泡排序算法
 * Created by Administrator on 2018/1/7.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2, 64, 23, 12, 54};
        bubbleSort(arr);
    }

    /**
     * 冒泡排序
     * 将数组中的所有元素进行两两比较,将最大的数放到最后面
     *
     * @param arr 接受需要排序的字段
     */
    private static void bubbleSort(int[] arr) {
        //遍历数组的所有元素
        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = 0; j < arr.length - 1 - i; j++ ) {
                //正序:从小到大排序  使用>
                //倒序:从大道小排序  使用<
                if (arr[j] > arr[j + 1]) {
                    //如果满足条件,将进行替换操作
                    swap(arr, j);
                }
            }
        }
        for ( int anArr : arr ) {
            System.out.print(anArr + "\t");
        }
    }

    /**
     * 替换数组中的值
     *
     * @param arr 数组
     * @param j   数组下标
     */
    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
