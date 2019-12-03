package singleton_pattern;

/**
 * 线程不安全的懒汉式
 * 严格讲，这其实不是单例
 * 解决线程安全方案：
 * 使用静态内部类&&静态属性
 * 使用dcl（double check lock）
 * @author dubaoming
 */
public class UnsafeLazySingleton {

    private UnsafeLazySingleton() {
    }

    private static UnsafeLazySingleton instance;

    public static UnsafeLazySingleton getInstance() throws InterruptedException {
        if (null == instance) {
            //当有线程同时执行到此处时，会new出多个不同对象
            Thread.sleep(2000L);
            instance = new UnsafeLazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            new Thread(() -> {
                try {
                    System.out.println(UnsafeLazySingleton.getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
