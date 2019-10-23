package com.company.Box;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;

        System.out.println("Volume 1 is " + myBox1.volume());

        System.out.println("Volume 2 is " + myBox2.volume());

        System.out.println(myBox1.avg(1, 2, 3, 4, 5, 6, 7, 8, 9));

        myBox1 = null;
        System.gc();
    }
}
