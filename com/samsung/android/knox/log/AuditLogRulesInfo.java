package com.samsung.android.knox.log;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;
import java.util.ArrayList;
import java.util.List;

public class AuditLogRulesInfo implements Parcelable {
    public static final int AUDIT_LOG_OUTCOME_ALL = 2;
    public static final int AUDIT_LOG_OUTCOME_FAILURE = 0;
    public static final int AUDIT_LOG_OUTCOME_SUCCESS = 1;
    public static final Parcelable.Creator<AuditLogRulesInfo> CREATOR = new Parcelable.Creator<AuditLogRulesInfo>() {
        public AuditLogRulesInfo createFromParcel(Parcel parcel) {
            return new AuditLogRulesInfo(parcel);
        }

        public AuditLogRulesInfo[] newArray(int i) {
            return new AuditLogRulesInfo[i];
        }
    };
    private boolean mEnableKernel;
    private List<Integer> mGroupsRule;
    private int mOutcomeRule;
    private int mSeverityRule;
    private List<Integer> mUsersRule;

    public static AuditLogRulesInfo convertToNew(com.sec.enterprise.knox.auditlog.AuditLogRulesInfo auditLogRulesInfo) {
        if (auditLogRulesInfo == null) {
            return null;
        }
        return new AuditLogRulesInfo(auditLogRulesInfo.getSeverityRule(), auditLogRulesInfo.getOutcomeRule(), auditLogRulesInfo.getGroupsRule(), auditLogRulesInfo.isKernelLogsEnabled(), auditLogRulesInfo.getUsersRule());
    }

    public static com.sec.enterprise.knox.auditlog.AuditLogRulesInfo convertToOld(AuditLogRulesInfo auditLogRulesInfo) {
        if (auditLogRulesInfo == null) {
            return null;
        }
        try {
            return new com.sec.enterprise.knox.auditlog.AuditLogRulesInfo(auditLogRulesInfo.getSeverityRule(), auditLogRulesInfo.getOutcomeRule(), auditLogRulesInfo.getGroupsRule(), auditLogRulesInfo.isKernelLogsEnabled(), auditLogRulesInfo.getUsersRule());
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(AuditLogRulesInfo.class, 17));
        }
    }

    private void readFromParcel(Parcel parcel) {
        boolean z;
        this.mSeverityRule = parcel.readInt();
        this.mOutcomeRule = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.mGroupsRule = arrayList;
        Class<Integer> cls = Integer.class;
        parcel.readList(arrayList, cls.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mEnableKernel = z;
        ArrayList arrayList2 = new ArrayList();
        this.mUsersRule = arrayList2;
        parcel.readList(arrayList2, cls.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public List<Integer> getGroupsRule() {
        return this.mGroupsRule;
    }

    public int getOutcomeRule() {
        return this.mOutcomeRule;
    }

    public int getSeverityRule() {
        return this.mSeverityRule;
    }

    public List<Integer> getUsersRule() {
        return this.mUsersRule;
    }

    public boolean isKernelLogsEnabled() {
        return this.mEnableKernel;
    }

    public void setGroupsRule(List<Integer> list) {
        this.mGroupsRule = list;
    }

    public void setKernelLogsEnabled(boolean z) {
        this.mEnableKernel = z;
    }

    public void setOutcomeRule(int i) {
        this.mOutcomeRule = i;
    }

    public void setSeverityRule(int i) {
        this.mSeverityRule = i;
    }

    public void setUsersRule(List<Integer> list) {
        this.mUsersRule = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mSeverityRule);
        parcel.writeInt(this.mOutcomeRule);
        parcel.writeList(this.mGroupsRule);
        parcel.writeByte(this.mEnableKernel ? (byte) 1 : 0);
        parcel.writeList(this.mUsersRule);
    }

    public AuditLogRulesInfo() {
        this.mSeverityRule = 5;
        this.mOutcomeRule = 2;
        this.mGroupsRule = null;
        this.mEnableKernel = false;
        this.mUsersRule = null;
    }

    public AuditLogRulesInfo(int i, int i8, List<Integer> list, boolean z, List<Integer> list2) {
        this.mSeverityRule = i;
        this.mOutcomeRule = i8;
        this.mGroupsRule = list;
        this.mEnableKernel = z;
        this.mUsersRule = list2;
    }

    private AuditLogRulesInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
