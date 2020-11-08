package com.sxt.extend;

import com.sxt.domain.Man;

public class SupperMan2 {

    private Man man;

    public SupperMan2(Man man) {
        this.man = man;
    }

    public void eat(){
        begin();
        man.eat();
        end();
    }

    /**
     * 执行之前做的事
     */
    public void begin(){
        System.out.println("饭前水果");
        System.out.println("搞一杯");
    }
    /**
     * 执行之后做的事
     */
    public void end(){
        System.out.println("饭后甜点");
        System.out.println("搞一根");
    }
}
