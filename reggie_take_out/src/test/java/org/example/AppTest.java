package org.example;


import com.itheima.reggie.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Autowired
   private   CategoryService categoryService;
    @Test
    void name() {

    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
//        assertTrue( true );
        Box stringBox = new Box();
        stringBox.add("nihao");

     CategoryService aa =   categoryService;


//        Box<Integer> integerBox = new Box<>();
//
//        integerBox.add(123);
//
        System.out.printf("字符串为 :%s\n", stringBox.get());
//        System.out.printf("字符串为 :%s\n", integerBox.get());

    }

    public class  Box<M>{
        private M t;
        public void  add(M t) {
        this.t = t;
        }
        public M get(){

            return this.t;
        }

    }
}
