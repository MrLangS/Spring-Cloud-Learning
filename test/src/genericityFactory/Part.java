package genericityFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part {
    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();

    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }

    private static Random random = new Random(47);
    public static Part createRandom(){
        int n = random.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
    public String toString(){
        return getClass().getSimpleName();
    }
}
