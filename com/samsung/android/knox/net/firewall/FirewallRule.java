package com.samsung.android.knox.net.firewall;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.samsung.android.knox.AppIdentity;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.net.firewall.Firewall;
import com.sec.enterprise.firewall.Firewall;
import com.sec.enterprise.firewall.FirewallRule;
import java.security.InvalidParameterException;
import java.util.ArrayList;

public class FirewallRule implements Parcelable {
    private static final String ADDRESS = "address";
    private static final String ADDRESS_TYPE = "address type";
    private static final String APP_IDENTITY = "app identity";
    public static final Parcelable.Creator<FirewallRule> CREATOR = new Parcelable.Creator<FirewallRule>() {
        public FirewallRule createFromParcel(Parcel parcel) {
            return new FirewallRule(parcel);
        }

        public FirewallRule[] newArray(int i) {
            return new FirewallRule[i];
        }
    };
    private static final String DIRECTION = "direction";
    private static final String IS_INVALID = " is invalid.";
    private static final String NETWORK_INTERFACE = "network interface";
    private static final String PARAMETER = "Parameter: ";
    private static final String PORT_LOCATION = "port location";
    private static final String PORT_NUMBER = "port number";
    private static final String PROTOCOL = "protocol";
    private static final String RULE_TYPE = "rule type";
    private static final String TARGET_IP = "target IP";
    private static final String TARGET_PORT_NUMBER = "target port number";
    private static final String UNSUPPORTED_METHOD = "This method is not supported for this RuleType: ";
    private String mAddress;
    private Firewall.AddressType mAddressType;
    private AppIdentity mAppIdentity;
    private Firewall.Direction mDirection;
    private int mId;
    private Firewall.NetworkInterface mNetworkInterface;
    private Firewall.PortLocation mPortLocation;
    private String mPortNumber;
    private Firewall.Protocol mProtocol;
    private RuleType mRuleType;
    private Status mStatus;
    private String mTargetIp;
    private String mTargetPortNumber;

    /* renamed from: com.samsung.android.knox.net.firewall.FirewallRule$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$samsung$android$knox$net$firewall$FirewallRule$RuleType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.samsung.android.knox.net.firewall.FirewallRule$RuleType[] r0 = com.samsung.android.knox.net.firewall.FirewallRule.RuleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$samsung$android$knox$net$firewall$FirewallRule$RuleType = r0
                com.samsung.android.knox.net.firewall.FirewallRule$RuleType r1 = com.samsung.android.knox.net.firewall.FirewallRule.RuleType.ALLOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$samsung$android$knox$net$firewall$FirewallRule$RuleType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.samsung.android.knox.net.firewall.FirewallRule$RuleType r1 = com.samsung.android.knox.net.firewall.FirewallRule.RuleType.DENY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$samsung$android$knox$net$firewall$FirewallRule$RuleType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.samsung.android.knox.net.firewall.FirewallRule$RuleType r1 = com.samsung.android.knox.net.firewall.FirewallRule.RuleType.REDIRECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$samsung$android$knox$net$firewall$FirewallRule$RuleType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.samsung.android.knox.net.firewall.FirewallRule$RuleType r1 = com.samsung.android.knox.net.firewall.FirewallRule.RuleType.REDIRECT_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.net.firewall.FirewallRule.AnonymousClass2.<clinit>():void");
        }
    }

    public enum RuleType {
        DENY,
        ALLOW,
        REDIRECT,
        REDIRECT_EXCEPTION
    }

    public enum Status {
        DISABLED,
        ENABLED,
        PENDING
    }

    public FirewallRule(RuleType ruleType, Firewall.AddressType addressType) {
        if (ruleType == null) {
            throw new InvalidParameterException("Parameter: rule type is invalid.");
        } else if (addressType != null) {
            this.mRuleType = ruleType;
            this.mStatus = Status.DISABLED;
            this.mAddressType = addressType;
            this.mAddress = "*";
            this.mPortNumber = "*";
            this.mAppIdentity = new AppIdentity("*", (String) null);
            this.mPortLocation = Firewall.PortLocation.ALL;
            this.mNetworkInterface = Firewall.NetworkInterface.ALL_NETWORKS;
            this.mDirection = Firewall.Direction.ALL;
            this.mProtocol = Firewall.Protocol.ALL;
            this.mTargetIp = null;
            this.mTargetPortNumber = null;
            this.mId = -1;
        } else {
            throw new InvalidParameterException("Parameter: address type is invalid.");
        }
    }

    private static FirewallRule convertToNew(com.sec.enterprise.firewall.FirewallRule firewallRule) {
        AppIdentity appIdentity;
        if (firewallRule == null) {
            return null;
        }
        RuleType ruleType = (RuleType) SupportLibUtils.convertEnumToEnum(firewallRule.getRuleType(), RuleType.class);
        FirewallRule firewallRule2 = new FirewallRule(ruleType, (Firewall.AddressType) SupportLibUtils.convertEnumToEnum(firewallRule.getAddressType(), Firewall.AddressType.class));
        firewallRule2.setId(firewallRule.getId());
        firewallRule2.setIpAddress(firewallRule.getIpAddress());
        firewallRule2.setPortNumber(firewallRule.getPortNumber());
        if (RuleType.ALLOW.equals(ruleType) || RuleType.DENY.equals(ruleType)) {
            firewallRule2.setPortLocation((Firewall.PortLocation) SupportLibUtils.convertEnumToEnum(firewallRule.getPortLocation(), Firewall.PortLocation.class));
            firewallRule2.setDirection((Firewall.Direction) SupportLibUtils.convertEnumToEnum(firewallRule.getDirection(), Firewall.Direction.class));
        }
        try {
            appIdentity = AppIdentity.convertToNew(firewallRule.getApplication());
        } catch (NoSuchMethodError unused) {
            appIdentity = new AppIdentity();
            appIdentity.setPackageName(firewallRule.getPackageName());
        }
        firewallRule2.setApplication(appIdentity);
        firewallRule2.setNetworkInterface((Firewall.NetworkInterface) SupportLibUtils.convertEnumToEnum(firewallRule.getNetworkInterface(), Firewall.NetworkInterface.class));
        firewallRule2.setProtocol((Firewall.Protocol) SupportLibUtils.convertEnumToEnum(firewallRule.getProtocol(), Firewall.Protocol.class));
        if (RuleType.REDIRECT.equals(ruleType)) {
            firewallRule2.setTargetIpAddress(firewallRule.getTargetIpAddress());
            firewallRule2.setTargetPortNumber(firewallRule.getTargetPortNumber());
        }
        firewallRule2.setStatus((Status) SupportLibUtils.convertEnumToEnum(firewallRule.getStatus(), Status.class));
        return firewallRule2;
    }

    public static FirewallRule[] convertToNewArray(com.sec.enterprise.firewall.FirewallRule[] firewallRuleArr) {
        if (firewallRuleArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.sec.enterprise.firewall.FirewallRule convertToNew : firewallRuleArr) {
            arrayList.add(convertToNew(convertToNew));
        }
        FirewallRule[] firewallRuleArr2 = new FirewallRule[arrayList.size()];
        arrayList.toArray(firewallRuleArr2);
        return firewallRuleArr2;
    }

    private static com.sec.enterprise.firewall.FirewallRule convertToOld(FirewallRule firewallRule) {
        if (firewallRule == null) {
            return null;
        }
        com.sec.enterprise.firewall.FirewallRule firewallRule2 = new com.sec.enterprise.firewall.FirewallRule(SupportLibUtils.convertEnumToEnum(firewallRule.getRuleType(), FirewallRule.RuleType.class), SupportLibUtils.convertEnumToEnum(firewallRule.getAddressType(), Firewall.AddressType.class));
        firewallRule2.setId(firewallRule.getId());
        firewallRule2.setIpAddress(firewallRule.getIpAddress());
        firewallRule2.setPortNumber(firewallRule.getPortNumber());
        if (RuleType.ALLOW.equals(firewallRule.getRuleType()) || RuleType.DENY.equals(firewallRule.getRuleType())) {
            firewallRule2.setPortLocation(SupportLibUtils.convertEnumToEnum(firewallRule.getPortLocation(), Firewall.PortLocation.class));
            firewallRule2.setDirection(SupportLibUtils.convertEnumToEnum(firewallRule.getDirection(), Firewall.Direction.class));
        }
        try {
            firewallRule2.setApplication(AppIdentity.convertToOld(firewallRule.getApplication()));
        } catch (NoSuchMethodError unused) {
            if (TextUtils.isEmpty(firewallRule.getApplication().getSignature())) {
                firewallRule2.setPackageName(firewallRule.getApplication().getPackageName());
            } else {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(FirewallRule.class, "setApplication", new Class[]{AppIdentity.class}, 19));
            }
        }
        firewallRule2.setNetworkInterface(SupportLibUtils.convertEnumToEnum(firewallRule.getNetworkInterface(), Firewall.NetworkInterface.class));
        firewallRule2.setProtocol(SupportLibUtils.convertEnumToEnum(firewallRule.getProtocol(), Firewall.Protocol.class));
        if (RuleType.REDIRECT.equals(firewallRule.getRuleType())) {
            firewallRule2.setTargetIpAddress(firewallRule.getTargetIpAddress());
            firewallRule2.setTargetPortNumber(firewallRule.getTargetPortNumber());
        }
        firewallRule2.setStatus(SupportLibUtils.convertEnumToEnum(firewallRule.getStatus(), FirewallRule.Status.class));
        return firewallRule2;
    }

    public static com.sec.enterprise.firewall.FirewallRule[] convertToOldArray(FirewallRule[] firewallRuleArr) {
        if (firewallRuleArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FirewallRule convertToOld : firewallRuleArr) {
            arrayList.add(convertToOld(convertToOld));
        }
        com.sec.enterprise.firewall.FirewallRule[] firewallRuleArr2 = new com.sec.enterprise.firewall.FirewallRule[arrayList.size()];
        arrayList.toArray(firewallRuleArr2);
        return firewallRuleArr2;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014a, code lost:
        if (r3.equals(getRuleType()) != false) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.samsung.android.knox.net.firewall.FirewallRule
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.samsung.android.knox.net.firewall.FirewallRule r6 = (com.samsung.android.knox.net.firewall.FirewallRule) r6
            com.samsung.android.knox.net.firewall.Firewall$AddressType r0 = r6.getAddressType()
            r2 = 1
            if (r0 != 0) goto L_0x0015
            com.samsung.android.knox.net.firewall.Firewall$AddressType r0 = r5.getAddressType()
            if (r0 == 0) goto L_0x0029
        L_0x0015:
            com.samsung.android.knox.net.firewall.Firewall$AddressType r0 = r6.getAddressType()
            if (r0 == 0) goto L_0x002b
            com.samsung.android.knox.net.firewall.Firewall$AddressType r0 = r6.getAddressType()
            com.samsung.android.knox.net.firewall.Firewall$AddressType r3 = r5.getAddressType()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002b
        L_0x0029:
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            java.lang.String r3 = r6.getIpAddress()
            if (r3 != 0) goto L_0x0038
            java.lang.String r3 = r5.getIpAddress()
            if (r3 == 0) goto L_0x004c
        L_0x0038:
            java.lang.String r3 = r6.getIpAddress()
            if (r3 == 0) goto L_0x004e
            java.lang.String r3 = r6.getIpAddress()
            java.lang.String r4 = r5.getIpAddress()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x004e
        L_0x004c:
            r3 = 1
            goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            r0 = r0 & r3
            com.samsung.android.knox.net.firewall.Firewall$NetworkInterface r3 = r6.getNetworkInterface()
            if (r3 != 0) goto L_0x005c
            com.samsung.android.knox.net.firewall.Firewall$NetworkInterface r3 = r5.getNetworkInterface()
            if (r3 == 0) goto L_0x0070
        L_0x005c:
            com.samsung.android.knox.net.firewall.Firewall$NetworkInterface r3 = r6.getNetworkInterface()
            if (r3 == 0) goto L_0x0072
            com.samsung.android.knox.net.firewall.Firewall$NetworkInterface r3 = r6.getNetworkInterface()
            com.samsung.android.knox.net.firewall.Firewall$NetworkInterface r4 = r5.getNetworkInterface()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0072
        L_0x0070:
            r3 = 1
            goto L_0x0073
        L_0x0072:
            r3 = 0
        L_0x0073:
            r0 = r0 & r3
            com.samsung.android.knox.AppIdentity r3 = r6.getApplication()
            if (r3 != 0) goto L_0x0080
            com.samsung.android.knox.AppIdentity r3 = r5.getApplication()
            if (r3 == 0) goto L_0x00cc
        L_0x0080:
            com.samsung.android.knox.AppIdentity r3 = r6.getApplication()
            if (r3 == 0) goto L_0x00a0
            com.samsung.android.knox.AppIdentity r3 = r5.getApplication()
            if (r3 == 0) goto L_0x00a0
            com.samsung.android.knox.AppIdentity r3 = r6.getApplication()
            java.lang.String r3 = r3.getPackageName()
            if (r3 != 0) goto L_0x00a0
            com.samsung.android.knox.AppIdentity r3 = r5.getApplication()
            java.lang.String r3 = r3.getPackageName()
            if (r3 == 0) goto L_0x00cc
        L_0x00a0:
            com.samsung.android.knox.AppIdentity r3 = r6.getApplication()
            if (r3 == 0) goto L_0x00ce
            com.samsung.android.knox.AppIdentity r3 = r5.getApplication()
            if (r3 == 0) goto L_0x00ce
            com.samsung.android.knox.AppIdentity r3 = r6.getApplication()
            java.lang.String r3 = r3.getPackageName()
            if (r3 == 0) goto L_0x00ce
            com.samsung.android.knox.AppIdentity r3 = r6.getApplication()
            java.lang.String r3 = r3.getPackageName()
            com.samsung.android.knox.AppIdentity r4 = r5.getApplication()
            java.lang.String r4 = r4.getPackageName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ce
        L_0x00cc:
            r3 = 1
            goto L_0x00cf
        L_0x00ce:
            r3 = 0
        L_0x00cf:
            r0 = r0 & r3
            com.samsung.android.knox.AppIdentity r3 = r6.getApplication()
            if (r3 == 0) goto L_0x00f0
            com.samsung.android.knox.AppIdentity r3 = r5.getApplication()
            if (r3 == 0) goto L_0x00f0
            com.samsung.android.knox.AppIdentity r3 = r6.getApplication()
            java.lang.String r3 = r3.getSignature()
            if (r3 != 0) goto L_0x00f0
            com.samsung.android.knox.AppIdentity r3 = r5.getApplication()
            java.lang.String r3 = r3.getSignature()
            if (r3 == 0) goto L_0x011c
        L_0x00f0:
            com.samsung.android.knox.AppIdentity r3 = r6.getApplication()
            if (r3 == 0) goto L_0x011e
            com.samsung.android.knox.AppIdentity r3 = r5.getApplication()
            if (r3 == 0) goto L_0x011e
            com.samsung.android.knox.AppIdentity r3 = r6.getApplication()
            java.lang.String r3 = r3.getSignature()
            if (r3 == 0) goto L_0x011e
            com.samsung.android.knox.AppIdentity r3 = r6.getApplication()
            java.lang.String r3 = r3.getSignature()
            com.samsung.android.knox.AppIdentity r4 = r5.getApplication()
            java.lang.String r4 = r4.getSignature()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011e
        L_0x011c:
            r3 = 1
            goto L_0x011f
        L_0x011e:
            r3 = 0
        L_0x011f:
            r0 = r0 & r3
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r3 = com.samsung.android.knox.net.firewall.FirewallRule.RuleType.DENY
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r4 = r6.getRuleType()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0136
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r4 = r5.getRuleType()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x014c
        L_0x0136:
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r3 = com.samsung.android.knox.net.firewall.FirewallRule.RuleType.ALLOW
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r4 = r6.getRuleType()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0194
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r4 = r5.getRuleType()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0194
        L_0x014c:
            com.samsung.android.knox.net.firewall.Firewall$Direction r3 = r6.getDirection()
            if (r3 != 0) goto L_0x0158
            com.samsung.android.knox.net.firewall.Firewall$Direction r3 = r5.getDirection()
            if (r3 == 0) goto L_0x016c
        L_0x0158:
            com.samsung.android.knox.net.firewall.Firewall$Direction r3 = r6.getDirection()
            if (r3 == 0) goto L_0x016e
            com.samsung.android.knox.net.firewall.Firewall$Direction r3 = r6.getDirection()
            com.samsung.android.knox.net.firewall.Firewall$Direction r4 = r5.getDirection()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x016e
        L_0x016c:
            r3 = 1
            goto L_0x016f
        L_0x016e:
            r3 = 0
        L_0x016f:
            r0 = r0 & r3
            com.samsung.android.knox.net.firewall.Firewall$PortLocation r3 = r6.getPortLocation()
            if (r3 != 0) goto L_0x017c
            com.samsung.android.knox.net.firewall.Firewall$PortLocation r3 = r5.getPortLocation()
            if (r3 == 0) goto L_0x0190
        L_0x017c:
            com.samsung.android.knox.net.firewall.Firewall$PortLocation r3 = r6.getPortLocation()
            if (r3 == 0) goto L_0x0192
            com.samsung.android.knox.net.firewall.Firewall$PortLocation r3 = r6.getPortLocation()
            com.samsung.android.knox.net.firewall.Firewall$PortLocation r4 = r5.getPortLocation()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0192
        L_0x0190:
            r3 = 1
            goto L_0x0193
        L_0x0192:
            r3 = 0
        L_0x0193:
            r0 = r0 & r3
        L_0x0194:
            java.lang.String r3 = r6.getPortNumber()
            if (r3 != 0) goto L_0x01a0
            java.lang.String r3 = r5.getPortNumber()
            if (r3 == 0) goto L_0x01b4
        L_0x01a0:
            java.lang.String r3 = r6.getPortNumber()
            if (r3 == 0) goto L_0x01b6
            java.lang.String r3 = r6.getPortNumber()
            java.lang.String r4 = r5.getPortNumber()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01b6
        L_0x01b4:
            r3 = 1
            goto L_0x01b7
        L_0x01b6:
            r3 = 0
        L_0x01b7:
            r0 = r0 & r3
            com.samsung.android.knox.net.firewall.Firewall$Protocol r3 = r6.getProtocol()
            if (r3 != 0) goto L_0x01c4
            com.samsung.android.knox.net.firewall.Firewall$Protocol r3 = r5.getProtocol()
            if (r3 == 0) goto L_0x01d8
        L_0x01c4:
            com.samsung.android.knox.net.firewall.Firewall$Protocol r3 = r6.getProtocol()
            if (r3 == 0) goto L_0x01da
            com.samsung.android.knox.net.firewall.Firewall$Protocol r3 = r6.getProtocol()
            com.samsung.android.knox.net.firewall.Firewall$Protocol r4 = r5.getProtocol()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01da
        L_0x01d8:
            r3 = 1
            goto L_0x01db
        L_0x01da:
            r3 = 0
        L_0x01db:
            r0 = r0 & r3
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r3 = r6.getRuleType()
            if (r3 != 0) goto L_0x01e8
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r3 = r5.getRuleType()
            if (r3 == 0) goto L_0x01fc
        L_0x01e8:
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r3 = r6.getRuleType()
            if (r3 == 0) goto L_0x01fe
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r3 = r6.getRuleType()
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r4 = r5.getRuleType()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01fe
        L_0x01fc:
            r3 = 1
            goto L_0x01ff
        L_0x01fe:
            r3 = 0
        L_0x01ff:
            r0 = r0 & r3
            com.samsung.android.knox.net.firewall.FirewallRule$Status r3 = r6.getStatus()
            if (r3 != 0) goto L_0x020c
            com.samsung.android.knox.net.firewall.FirewallRule$Status r3 = r5.getStatus()
            if (r3 == 0) goto L_0x0220
        L_0x020c:
            com.samsung.android.knox.net.firewall.FirewallRule$Status r3 = r6.getStatus()
            if (r3 == 0) goto L_0x0222
            com.samsung.android.knox.net.firewall.FirewallRule$Status r3 = r6.getStatus()
            com.samsung.android.knox.net.firewall.FirewallRule$Status r4 = r5.getStatus()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0222
        L_0x0220:
            r3 = 1
            goto L_0x0223
        L_0x0222:
            r3 = 0
        L_0x0223:
            r0 = r0 & r3
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r3 = com.samsung.android.knox.net.firewall.FirewallRule.RuleType.REDIRECT
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r4 = r6.getRuleType()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0280
            com.samsung.android.knox.net.firewall.FirewallRule$RuleType r4 = r5.getRuleType()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0280
            java.lang.String r3 = r6.getTargetIpAddress()
            if (r3 != 0) goto L_0x0246
            java.lang.String r3 = r5.getTargetIpAddress()
            if (r3 == 0) goto L_0x025a
        L_0x0246:
            java.lang.String r3 = r6.getTargetIpAddress()
            if (r3 == 0) goto L_0x025c
            java.lang.String r3 = r6.getTargetIpAddress()
            java.lang.String r4 = r5.getTargetIpAddress()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x025c
        L_0x025a:
            r3 = 1
            goto L_0x025d
        L_0x025c:
            r3 = 0
        L_0x025d:
            r0 = r0 & r3
            java.lang.String r3 = r6.getTargetPortNumber()
            if (r3 != 0) goto L_0x026a
            java.lang.String r3 = r5.getTargetPortNumber()
            if (r3 == 0) goto L_0x027e
        L_0x026a:
            java.lang.String r3 = r6.getTargetPortNumber()
            if (r3 == 0) goto L_0x027f
            java.lang.String r6 = r6.getTargetPortNumber()
            java.lang.String r3 = r5.getTargetPortNumber()
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x027f
        L_0x027e:
            r1 = 1
        L_0x027f:
            r0 = r0 & r1
        L_0x0280:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.net.firewall.FirewallRule.equals(java.lang.Object):boolean");
    }

    public Firewall.AddressType getAddressType() {
        return this.mAddressType;
    }

    public AppIdentity getApplication() {
        return this.mAppIdentity;
    }

    public Firewall.Direction getDirection() {
        if (RuleType.ALLOW.equals(getRuleType()) || RuleType.DENY.equals(getRuleType())) {
            return this.mDirection;
        }
        throw new UnsupportedOperationException(UNSUPPORTED_METHOD + getRuleType().toString());
    }

    public int getId() {
        return this.mId;
    }

    public String getIpAddress() {
        return this.mAddress;
    }

    public Firewall.NetworkInterface getNetworkInterface() {
        return this.mNetworkInterface;
    }

    public Firewall.PortLocation getPortLocation() {
        if (RuleType.ALLOW.equals(getRuleType()) || RuleType.DENY.equals(getRuleType())) {
            return this.mPortLocation;
        }
        throw new UnsupportedOperationException(UNSUPPORTED_METHOD + getRuleType().toString());
    }

    public String getPortNumber() {
        return this.mPortNumber;
    }

    public Firewall.Protocol getProtocol() {
        return this.mProtocol;
    }

    public RuleType getRuleType() {
        return this.mRuleType;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public String getTargetIpAddress() {
        if (RuleType.REDIRECT.equals(getRuleType())) {
            return this.mTargetIp;
        }
        throw new UnsupportedOperationException(UNSUPPORTED_METHOD + getRuleType().toString());
    }

    public String getTargetPortNumber() {
        if (RuleType.REDIRECT.equals(getRuleType())) {
            return this.mTargetPortNumber;
        }
        throw new UnsupportedOperationException(UNSUPPORTED_METHOD + getRuleType().toString());
    }

    public int hashCode() {
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str = this.mAddress;
        int i18 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i19 = (i + 31) * 31;
        Firewall.AddressType addressType = this.mAddressType;
        if (addressType == null) {
            i8 = 0;
        } else {
            i8 = addressType.hashCode();
        }
        int i20 = (i19 + i8) * 31;
        Firewall.Direction direction = this.mDirection;
        if (direction == null) {
            i9 = 0;
        } else {
            i9 = direction.hashCode();
        }
        int i21 = (((i20 + i9) * 31) + this.mId) * 31;
        Firewall.NetworkInterface networkInterface = this.mNetworkInterface;
        if (networkInterface == null) {
            i10 = 0;
        } else {
            i10 = networkInterface.hashCode();
        }
        int i22 = (i21 + i10) * 31;
        AppIdentity appIdentity = this.mAppIdentity;
        if (appIdentity == null) {
            i11 = 0;
        } else {
            i11 = appIdentity.hashCode();
        }
        int i23 = (i22 + i11) * 31;
        Firewall.PortLocation portLocation = this.mPortLocation;
        if (portLocation == null) {
            i12 = 0;
        } else {
            i12 = portLocation.hashCode();
        }
        int i24 = (i23 + i12) * 31;
        String str2 = this.mPortNumber;
        if (str2 == null) {
            i13 = 0;
        } else {
            i13 = str2.hashCode();
        }
        int i25 = (i24 + i13) * 31;
        Firewall.Protocol protocol = this.mProtocol;
        if (protocol == null) {
            i14 = 0;
        } else {
            i14 = protocol.hashCode();
        }
        int i26 = (i25 + i14) * 31;
        RuleType ruleType = this.mRuleType;
        if (ruleType == null) {
            i15 = 0;
        } else {
            i15 = ruleType.hashCode();
        }
        int i27 = (i26 + i15) * 31;
        Status status = this.mStatus;
        if (status == null) {
            i16 = 0;
        } else {
            i16 = status.hashCode();
        }
        int i28 = (i27 + i16) * 31;
        String str3 = this.mTargetIp;
        if (str3 == null) {
            i17 = 0;
        } else {
            i17 = str3.hashCode();
        }
        int i29 = (i28 + i17) * 31;
        String str4 = this.mTargetPortNumber;
        if (str4 != null) {
            i18 = str4.hashCode();
        }
        return i29 + i18;
    }

    public void setApplication(AppIdentity appIdentity) {
        if (appIdentity == null || !FirewallRuleValidator.validatePackageName(appIdentity.getPackageName())) {
            throw new InvalidParameterException("Parameter: app identity is invalid.");
        }
        this.mAppIdentity = appIdentity;
    }

    public void setDirection(Firewall.Direction direction) {
        if (direction == null) {
            throw new InvalidParameterException("Parameter: direction is invalid.");
        } else if (RuleType.ALLOW.equals(getRuleType()) || RuleType.DENY.equals(getRuleType())) {
            this.mDirection = direction;
        } else {
            throw new UnsupportedOperationException(UNSUPPORTED_METHOD + getRuleType().toString());
        }
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setIpAddress(String str) {
        if (this.mAddressType.equals(Firewall.AddressType.IPV4)) {
            if (!FirewallRuleValidator.validadeIpv4Range(str) && !FirewallRuleValidator.validateIpv4Address(str) && !"*".equals(str)) {
                throw new InvalidParameterException("Parameter: address is invalid.");
            }
        } else if (this.mAddressType.equals(Firewall.AddressType.IPV6) && !FirewallRuleValidator.validadeIpv6Range(str) && !FirewallRuleValidator.validateIpv6Address(str) && !"*".equals(str)) {
            throw new InvalidParameterException("Parameter: address is invalid.");
        }
        this.mAddress = str;
    }

    public void setNetworkInterface(Firewall.NetworkInterface networkInterface) {
        if (networkInterface != null) {
            this.mNetworkInterface = networkInterface;
            return;
        }
        throw new InvalidParameterException("Parameter: network interface is invalid.");
    }

    public void setPortLocation(Firewall.PortLocation portLocation) {
        if (portLocation == null) {
            throw new InvalidParameterException("Parameter: port location is invalid.");
        } else if (RuleType.ALLOW.equals(getRuleType()) || RuleType.DENY.equals(getRuleType())) {
            this.mPortLocation = portLocation;
        } else {
            throw new UnsupportedOperationException(UNSUPPORTED_METHOD + getRuleType().toString());
        }
    }

    public void setPortNumber(String str) {
        if (FirewallRuleValidator.validatePortNumber(str) || FirewallRuleValidator.validadePortNumberRange(str) || "*".equals(str)) {
            this.mPortNumber = str;
            return;
        }
        throw new InvalidParameterException("Parameter: port number is invalid.");
    }

    public void setProtocol(Firewall.Protocol protocol) {
        if (protocol != null) {
            this.mProtocol = protocol;
            return;
        }
        throw new InvalidParameterException("Parameter: protocol is invalid.");
    }

    public void setStatus(Status status) {
        this.mStatus = status;
    }

    public void setTargetIpAddress(String str) {
        if (RuleType.REDIRECT.equals(getRuleType())) {
            if (this.mAddressType.equals(Firewall.AddressType.IPV4)) {
                if (!FirewallRuleValidator.validateIpv4Address(str)) {
                    throw new InvalidParameterException("Parameter: target IP is invalid.");
                }
            } else if (!FirewallRuleValidator.validateIpv6Address(str)) {
                throw new InvalidParameterException("Parameter: target IP is invalid.");
            }
            this.mTargetIp = str;
            return;
        }
        throw new UnsupportedOperationException(UNSUPPORTED_METHOD + getRuleType().toString());
    }

    public void setTargetPortNumber(String str) {
        if (!RuleType.REDIRECT.equals(getRuleType())) {
            throw new UnsupportedOperationException(UNSUPPORTED_METHOD + getRuleType().toString());
        } else if (FirewallRuleValidator.validatePortNumber(str)) {
            this.mTargetPortNumber = str;
        } else {
            throw new InvalidParameterException("Parameter: target port number is invalid.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = AnonymousClass2.$SwitchMap$com$samsung$android$knox$net$firewall$FirewallRule$RuleType[this.mRuleType.ordinal()];
        if (i == 1 || i == 2) {
            sb.append("\nIP Address: " + getIpAddress());
            sb.append("\nPort Number: " + getPortNumber());
            sb.append("\nPort Location: " + getPortLocation());
            sb.append("\nPackage Name: " + getApplication().getPackageName());
            sb.append("\nSignature: " + getApplication().getSignature());
            sb.append("\nNetwork Interface: " + getNetworkInterface());
            sb.append("\nDirection: " + getDirection());
            sb.append("\nProtocol: " + getProtocol());
            sb.append("\nAddress Type: " + getAddressType() + "\n");
        } else if (i == 3) {
            sb.append("\nSource IP Address: " + getIpAddress());
            sb.append("\nSource Port Number: " + getPortNumber());
            sb.append("\nTarget IP Address: " + getTargetIpAddress());
            sb.append("\nTarget Port Number: " + getTargetPortNumber());
            sb.append("\nPackage Name: " + getApplication().getPackageName());
            sb.append("\nSignature: " + getApplication().getSignature());
            sb.append("\nNetwork Interface: " + getNetworkInterface());
            sb.append("\nProtocol: " + getProtocol() + "\n");
            sb.append("\nAddress Type: " + getAddressType() + "\n");
        } else if (i == 4) {
            sb.append("\nIP Address: " + getIpAddress());
            sb.append("\nPort Number: " + getPortNumber());
            sb.append("\nPackage Name: " + getApplication().getPackageName());
            sb.append("\nSignature: " + getApplication().getSignature());
            sb.append("\nProtocol: " + getProtocol() + "\n");
            sb.append("\nAddress Type: " + getAddressType() + "\n");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mId);
        parcel.writeSerializable(this.mRuleType);
        parcel.writeSerializable(this.mStatus);
        parcel.writeString(this.mAddress);
        parcel.writeString(this.mPortNumber);
        parcel.writeSerializable(this.mPortLocation);
        parcel.writeParcelable(this.mAppIdentity, i);
        parcel.writeSerializable(this.mNetworkInterface);
        parcel.writeSerializable(this.mDirection);
        parcel.writeSerializable(this.mProtocol);
        parcel.writeSerializable(this.mAddressType);
        parcel.writeString(this.mTargetIp);
        parcel.writeString(this.mTargetPortNumber);
    }

    public FirewallRule(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mRuleType = (RuleType) parcel.readSerializable();
        this.mStatus = (Status) parcel.readSerializable();
        this.mAddress = parcel.readString();
        this.mPortNumber = parcel.readString();
        this.mPortLocation = (Firewall.PortLocation) parcel.readSerializable();
        this.mAppIdentity = (AppIdentity) parcel.readParcelable(AppIdentity.class.getClassLoader());
        this.mNetworkInterface = (Firewall.NetworkInterface) parcel.readSerializable();
        this.mDirection = (Firewall.Direction) parcel.readSerializable();
        this.mProtocol = (Firewall.Protocol) parcel.readSerializable();
        this.mAddressType = (Firewall.AddressType) parcel.readSerializable();
        this.mTargetIp = parcel.readString();
        this.mTargetPortNumber = parcel.readString();
    }
}
