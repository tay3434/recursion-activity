package edu.psu.ist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CountDownTests {

    @Test public void testBunnyEars01() {
        int computedEarCount = CountDown.bunnyEars(2);
        Assertions.assertEquals(4, computedEarCount);
    }

    // NOTE on testing countDownThenUp:
    // it's a little trickier to write jUnit tests for
    // methods that return void -- so just print the 
    // answer to screen in a main to test this one

}
