package net.haesleinhuepf.playground.async;

import ij.IJ;
import ij.ImagePlus;
import ij.plugin.Duplicator;
import ij.plugin.ImageCalculator;
import org.scijava.ItemIO;
import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

import static net.haesleinhuepf.playground.async.Utilities.sleep;

@Plugin(type = Command.class, menuPath = "Plugins>DoG (ImageJ-legacy)")
public class ApplySigma implements
        Command {

    @Parameter
    private Double sigma;

    @Override
    public void run() {
        sleep(500);
        System.out.println("Apply sigma (1)... sigma = " + sigma);
        sleep(500);
        System.out.println("Apply sigma (2)... sigma = " + sigma);
        sleep(500);
        System.out.println("Apply sigma (3)... sigma = " + sigma);
        sleep(500);
        System.out.println("Apply sigma (4)... sigma = " + sigma);
        sleep(500);
        System.out.println("Apply sigma (5)... sigma = " + sigma);
    }
}
