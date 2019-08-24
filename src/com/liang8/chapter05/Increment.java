package com.liang8.chapter05;

/**
 * Note that this code in its documented state will not actually increment anything as it's a void method
 */
public class Increment {
    public static void main(String[] args)
    {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("after the call, x is " + x);
    }
    
    public static void increment(int n)
    {
        n++;
        System.out.println("n inside the method is " + n);
    }
}
