package net.haesleinhuepf.playground.async;

import net.imagej.ImageJ;
import net.imagej.patcher.LegacyInjector;

public class Main {


    static {
        LegacyInjector.preinit();
    }

    public static void main(final String... args) throws Exception {
        new ij.ImageJ();

        // Run ImageJ
        final ImageJ ij = new ImageJ();
        ij.ui().showUI();

        Double sigma = 0.0;

        ij.command().run(DetermineSigma.class, true, new Object[]{"sigma", sigma});
        ij.command().run(ApplySigma.class, true, new Object[]{"sigma", sigma});

    }
}
