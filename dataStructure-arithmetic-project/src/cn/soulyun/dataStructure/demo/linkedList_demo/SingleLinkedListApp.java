package cn.soulyun.dataStructure.demo.linkedList_demo;


/**
 * Created by fanhaiquan on  2019-01-13.
 */
public class SingleLinkedListApp {

    public static void main(String[] args) {

        // 构建链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        // 1.增
        // 向第一位和最后一位插入元素
        singleLinkedList.addFirst(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);

        System.out.println("当前链表容量为：" + singleLinkedList.size + "，共修改次数为:" + singleLinkedList.modCount);
        singleLinkedList.printElements(singleLinkedList);

        // 向指定位置插入元素
        singleLinkedList.add(2, "二");

        System.out.println("在中间插入新节点之后：");
        singleLinkedList.printElements(singleLinkedList);
        System.out.println("当前链表容量为：" + singleLinkedList.size + "，共修改次数为:" + singleLinkedList.modCount);

        // 2.删
        // 删除指定节点
        Object rElement = singleLinkedList.remove(0);
        System.out.println("移出的元素为：" + rElement + "，移出之后链表的容量为:" + singleLinkedList.size + "，一共修改了:" + singleLinkedList.modCount + "次");
        singleLinkedList.printElements(singleLinkedList);

        // 3.查
        // 获取指定节点的元素
        Object node = singleLinkedList.getNode(3);
        System.out.println("第" + 2 + "个元素为：" + node);


    }
}
