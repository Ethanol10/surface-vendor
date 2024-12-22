package vendor.surface.touchpen.V1_0;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class DisplayTapped {
    public static final int LEFT_DISPLAY = 0;
    public static final int RIGHT_DISPLAY = 1;

    public static final String toString(int o) {
        if (o == 0) {
            return "LEFT_DISPLAY";
        }
        if (o == 1) {
            return "RIGHT_DISPLAY";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        list.add("LEFT_DISPLAY");
        if ((o & 1) == 1) {
            list.add("RIGHT_DISPLAY");
            flipped = 0 | 1;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString((~flipped) & o));
        }
        return String.join(" | ", list);
    }
}