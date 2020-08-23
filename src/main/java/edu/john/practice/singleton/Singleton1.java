package edu.john.practice.singleton;

/**
 * 第一种：急性子式（不存在线程安全问题） 1/3
 * （简洁直观）
 * 直接创建实例对象式：不管你是否需要这个对象都创建
 * 要点
 * 1.构造器私有化
 * 2.自行创建，并用静态变量保存
 * 3.向外提供这个实例（可以考虑public）
 * 4.强调这是一个单例，可以使用final修饰
 *
 *      jdk1.5之后有一个更简洁的枚举式Singleton2
 * @author John
 * @date 8/23/2020 3:19 PM
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){
    }
}
