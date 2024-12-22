package vendor.surface.touchpen.V1_0;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class BluetoothAddressType {
    public static final byte PUBLIC = 0;
    public static final byte RANDOM = 1;

    public static final String toString(byte o) {
        if (o == 0) {
            return "PUBLIC";
        }
        if (o == 1) {
            return "RANDOM";
        }
        return "0x" + Integer.toHexString(Byte.toUnsignedInt(o));
    }

    public static final String dumpBitfield(byte o) {
        ArrayList<String> list = new ArrayList<>();
        byte flipped = 0;
        list.add("PUBLIC");
        if ((o & 1) == 1) {
            list.add("RANDOM");
            flipped = (byte) (0 | 1);
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(Byte.toUnsignedInt((byte) ((~flipped) & o))));
        }
        return String.join(" | ", list);
    }
}