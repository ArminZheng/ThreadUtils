package edu.john.practice.singleton;

/**
 * 第二种：慢性子式 2/3
 * （延迟创建这个实例对象）
 * 1.构造器私有化
 * 2.类当中用一个静态变量来保存唯一实例
 * 3.提供一个静态方法来，获取这个实例对象
 * <p>
 * 线程安全（适合多线程）
 *
 * @author John
 * @date 8/24/2020 2:06 AM
 */
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {}

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    try { // 会导致线程阻塞
                        Thread.sleep(3000); // 为了模拟线程不安全，加入睡眠
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
