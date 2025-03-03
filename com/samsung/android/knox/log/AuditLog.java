package com.samsung.android.knox.log;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.samsung.android.knox.SupportLibUtils;

public class AuditLog {
    public static final String ACTION_AUDIT_CRITICAL_SIZE = "com.samsung.android.knox.intent.action.AUDIT_CRITICAL_SIZE";
    public static final String ACTION_AUDIT_FULL_SIZE = "com.samsung.android.knox.intent.action.AUDIT_FULL_SIZE";
    public static final String ACTION_AUDIT_MAXIMUM_SIZE = "com.samsung.android.knox.intent.action.AUDIT_MAXIMUM_SIZE";
    public static final String ACTION_DUMP_LOG_RESULT = "com.samsung.android.knox.intent.action.DUMP_LOG_RESULT";
    public static final String ACTION_LOG_EXCEPTION = "com.samsung.android.knox.intent.action.LOG_EXCEPTION";
    public static final int AUDIT_LOG_GROUP_APPLICATION = 5;
    public static final int AUDIT_LOG_GROUP_EVENTS = 4;
    public static final int AUDIT_LOG_GROUP_NETWORK = 3;
    public static final int AUDIT_LOG_GROUP_SECURITY = 1;
    public static final int AUDIT_LOG_GROUP_SYSTEM = 2;
    public static final int AUDIT_LOG_SEVERITY_ALERT = 1;
    public static final int AUDIT_LOG_SEVERITY_CRITICAL = 2;
    public static final int AUDIT_LOG_SEVERITY_ERROR = 3;
    public static final int AUDIT_LOG_SEVERITY_NOTICE = 5;
    public static final int AUDIT_LOG_SEVERITY_WARNING = 4;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_UNKNOWN = -2000;
    public static final String EXTRA_AUDIT_RESULT = "com.samsung.android.knox.intent.extra.AUDIT_RESULT";
    private static final String TAG = "AuditLog-SupportLib";
    private com.sec.enterprise.knox.auditlog.AuditLog mAuditLog;

    public AuditLog(com.sec.enterprise.knox.auditlog.AuditLog auditLog) {
        this.mAuditLog = auditLog;
    }

    public static void a(int i, boolean z, int i8, String str, String str2) {
        try {
            com.sec.enterprise.knox.auditlog.AuditLog.a(i, z, i8, str, str2);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
        }
    }

    public static void c(int i, boolean z, int i8, String str, String str2) {
        try {
            com.sec.enterprise.knox.auditlog.AuditLog.c(i, z, i8, str, str2);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
        }
    }

    public static void e(int i, boolean z, int i8, String str, String str2) {
        try {
            com.sec.enterprise.knox.auditlog.AuditLog.e(i, z, i8, str, str2);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
        }
    }

    public static void n(int i, boolean z, int i8, String str, String str2) {
        try {
            com.sec.enterprise.knox.auditlog.AuditLog.n(i, z, i8, str, str2);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
        }
    }

    public static void w(int i, boolean z, int i8, String str, String str2) {
        try {
            com.sec.enterprise.knox.auditlog.AuditLog.w(i, z, i8, str, str2);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
        }
    }

    public boolean disableAuditLog() {
        return this.mAuditLog.disableAuditLog();
    }

    public boolean disableIPTablesLogging() {
        return this.mAuditLog.disableIPTablesLogging();
    }

    public boolean dumpLogFile(long j7, long j8, String str, ParcelFileDescriptor parcelFileDescriptor) {
        return this.mAuditLog.dumpLogFile(j7, j8, str, parcelFileDescriptor);
    }

    public boolean enableAuditLog() {
        return this.mAuditLog.enableAuditLog();
    }

    public boolean enableIPTablesLogging() {
        return this.mAuditLog.enableIPTablesLogging();
    }

    public AuditLogRulesInfo getAuditLogRules() {
        try {
            return AuditLogRulesInfo.convertToNew(this.mAuditLog.getAuditLogRules());
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(AuditLog.class, "getAuditLogRules", (Class<?>[]) null, 17));
        }
    }

    public int getCriticalLogSize() {
        return this.mAuditLog.getCriticalLogSize();
    }

    public int getCurrentLogFileSize() {
        return this.mAuditLog.getCurrentLogFileSize();
    }

    public int getMaximumLogSize() {
        return this.mAuditLog.getMaximumLogSize();
    }

    public boolean isAuditLogEnabled() {
        return this.mAuditLog.isAuditLogEnabled();
    }

    public boolean isIPTablesLoggingEnabled() {
        return this.mAuditLog.isIPTablesLoggingEnabled();
    }

    public boolean setAuditLogRules(AuditLogRulesInfo auditLogRulesInfo) {
        try {
            return this.mAuditLog.setAuditLogRules(AuditLogRulesInfo.convertToOld(auditLogRulesInfo));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public boolean setCriticalLogSize(int i) {
        return this.mAuditLog.setCriticalLogSize(i);
    }

    public boolean setMaximumLogSize(int i) {
        return this.mAuditLog.setMaximumLogSize(i);
    }
}
