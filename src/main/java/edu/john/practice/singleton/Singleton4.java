package edu.john.practice.singleton;

/**
 * 第二种：慢性子式 1/3
 * （延迟创建这个实例对象）
 * 1.构造器私有化
 * 2.类当中用一个静态变量来保存唯一实例
 * 3.提供一个静态方法来，获取这个实例对象
 *
 * 线程不安全（适合单线程）
 * @author John
 * @date 8/24/2020 1:35 AM
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){}

    public static Singleton4 getInstance() {
        if (instance == null) {
            try { // 会导致线程阻塞
                Thread.sleep(100); // 为了模拟线程不安全，加入睡眠
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton4();
        }
        return instance;
    }
}
