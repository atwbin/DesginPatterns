package com.atwbin.singleton_demo;

/**
 * Author：Created by Wbin on 2018/11/2
 *
 * Description：
 */
public class VolatileTest {

    int a = 1;
    int b = 2;

    public void print() {
        System.out.print("b=" + b + "a=" + a);

    }


    public void change() {
        b = 3;
        a = b;
    }

    public static void main(String[] args) {

        final VolatileTest volatileTest = new VolatileTest();
        //执行的结果
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    volatileTest.change();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    volatileTest.print();
                }
            }).start();
        }
    }
}
