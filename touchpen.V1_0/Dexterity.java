package vendor.surface.touchpen.V1_0;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Dexterity {
    public static final int USER_LEFT_HANDED = 0;
    public static final int USER_RIGHT_HANDED = 1;

    public static final String toString(int o) {
        if (o == 0) {
            return "USER_LEFT_HANDED";
        }
        if (o == 1) {
            return "USER_RIGHT_HANDED";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        list.add("USER_LEFT_HANDED");
        if ((o & 1) == 1) {
            list.add("USER_RIGHT_HANDED");
            flipped = 0 | 1;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString((~flipped) & o));
        }
        return String.join(" | ", list);
    }
}