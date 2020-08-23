package edu.john.test;

import edu.john.practice.singleton.Singleton4;
import edu.john.practice.singleton.Singleton5;

import java.util.concurrent.*;

/**
 * @author John
 * @date 8/24/2020 1:47 AM
 */
public class SingletonChronicTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        singleton4();
//        singletonUnsafe4();
        singleton5();
    }
    static void singleton4(){ //单线程版chronic
        Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();

        System.out.println("s1 == s2 ? " + (s1 == s2));
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

    static void singletonUnsafe4() throws ExecutionException, InterruptedException { // 下面是线程不安全的情况
        Callable<Singleton4> c = new Callable<Singleton4>() { // 创建线程 泛型接口，call()函数返回的类型就是传递进来的V类型
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
        // 创建一个线程池
        ExecutorService espool = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = espool.submit(c);
        Future<Singleton4> f2 = espool.submit(c);

        Singleton4 s1 = f1.get();
        Singleton4 s2 = f2.get();

        System.out.println("s1 == s2 ? " + (s1 == s2));
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        espool.shutdown();
    }

    static void singleton5() throws ExecutionException, InterruptedException {// 下面是线程安全的情况（用synchronized改造）
        Callable<Singleton5> c = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };
        // 创建一个线程池
        ExecutorService espool = Executors.newFixedThreadPool(2);
        Future<Singleton5> f1 = espool.submit(c);
        Future<Singleton5> f2 = espool.submit(c);

        Singleton5 s1 = f1.get();
        Singleton5 s2 = f2.get();

        System.out.println("s1 == s2 ? " + (s1 == s2));
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        espool.shutdown();
    }
}
