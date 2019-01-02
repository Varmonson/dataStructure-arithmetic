package cn.soulyun.dataStructure.demo.prepare_demo;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by fanhaiquan on  2019-01-02.
 * <p>
 * 选择问题
 * 需求：有一组N个数求其中第k个最大者
 *
 * 分析：倒序排序，取第k个数
 */
public class ChooseQuestion {

    /**
     * 1.冒泡排序
     *
     * 外层控制比较轮数，内层一轮内的相邻两位比较，然后交换位置
     */
    @Test
    public void testBubblingSort() {
        int[] arr = {12, 45, 8, 48, 46, 97, 67};
        int k = 6;

        long beginTime = System.nanoTime();

        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        int[] sortArr = sortArr(newArr);

        long endTime = System.nanoTime();
        System.out.println(Arrays.toString(sortArr));

        System.out.println("第k大的数为：" + sortArr[k-1]);
        System.out.println("一共耗时：" + (endTime - beginTime) + "纳秒");
    }


    /**
     * 2.读取第k个数，降序排序，
     * 然后读取k后面的数，大于k，则替换，否则，忽略
     */
    @Test
    public void testMidInsert(){
        int[] arr = {12, 45, 8, 48, 46, 97, 67};
        int k = 6;
        long beginTime = System.nanoTime();

        // 1.读取k个数
        int[] newArr = new int[k];
        for (int i = 0; i < k; i++) {
            newArr[i] = arr[i];
        }

        // 2.对k个数排序
        int[] sortArr = sortArr(newArr);

        // 3.依次读取k+i个数
        for (int i = k; i < arr.length; i++){
            if (arr[i] < sortArr[k-1]){   // 如果小于第k个数，忽略
                break;
            } else {  // 否则，该数和k数组中的数比较
                for (int j = 0; j < sortArr.length; j++){
                    if (arr[i] > sortArr[j]) {  // 如果该数大于k数组中的第j个元素
                        for (int m = sortArr.length - 1; m > j; m--){       // j后面的元素后移一位
                            sortArr[m] = sortArr[m-1];
                        }
                        sortArr[j] = arr[i];   // 把该数放在第j的位置
                        break;
                    }
                }
            }
        }

        long endTime = System.nanoTime();
        System.out.println(Arrays.toString(sortArr));

        System.out.println("第k大的数为：" + sortArr[k-1]);
        System.out.println("一共耗时：" + (endTime - beginTime) + "纳秒");
    }

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public int[] sortArr(int[] arr){
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {  // 比较次数
            for (int j = 0; j < arr.length - 1 - i; j++) { // 相邻两位比较
                if (arr[j] < arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
