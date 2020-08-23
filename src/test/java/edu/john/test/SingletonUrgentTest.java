package edu.john.test;

import edu.john.practice.singleton.Singleton1;
import edu.john.practice.singleton.Singleton2;
import edu.john.practice.singleton.Singleton3;

/**
 * @author John
 * @date 8/24/2020 12:56 AM
 */
public class SingletonUrgentTest {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.INSTANCE;
        System.out.println("singleton1 = " + singleton1);
        Singleton2 singleton2 = Singleton2.INSTANCE;
        System.out.println("singleton2 = " + singleton2);

        Singleton3 singleton3 = Singleton3.INSTANCE;
        System.out.println(singleton3);

    }
}
