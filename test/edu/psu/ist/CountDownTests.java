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
    // methods that return void -- how are you going
    // to test printing to the screen is ok?
    //
    // so for now, you can just test the countUpThenDown method by 
    // running it in the main and printing it to the screen.

}
