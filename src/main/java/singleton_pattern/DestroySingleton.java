package singleton_pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式的破坏
 * 使用反射强行跳过限制来调用私有构造器来创建对象
 * 解决方案：在构造器中加入null判断，如果已经存在的单例的实例，抛出异常
 */
public class DestroySingleton {

    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        HungrySingleton sc1 = HungrySingleton.getInstance();
        HungrySingleton sc2 = HungrySingleton.getInstance();
        System.out.println(sc1);
        System.out.println(sc2);
        Class<HungrySingleton> clazz = (Class<HungrySingleton>) Class.forName("singleton_pattern.HungrySingleton");
        Constructor<HungrySingleton> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        HungrySingleton sc3 = c.newInstance();
        HungrySingleton sc4 = c.newInstance();
        System.out.println("通过反射获取对象sc3" + sc3);
        System.out.println("通过反射获取对象sc4" + sc4);
    }

}
