package com.samsung.android.knox.net.firewall;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.AppIdentity;
import com.samsung.android.knox.SupportLibUtils;
import java.util.ArrayList;
import java.util.List;

public class DomainFilterRule implements Parcelable {
    public static final List<DomainFilterRule> CLEAR_ALL = null;
    public static final Parcelable.Creator<DomainFilterRule> CREATOR = new Parcelable.Creator<DomainFilterRule>() {
        public DomainFilterRule createFromParcel(Parcel parcel) {
            return new DomainFilterRule(parcel);
        }

        public DomainFilterRule[] newArray(int i) {
            return new DomainFilterRule[i];
        }
    };
    private List<String> mAllowDomains;
    private AppIdentity mAppIdentity;
    private List<String> mDenyDomains;
    private String mDns1;
    private String mDns2;
    private int mNullCheck;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.samsung.android.knox.net.firewall.DomainFilterRule convertToNew(com.sec.enterprise.firewall.DomainFilterRule r2) {
        /*
            if (r2 != 0) goto L_0x0004
            r2 = 0
            return r2
        L_0x0004:
            com.samsung.android.knox.net.firewall.DomainFilterRule r0 = new com.samsung.android.knox.net.firewall.DomainFilterRule
            r0.<init>()
            java.util.List r1 = r2.getAllowDomains()
            r0.setAllowDomains(r1)
            com.sec.enterprise.AppIdentity r1 = r2.getApplication()
            com.samsung.android.knox.AppIdentity r1 = com.samsung.android.knox.AppIdentity.convertToNew(r1)
            r0.setApplication(r1)
            java.util.List r1 = r2.getDenyDomains()
            r0.setDenyDomains(r1)
            java.lang.String r1 = r2.getDns1()     // Catch:{ NoSuchMethodError -> 0x0029 }
            r0.setDns1(r1)     // Catch:{ NoSuchMethodError -> 0x0029 }
        L_0x0029:
            java.lang.String r2 = r2.getDns2()     // Catch:{ NoSuchMethodError -> 0x0030 }
            r0.setDns2(r2)     // Catch:{ NoSuchMethodError -> 0x0030 }
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.net.firewall.DomainFilterRule.convertToNew(com.sec.enterprise.firewall.DomainFilterRule):com.samsung.android.knox.net.firewall.DomainFilterRule");
    }

    public static List<DomainFilterRule> convertToNewList(List<com.sec.enterprise.firewall.DomainFilterRule> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.sec.enterprise.firewall.DomainFilterRule convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    private static com.sec.enterprise.firewall.DomainFilterRule convertToOld(DomainFilterRule domainFilterRule) {
        Class<String> cls = String.class;
        Class<DomainFilterRule> cls2 = DomainFilterRule.class;
        if (domainFilterRule == null) {
            return null;
        }
        try {
            com.sec.enterprise.firewall.DomainFilterRule domainFilterRule2 = new com.sec.enterprise.firewall.DomainFilterRule(AppIdentity.convertToOld(domainFilterRule.getApplication()), domainFilterRule.getDenyDomains(), domainFilterRule.getAllowDomains());
            try {
                domainFilterRule2.setDns1(domainFilterRule.getDns1());
            } catch (NoSuchMethodError unused) {
                if (domainFilterRule.getDns1() != null) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "setDns1", new Class[]{cls}, 20));
                }
            }
            try {
                domainFilterRule2.setDns2(domainFilterRule.getDns2());
            } catch (NoSuchMethodError unused2) {
                if (domainFilterRule.getDns2() != null) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "setDns2", new Class[]{cls}, 20));
                }
            }
            return domainFilterRule2;
        } catch (NoClassDefFoundError unused3) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(cls2, 19));
        }
    }

    public static List<com.sec.enterprise.firewall.DomainFilterRule> convertToOldList(List<DomainFilterRule> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DomainFilterRule convertToOld : list) {
            arrayList.add(convertToOld(convertToOld));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public List<String> getAllowDomains() {
        return this.mAllowDomains;
    }

    public AppIdentity getApplication() {
        return this.mAppIdentity;
    }

    public List<String> getDenyDomains() {
        return this.mDenyDomains;
    }

    public String getDns1() {
        return this.mDns1;
    }

    public String getDns2() {
        return this.mDns2;
    }

    public void setAllowDomains(List<String> list) {
        if (list != null) {
            this.mAllowDomains = new ArrayList(list);
        } else {
            this.mAllowDomains = null;
        }
    }

    public void setApplication(AppIdentity appIdentity) {
        this.mAppIdentity = appIdentity;
    }

    public void setDenyDomains(List<String> list) {
        if (list != null) {
            this.mDenyDomains = new ArrayList(list);
        } else {
            this.mDenyDomains = null;
        }
    }

    public void setDns1(String str) {
        this.mDns1 = str;
    }

    public void setDns2(String str) {
        this.mDns2 = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mAppIdentity, i);
        if (this.mDenyDomains != null) {
            parcel.writeInt(1);
            parcel.writeStringList(this.mDenyDomains);
        } else {
            parcel.writeInt(0);
        }
        if (this.mAllowDomains != null) {
            parcel.writeInt(1);
            parcel.writeStringList(this.mAllowDomains);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.mDns1);
        parcel.writeString(this.mDns2);
    }

    public DomainFilterRule(AppIdentity appIdentity, List<String> list, List<String> list2) {
        this.mAppIdentity = appIdentity;
        if (list != null) {
            this.mDenyDomains = new ArrayList(list);
        } else {
            this.mDenyDomains = null;
        }
        if (list2 != null) {
            this.mAllowDomains = new ArrayList(list2);
        } else {
            this.mAllowDomains = null;
        }
    }

    public DomainFilterRule(AppIdentity appIdentity, List<String> list, List<String> list2, String str, String str2) {
        this.mAppIdentity = appIdentity;
        if (list != null) {
            this.mDenyDomains = new ArrayList(list);
        } else {
            this.mDenyDomains = null;
        }
        if (list2 != null) {
            this.mAllowDomains = new ArrayList(list2);
        } else {
            this.mAllowDomains = null;
        }
        this.mDns1 = str;
        this.mDns2 = str2;
    }

    public DomainFilterRule(AppIdentity appIdentity) {
        this.mAppIdentity = appIdentity;
        this.mDenyDomains = new ArrayList();
        this.mAllowDomains = new ArrayList();
        this.mDns1 = null;
        this.mDns2 = null;
    }

    public DomainFilterRule() {
        this.mAppIdentity = new AppIdentity();
        this.mDenyDomains = new ArrayList();
        this.mAllowDomains = new ArrayList();
        this.mDns1 = null;
        this.mDns2 = null;
    }

    private DomainFilterRule(Parcel parcel) {
        this();
        this.mAppIdentity = (AppIdentity) parcel.readParcelable(AppIdentity.class.getClassLoader());
        int readInt = parcel.readInt();
        this.mNullCheck = readInt;
        if (readInt == 1) {
            parcel.readStringList(this.mDenyDomains);
        } else {
            this.mDenyDomains = null;
        }
        int readInt2 = parcel.readInt();
        this.mNullCheck = readInt2;
        if (readInt2 == 1) {
            parcel.readStringList(this.mAllowDomains);
        } else {
            this.mAllowDomains = null;
        }
        this.mDns1 = parcel.readString();
        this.mDns2 = parcel.readString();
    }
}
