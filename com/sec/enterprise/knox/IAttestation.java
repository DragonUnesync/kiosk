package com.sec.enterprise.knox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IAttestation extends IInterface {

    public static abstract class Stub extends Binder implements IAttestation {
        private static final String DESCRIPTOR = "com.sec.enterprise.knox.IAttestation";
        static final int TRANSACTION_startAttestation_nonce = 1;

        public static class Proxy implements IAttestation {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void startAttestation_nonce(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAttestation asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAttestation)) {
                return new Proxy(iBinder);
            }
            return (IAttestation) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i8) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                startAttestation_nonce(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i8);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }

        public abstract /* synthetic */ void startAttestation_nonce(String str);
    }

    void startAttestation_nonce(String str);
}
