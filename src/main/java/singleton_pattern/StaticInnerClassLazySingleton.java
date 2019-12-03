package singleton_pattern;

/**
 * 懒汉式：用静态内部类中持有静态final的单例实例属性实现
 * 优点：延迟加载，解决线程安全问题
 */
public class StaticInnerClassLazySingleton {

    /**
     * 1、单例模式的共同特点，首先不希望外部直接new去创建对象，所以构造器私有
     */
    private StaticInnerClassLazySingleton() {
    }

    /**
     * 2、静态内部类中定义静态final属性达到"懒"加载的效果
     * 在内部类中创建单例实例
     */
    private static class Holder {
        private static final StaticInnerClassLazySingleton SINGLE_TON = new StaticInnerClassLazySingleton();
    }

    /**
     * 3、由于构造器私有，所以只能用静态方法来获取静态内部类创建好的静态属性
     *
     * @return 单例对象实例
     */
    public static StaticInnerClassLazySingleton getInstance() {
        return Holder.SINGLE_TON;
    }
}
