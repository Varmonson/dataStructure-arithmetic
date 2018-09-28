package cn.soulyun.dataStructure.demo.array_demo;

/**
 * @program: dataStructure-arithmetic-project
 * @description: 封装一个数组类，提供增删查方法
 * @author: fhq
 * @create: 2018-09-28 14:30
 **/
public class HighArray {

    // 定义一个数组
    private long[] a;
    // 定义一个指针，用来跟踪数组最后一个元素的下一个下标
    private int nElement;

    // 构造方法
    public HighArray(int max) {
        // 创建一个数组
        a = new long[max];
        // 初始化指针，数组中没有元素
        nElement = 0;
    }

    /**
     * 查找数组中是否存在该元素
     *
     * @param searchKey
     * @return
     */
    public boolean find(long searchKey) {
        int j; // 定义一个遍历下标
        for (j = 0; j < nElement; j++)  // 遍历数组
            if (a[j] == searchKey)  // 如果找到改元素，结束遍历
                break;
        if (j == nElement)
            return false;   // 遍历的下标等于指针的值，说明该数组中不存在该元素
        else
            return true;    // 反之，则存在
    }

    /**
     * 向数组中添加一个元素
     *
     * @param value
     * @return
     */
    public void insert(long value) {
        a[nElement] = value;  // 把元素放到指针位置
        nElement++;    // 指针+1
    }

    /**
     * 删除数组中的某一个元素
     *
     * @param value
     * @return
     */
    public boolean delete(long value) {
        int j;

        // 查找
        for (j = 0; j < nElement; j++)
            if (a[j] == value)   // 找到，则结束遍历
                break;

        if (j == nElement) {
            return false;    // 不存在，返回
        } else {       // 删除
            for (int k = j; k < nElement; k++)
                a[k] = a[k + 1];   // 当前元素后面的每一位元素，前移一位
            nElement--;   // 数组长度-1
            return true;
        }
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
