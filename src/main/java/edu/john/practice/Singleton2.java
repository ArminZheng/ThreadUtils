package edu.john.practice;

/**
 * 第一种：急性子式
 * （最简洁）
 * 枚举类型：表示该类型对象是有限的几个
 * 我们可以限定为一个，就成了单例
 *
 * @author John
 * @date 8/23/2020 4:44 PM
 */
public enum Singleton2 {
    INSTANCE
    //枚举类型的构造都是私有的
}

/* 等于以下
public final class Color extends Enum { // 继承自Enum，标记为final class
    // 每个实例均为全局唯一:
    public static final Color RED = new Color();
    public static final Color GREEN = new Color();
    public static final Color BLUE = new Color();
    // private构造方法，确保外部无法调用new操作符:
    private Color() {}
}*/
