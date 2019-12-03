package singleton_pattern;

/**
 * 懒汉式--双重检查锁（double check lock）、防指令重排（volatile）
 * <p>
 * volatile：防止指令重新排序
 * 指令重排序：
 * 在执行程序时，为了提高性能，处理器和编译器常常会对指令进行重新排序。
 * 但是不是随便排序的，想进行排序需要满足一下条件：
 * 1、在单线程下，不能改变程序运行结果
 * 2、存在数据依赖关系的不能进行重排序
 * <p>
 * instance = new DclLazySingleton(); 指令顺序：
 * 1、分配内存空间
 * 2、初始化对象
 * 3、将对象指向刚分配的内存空间
 * 但是有些编译器为了性能的原因，可能会将第2步和第3步进行重排序，顺序就变成了：
 * 1、分配内存空间
 * 2、将对象指向刚刚分配的内存空间
 * 3、初始化对象
 * 现在设想：在指令进行重排之后，两个线程进行了如下的调用：
 * Thread1经过双重null判断完成了了new DclLazySingleton步骤中的2（将对象指向刚刚分配的内存空间）步骤，失去时间片
 * 这时，Thread2得到时间片，执行第一个null判断，判断不为空，然后走到return去访问instance对象，
 * 此时就出现了问题，Thread2可能会取到一个无效或者错误状态的对象
 *
 * 解决办法就是在DclLazySingleton声明为volatile即可
 * 所有的写(write)操作都将发生在读(read)操作之前。
 */
public class DclLazySingleton {

    private DclLazySingleton() {
    }

    /**
     * 不加volatile可能会出现，多线程并发访问出现读取无效对象或者状态错误对象的情况（虽然概率低）
     */
    private volatile static DclLazySingleton instance;

    public static DclLazySingleton getInstance() {
        if (null == instance) {
            synchronized (DclLazySingleton.class) {
                if (null == instance) {
                    //Thread1
                    instance = new DclLazySingleton();
                }
            }
        }
        return instance;
    }


}
