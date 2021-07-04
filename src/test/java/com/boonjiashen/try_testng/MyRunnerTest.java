package com.boonjiashen.try_testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyRunnerTest {

    @Test
    public void noArgConstructorShouldConstruct() {
        new MyRunner();
    }

    @Test
    public void squareShouldReturn4_IfArgIs2() {
        int actualResult = new MyRunner().square(2);

        assertEquals(4, actualResult);
    }
}
