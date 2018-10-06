package cn.soulyun.dataStructure.demo.array_demo;

/**
 * @program: dataStructure-arithmetic-project
 * @description: 调用封装的数组
 * @author: fhq
 * @create: 2018-09-28 15:14
 **/
public class HighArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;   // 定义数组最大长度
        HighArray arr = new HighArray(maxSize);  // 创建数组

        // 插入
        arr.insert(77);
        arr.insert(11);
        arr.insert(22);
        arr.insert(99);
        arr.insert(00);
        arr.insert(88);
        arr.insert(55);
        arr.insert(33);
        arr.insert(66);
        arr.insert(44);

        // 打印
        arr.display();

        // 查找
        int searchKey = 35;
        if(arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        // 删除
//        arr.delete(00);
//        arr.delete(55);
//        arr.delete(99);

        arr.display();

        // 获取数组最大值
        long max = arr.getMax();
        System.out.println("数组最大值为：" + max);

        // 移出数组最大值
        long delMax = arr.removeMax();
        System.out.println("已删除最大值,最大值为：" + delMax);

        // 打印删除最大值后的数组
        arr.display();
    }

}
