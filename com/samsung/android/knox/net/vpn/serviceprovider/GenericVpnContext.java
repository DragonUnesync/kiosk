package com.samsung.android.knox.net.vpn.serviceprovider;

import android.content.Context;
import com.samsung.android.knox.SupportLibUtils;

public class GenericVpnContext extends com.sec.vpn.knox.GenericVpnContext {
    public GenericVpnContext(Context context) {
        super(context);
    }

    public void enableMetaData(boolean z) {
        try {
            GenericVpnContext.super.enableMetaData(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(GenericVpnContext.class, "enableMetaData", new Class[]{Boolean.TYPE}, 13));
        }
    }

    public String getVPNProfile() {
        try {
            return GenericVpnContext.super.getVPNProfile();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(GenericVpnContext.class, "getVPNProfile", (Class<?>[]) null, 13));
        }
    }

    public boolean getVPNState() {
        try {
            return GenericVpnContext.super.getVPNState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(GenericVpnContext.class, "getVPNState", (Class<?>[]) null, 13));
        }
    }

    public boolean isMetaEnabled() {
        try {
            return GenericVpnContext.super.isMetaEnabled();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(GenericVpnContext.class, "isMetaEnabled", (Class<?>[]) null, 13));
        }
    }

    public void setGenericVpnParams(String str, boolean z) {
        try {
            GenericVpnContext.super.setGenericVpnParams(str, z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(GenericVpnContext.class, "setGenericVpnParams", new Class[]{String.class, Boolean.TYPE}, 13));
        }
    }
}
