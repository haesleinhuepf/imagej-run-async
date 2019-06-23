package net.haesleinhuepf.playground.async;

/**
 * Utilities
 * <p>
 * Author: @haesleinhuepf
 * June 2019
 */
public class Utilities {
    public static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
