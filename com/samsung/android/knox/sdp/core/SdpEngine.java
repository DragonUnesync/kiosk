package com.samsung.android.knox.sdp.core;

import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.SupportLibUtils;
import com.sec.enterprise.knox.sdp.exception.SdpAccessDeniedException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineExistsException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineLockedException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineNotExistsException;
import com.sec.enterprise.knox.sdp.exception.SdpInternalException;
import com.sec.enterprise.knox.sdp.exception.SdpInvalidPasswordException;
import com.sec.enterprise.knox.sdp.exception.SdpInvalidResetTokenException;
import com.sec.enterprise.knox.sdp.exception.SdpLicenseRequiredException;
import com.sec.enterprise.knox.sdp.exception.SdpNotSupportedException;

public class SdpEngine {
    private static final String TAG = "SdpEngine-SupportLib";
    private static SdpEngine mInstance;
    private static com.sec.enterprise.knox.sdp.engine.SdpEngine mSdpEngine;

    private SdpEngine(com.sec.enterprise.knox.sdp.engine.SdpEngine sdpEngine) {
        mSdpEngine = sdpEngine;
    }

    public static SdpEngine getInstance() {
        if (mInstance == null) {
            try {
                com.sec.enterprise.knox.sdp.engine.SdpEngine instance = com.sec.enterprise.knox.sdp.engine.SdpEngine.getInstance();
                if (instance != null) {
                    mInstance = new SdpEngine(instance);
                }
            } catch (SdpLicenseRequiredException unused) {
                throw new SdpException(-8);
            } catch (NoClassDefFoundError unused2) {
                if (EnterpriseDeviceManager.getAPILevel() <= -1) {
                    Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
                    return null;
                }
                throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(SdpEngine.class, 19));
            }
        }
        return mInstance;
    }

    public void addEngine(SdpCreationParam sdpCreationParam, String str, String str2) {
        try {
            mSdpEngine.addEngine(SdpCreationParam.convertToOld(sdpCreationParam), str, str2);
        } catch (SdpEngineExistsException unused) {
            throw new SdpException(-4);
        } catch (SdpNotSupportedException unused2) {
            throw new SdpException(-9);
        } catch (SdpAccessDeniedException unused3) {
            throw new SdpException(-7);
        } catch (SdpInternalException unused4) {
            throw new SdpException(-15);
        } catch (SdpInvalidPasswordException unused5) {
            throw new SdpException(-1);
        } catch (SdpInvalidResetTokenException unused6) {
            throw new SdpException(-2);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public boolean exists(String str) {
        try {
            return mSdpEngine.exists(str);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "exists", new Class[]{String.class}, 19));
        }
    }

    public void lock(String str) {
        try {
            mSdpEngine.lock(str);
        } catch (SdpInternalException unused) {
            throw new SdpException(-15);
        } catch (SdpEngineNotExistsException unused2) {
            throw new SdpException(-5);
        } catch (SdpAccessDeniedException unused3) {
            throw new SdpException(-7);
        } catch (NoSuchMethodError unused4) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "lock", new Class[]{String.class}, 19));
        }
    }

    public void removeEngine(String str) {
        try {
            mSdpEngine.removeEngine(str);
        } catch (SdpInternalException unused) {
            throw new SdpException(-15);
        } catch (SdpEngineNotExistsException unused2) {
            throw new SdpException(-5);
        } catch (SdpAccessDeniedException unused3) {
            throw new SdpException(-7);
        } catch (NoSuchMethodError unused4) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "removeEngine", new Class[]{String.class}, 19));
        }
    }

    public void resetPassword(String str, String str2, String str3) {
        try {
            mSdpEngine.resetPassword(str, str2, str3);
        } catch (SdpInternalException unused) {
            throw new SdpException(-15);
        } catch (SdpEngineNotExistsException unused2) {
            throw new SdpException(-5);
        } catch (SdpInvalidResetTokenException unused3) {
            throw new SdpException(-2);
        } catch (SdpAccessDeniedException unused4) {
            throw new SdpException(-7);
        } catch (SdpInvalidPasswordException unused5) {
            throw new SdpException(-1);
        } catch (NoSuchMethodError unused6) {
            Class<String> cls = String.class;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "resetPassword", new Class[]{cls, cls, cls}, 19));
        }
    }

    public void setPassword(String str, String str2) {
        try {
            mSdpEngine.setPassword(str, str2);
        } catch (SdpAccessDeniedException unused) {
            throw new SdpException(-7);
        } catch (SdpInternalException unused2) {
            throw new SdpException(-15);
        } catch (SdpEngineNotExistsException unused3) {
            throw new SdpException(-5);
        } catch (SdpEngineLockedException unused4) {
            throw new SdpException(-6);
        } catch (SdpInvalidPasswordException unused5) {
            throw new SdpException(-1);
        } catch (NoSuchMethodError unused6) {
            Class<String> cls = String.class;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "setPassword", new Class[]{cls, cls}, 19));
        }
    }

    public void unlock(String str, String str2) {
        try {
            mSdpEngine.unlock(str, str2);
        } catch (SdpInternalException unused) {
            throw new SdpException(-15);
        } catch (SdpEngineNotExistsException unused2) {
            throw new SdpException(-5);
        } catch (SdpInvalidPasswordException unused3) {
            throw new SdpException(-1);
        } catch (SdpAccessDeniedException unused4) {
            throw new SdpException(-7);
        } catch (NoSuchMethodError unused5) {
            Class<String> cls = String.class;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "unlock", new Class[]{cls, cls}, 19));
        }
    }
}
