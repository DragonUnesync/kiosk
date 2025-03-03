package com.samsung.android.knox.net.vpn.serviceprovider;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.samsung.android.knox.keystore.CertificateInfo;
import java.util.List;

public interface IKnoxVpnService extends IInterface {

    public static abstract class Stub extends Binder implements IKnoxVpnService {
        private static final String DESCRIPTOR = "com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService";
        static final int TRANSACTION_createConnection = 1;
        static final int TRANSACTION_getAllConnections = 3;
        static final int TRANSACTION_getCACertificate = 8;
        static final int TRANSACTION_getConnection = 4;
        static final int TRANSACTION_getErrorString = 12;
        static final int TRANSACTION_getState = 11;
        static final int TRANSACTION_getUserCertificate = 7;
        static final int TRANSACTION_getVpnModeOfOperation = 14;
        static final int TRANSACTION_removeConnection = 2;
        static final int TRANSACTION_setAutoRetryOnConnectionError = 16;
        static final int TRANSACTION_setCACertificate = 6;
        static final int TRANSACTION_setServerCertValidationUserAcceptanceCriteria = 15;
        static final int TRANSACTION_setUserCertificate = 5;
        static final int TRANSACTION_setVpnModeOfOperation = 13;
        static final int TRANSACTION_startConnection = 9;
        static final int TRANSACTION_stopConnection = 10;

        public static class Proxy implements IKnoxVpnService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public int createConnection(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public List<String> getAllConnections() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public CertificateInfo getCACertificate(String str) {
                CertificateInfo certificateInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        certificateInfo = CertificateInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        certificateInfo = null;
                    }
                    return certificateInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getConnection(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getErrorString(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public int getState(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public CertificateInfo getUserCertificate(String str) {
                CertificateInfo certificateInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        certificateInfo = CertificateInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        certificateInfo = null;
                    }
                    return certificateInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getVpnModeOfOperation(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int removeConnection(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean setAutoRetryOnConnectionError(String str, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z6 = true;
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z6 = false;
                    }
                    return z6;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean setCACertificate(String str, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    boolean z = false;
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean setServerCertValidationUserAcceptanceCriteria(String str, boolean z, List list, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z6 = true;
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeList(list);
                    obtain.writeInt(i);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z6 = false;
                    }
                    return z6;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean setUserCertificate(String str, byte[] bArr, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int setVpnModeOfOperation(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int startConnection(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int stopConnection(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IKnoxVpnService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IKnoxVpnService)) {
                return new Proxy(iBinder);
            }
            return (IKnoxVpnService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i8) {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        int createConnection = createConnection(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(createConnection);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        int removeConnection = removeConnection(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(removeConnection);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<String> allConnections = getAllConnections();
                        parcel2.writeNoException();
                        parcel2.writeStringList(allConnections);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        String connection = getConnection(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(connection);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean userCertificate = setUserCertificate(parcel.readString(), parcel.createByteArray(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(userCertificate ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean cACertificate = setCACertificate(parcel.readString(), parcel.createByteArray());
                        parcel2.writeNoException();
                        parcel2.writeInt(cACertificate ? 1 : 0);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        CertificateInfo userCertificate2 = getUserCertificate(parcel.readString());
                        parcel2.writeNoException();
                        if (userCertificate2 != null) {
                            parcel2.writeInt(1);
                            userCertificate2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        CertificateInfo cACertificate2 = getCACertificate(parcel.readString());
                        parcel2.writeNoException();
                        if (cACertificate2 != null) {
                            parcel2.writeInt(1);
                            cACertificate2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        int startConnection = startConnection(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(startConnection);
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        int stopConnection = stopConnection(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(stopConnection);
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        int state = getState(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(state);
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        String errorString = getErrorString(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(errorString);
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        int vpnModeOfOperation = setVpnModeOfOperation(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(vpnModeOfOperation);
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        int vpnModeOfOperation2 = getVpnModeOfOperation(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(vpnModeOfOperation2);
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        boolean serverCertValidationUserAcceptanceCriteria = setServerCertValidationUserAcceptanceCriteria(readString, z, parcel.readArrayList(getClass().getClassLoader()), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(serverCertValidationUserAcceptanceCriteria ? 1 : 0);
                        return true;
                    case 16:
                        parcel.enforceInterface(DESCRIPTOR);
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        boolean autoRetryOnConnectionError = setAutoRetryOnConnectionError(readString2, z);
                        parcel2.writeNoException();
                        parcel2.writeInt(autoRetryOnConnectionError ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i8);
                }
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    int createConnection(String str);

    List<String> getAllConnections();

    CertificateInfo getCACertificate(String str);

    String getConnection(String str);

    String getErrorString(String str);

    int getState(String str);

    CertificateInfo getUserCertificate(String str);

    int getVpnModeOfOperation(String str);

    int removeConnection(String str);

    boolean setAutoRetryOnConnectionError(String str, boolean z);

    boolean setCACertificate(String str, byte[] bArr);

    boolean setServerCertValidationUserAcceptanceCriteria(String str, boolean z, List list, int i);

    boolean setUserCertificate(String str, byte[] bArr, String str2);

    int setVpnModeOfOperation(String str, int i);

    int startConnection(String str);

    int stopConnection(String str);
}
