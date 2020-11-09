package com.sxt.extend;

import com.sxt.domain.Man;

public class SupperMan extends Man {
    @Override
    public void eat(){
        begin();
        super.eat();
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
