package edu.psu.ist;

// no need to extend class CountDown
// (this class won't even have fields ..
//  just exports static methods)
// so here the outermost CountDown class
// encapsulates/holds-together two static
// methods: downThenUp and bunnyEars.
public final class CountDown {

    /**
     * Given some number n, decrements n in increments of one
     * and prints the results each step, then prints the
     * increasing sequence.
     * <p>
     * For example, calling:
     * <pre><code>
     *     downThenUp(3)
     * </code></pre>
     * should print to the screen:
     * <pre><code>
     *     3
     *     2
     *     1
     *     1
     *     2
     *     3
     * </code></pre>
     * implement this implement the method and
     */
    public static void countDownThenUp(int n) {
        // todo
    }

    /**
     * We have a number of bunnies and each bunny has
     * two big floppy ears.
     * <p>
     * We want to compute the total number of ears across all bunnies
     * recursively (without loops or multiplication).
     * <p>
     * Some input output examples:
     * <pre><code>
     *    bunnyEars(0) should return: 0
     *    bunnyEars(1) should return: 2
     *    bunnyEars(2) should return: 4
     * </code></pre>
     */
    public static int bunnyEars(int n) {
        // "method stub"
        // this one is extra (not graded)
        return 0;
    }
}
