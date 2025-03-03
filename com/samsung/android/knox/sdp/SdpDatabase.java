package com.samsung.android.knox.sdp;

import android.database.sqlite.SQLiteDatabase;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.sdp.core.SdpException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineLockedException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineNotExistsException;
import com.sec.enterprise.knox.sdp.exception.SdpLicenseRequiredException;
import java.util.List;

public class SdpDatabase {
    private com.sec.enterprise.knox.sdp.SdpDatabase mSdpDatabase;

    public SdpDatabase(String str) {
        try {
            this.mSdpDatabase = new com.sec.enterprise.knox.sdp.SdpDatabase(str);
        } catch (SdpEngineNotExistsException unused) {
            throw new SdpException(-5);
        } catch (SdpLicenseRequiredException unused2) {
            throw new SdpException(-8);
        } catch (NoClassDefFoundError unused3) {
            throw new NoClassDefFoundError(SupportLibUtils.buildMethodErrorMsg(SdpDatabase.class, "SdpDatabase", new Class[]{String.class}, 19));
        }
    }

    public boolean isSensitive(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            return this.mSdpDatabase.isSensitive(sQLiteDatabase, str, str2, str3);
        } catch (NoSuchMethodError unused) {
            Class<String> cls = String.class;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpDatabase.class, "isSensitive", new Class[]{SQLiteDatabase.class, cls, cls, cls}, 19));
        }
    }

    public boolean setSensitive(SQLiteDatabase sQLiteDatabase, String str, String str2, List<String> list) {
        try {
            return this.mSdpDatabase.setSensitive(sQLiteDatabase, str, str2, list);
        } catch (SdpEngineLockedException unused) {
            throw new SdpException(-6);
        } catch (NoSuchMethodError unused2) {
            Class<String> cls = String.class;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpDatabase.class, "setSensitive", new Class[]{SQLiteDatabase.class, cls, cls, List.class}, 19));
        }
    }

    public boolean updateStateToDB(SQLiteDatabase sQLiteDatabase, String str, int i) {
        try {
            return this.mSdpDatabase.updateStateToDB(sQLiteDatabase, str, i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpDatabase.class, "updateStateToDB", new Class[]{SQLiteDatabase.class, String.class, Integer.TYPE}, 19));
        }
    }

    public boolean updateStateToDB(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            return this.mSdpDatabase.updateStateToDB(sQLiteDatabase, i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SdpDatabase.class, "updateStateToDB", new Class[]{SQLiteDatabase.class, Integer.TYPE}, 19));
        }
    }
}
