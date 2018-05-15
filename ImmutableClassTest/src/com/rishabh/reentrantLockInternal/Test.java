package com.rishabh.reentrantLockInternal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
class BaseB implements BaseA{
    public void doSomething(){};
}

class BaseC implements BaseA extends BaseB{
    public void doStuff(){
        System.out.println("Do Stuff");
    }
}

public class Test {
    public static void main(String[] args) {
        BaseC c = new BaseC();
        c.doStuff();
    }
}