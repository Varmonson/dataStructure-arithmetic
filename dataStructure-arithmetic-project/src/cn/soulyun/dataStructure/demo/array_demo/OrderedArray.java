package cn.soulyun.dataStructure.demo.array_demo;

/**
 * @program: dataStructure-arithmetic-project
 * @description: 有序的数组类
 * @author: fhq
 * @create: 2018-09-29 17:13
 **/
public class OrderedArray {

    private long[] a;      // 定义一个数组
    private int nElement;  // 定义一个指针元素，指向数组最后一个元素的下一个地址

    /**
     * 构造方法
     *
     * @param maxSize 数组最大容量
     */
    public OrderedArray(int maxSize) {
        a = new long[maxSize];
        nElement = 0;
    }

    public void compareInsert(long value){
//        if (nElement == 0 || value > a[nElement - 1]) {    // 数组中还未添加元素或者当前元素大于最后一位
//            a[nElement] = value;  // 直接添加元素
//            nElement++;
//            return;
//        }

        int j;

        // 找到
        for(j = 0; j < nElement; j++){
            if (a[j] > value)
                break;
        }

        for (int k = nElement; k > j; k--)
            a[k] = a[k - 1];
        a[j] = value;
        nElement++;
    }

    /**
     * 向数组中添加元素
     *
     * @param value
     */
    public void insert(long value) {
        int minPos = 0;   // 数组第一位索引
        int maxPos = nElement - 1;   // 数组最后一位索引
        int midPos = 0;    // 获取数组中间值的索引

        if (nElement == 0 || value > a[maxPos]) {    // 数组中还未添加元素或者当前元素大于最后一位
            a[nElement] = value;  // 直接添加元素
            nElement++;
            return;
        }

        while(minPos <= maxPos){   // 当最小元素索引大于最大元素索引时停止
             midPos = (minPos + maxPos) / 2;
             if(a[midPos] < value)
                 minPos = midPos + 1;
             else
                 maxPos = midPos - 1;
        }

        // 中间元素后移一位
        for (int j = nElement; j > midPos; j--)
            a[j] = a[j-1];
        a[midPos] = value;   // 该元素插入中间位置
        nElement++;   // 指针后移一位

//        while (true) {
//
//            // 当前数和中间数比较
//            if (value > a[midPos]) {       // 比中间数大
//                if (midPos == maxPos) {    // 当最小索引等于最大索引时结束
//                    for (int j = nElement; j > midPos; j--)
//                        a[j] = a[j - 1];   // 中间索引后的每一个元素后移一位
//                    a[midPos] = value;    // 把该元素放到中间索引处
//                    nElement++;    // 指针后移一位
//                    break;
//                } else {
//                    minPos = midPos + 1;// 否则，将中间索引+1赋给最小索引
//                }
//            } else if (value < a[midPos]) {// 比中间数小
//                if (midPos == maxPos) {    // 当最小索引等于最大索引时结束
//                    for (int j = nElement; j > midPos; j--)
//                        a[j] = a[j - 1];   // 中间索引后的每一个元素后移一位
//                    a[midPos] = value;    // 把该元素放到中间索引处
//                    nElement++;    // 指针后移一位
//                    break;
//                } else {
//                    maxPos = midPos;// 否则，将中间索引+1赋给最大索引
//                }
//            } else {
//                throw new RuntimeException("数组中中已经存在 ：{" + value + "}, 不能重复插入！");
//            }

//                if(minPos == maxPos){
//                    // 中间位置后的每一位元素后移一位
//                    for(int j = nElement; j > midPos; j--)
//                        a[j] = a[j-1];
//                    a[midPos] = value;  // 把该元素插入中间值后一位
//                    nElement++;  // 指针后移一位
//                    break;
//                } else {
//                    if(value < a[midPos]) {  // 当前数比中间数小
//                        maxPos = midPos - 1;   // 把中间数前一位的索引赋给最大索引
//                    } else {      // 否则，该值比中间数大
//                        minPos = midPos + 1;   // 把中间数后一位赋给最小索引
//                    }
//                }
//        }

    }

    /**
     * 查看数组所有元素
     */
    public void display() {
        for (int j = 0; j < nElement; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }


}
