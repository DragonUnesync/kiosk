package com.samsung.android.knox.net.vpn;

import N.e;
import android.app.Service;
import android.app.enterprise.CertificateInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService;
import com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService;
import java.util.List;
import org.altbeacon.beacon.service.RangedBeacon;

public class KnoxONSVpnService extends Service {
    private static final int BIND_VENDOR_APPLICATION_TIMEOUT = 5000;
    private static final String TAG = "KnoxONSVpnService";
    public static final String VENDOR_BIND_ACTION = ".BIND_SERVICE_NEW";
    private final int KNOX_VPN_STATE_FAILED = 5;
    private final int VPN_RETURN_INT_ERROR = -1;
    private Context mContext;
    private final IKnoxVpnService.Stub mIKnoxVpnService = new IKnoxVpnService.Stub() {
        public int createConnection(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.createConnection(str);
            }
            return -1;
        }

        public List<String> getAllConnections() {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.getAllConnections();
            }
            return null;
        }

        public CertificateInfo getCACertificate(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.convertToOldCertificateInfo(KnoxONSVpnService.this.mVpnInterface.getCACertificate(str));
            }
            return null;
        }

        public String getConnection(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.getConnection(str);
            }
            return null;
        }

        public String getErrorString(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.getErrorString(str);
            }
            return null;
        }

        public int getState(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.getState(str);
            }
            return 5;
        }

        public CertificateInfo getUserCertificate(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.convertToOldCertificateInfo(KnoxONSVpnService.this.mVpnInterface.getUserCertificate(str));
            }
            return null;
        }

        public int getVpnModeOfOperation(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.getVpnModeOfOperation(str);
            }
            return -1;
        }

        public int removeConnection(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.removeConnection(str);
            }
            return -1;
        }

        public boolean setAutoRetryOnConnectionError(String str, boolean z) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.setAutoRetryOnConnectionError(str, z);
            }
            return false;
        }

        public boolean setCACertificate(String str, byte[] bArr) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.setCACertificate(str, bArr);
            }
            return false;
        }

        public boolean setServerCertValidationUserAcceptanceCriteria(String str, boolean z, List list, int i) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.setServerCertValidationUserAcceptanceCriteria(str, z, list, i);
            }
            return false;
        }

        public boolean setUserCertificate(String str, byte[] bArr, String str2) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.setUserCertificate(str, bArr, str2);
            }
            return false;
        }

        public int setVpnModeOfOperation(String str, int i) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.setVpnModeOfOperation(str, i);
            }
            return -1;
        }

        public int startConnection(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.startConnection(str);
            }
            return -1;
        }

        public int stopConnection(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.stopConnection(str);
            }
            return -1;
        }
    };
    /* access modifiers changed from: private */
    public final Object mVendorLock = new Object();
    private String mVendorName;
    /* access modifiers changed from: private */
    public com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService mVpnInterface;

    public class VpnServiceConnection implements ServiceConnection {
        public VpnServiceConnection() {
        }

        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService unused = KnoxONSVpnService.this.mVpnInterface = IKnoxVpnService.Stub.asInterface(iBinder);
            String packageName = componentName.getPackageName();
            Log.d(KnoxONSVpnService.TAG, "Vendor VPN service connected: pkgName = " + packageName + "interface = " + KnoxONSVpnService.this.mVpnInterface);
            synchronized (KnoxONSVpnService.this.mVendorLock) {
                KnoxONSVpnService.this.mVendorLock.notifyAll();
            }
        }

        public synchronized void onServiceDisconnected(ComponentName componentName) {
            com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService unused = KnoxONSVpnService.this.mVpnInterface = null;
            String packageName = componentName.getPackageName();
            Log.d(KnoxONSVpnService.TAG, "Vendor VPN service disconnected : vendorName = " + packageName);
        }
    }

    private boolean bindKnoxVpnInterface() {
        if (TextUtils.isEmpty(this.mVendorName)) {
            return false;
        }
        Intent intent = new Intent();
        String A8 = e.A(new StringBuilder(), this.mVendorName, VENDOR_BIND_ACTION);
        Log.d(TAG, "Bind to Vpn Vendor Service : vendorAction = " + A8);
        VpnServiceConnection vpnServiceConnection = new VpnServiceConnection();
        intent.setAction(A8);
        List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices.size() > 0) {
            for (ResolveInfo next : queryIntentServices) {
                if (next.serviceInfo.packageName.equalsIgnoreCase(this.mVendorName)) {
                    ServiceInfo serviceInfo = next.serviceInfo;
                    intent.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
                }
            }
        }
        return this.mContext.bindService(intent, vpnServiceConnection, 1);
    }

    /* access modifiers changed from: private */
    public static CertificateInfo convertToOldCertificateInfo(com.samsung.android.knox.keystore.CertificateInfo certificateInfo) {
        if (certificateInfo == null) {
            return null;
        }
        CertificateInfo certificateInfo2 = new CertificateInfo();
        certificateInfo2.setCertificate(certificateInfo.getCertificate());
        certificateInfo2.setAlias(certificateInfo.getAlias());
        certificateInfo2.setEnabled(certificateInfo.getEnabled());
        certificateInfo2.setHasPrivateKey(certificateInfo.getHasPrivateKey());
        certificateInfo2.setKeystore(certificateInfo.getKeystore());
        certificateInfo2.setSystemPreloaded(certificateInfo.getSystemPreloaded());
        return certificateInfo2;
    }

    /* access modifiers changed from: private */
    public com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService getService() {
        if (this.mVpnInterface == null) {
            synchronized (this.mVendorLock) {
                try {
                    bindKnoxVpnInterface();
                    this.mVendorLock.wait(RangedBeacon.DEFAULT_MAX_TRACKING_AGE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return this.mVpnInterface;
    }

    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind()");
        if (intent.getComponent() != null) {
            this.mVendorName = intent.getComponent().getPackageName();
        }
        return this.mIKnoxVpnService;
    }

    public void onCreate() {
        super.onCreate();
        this.mContext = getApplicationContext();
    }
}
