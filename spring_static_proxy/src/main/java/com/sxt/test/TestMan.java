package com.sxt.test;

import com.sxt.domain.Man;
import com.sxt.extend.SupperMan;
import com.sxt.extend.SupperMan2;

public class TestMan {
    public static void main(String[] args) {

        SupperMan man = new SupperMan();
        man.eat();
        System.out.println("------------------");
        Man m = new Man();
        SupperMan2 man2 = new SupperMan2(m);
        man2.eat();
    }
}
