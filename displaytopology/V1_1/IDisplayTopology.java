package vendor.surface.displaytopology.V1_1;

import android.hidl.base.V1_0.DebugInfo;
import android.hidl.base.V1_0.IBase;
import android.os.HidlSupport;
import android.os.HwBinder;
import android.os.HwBlob;
import android.os.HwParcel;
import android.os.IHwBinder;
import android.os.IHwInterface;
import android.os.NativeHandle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public interface IDisplayTopology extends vendor.surface.displaytopology.V1_0.IDisplayTopology {
    public static final String kInterfaceName = "vendor.surface.displaytopology@1.1::IDisplayTopology";

    @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
    IHwBinder asBinder();

    @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
    void debug(NativeHandle nativeHandle, ArrayList<String> arrayList) throws RemoteException;

    @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
    DebugInfo getDebugInfo() throws RemoteException;

    @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
    ArrayList<byte[]> getHashChain() throws RemoteException;

    @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
    ArrayList<String> interfaceChain() throws RemoteException;

    @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
    String interfaceDescriptor() throws RemoteException;

    @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
    boolean linkToDeath(IHwBinder.DeathRecipient deathRecipient, long j) throws RemoteException;

    @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
    void notifySyspropsChanged() throws RemoteException;

    void onRotation(int i) throws RemoteException;

    @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
    void ping() throws RemoteException;

    @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
    void setHALInstrumentation() throws RemoteException;

    @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
    boolean unlinkToDeath(IHwBinder.DeathRecipient deathRecipient) throws RemoteException;

    static IDisplayTopology asInterface(IHwBinder binder) {
        if (binder == null) {
            return null;
        }
        IHwInterface iface = binder.queryLocalInterface(kInterfaceName);
        if (iface != null && (iface instanceof IDisplayTopology)) {
            return (IDisplayTopology) iface;
        }
        IDisplayTopology proxy = new Proxy(binder);
        try {
            Iterator<String> it = proxy.interfaceChain().iterator();
            while (it.hasNext()) {
                String descriptor = it.next();
                if (descriptor.equals(kInterfaceName)) {
                    return proxy;
                }
            }
        } catch (RemoteException e) {
        }
        return null;
    }

    static IDisplayTopology castFrom(IHwInterface iface) {
        if (iface == null) {
            return null;
        }
        return asInterface(iface.asBinder());
    }

    static IDisplayTopology getService(String serviceName, boolean retry) throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, serviceName, retry));
    }

    static IDisplayTopology getService(boolean retry) throws RemoteException {
        return getService("default", retry);
    }

    @Deprecated
    static IDisplayTopology getService(String serviceName) throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, serviceName));
    }

    @Deprecated
    static IDisplayTopology getService() throws RemoteException {
        return getService("default");
    }

    public static final class RotationAngle {
        public static final int _0_DEGREES = 0;
        public static final int _180_DEGREES = 2;
        public static final int _270_DEGREES = 3;
        public static final int _90_DEGREES = 1;

        public static final String toString(int o) {
            if (o == 0) {
                return "_0_DEGREES";
            }
            if (o == 1) {
                return "_90_DEGREES";
            }
            if (o == 2) {
                return "_180_DEGREES";
            }
            if (o == 3) {
                return "_270_DEGREES";
            }
            return "0x" + Integer.toHexString(o);
        }

        public static final String dumpBitfield(int o) {
            ArrayList<String> list = new ArrayList<>();
            int flipped = 0;
            list.add("_0_DEGREES");
            if ((o & 1) == 1) {
                list.add("_90_DEGREES");
                flipped = 0 | 1;
            }
            if ((o & 2) == 2) {
                list.add("_180_DEGREES");
                flipped |= 2;
            }
            if ((o & 3) == 3) {
                list.add("_270_DEGREES");
                flipped |= 3;
            }
            if (o != flipped) {
                list.add("0x" + Integer.toHexString((~flipped) & o));
            }
            return String.join(" | ", list);
        }
    }

    public static final class Proxy implements IDisplayTopology {
        private IHwBinder mRemote;

        public Proxy(IHwBinder remote) {
            Objects.requireNonNull(remote);
            this.mRemote = remote;
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public IHwBinder asBinder() {
            return this.mRemote;
        }

        public String toString() {
            try {
                return interfaceDescriptor() + "@Proxy";
            } catch (RemoteException e) {
                return "[class or subclass of vendor.surface.displaytopology@1.1::IDisplayTopology]@Proxy";
            }
        }

        public final boolean equals(Object other) {
            return HidlSupport.interfacesEqual(this, other);
        }

        public final int hashCode() {
            return asBinder().hashCode();
        }

        @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology
        public int setComposition(int mode) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.surface.displaytopology.V1_0.IDisplayTopology.kInterfaceName);
            _hidl_request.writeInt32(mode);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(1, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_error = _hidl_reply.readInt32();
                return _hidl_out_error;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology
        public int getComposition() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.surface.displaytopology.V1_0.IDisplayTopology.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(2, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_mode = _hidl_reply.readInt32();
                return _hidl_out_mode;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology
        public int getBezelDefaultSize() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.surface.displaytopology.V1_0.IDisplayTopology.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(3, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_px = _hidl_reply.readInt32();
                return _hidl_out_px;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology
        public int getBezelSize() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.surface.displaytopology.V1_0.IDisplayTopology.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(4, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_px = _hidl_reply.readInt32();
                return _hidl_out_px;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_0.IDisplayTopology
        public int setBezelSize(int px) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(vendor.surface.displaytopology.V1_0.IDisplayTopology.kInterfaceName);
            _hidl_request.writeInt32(px);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(5, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_error = _hidl_reply.readInt32();
                return _hidl_out_error;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology
        public void onRotation(int angle) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IDisplayTopology.kInterfaceName);
            _hidl_request.writeInt32(angle);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(6, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public ArrayList<String> interfaceChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256067662, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                ArrayList<String> _hidl_out_descriptors = _hidl_reply.readStringVector();
                return _hidl_out_descriptors;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public void debug(NativeHandle fd, ArrayList<String> options) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            _hidl_request.writeNativeHandle(fd);
            _hidl_request.writeStringVector(options);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256131655, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public String interfaceDescriptor() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256136003, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                String _hidl_out_descriptor = _hidl_reply.readString();
                return _hidl_out_descriptor;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public ArrayList<byte[]> getHashChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256398152, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                ArrayList<byte[]> _hidl_out_hashchain = new ArrayList<>();
                HwBlob _hidl_blob = _hidl_reply.readBuffer(16L);
                int _hidl_vec_size = _hidl_blob.getInt32(8L);
                HwBlob childBlob = _hidl_reply.readEmbeddedBuffer(_hidl_vec_size * 32, _hidl_blob.handle(), 0L, true);
                _hidl_out_hashchain.clear();
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                    byte[] _hidl_vec_element = new byte[32];
                    long _hidl_array_offset_1 = _hidl_index_0 * 32;
                    childBlob.copyToInt8Array(_hidl_array_offset_1, _hidl_vec_element, 32);
                    _hidl_out_hashchain.add(_hidl_vec_element);
                }
                return _hidl_out_hashchain;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public void setHALInstrumentation() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256462420, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public boolean linkToDeath(IHwBinder.DeathRecipient recipient, long cookie) throws RemoteException {
            return this.mRemote.linkToDeath(recipient, cookie);
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public void ping() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256921159, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public DebugInfo getDebugInfo() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257049926, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                DebugInfo _hidl_out_info = new DebugInfo();
                _hidl_out_info.readFromParcel(_hidl_reply);
                return _hidl_out_info;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public void notifySyspropsChanged() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257120595, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public boolean unlinkToDeath(IHwBinder.DeathRecipient recipient) throws RemoteException {
            return this.mRemote.unlinkToDeath(recipient);
        }
    }

    public static abstract class Stub extends HwBinder implements IDisplayTopology {
        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public IHwBinder asBinder() {
            return this;
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public final ArrayList<String> interfaceChain() {
            return new ArrayList<>(Arrays.asList(IDisplayTopology.kInterfaceName, vendor.surface.displaytopology.V1_0.IDisplayTopology.kInterfaceName, IBase.kInterfaceName));
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public void debug(NativeHandle fd, ArrayList<String> options) {
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public final String interfaceDescriptor() {
            return IDisplayTopology.kInterfaceName;
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public final ArrayList<byte[]> getHashChain() {
            return new ArrayList<>(Arrays.asList(new byte[]{70, -54, -49, 96, 44, -105, 74, 55, -21, 58, -59, 23, Byte.MIN_VALUE, -87, -92, -85, 64, -112, -120, -39, 74, 49, -121, -11, 88, -50, 119, -18, -98, -9, 47, -2}, new byte[]{-125, -38, -93, -58, 82, -3, 9, 32, -47, -71, 11, -1, 62, 46, 69, 61, -81, -103, 79, -83, -48, 82, -99, 75, -43, -28, -30, -94, -127, 70, -38, 0}, new byte[]{-20, Byte.MAX_VALUE, -41, -98, -48, 45, -6, -123, -68, 73, -108, 38, -83, -82, 62, -66, 35, -17, 5, 36, -13, -51, 105, 87, 19, -109, 36, -72, 59, 24, -54, 76}));
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public final void setHALInstrumentation() {
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public final boolean linkToDeath(IHwBinder.DeathRecipient recipient, long cookie) {
            return true;
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public final void ping() {
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public final DebugInfo getDebugInfo() {
            DebugInfo info = new DebugInfo();
            info.pid = HidlSupport.getPidIfSharable();
            info.ptr = 0L;
            info.arch = 0;
            return info;
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public final void notifySyspropsChanged() {
            HwBinder.enableInstrumentation();
        }

        @Override // vendor.surface.displaytopology.V1_1.IDisplayTopology, vendor.surface.displaytopology.V1_0.IDisplayTopology, android.hidl.base.V1_0.IBase
        public final boolean unlinkToDeath(IHwBinder.DeathRecipient recipient) {
            return true;
        }

        public IHwInterface queryLocalInterface(String descriptor) {
            if (IDisplayTopology.kInterfaceName.equals(descriptor)) {
                return this;
            }
            return null;
        }

        public void registerAsService(String serviceName) throws RemoteException {
            registerService(serviceName);
        }

        public String toString() {
            return interfaceDescriptor() + "@Stub";
        }

        public void onTransact(int _hidl_code, HwParcel _hidl_request, HwParcel _hidl_reply, int _hidl_flags) throws RemoteException {
            switch (_hidl_code) {
                case 1:
                    _hidl_request.enforceInterface(vendor.surface.displaytopology.V1_0.IDisplayTopology.kInterfaceName);
                    int mode = _hidl_request.readInt32();
                    int _hidl_out_error = setComposition(mode);
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_error);
                    _hidl_reply.send();
                    return;
                case 2:
                    _hidl_request.enforceInterface(vendor.surface.displaytopology.V1_0.IDisplayTopology.kInterfaceName);
                    int _hidl_out_mode = getComposition();
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_mode);
                    _hidl_reply.send();
                    return;
                case 3:
                    _hidl_request.enforceInterface(vendor.surface.displaytopology.V1_0.IDisplayTopology.kInterfaceName);
                    int _hidl_out_px = getBezelDefaultSize();
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_px);
                    _hidl_reply.send();
                    return;
                case 4:
                    _hidl_request.enforceInterface(vendor.surface.displaytopology.V1_0.IDisplayTopology.kInterfaceName);
                    int _hidl_out_px2 = getBezelSize();
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_px2);
                    _hidl_reply.send();
                    return;
                case 5:
                    _hidl_request.enforceInterface(vendor.surface.displaytopology.V1_0.IDisplayTopology.kInterfaceName);
                    int px = _hidl_request.readInt32();
                    int _hidl_out_error2 = setBezelSize(px);
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_error2);
                    _hidl_reply.send();
                    return;
                case 6:
                    _hidl_request.enforceInterface(IDisplayTopology.kInterfaceName);
                    int angle = _hidl_request.readInt32();
                    onRotation(angle);
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.send();
                    return;
                case 256067662:
                    _hidl_request.enforceInterface(IBase.kInterfaceName);
                    ArrayList<String> _hidl_out_descriptors = interfaceChain();
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeStringVector(_hidl_out_descriptors);
                    _hidl_reply.send();
                    return;
                case 256131655:
                    _hidl_request.enforceInterface(IBase.kInterfaceName);
                    NativeHandle fd = _hidl_request.readNativeHandle();
                    ArrayList<String> options = _hidl_request.readStringVector();
                    debug(fd, options);
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.send();
                    return;
                case 256136003:
                    _hidl_request.enforceInterface(IBase.kInterfaceName);
                    String _hidl_out_descriptor = interfaceDescriptor();
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeString(_hidl_out_descriptor);
                    _hidl_reply.send();
                    return;
                case 256398152:
                    _hidl_request.enforceInterface(IBase.kInterfaceName);
                    ArrayList<byte[]> _hidl_out_hashchain = getHashChain();
                    _hidl_reply.writeStatus(0);
                    HwBlob _hidl_blob = new HwBlob(16);
                    int _hidl_vec_size = _hidl_out_hashchain.size();
                    _hidl_blob.putInt32(8L, _hidl_vec_size);
                    _hidl_blob.putBool(12L, false);
                    HwBlob childBlob = new HwBlob(_hidl_vec_size * 32);
                    for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                        long _hidl_array_offset_1 = _hidl_index_0 * 32;
                        byte[] _hidl_array_item_1 = _hidl_out_hashchain.get(_hidl_index_0);
                        if (_hidl_array_item_1 == null || _hidl_array_item_1.length != 32) {
                            throw new IllegalArgumentException("Array element is not of the expected length");
                        }
                        childBlob.putInt8Array(_hidl_array_offset_1, _hidl_array_item_1);
                    }
                    _hidl_blob.putBlob(0L, childBlob);
                    _hidl_reply.writeBuffer(_hidl_blob);
                    _hidl_reply.send();
                    return;
                case 256462420:
                    _hidl_request.enforceInterface(IBase.kInterfaceName);
                    setHALInstrumentation();
                    return;
                case 256660548:
                default:
                    return;
                case 256921159:
                    _hidl_request.enforceInterface(IBase.kInterfaceName);
                    ping();
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.send();
                    return;
                case 257049926:
                    _hidl_request.enforceInterface(IBase.kInterfaceName);
                    DebugInfo _hidl_out_info = getDebugInfo();
                    _hidl_reply.writeStatus(0);
                    _hidl_out_info.writeToParcel(_hidl_reply);
                    _hidl_reply.send();
                    return;
                case 257120595:
                    _hidl_request.enforceInterface(IBase.kInterfaceName);
                    notifySyspropsChanged();
                    return;
            }
        }
    }
}