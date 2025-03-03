package com.samsung.android.knox;

import android.app.Application;
import android.app.enterprise.FirewallPolicy;
import android.app.enterprise.MiscPolicy;
import android.app.enterprise.SecurityPolicy;
import android.app.enterprise.devicesettings.DeviceSettingsPolicy;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import com.samsung.android.knox.accounts.DeviceAccountPolicy;
import com.samsung.android.knox.accounts.EmailAccountPolicy;
import com.samsung.android.knox.accounts.EmailPolicy;
import com.samsung.android.knox.accounts.ExchangeAccountPolicy;
import com.samsung.android.knox.accounts.LDAPAccountPolicy;
import com.samsung.android.knox.application.ApplicationPolicy;
import com.samsung.android.knox.bluetooth.BluetoothPolicy;
import com.samsung.android.knox.bluetooth.BluetoothSecureModePolicy;
import com.samsung.android.knox.browser.BrowserPolicy;
import com.samsung.android.knox.container.BasePasswordPolicy;
import com.samsung.android.knox.datetime.DateTimePolicy;
import com.samsung.android.knox.deviceinfo.DeviceInventory;
import com.samsung.android.knox.devicesecurity.DeviceSecurityPolicy;
import com.samsung.android.knox.devicesecurity.PasswordPolicy;
import com.samsung.android.knox.display.Font;
import com.samsung.android.knox.keystore.CertificateProvisioning;
import com.samsung.android.knox.kiosk.KioskMode;
import com.samsung.android.knox.license.EnterpriseLicenseManager;
import com.samsung.android.knox.location.Geofencing;
import com.samsung.android.knox.location.LocationPolicy;
import com.samsung.android.knox.lockscreen.BootBanner;
import com.samsung.android.knox.lockscreen.LockscreenOverlay;
import com.samsung.android.knox.multiuser.MultiUserManager;
import com.samsung.android.knox.net.GlobalProxy;
import com.samsung.android.knox.net.apn.ApnSettingsPolicy;
import com.samsung.android.knox.net.firewall.Firewall;
import com.samsung.android.knox.net.vpn.VpnPolicy;
import com.samsung.android.knox.net.wifi.WifiPolicy;
import com.samsung.android.knox.nfc.NfcPolicy;
import com.samsung.android.knox.remotecontrol.RemoteInjection;
import com.samsung.android.knox.restriction.PhoneRestrictionPolicy;
import com.samsung.android.knox.restriction.RestrictionPolicy;
import com.samsung.android.knox.restriction.RoamingPolicy;
import com.samsung.android.knox.restriction.SPDControlPolicy;
import com.sec.enterprise.knox.AdvancedRestrictionPolicy;
import com.sec.enterprise.knox.EnterpriseKnoxManager;

public class EnterpriseDeviceManager {
    private static final int API_LEVEL_NOT_DEFINED = 0;
    private static final boolean DEBUG = true;
    private static final int KNOX_1_0 = 6;
    private static final int KNOX_1_0_1 = 7;
    private static final int KNOX_1_0_2 = 8;
    private static final int KNOX_1_1 = 9;
    private static final int KNOX_1_2 = 10;
    public static final int KNOX_2_0 = 11;
    public static final int KNOX_2_1 = 12;
    public static final int KNOX_2_2 = 13;
    public static final int KNOX_2_3 = 14;
    public static final int KNOX_2_4 = 15;
    public static final int KNOX_2_4_1 = 16;
    public static final int KNOX_2_5 = 17;
    public static final int KNOX_2_5_1 = 18;
    public static final int KNOX_2_6 = 19;
    public static final int KNOX_2_7 = 20;
    public static final int KNOX_NOT_SUPPORTED = -1;
    private static final int MDM_2_0 = 2;
    private static final int MDM_2_1 = 3;
    private static final int MDM_2_2 = 4;
    private static final int MDM_3_0 = 5;
    private static final String TAG = "EnterpriseDeviceManager-SupportLib";
    private static int mAPILevel;
    private static Context mContext;
    private static android.app.enterprise.EnterpriseDeviceManager mEdm;
    private static EnterpriseDeviceManager mInstance;
    private volatile ApnSettingsPolicy mApnSettingsPolicy;
    private volatile ApplicationPolicy mApplicationPolicy;
    private volatile BasePasswordPolicy mBasePasswordPolicy;
    private volatile BluetoothPolicy mBluetoothPolicy;
    private volatile BluetoothSecureModePolicy mBluetoothSecureModePolicy;
    private volatile BootBanner mBootBanner;
    private volatile BrowserPolicy mBrowserPolicy;
    private volatile CertificateProvisioning mCertificateProvisioning;
    private volatile DateTimePolicy mDateTimePolicy;
    private volatile DeviceAccountPolicy mDeviceAccountPolicy;
    private volatile DeviceInventory mDeviceInventory;
    private volatile DeviceSecurityPolicy mDeviceSecurityPolicy;
    private volatile EmailAccountPolicy mEmailAccountPolicy;
    private volatile EmailPolicy mEmailPolicy;
    private volatile EnterpriseLicenseManager mEnterpriseLicenseManager;
    private volatile ExchangeAccountPolicy mExchangeAccountPolicy;
    private volatile Firewall mFirewall;
    private volatile Font mFont;
    private volatile Geofencing mGeofencing;
    private volatile GlobalProxy mGlobalProxy;
    private volatile KioskMode mKioskMode;
    private volatile LDAPAccountPolicy mLDAPAccountPolicy;
    private volatile LocationPolicy mLocationPolicy;
    private volatile LockscreenOverlay mLockscreenOverlay;
    private volatile MultiUserManager mMultiUserManager;
    private volatile NfcPolicy mNfcPolicy;
    private volatile PasswordPolicy mPasswordPolicy;
    private volatile PhoneRestrictionPolicy mPhoneRestrictionPolicy;
    private volatile RemoteInjection mRemoteInjection;
    private volatile RestrictionPolicy mRestrictionPolicy;
    private volatile RoamingPolicy mRoamingPolicy;
    private volatile SPDControlPolicy mSPDControlPolicy;
    private volatile VpnPolicy mVpnPolicy;
    private volatile WifiPolicy mWifiPolicy;

    /* renamed from: com.samsung.android.knox.EnterpriseDeviceManager$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion;
        static final /* synthetic */ int[] $SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion;

        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|(3:49|50|52)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|(3:49|50|52)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|49|50|52) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f1 */
        static {
            /*
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion[] r0 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion = r0
                r1 = 1
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r2 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_2     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x001d }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r3 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_2_1     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r4 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_2_2     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_3     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x003e }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_4     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_4_0_1     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_4_1     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x0060 }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x006c }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_1     // Catch:{ NoSuchFieldError -> 0x006c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r6 = 9
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_2     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6 = 10
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x0084 }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_3     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r6 = 11
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x0090 }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_4     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r6 = 12
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x009c }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_4_1     // Catch:{ NoSuchFieldError -> 0x009c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r6 = 13
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x00a8 }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_5     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r6 = 14
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x00b4 }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_5_1     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r6 = 15
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x00c0 }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_6     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r6 = 16
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r4 = $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion     // Catch:{ NoSuchFieldError -> 0x00cc }
                android.app.enterprise.EnterpriseDeviceManager$EnterpriseSdkVersion r5 = android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_7     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r6 = 17
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                com.sec.enterprise.knox.EnterpriseKnoxManager$EnterpriseKnoxSdkVersion[] r4 = com.sec.enterprise.knox.EnterpriseKnoxManager.EnterpriseKnoxSdkVersion.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion = r4
                com.sec.enterprise.knox.EnterpriseKnoxManager$EnterpriseKnoxSdkVersion r5 = com.sec.enterprise.knox.EnterpriseKnoxManager.EnterpriseKnoxSdkVersion.KNOX_ENTERPRISE_SDK_VERSION_1_0_1     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r1 = $SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion     // Catch:{ NoSuchFieldError -> 0x00e7 }
                com.sec.enterprise.knox.EnterpriseKnoxManager$EnterpriseKnoxSdkVersion r4 = com.sec.enterprise.knox.EnterpriseKnoxManager.EnterpriseKnoxSdkVersion.KNOX_ENTERPRISE_SDK_VERSION_1_0_2     // Catch:{ NoSuchFieldError -> 0x00e7 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00e7 }
            L_0x00e7:
                int[] r0 = $SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion     // Catch:{ NoSuchFieldError -> 0x00f1 }
                com.sec.enterprise.knox.EnterpriseKnoxManager$EnterpriseKnoxSdkVersion r1 = com.sec.enterprise.knox.EnterpriseKnoxManager.EnterpriseKnoxSdkVersion.KNOX_ENTERPRISE_SDK_VERSION_1_1_0     // Catch:{ NoSuchFieldError -> 0x00f1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f1 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f1 }
            L_0x00f1:
                int[] r0 = $SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion     // Catch:{ NoSuchFieldError -> 0x00fb }
                com.sec.enterprise.knox.EnterpriseKnoxManager$EnterpriseKnoxSdkVersion r1 = com.sec.enterprise.knox.EnterpriseKnoxManager.EnterpriseKnoxSdkVersion.KNOX_ENTERPRISE_SDK_VERSION_1_2_0     // Catch:{ NoSuchFieldError -> 0x00fb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fb }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00fb }
            L_0x00fb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.EnterpriseDeviceManager.AnonymousClass1.<clinit>():void");
        }
    }

    private EnterpriseDeviceManager(android.app.enterprise.EnterpriseDeviceManager enterpriseDeviceManager) {
        mEdm = enterpriseDeviceManager;
    }

    public static int getAPILevel() {
        int i = mAPILevel;
        if (i != 0) {
            return i;
        }
        try {
            android.app.enterprise.EnterpriseDeviceManager enterpriseDeviceManager = mEdm;
            if (enterpriseDeviceManager == null) {
                Context contextFromCurrentApplication = getContextFromCurrentApplication();
                if (contextFromCurrentApplication != null) {
                    enterpriseDeviceManager = (android.app.enterprise.EnterpriseDeviceManager) contextFromCurrentApplication.getSystemService("enterprise_policy");
                } else {
                    enterpriseDeviceManager = null;
                }
            }
            if (enterpriseDeviceManager != null) {
                switch (AnonymousClass1.$SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[enterpriseDeviceManager.getEnterpriseSdkVer().ordinal()]) {
                    case 1:
                        mAPILevel = 2;
                        break;
                    case 2:
                        mAPILevel = 3;
                        break;
                    case 3:
                        mAPILevel = 4;
                        break;
                    case 4:
                        mAPILevel = 5;
                        break;
                    case 5:
                        mAPILevel = 6;
                        break;
                    case 6:
                        EnterpriseKnoxManager instance = EnterpriseKnoxManager.getInstance();
                        if (instance != null) {
                            int i8 = AnonymousClass1.$SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion[instance.getVersion().ordinal()];
                            if (i8 != 1) {
                                if (i8 == 2) {
                                    mAPILevel = 8;
                                    break;
                                } else {
                                    mAPILevel = 7;
                                    break;
                                }
                            } else {
                                mAPILevel = 7;
                                break;
                            }
                        }
                        break;
                    case 7:
                        EnterpriseKnoxManager instance2 = EnterpriseKnoxManager.getInstance();
                        if (instance2 != null) {
                            int i9 = AnonymousClass1.$SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion[instance2.getVersion().ordinal()];
                            if (i9 != 3) {
                                if (i9 == 4) {
                                    mAPILevel = 10;
                                    break;
                                } else {
                                    mAPILevel = 9;
                                    break;
                                }
                            } else {
                                mAPILevel = 9;
                                break;
                            }
                        }
                        break;
                    case 8:
                        mAPILevel = 11;
                        break;
                    case 9:
                        mAPILevel = 12;
                        break;
                    case 10:
                        mAPILevel = 13;
                        break;
                    case 11:
                        mAPILevel = 14;
                        break;
                    case 12:
                        mAPILevel = 15;
                        break;
                    case 13:
                        mAPILevel = 16;
                        break;
                    case KNOX_2_3 /*14*/:
                        mAPILevel = 17;
                        break;
                    case KNOX_2_4 /*15*/:
                        mAPILevel = 18;
                        break;
                    case KNOX_2_4_1 /*16*/:
                        mAPILevel = 19;
                        break;
                    case KNOX_2_5 /*17*/:
                        mAPILevel = 20;
                        break;
                }
            }
            return mAPILevel;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return -1;
        }
    }

    private static Context getContextFromCurrentApplication() {
        try {
            return ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", (Class[]) null).invoke((Object) null, (Object[]) null)).getApplicationContext();
        } catch (Exception unused) {
            Log.w(TAG, "Could not call ActivityThread.currentApplication()");
            return null;
        }
    }

    public static EnterpriseDeviceManager getInstance(Context context) {
        EnterpriseDeviceManager enterpriseDeviceManager;
        android.app.enterprise.EnterpriseDeviceManager enterpriseDeviceManager2;
        if (context == null) {
            return null;
        }
        EnterpriseDeviceManager enterpriseDeviceManager3 = mInstance;
        if (enterpriseDeviceManager3 != null) {
            return enterpriseDeviceManager3;
        }
        try {
            synchronized (EnterpriseDeviceManager.class) {
                enterpriseDeviceManager = mInstance;
                if (enterpriseDeviceManager == null && (enterpriseDeviceManager2 = (android.app.enterprise.EnterpriseDeviceManager) context.getSystemService("enterprise_policy")) != null) {
                    enterpriseDeviceManager = new EnterpriseDeviceManager(enterpriseDeviceManager2);
                    mInstance = enterpriseDeviceManager;
                    mContext = context;
                }
            }
            return enterpriseDeviceManager;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean getAdminRemovable(String str) {
        return mEdm.getAdminRemovable(str);
    }

    public ApnSettingsPolicy getApnSettingsPolicy() {
        android.app.enterprise.ApnSettingsPolicy apnSettingsPolicy;
        ApnSettingsPolicy apnSettingsPolicy2 = this.mApnSettingsPolicy;
        if (apnSettingsPolicy2 == null) {
            synchronized (this) {
                try {
                    apnSettingsPolicy2 = this.mApnSettingsPolicy;
                    if (apnSettingsPolicy2 == null && (apnSettingsPolicy = mEdm.getApnSettingsPolicy()) != null) {
                        apnSettingsPolicy2 = new ApnSettingsPolicy(apnSettingsPolicy);
                        this.mApnSettingsPolicy = apnSettingsPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return apnSettingsPolicy2;
    }

    public ApplicationPolicy getApplicationPolicy() {
        ApplicationPolicy applicationPolicy = this.mApplicationPolicy;
        EnterpriseKnoxManager instance = EnterpriseKnoxManager.getInstance();
        if (applicationPolicy == null) {
            synchronized (this) {
                try {
                    applicationPolicy = this.mApplicationPolicy;
                    if (applicationPolicy == null) {
                        android.app.enterprise.ApplicationPolicy applicationPolicy2 = mEdm.getApplicationPolicy();
                        if (getAPILevel() >= 11) {
                            AdvancedRestrictionPolicy advancedRestrictionPolicy = instance.getAdvancedRestrictionPolicy(mContext);
                            if (!(applicationPolicy2 == null || advancedRestrictionPolicy == null)) {
                                applicationPolicy = new ApplicationPolicy(applicationPolicy2, advancedRestrictionPolicy);
                                this.mApplicationPolicy = applicationPolicy;
                            }
                        } else if (applicationPolicy2 != null) {
                            applicationPolicy = new ApplicationPolicy(applicationPolicy2, (AdvancedRestrictionPolicy) null);
                            this.mApplicationPolicy = applicationPolicy;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return applicationPolicy;
    }

    public BluetoothPolicy getBluetoothPolicy() {
        BluetoothPolicy bluetoothPolicy = this.mBluetoothPolicy;
        if (bluetoothPolicy == null) {
            synchronized (this) {
                try {
                    bluetoothPolicy = this.mBluetoothPolicy;
                    if (bluetoothPolicy == null) {
                        android.app.enterprise.BluetoothPolicy bluetoothPolicy2 = mEdm.getBluetoothPolicy();
                        android.app.enterprise.RestrictionPolicy restrictionPolicy = mEdm.getRestrictionPolicy();
                        if (!(bluetoothPolicy2 == null || restrictionPolicy == null)) {
                            bluetoothPolicy = new BluetoothPolicy(bluetoothPolicy2, restrictionPolicy);
                            this.mBluetoothPolicy = bluetoothPolicy;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bluetoothPolicy;
    }

    public BluetoothSecureModePolicy getBluetoothSecureModePolicy() {
        android.app.enterprise.BluetoothSecureModePolicy bluetoothSecureModePolicy;
        BluetoothSecureModePolicy bluetoothSecureModePolicy2 = this.mBluetoothSecureModePolicy;
        if (bluetoothSecureModePolicy2 == null) {
            synchronized (this) {
                try {
                    bluetoothSecureModePolicy2 = this.mBluetoothSecureModePolicy;
                    if (bluetoothSecureModePolicy2 == null && (bluetoothSecureModePolicy = mEdm.getBluetoothSecureModePolicy()) != null) {
                        bluetoothSecureModePolicy2 = new BluetoothSecureModePolicy(bluetoothSecureModePolicy);
                        this.mBluetoothSecureModePolicy = bluetoothSecureModePolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bluetoothSecureModePolicy2;
    }

    public BootBanner getBootBanner() {
        SecurityPolicy securityPolicy;
        BootBanner bootBanner = this.mBootBanner;
        if (bootBanner == null) {
            synchronized (this) {
                try {
                    bootBanner = this.mBootBanner;
                    if (bootBanner == null && (securityPolicy = mEdm.getSecurityPolicy()) != null) {
                        bootBanner = new BootBanner(securityPolicy);
                        this.mBootBanner = bootBanner;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bootBanner;
    }

    public BrowserPolicy getBrowserPolicy() {
        BrowserPolicy browserPolicy = this.mBrowserPolicy;
        if (browserPolicy == null) {
            synchronized (this) {
                try {
                    browserPolicy = this.mBrowserPolicy;
                    if (browserPolicy == null) {
                        android.app.enterprise.BrowserPolicy browserPolicy2 = mEdm.getBrowserPolicy();
                        MiscPolicy miscPolicy = mEdm.getMiscPolicy();
                        if (!(browserPolicy2 == null || miscPolicy == null)) {
                            browserPolicy = new BrowserPolicy(browserPolicy2, miscPolicy);
                            this.mBrowserPolicy = browserPolicy;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return browserPolicy;
    }

    public CertificateProvisioning getCertificateProvisioning() {
        SecurityPolicy securityPolicy;
        CertificateProvisioning certificateProvisioning = this.mCertificateProvisioning;
        if (certificateProvisioning == null) {
            synchronized (this) {
                try {
                    certificateProvisioning = this.mCertificateProvisioning;
                    if (certificateProvisioning == null && (securityPolicy = mEdm.getSecurityPolicy()) != null) {
                        certificateProvisioning = new CertificateProvisioning(securityPolicy);
                        this.mCertificateProvisioning = certificateProvisioning;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return certificateProvisioning;
    }

    public DateTimePolicy getDateTimePolicy() {
        android.app.enterprise.DateTimePolicy dateTimePolicy;
        DateTimePolicy dateTimePolicy2 = this.mDateTimePolicy;
        if (dateTimePolicy2 == null) {
            synchronized (this) {
                try {
                    dateTimePolicy2 = this.mDateTimePolicy;
                    if (dateTimePolicy2 == null && (dateTimePolicy = mEdm.getDateTimePolicy()) != null) {
                        dateTimePolicy2 = new DateTimePolicy(mContext, dateTimePolicy);
                        this.mDateTimePolicy = dateTimePolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return dateTimePolicy2;
    }

    public DeviceAccountPolicy getDeviceAccountPolicy() {
        DeviceAccountPolicy deviceAccountPolicy = this.mDeviceAccountPolicy;
        if (deviceAccountPolicy == null) {
            synchronized (this) {
                try {
                    deviceAccountPolicy = this.mDeviceAccountPolicy;
                    if (deviceAccountPolicy == null) {
                        android.app.enterprise.DeviceAccountPolicy deviceAccountPolicy2 = mEdm.getDeviceAccountPolicy();
                        SecurityPolicy securityPolicy = mEdm.getSecurityPolicy();
                        if (!(deviceAccountPolicy2 == null || securityPolicy == null)) {
                            deviceAccountPolicy = new DeviceAccountPolicy(deviceAccountPolicy2, securityPolicy);
                            this.mDeviceAccountPolicy = deviceAccountPolicy;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return deviceAccountPolicy;
    }

    public DeviceInventory getDeviceInventory() {
        DeviceInventory deviceInventory = this.mDeviceInventory;
        if (deviceInventory == null) {
            synchronized (this) {
                try {
                    deviceInventory = this.mDeviceInventory;
                    if (deviceInventory == null) {
                        android.app.enterprise.DeviceInventory deviceInventory2 = mEdm.getDeviceInventory();
                        MiscPolicy miscPolicy = mEdm.getMiscPolicy();
                        if (!(deviceInventory2 == null || miscPolicy == null)) {
                            deviceInventory = new DeviceInventory(deviceInventory2, miscPolicy);
                            this.mDeviceInventory = deviceInventory;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return deviceInventory;
    }

    public DeviceSecurityPolicy getDeviceSecurityPolicy() {
        DeviceSecurityPolicy deviceSecurityPolicy = this.mDeviceSecurityPolicy;
        if (deviceSecurityPolicy == null) {
            synchronized (this) {
                try {
                    deviceSecurityPolicy = this.mDeviceSecurityPolicy;
                    if (deviceSecurityPolicy == null) {
                        MiscPolicy miscPolicy = mEdm.getMiscPolicy();
                        SecurityPolicy securityPolicy = mEdm.getSecurityPolicy();
                        if (!(miscPolicy == null || securityPolicy == null)) {
                            deviceSecurityPolicy = new DeviceSecurityPolicy(miscPolicy, securityPolicy);
                            this.mDeviceSecurityPolicy = deviceSecurityPolicy;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return deviceSecurityPolicy;
    }

    public EmailAccountPolicy getEmailAccountPolicy() {
        android.app.enterprise.EmailAccountPolicy emailAccountPolicy;
        EmailAccountPolicy emailAccountPolicy2 = this.mEmailAccountPolicy;
        if (emailAccountPolicy2 == null) {
            synchronized (this) {
                try {
                    emailAccountPolicy2 = this.mEmailAccountPolicy;
                    if (emailAccountPolicy2 == null && (emailAccountPolicy = mEdm.getEmailAccountPolicy()) != null) {
                        emailAccountPolicy2 = new EmailAccountPolicy(emailAccountPolicy);
                        this.mEmailAccountPolicy = emailAccountPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emailAccountPolicy2;
    }

    public EmailPolicy getEmailPolicy() {
        android.app.enterprise.EmailPolicy emailPolicy;
        EmailPolicy emailPolicy2 = this.mEmailPolicy;
        if (emailPolicy2 == null) {
            synchronized (this) {
                try {
                    emailPolicy2 = this.mEmailPolicy;
                    if (emailPolicy2 == null && (emailPolicy = mEdm.getEmailPolicy()) != null) {
                        emailPolicy2 = new EmailPolicy(emailPolicy);
                        this.mEmailPolicy = emailPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emailPolicy2;
    }

    public ExchangeAccountPolicy getExchangeAccountPolicy() {
        android.app.enterprise.ExchangeAccountPolicy exchangeAccountPolicy;
        ExchangeAccountPolicy exchangeAccountPolicy2 = this.mExchangeAccountPolicy;
        if (exchangeAccountPolicy2 == null) {
            synchronized (this) {
                try {
                    exchangeAccountPolicy2 = this.mExchangeAccountPolicy;
                    if (exchangeAccountPolicy2 == null && (exchangeAccountPolicy = mEdm.getExchangeAccountPolicy()) != null) {
                        exchangeAccountPolicy2 = new ExchangeAccountPolicy(exchangeAccountPolicy);
                        this.mExchangeAccountPolicy = exchangeAccountPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return exchangeAccountPolicy2;
    }

    public Firewall getFirewall() {
        Firewall firewall = this.mFirewall;
        if (firewall == null) {
            synchronized (this) {
                try {
                    firewall = this.mFirewall;
                    if (firewall == null) {
                        if (getAPILevel() >= 17) {
                            com.sec.enterprise.firewall.Firewall firewall2 = mEdm.getFirewall();
                            if (firewall2 != null) {
                                firewall = new Firewall(firewall2);
                                this.mFirewall = firewall;
                            }
                        } else {
                            FirewallPolicy firewallPolicy = mEdm.getFirewallPolicy();
                            if (firewallPolicy != null) {
                                firewall = new Firewall(firewallPolicy);
                                this.mFirewall = firewall;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return firewall;
    }

    public Font getFont() {
        MiscPolicy miscPolicy;
        Font font = this.mFont;
        if (font == null) {
            synchronized (this) {
                try {
                    font = this.mFont;
                    if (font == null && (miscPolicy = mEdm.getMiscPolicy()) != null) {
                        font = new Font(miscPolicy);
                        this.mFont = font;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return font;
    }

    public Geofencing getGeofencing() {
        android.app.enterprise.geofencing.Geofencing instance;
        Geofencing geofencing = this.mGeofencing;
        if (geofencing == null) {
            synchronized (this) {
                try {
                    geofencing = this.mGeofencing;
                    if (geofencing == null && (instance = android.app.enterprise.geofencing.Geofencing.getInstance(mContext)) != null) {
                        geofencing = new Geofencing(instance);
                        this.mGeofencing = geofencing;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return geofencing;
    }

    public GlobalProxy getGlobalProxy() {
        DeviceSettingsPolicy instance;
        GlobalProxy globalProxy = this.mGlobalProxy;
        if (globalProxy == null) {
            synchronized (this) {
                try {
                    globalProxy = this.mGlobalProxy;
                    if (globalProxy == null && (instance = DeviceSettingsPolicy.getInstance(mContext)) != null) {
                        globalProxy = new GlobalProxy(instance);
                        this.mGlobalProxy = globalProxy;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return globalProxy;
    }

    public KioskMode getKioskMode() {
        android.app.enterprise.kioskmode.KioskMode instance;
        KioskMode kioskMode = this.mKioskMode;
        if (kioskMode == null) {
            synchronized (this) {
                try {
                    kioskMode = this.mKioskMode;
                    if (kioskMode == null && (instance = android.app.enterprise.kioskmode.KioskMode.getInstance(mContext)) != null) {
                        kioskMode = new KioskMode(instance);
                        this.mKioskMode = kioskMode;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kioskMode;
    }

    public LDAPAccountPolicy getLDAPAccountPolicy() {
        android.app.enterprise.LDAPAccountPolicy lDAPAccountPolicy;
        LDAPAccountPolicy lDAPAccountPolicy2 = this.mLDAPAccountPolicy;
        if (lDAPAccountPolicy2 == null) {
            synchronized (this) {
                try {
                    lDAPAccountPolicy2 = this.mLDAPAccountPolicy;
                    if (lDAPAccountPolicy2 == null && (lDAPAccountPolicy = mEdm.getLDAPAccountPolicy()) != null) {
                        lDAPAccountPolicy2 = new LDAPAccountPolicy(lDAPAccountPolicy);
                        this.mLDAPAccountPolicy = lDAPAccountPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lDAPAccountPolicy2;
    }

    public LocationPolicy getLocationPolicy() {
        android.app.enterprise.LocationPolicy locationPolicy;
        LocationPolicy locationPolicy2 = this.mLocationPolicy;
        if (locationPolicy2 == null) {
            synchronized (this) {
                try {
                    locationPolicy2 = this.mLocationPolicy;
                    if (locationPolicy2 == null && (locationPolicy = mEdm.getLocationPolicy()) != null) {
                        locationPolicy2 = new LocationPolicy(locationPolicy);
                        this.mLocationPolicy = locationPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return locationPolicy2;
    }

    public LockscreenOverlay getLockscreenOverlay() {
        LockscreenOverlay lockscreenOverlay = this.mLockscreenOverlay;
        if (lockscreenOverlay == null) {
            synchronized (this) {
                try {
                    lockscreenOverlay = this.mLockscreenOverlay;
                    if (lockscreenOverlay == null) {
                        android.app.enterprise.lso.LockscreenOverlay instance = android.app.enterprise.lso.LockscreenOverlay.getInstance(mContext);
                        MiscPolicy miscPolicy = mEdm.getMiscPolicy();
                        if (!(instance == null || miscPolicy == null)) {
                            lockscreenOverlay = new LockscreenOverlay(instance, miscPolicy);
                            this.mLockscreenOverlay = lockscreenOverlay;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lockscreenOverlay;
    }

    public MultiUserManager getMultiUserManager() {
        android.app.enterprise.multiuser.MultiUserManager instance;
        MultiUserManager multiUserManager = this.mMultiUserManager;
        if (multiUserManager == null) {
            synchronized (this) {
                try {
                    multiUserManager = this.mMultiUserManager;
                    if (multiUserManager == null && (instance = android.app.enterprise.multiuser.MultiUserManager.getInstance(mContext)) != null) {
                        multiUserManager = new MultiUserManager(instance);
                        this.mMultiUserManager = multiUserManager;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return multiUserManager;
    }

    public NfcPolicy getNfcPolicy() {
        DeviceSettingsPolicy instance;
        NfcPolicy nfcPolicy = this.mNfcPolicy;
        if (nfcPolicy == null) {
            synchronized (this) {
                try {
                    nfcPolicy = this.mNfcPolicy;
                    if (nfcPolicy == null && (instance = DeviceSettingsPolicy.getInstance(mContext)) != null) {
                        nfcPolicy = new NfcPolicy(instance);
                        this.mNfcPolicy = nfcPolicy;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nfcPolicy;
    }

    public PasswordPolicy getPasswordPolicy() {
        android.app.enterprise.PasswordPolicy passwordPolicy;
        PasswordPolicy passwordPolicy2 = this.mPasswordPolicy;
        if (passwordPolicy2 == null) {
            synchronized (this) {
                try {
                    passwordPolicy2 = this.mPasswordPolicy;
                    if (passwordPolicy2 == null && (passwordPolicy = mEdm.getPasswordPolicy()) != null) {
                        passwordPolicy2 = new PasswordPolicy(passwordPolicy);
                        this.mPasswordPolicy = passwordPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return passwordPolicy2;
    }

    public PhoneRestrictionPolicy getPhoneRestrictionPolicy() {
        android.app.enterprise.PhoneRestrictionPolicy phoneRestrictionPolicy;
        PhoneRestrictionPolicy phoneRestrictionPolicy2 = this.mPhoneRestrictionPolicy;
        if (phoneRestrictionPolicy2 == null) {
            synchronized (this) {
                try {
                    phoneRestrictionPolicy2 = this.mPhoneRestrictionPolicy;
                    if (phoneRestrictionPolicy2 == null && (phoneRestrictionPolicy = mEdm.getPhoneRestrictionPolicy()) != null) {
                        phoneRestrictionPolicy2 = new PhoneRestrictionPolicy(phoneRestrictionPolicy);
                        this.mPhoneRestrictionPolicy = phoneRestrictionPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return phoneRestrictionPolicy2;
    }

    public RemoteInjection getRemoteInjection() {
        android.app.enterprise.remotecontrol.RemoteInjection instance;
        RemoteInjection remoteInjection = this.mRemoteInjection;
        if (remoteInjection == null) {
            synchronized (this) {
                try {
                    remoteInjection = this.mRemoteInjection;
                    if (remoteInjection == null && (instance = android.app.enterprise.remotecontrol.RemoteInjection.getInstance()) != null) {
                        remoteInjection = new RemoteInjection(instance);
                        this.mRemoteInjection = remoteInjection;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return remoteInjection;
    }

    public RestrictionPolicy getRestrictionPolicy() {
        android.app.enterprise.RestrictionPolicy restrictionPolicy;
        RestrictionPolicy restrictionPolicy2 = this.mRestrictionPolicy;
        if (restrictionPolicy2 == null) {
            synchronized (this) {
                try {
                    restrictionPolicy2 = this.mRestrictionPolicy;
                    if (restrictionPolicy2 == null && (restrictionPolicy = mEdm.getRestrictionPolicy()) != null) {
                        restrictionPolicy2 = new RestrictionPolicy(restrictionPolicy);
                        this.mRestrictionPolicy = restrictionPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return restrictionPolicy2;
    }

    public RoamingPolicy getRoamingPolicy() {
        android.app.enterprise.RoamingPolicy roamingPolicy;
        RoamingPolicy roamingPolicy2 = this.mRoamingPolicy;
        if (roamingPolicy2 == null) {
            synchronized (this) {
                try {
                    roamingPolicy2 = this.mRoamingPolicy;
                    if (roamingPolicy2 == null && (roamingPolicy = mEdm.getRoamingPolicy()) != null) {
                        roamingPolicy2 = new RoamingPolicy(roamingPolicy);
                        this.mRoamingPolicy = roamingPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return roamingPolicy2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw new java.lang.NoSuchMethodError(com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(com.samsung.android.knox.EnterpriseDeviceManager.class, "getSPDControlPolicy", (java.lang.Class<?>[]) null, 19));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.samsung.android.knox.restriction.SPDControlPolicy getSPDControlPolicy() {
        /*
            r5 = this;
            com.samsung.android.knox.restriction.SPDControlPolicy r0 = r5.mSPDControlPolicy
            if (r0 != 0) goto L_0x0030
            monitor-enter(r5)
            com.samsung.android.knox.restriction.SPDControlPolicy r0 = r5.mSPDControlPolicy     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002c
            android.app.enterprise.EnterpriseDeviceManager r1 = mEdm     // Catch:{ NoSuchMethodError -> 0x001b }
            com.sec.enterprise.spd.SPDControlPolicy r1 = r1.getSPDControlPolicy()     // Catch:{ NoSuchMethodError -> 0x001b }
            if (r1 == 0) goto L_0x002c
            com.samsung.android.knox.restriction.SPDControlPolicy r0 = new com.samsung.android.knox.restriction.SPDControlPolicy     // Catch:{ NoSuchMethodError -> 0x001b }
            r0.<init>(r1)     // Catch:{ NoSuchMethodError -> 0x001b }
            r5.mSPDControlPolicy = r0     // Catch:{ NoSuchMethodError -> 0x001b }
            goto L_0x002c
        L_0x0019:
            r0 = move-exception
            goto L_0x002e
        L_0x001b:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError     // Catch:{ all -> 0x0019 }
            java.lang.Class<com.samsung.android.knox.EnterpriseDeviceManager> r1 = com.samsung.android.knox.EnterpriseDeviceManager.class
            java.lang.String r2 = "getSPDControlPolicy"
            r3 = 0
            r4 = 19
            java.lang.String r1 = com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(r1, r2, r3, r4)     // Catch:{ all -> 0x0019 }
            r0.<init>(r1)     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            goto L_0x0030
        L_0x002e:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.EnterpriseDeviceManager.getSPDControlPolicy():com.samsung.android.knox.restriction.SPDControlPolicy");
    }

    public VpnPolicy getVpnPolicy() {
        android.app.enterprise.VpnPolicy vpnPolicy;
        VpnPolicy vpnPolicy2 = this.mVpnPolicy;
        if (vpnPolicy2 == null) {
            synchronized (this) {
                try {
                    vpnPolicy2 = this.mVpnPolicy;
                    if (vpnPolicy2 == null && (vpnPolicy = mEdm.getVpnPolicy()) != null) {
                        vpnPolicy2 = new VpnPolicy(vpnPolicy);
                        this.mVpnPolicy = vpnPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return vpnPolicy2;
    }

    public WifiPolicy getWifiPolicy() {
        android.app.enterprise.WifiPolicy wifiPolicy;
        WifiPolicy wifiPolicy2 = this.mWifiPolicy;
        if (wifiPolicy2 == null) {
            synchronized (this) {
                try {
                    wifiPolicy2 = this.mWifiPolicy;
                    if (wifiPolicy2 == null && (wifiPolicy = mEdm.getWifiPolicy()) != null) {
                        wifiPolicy2 = new WifiPolicy(wifiPolicy);
                        this.mWifiPolicy = wifiPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return wifiPolicy2;
    }

    public boolean isAdminActive(ComponentName componentName) {
        return mEdm.isAdminActive(componentName);
    }

    public boolean setAdminRemovable(boolean z, String str) {
        return mEdm.setAdminRemovable(z, str);
    }

    public boolean getAdminRemovable() {
        return mEdm.getAdminRemovable();
    }

    public boolean setAdminRemovable(boolean z) {
        return mEdm.setAdminRemovable(z);
    }
}
