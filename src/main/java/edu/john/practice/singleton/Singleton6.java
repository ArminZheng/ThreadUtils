package edu.john.practice.singleton;

/**
 * 第二种：慢性子式 3/3 nice
 *  静态内部类形式：（适合多线程）
 *      在内部类被加载和初始化时，才创建INSTANCE实例对象；
 *      静态内部类不会自动随着外部类的加载和初始化，它是独立的，需要单独加载和初始化；
 *      因为是在内部类加载和初始化时创建的，因此是线程安全的 （是类加载器来完成的）
 * @author John
 * @date 8/24/2020 2:18 AM
 */
public class Singleton6 {

    private Singleton6() {
    }

    private static class Inner {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance(){
        return Inner.INSTANCE;
    }
}
