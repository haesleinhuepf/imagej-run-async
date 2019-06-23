package net.haesleinhuepf.playground.async;

import net.imglib2.type.numeric.RealType;
import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

import static net.haesleinhuepf.playground.async.Utilities.sleep;

@Plugin(type = Command.class, menuPath = "Plugins>DoG (CLIJ)")
public class DetermineSigma<T extends RealType<T>> implements Command {

    @Parameter
    private Double sigma;

    @Override
    public void run() {
        sleep(700);
        System.out.println("Determining sigma (1)... sigma = " + sigma);
        sleep(700);
        System.out.println("Determining sigma (2)... sigma = " + sigma);
        sleep(700);
        sigma = 3.0;
        System.out.println("Determining sigma (3)... sigma = " + sigma);
    }
}
