package main.sort;

/**
 * 排序总和
 */
public class Sorts {
    public static void main(String[] args) {
        int[] arr= new int[]{34,3,25,7,55,6,19,42};
        //冒泡排序
        /*arr = bubbleSort(arr);
        System.out.println("冒泡排序：");*/

        //选择排序
        /*arr = selectionSort(arr);
        System.out.println("选择排序：");*/

        //插入排序
        arr = insertionSort(arr);
        System.out.println("插入排序: ");

        for (int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }



    /**
     * 冒泡排序
     * 两两比较，每一轮找出极值，缩小范围在比较
     * 最佳情况：T(n) = O(n) 最差情况：T(n) = O(n2) 平均情况：T(n) = O(n2)
     */
    public static int[] bubbleSort(int[] arr){
        for (int i = 0 ;i<arr.length;i++){
            for (int j = 0;j < arr.length-1-i;j++){ //将最大或最小的数放入最后一位
                if (arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 选择排序
     * 将第一个数与其余每一个数比较。找出最大或最小值，然后再讲第二个数与后续每一个数比较，知道倒数第二位与最后一位比较完成
     * 永远需要
     */
    private static int[] selectionSort(int[] arr) {
        for (int i = 0;i <arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 插入排序 与斗地主摸排类似，temp暂存要比较的数，将temp与前一个数比较，条件成立则将前一个数的值
     * 给temp所在位置的数 （不是temp,用temp表示arr[i]是因为直接用arr[i]会造成数组下标异常）
     * 再次比较 temp前一个数与前前个数，成立则前前个数的值给前一个数知道条件不成立，此时temp给前前个数
     * 最佳情况：T(n) = O(n)   最坏情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
     * @param arr
     * @return
     */
    private  static int[] insertionSort(int[] arr){
        int temp;
        for (int i = 1;i< arr.length;i++){
            int j = i;
            temp = arr[i];
            while (j>0&&temp<arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
}
