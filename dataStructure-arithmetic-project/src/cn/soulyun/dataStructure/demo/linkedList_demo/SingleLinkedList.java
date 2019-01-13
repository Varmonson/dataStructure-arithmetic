package cn.soulyun.dataStructure.demo.linkedList_demo;


/**
 * Created by fanhaiquan on  2019-01-13.
 *
 * 单链表结构
 */
public class SingleLinkedList<E> {
    private MyNode<E> first;
    int size = 0;
    int modCount = 0;

    /**
     * 无参构造
     */
    public SingleLinkedList(){

    }

    /**
     * 数据节点
     * @param <E>
     */
    private static class MyNode<E>{
        E data;
        MyNode<E> next;

        MyNode(E element, MyNode<E> next){
            this.data = element;
            this.next = next;
        }
    }

    /**
     * 打印链表元素
     * @param singleLinkedList
     */
    void printElements(SingleLinkedList<E> singleLinkedList){
        for (int i = 0; i < singleLinkedList.size; i++){
            System.out.print(singleLinkedList.getNode(i) + " ");
        }
    }

    /**
     * 获取第n个节点的元素
     * @param index
     * @return
     */
    E getNode(int index){
        return myNode(index).data;
    }

    /**
     * 获取第n个节点
     * @param index
     * @return
     */
    MyNode<E> myNode(int index) {
        if (index < 0)
            return null;
        // 获取第n-1个节点的下一个节点
        MyNode<E> x = first;
        for (int i = 0; i <= index - 1; i++){
            x = x.next;
        }
        return x;
    }

    /**
     * 向第一个节点前添加节点
     * @param e
     */
    void linkFirst(E e){
        MyNode f = first;
        MyNode newNode = new MyNode(e, f);

        first = newNode;

        size++;
        modCount++;
    }

    /**
     * 向末尾添加元素
     * @param e
     */
    void linkLast(E e){
        MyNode pointer = first;
        MyNode newNode = new MyNode<>(e, null);

        for (int i = 0; i < size - 1; i++)
            if (pointer.next != null)
                pointer = pointer.next;
        pointer.next = newNode;

        size++;  // 增加容量
        modCount++;   // 累加修改次数
    }

    /**
     * 在第一个节点之前添加节点
     * @param e
     */
    void addFirst(E e){
        linkFirst(e);
    }

    /**
     * 在最后一个节点之后添加
     * @param e
     */
    public void addLast(E e){
        linkLast(e);
    }

    /**
     * 向第n个节点后插入节点
     * @param index
     * @param e
     */
    void add(int index, E e){
        // 获取第n个节点
        MyNode<E> modNode = myNode(index);
        // 获取第n个节点中的下一个节点
        MyNode<E> nextNode = modNode.next;
        // 把插入的元素指向n的下一个节点
        MyNode newNode = new MyNode(e, nextNode);
        // 把n节点插入的元素
        modNode.next = newNode;

        size++;
        modCount++;
    }

    /**
     * 删除指定的节点
     * @param index
     * @return
     */
    E remove(int index){
        // 要移出的元素
        E element = getNode(index);
        // 获取当前节点的前一个节点
        MyNode<E> prevNode = myNode(index - 1);
        // 获取当前节点的下一个节点
        MyNode<E> nextNode = myNode(index + 1);

        // 判断前一个节点是否为null
        if (prevNode == null){
            first = nextNode;  // 移出第一个节点
        } else {
            // 把当前节点的前一个节点指向当前节点的后一个节点
            prevNode.next = nextNode;
        }

        size--;
        modCount++;
        // 返回当前节点的元素
        return element;
    }


}
