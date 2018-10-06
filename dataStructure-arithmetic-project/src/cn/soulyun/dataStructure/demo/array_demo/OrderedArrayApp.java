package cn.soulyun.dataStructure.demo.array_demo;

/**
 * @program: dataStructure-arithmetic-project
 * @description: 有序数组测试
 * @author: fhq
 * @create: 2018-09-29 17:39
 **/
public class OrderedArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        OrderedArray orderedArray;
        orderedArray = new OrderedArray(maxSize);   // 894491纳秒

        long start = System.nanoTime();

        // 向有序数组中插入10个元素
        orderedArray.insert(88);
        orderedArray.insert(33);
        orderedArray.insert(99);
        orderedArray.insert(22);
        orderedArray.insert(00);
        orderedArray.insert(11);
        orderedArray.insert(44);
        orderedArray.insert(77);
        orderedArray.insert(55);
        orderedArray.insert(66);
        orderedArray.insert(12);
        orderedArray.insert(45);
        orderedArray.insert(64);
        orderedArray.insert(23);
        orderedArray.insert(5);
        orderedArray.insert(14);
        orderedArray.insert(85);
//        orderedArray.compareInsert(88);
//        orderedArray.compareInsert(33);
//        orderedArray.compareInsert(99);
//        orderedArray.compareInsert(22);
//        orderedArray.compareInsert(00);
//        orderedArray.compareInsert(11);
//        orderedArray.compareInsert(44);
//        orderedArray.compareInsert(77);
//        orderedArray.compareInsert(55);
//        orderedArray.compareInsert(66);
//        orderedArray.compareInsert(12);
//        orderedArray.compareInsert(45);
//        orderedArray.compareInsert(64);
//        orderedArray.compareInsert(23);
//        orderedArray.compareInsert(5);
//        orderedArray.compareInsert(14);
//        orderedArray.compareInsert(85);

        long end = System.nanoTime();

        System.out.println("一共耗时：" + (end - start) + "纳秒");

        // 打印数组
        orderedArray.display();

    }


}
