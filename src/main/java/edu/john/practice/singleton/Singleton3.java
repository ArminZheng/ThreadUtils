package edu.john.practice.singleton;

import java.io.IOException;
import java.util.Properties;

/**
 * 第一种：急性子式 3/3
 *
 * 静态代码块：也是在类加载和初始化的时候，被创建
 * 适合复杂实例化的情况
 *
 * 线程安全：因为java的类加载器机制，设计的就是可以避免线程安全问题
 *
 * @author John
 * @date 8/24/2020 12:58 AM
 */
public class Singleton3 {
    public static final Singleton3 INSTANCE;
    private String info;

    static {
        try {
            Properties pro = new Properties();
            pro.load(Singleton3.class.getClassLoader().getResourceAsStream("Singleton.properties"));
            INSTANCE = new Singleton3(pro.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Singleton3(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "info='" + info + '\'' +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
