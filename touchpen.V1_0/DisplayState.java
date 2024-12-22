package vendor.surface.touchpen.V1_0;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class DisplayState {
    public static final int BOTH_DISPLAYS_ON = 2;
    public static final int LEFT_DISPLAY_ONLY = 0;
    public static final int NONE = 3;
    public static final int RIGHT_DISPLAY_ONLY = 1;

    public static final String toString(int o) {
        if (o == 0) {
            return "LEFT_DISPLAY_ONLY";
        }
        if (o == 1) {
            return "RIGHT_DISPLAY_ONLY";
        }
        if (o == 2) {
            return "BOTH_DISPLAYS_ON";
        }
        if (o == 3) {
            return "NONE";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        list.add("LEFT_DISPLAY_ONLY");
        if ((o & 1) == 1) {
            list.add("RIGHT_DISPLAY_ONLY");
            flipped = 0 | 1;
        }
        if ((o & 2) == 2) {
            list.add("BOTH_DISPLAYS_ON");
            flipped |= 2;
        }
        if ((o & 3) == 3) {
            list.add("NONE");
            flipped |= 3;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString((~flipped) & o));
        }
        return String.join(" | ", list);
    }
}