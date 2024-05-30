import com.sun.management.HotSpotDiagnosticMXBean;

import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) {
        String bitModel = System.getProperty("sun.arch.data.model");
        System.out.println("bitModel = " + bitModel);

        HotSpotDiagnosticMXBean hotSpot
                = ManagementFactory.getPlatformMXBean(HotSpotDiagnosticMXBean.class);
        boolean isCompressedOopsEnabled = Boolean.parseBoolean(
                hotSpot.getVMOption("UseCompressedOops").getValue());
        System.out.println("isCompressedOopsEnabled = " + isCompressedOopsEnabled);
    }
}