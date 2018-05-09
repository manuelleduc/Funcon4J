package bench;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BenchTool {
    public static final List<Long> timings = new ArrayList<>();
    public static final String FNC_BENCH = "fnc.bench";

    public static void setBench(boolean bench) {
        System.setProperty(FNC_BENCH, String.valueOf(bench));
    }

    public static void add(long l) {
        if (Objects.equals("true", System.getProperty(FNC_BENCH))) {
            timings.add(l);
            System.out.println(l);
        }
    }
}
