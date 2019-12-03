package singleton_pattern;

/**
 * 单例模式：所谓单例，就是说在整个应用程序中，有且仅有一个此类的实例。该类负责创建自己的实例，同时确保只有1个对象被创建。
 * 特点：
 * 1、构造方法私有
 * 2、持有自己类型的属性
 * 3、对外提供获取实例的静态方法
 * <p>
 * 饿汉式：通过静态final属性的核心来实现
 * 优点：天生线程安全、简单。饿汉式单例的实例对象在类加载时就已经创建好了。也就是说在线程访问单例对象之前该对象就已经创建好了。
 * 线程每次都只能、也必定会拿到同一个对象。
 * 缺点：提前初始化会延长类加载器加载时间。如果不使用会浪费内存空间。
 *
 * @author dubaoming
 */
public class HungrySingleton {

    /**
     * 1、单例模式的共同特点，首先不希望外部直接new去创建对象，所以构造器私有
     */
    private HungrySingleton() {

        //防止反射强行调用私有构造方法来获取对象
        if (null != HUNGRY_SINGLETON) {
            throw new RuntimeException();
        }

    }

    /**
     * 2、希望在类加载时就创建对象，所有使用静态属性来实现"饿"加载的效果。（类加载时，最先加载的就是静态属性）
     */
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    /**
     * 3、由于构造器私有，所以只能用静态方法来获取创建好的静态属性
     *
     * @return 单例对象实例
     */
    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    public static void main(String[] args) {

    }
}
