package com.samsung.android.knox.sdp;

import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.sdp.core.SdpEngineInfo;
import com.samsung.android.knox.sdp.core.SdpException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineNotExistsException;
import com.sec.enterprise.knox.sdp.exception.SdpInternalException;
import com.sec.enterprise.knox.sdp.exception.SdpLicenseRequiredException;

public class SdpUtil {
    private static final String TAG = "SdpUtil-SupportLib";
    private static SdpUtil mInstance;
    private static com.sec.enterprise.knox.sdp.SdpUtil mSdpUtil;

    private SdpUtil(com.sec.enterprise.knox.sdp.SdpUtil sdpUtil) {
        mSdpUtil = sdpUtil;
    }

    public static SdpUtil getInstance() {
        if (mInstance == null) {
            try {
                com.sec.enterprise.knox.sdp.SdpUtil instance = com.sec.enterprise.knox.sdp.SdpUtil.getInstance();
                if (instance != null) {
                    mInstance = new SdpUtil(instance);
                }
            } catch (NoClassDefFoundError unused) {
                if (EnterpriseDeviceManager.getAPILevel() <= -1) {
                    Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
                    return null;
                }
                throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(SdpUtil.class, 19));
            }
        }
        return mInstance;
    }

    public static boolean isKnoxWorkspace(int i) {
        try {
            return com.sec.enterprise.knox.sdp.SdpUtil.isKnoxWorkspace(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpUtil.class, "isKnoxWorkspace", new Class[]{Integer.TYPE}, 19));
        }
    }

    public SdpEngineInfo getEngineInfo(String str) {
        try {
            return SdpEngineInfo.convertToNew(mSdpUtil.getEngineInfo(str));
        } catch (SdpLicenseRequiredException unused) {
            throw new SdpException(-8);
        } catch (SdpEngineNotExistsException unused2) {
            throw new SdpException(-5);
        } catch (SdpInternalException unused3) {
            throw new SdpException(-15);
        } catch (NoSuchMethodError unused4) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpUtil.class, "getEngineInfo", new Class[]{String.class}, 19));
        }
    }

    public boolean isSdpSupported() {
        try {
            return mSdpUtil.isSdpSupported();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpUtil.class, "isSdpSupported", (Class<?>[]) null, 19));
        }
    }

    public boolean registerListener(String str, SdpStateListener sdpStateListener) {
        try {
            return mSdpUtil.registerListener(str, new SdpStateListenerProxy(sdpStateListener));
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpUtil.class, "registerListener", new Class[]{String.class, SdpStateListener.class}, 19));
        }
    }

    public boolean unregisterListener(String str, SdpStateListener sdpStateListener) {
        try {
            return mSdpUtil.unregisterListener(str, new SdpStateListenerProxy(sdpStateListener));
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpUtil.class, "unregisterListener", new Class[]{String.class, SdpStateListener.class}, 19));
        }
    }
}
