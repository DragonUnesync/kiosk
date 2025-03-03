package com.samsung.android.knox.net.firewall;

import android.app.enterprise.FirewallAllowRule;
import android.app.enterprise.FirewallDenyRule;
import android.app.enterprise.FirewallExceptionRule;
import android.app.enterprise.FirewallRerouteRule;
import com.samsung.android.knox.AppIdentity;
import com.samsung.android.knox.net.firewall.Firewall;
import com.samsung.android.knox.net.firewall.FirewallRule;
import java.util.ArrayList;
import java.util.List;

class FirewallRuleTranslator {
    private static String[] networkInterfaceOptions = {"wifi", "data", "*"};
    private static String[] portLocationOptions = {"remote", "local", "*"};

    /* renamed from: com.samsung.android.knox.net.firewall.FirewallRuleTranslator$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.net.firewall.FirewallRuleTranslator.AnonymousClass1.<clinit>():void");
        }
    }

    private static String translateNetworkInterfaceToString(Firewall.NetworkInterface networkInterface) {
        if (networkInterface == null) {
            return null;
        }
        if (networkInterface.equals(Firewall.NetworkInterface.WIFI_DATA_ONLY)) {
            return networkInterfaceOptions[0];
        }
        if (networkInterface.equals(Firewall.NetworkInterface.MOBILE_DATA_ONLY)) {
            return networkInterfaceOptions[1];
        }
        return networkInterfaceOptions[2];
    }

    private static String translatePortLocationToString(Firewall.PortLocation portLocation) {
        if (portLocation == null) {
            return "";
        }
        if (portLocation.equals(Firewall.PortLocation.REMOTE)) {
            return portLocationOptions[0];
        }
        if (portLocation.equals(Firewall.PortLocation.LOCAL)) {
            return portLocationOptions[1];
        }
        return portLocationOptions[2];
    }

    private static Firewall.NetworkInterface translateStringToNetworkInterface(String str) {
        if (networkInterfaceOptions[0].equals(str)) {
            return Firewall.NetworkInterface.WIFI_DATA_ONLY;
        }
        if (networkInterfaceOptions[1].equals(str)) {
            return Firewall.NetworkInterface.MOBILE_DATA_ONLY;
        }
        return Firewall.NetworkInterface.ALL_NETWORKS;
    }

    private static Firewall.PortLocation translateStringToPortLocation(String str) {
        Firewall.PortLocation portLocation = Firewall.PortLocation.ALL;
        if (portLocationOptions[0].equals(str)) {
            return Firewall.PortLocation.REMOTE;
        }
        if (portLocationOptions[1].equals(str)) {
            return Firewall.PortLocation.LOCAL;
        }
        return portLocation;
    }

    private static FirewallRule translateToNew(String str, FirewallRule.RuleType ruleType) {
        if (ruleType == FirewallRule.RuleType.ALLOW) {
            return translateToNewAllow(str);
        }
        if (ruleType == FirewallRule.RuleType.DENY) {
            return translateToNewDeny(str);
        }
        if (ruleType == FirewallRule.RuleType.REDIRECT) {
            return translateToNewRedirect(str);
        }
        if (ruleType == FirewallRule.RuleType.REDIRECT_EXCEPTION) {
            return translateToNewRedirectException(str);
        }
        return null;
    }

    private static FirewallRule translateToNewAllow(String str) {
        Firewall.NetworkInterface networkInterface;
        String str2;
        if (str == null) {
            return null;
        }
        String[] split = str.split(";");
        if (split.length < 2 || split.length > 4) {
            return null;
        }
        Firewall.PortLocation portLocation = Firewall.PortLocation.REMOTE;
        Firewall.NetworkInterface networkInterface2 = Firewall.NetworkInterface.ALL_NETWORKS;
        int lastIndexOf = split[0].lastIndexOf(":");
        if (lastIndexOf == -1) {
            return null;
        }
        String substring = split[0].substring(0, lastIndexOf);
        String substring2 = split[0].substring(lastIndexOf + 1);
        Firewall.PortLocation translateStringToPortLocation = translateStringToPortLocation(split[1]);
        if (split.length == 3) {
            networkInterface2 = translateStringToNetworkInterface(split[2]);
        }
        if (split.length > 3) {
            str2 = split[2];
            networkInterface = translateStringToNetworkInterface(split[3]);
        } else {
            Firewall.NetworkInterface networkInterface3 = networkInterface2;
            str2 = "*";
            networkInterface = networkInterface3;
        }
        FirewallRule firewallRule = new FirewallRule(FirewallRule.RuleType.ALLOW, Firewall.AddressType.IPV4);
        AppIdentity appIdentity = new AppIdentity(str2, (String) null);
        firewallRule.setIpAddress(substring);
        firewallRule.setPortNumber(substring2);
        firewallRule.setPortLocation(translateStringToPortLocation);
        firewallRule.setApplication(appIdentity);
        firewallRule.setNetworkInterface(networkInterface);
        return firewallRule;
    }

    private static FirewallRule translateToNewDeny(String str) {
        Firewall.NetworkInterface networkInterface;
        String str2;
        if (str == null) {
            return null;
        }
        String[] split = str.split(";");
        if (split.length < 2 || split.length > 4) {
            return null;
        }
        Firewall.PortLocation portLocation = Firewall.PortLocation.REMOTE;
        Firewall.NetworkInterface networkInterface2 = Firewall.NetworkInterface.ALL_NETWORKS;
        int lastIndexOf = split[0].lastIndexOf(":");
        if (lastIndexOf == -1) {
            return null;
        }
        String substring = split[0].substring(0, lastIndexOf);
        String substring2 = split[0].substring(lastIndexOf + 1);
        Firewall.PortLocation translateStringToPortLocation = translateStringToPortLocation(split[1]);
        if (split.length == 3) {
            networkInterface2 = translateStringToNetworkInterface(split[2]);
        }
        if (split.length > 3) {
            str2 = split[2];
            networkInterface = translateStringToNetworkInterface(split[3]);
        } else {
            Firewall.NetworkInterface networkInterface3 = networkInterface2;
            str2 = "*";
            networkInterface = networkInterface3;
        }
        FirewallRule firewallRule = new FirewallRule(FirewallRule.RuleType.DENY, Firewall.AddressType.IPV4);
        AppIdentity appIdentity = new AppIdentity(str2, (String) null);
        firewallRule.setIpAddress(substring);
        firewallRule.setPortNumber(substring2);
        firewallRule.setPortLocation(translateStringToPortLocation);
        firewallRule.setApplication(appIdentity);
        firewallRule.setNetworkInterface(networkInterface);
        return firewallRule;
    }

    public static List<FirewallRule> translateToNewList(List<String> list, FirewallRule.RuleType ruleType, FirewallRule.Status status) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String translateToNew : list) {
            FirewallRule translateToNew2 = translateToNew(translateToNew, ruleType);
            translateToNew2.setStatus(status);
            arrayList.add(translateToNew2);
        }
        return arrayList;
    }

    private static FirewallRule translateToNewRedirect(String str) {
        Firewall.NetworkInterface networkInterface;
        String str2;
        if (str == null) {
            return null;
        }
        String[] split = str.split(";");
        if (split.length != 2 && split.length != 4) {
            return null;
        }
        Firewall.NetworkInterface networkInterface2 = Firewall.NetworkInterface.ALL_NETWORKS;
        int lastIndexOf = split[0].lastIndexOf(":");
        if (lastIndexOf == -1) {
            return null;
        }
        String substring = split[0].substring(0, lastIndexOf);
        String substring2 = split[0].substring(lastIndexOf + 1);
        int lastIndexOf2 = split[1].lastIndexOf(":");
        if (lastIndexOf2 == -1) {
            return null;
        }
        String substring3 = split[1].substring(0, lastIndexOf2);
        String substring4 = split[1].substring(lastIndexOf2 + 1);
        if (split.length == 4) {
            str2 = split[2];
            networkInterface = translateStringToNetworkInterface(split[3]);
        } else {
            Firewall.NetworkInterface networkInterface3 = networkInterface2;
            str2 = "*";
            networkInterface = networkInterface3;
        }
        FirewallRule firewallRule = new FirewallRule(FirewallRule.RuleType.REDIRECT, Firewall.AddressType.IPV4);
        AppIdentity appIdentity = new AppIdentity(str2, (String) null);
        firewallRule.setIpAddress(substring);
        firewallRule.setPortNumber(substring2);
        firewallRule.setTargetIpAddress(substring3);
        firewallRule.setTargetPortNumber(substring4);
        firewallRule.setApplication(appIdentity);
        firewallRule.setNetworkInterface(networkInterface);
        return firewallRule;
    }

    private static FirewallRule translateToNewRedirectException(String str) {
        int lastIndexOf;
        String str2;
        if (str == null) {
            return null;
        }
        String[] split = str.split(";");
        if (split.length < 1 || split.length > 2 || (lastIndexOf = split[0].lastIndexOf(":")) == -1) {
            return null;
        }
        String substring = split[0].substring(0, lastIndexOf);
        String substring2 = split[0].substring(lastIndexOf + 1);
        if (split.length == 2) {
            str2 = split[1];
        } else {
            str2 = "*";
        }
        FirewallRule firewallRule = new FirewallRule(FirewallRule.RuleType.REDIRECT_EXCEPTION, Firewall.AddressType.IPV4);
        AppIdentity appIdentity = new AppIdentity(str2, (String) null);
        firewallRule.setIpAddress(substring);
        firewallRule.setPortNumber(substring2);
        firewallRule.setApplication(appIdentity);
        return firewallRule;
    }

    public static Object translateToOld(FirewallRule firewallRule) {
        int i = AnonymousClass1.$SwitchMap$com$samsung$android$knox$net$firewall$FirewallRule$RuleType[firewallRule.getRuleType().ordinal()];
        if (i == 1) {
            return translateToOldAllow(firewallRule);
        }
        if (i == 2) {
            return translateToOldDeny(firewallRule);
        }
        if (i == 3) {
            return translateToOldRedirect(firewallRule);
        }
        if (i != 4) {
            return null;
        }
        return translateToOldRedirectException(firewallRule);
    }

    private static FirewallAllowRule translateToOldAllow(FirewallRule firewallRule) {
        StringBuilder sb = new StringBuilder();
        sb.append(firewallRule.getIpAddress());
        sb.append(":");
        sb.append(firewallRule.getPortNumber());
        sb.append(";");
        sb.append(translatePortLocationToString(firewallRule.getPortLocation()));
        if (!firewallRule.getNetworkInterface().equals(Firewall.NetworkInterface.ALL_NETWORKS)) {
            sb.append(";");
            sb.append(translateNetworkInterfaceToString(firewallRule.getNetworkInterface()));
        }
        FirewallAllowRule firewallAllowRule = new FirewallAllowRule();
        firewallAllowRule.add(sb.toString());
        return firewallAllowRule;
    }

    private static FirewallDenyRule translateToOldDeny(FirewallRule firewallRule) {
        StringBuilder sb = new StringBuilder();
        sb.append(firewallRule.getIpAddress());
        sb.append(":");
        sb.append(firewallRule.getPortNumber());
        sb.append(";");
        sb.append(translatePortLocationToString(firewallRule.getPortLocation()));
        String packageName = firewallRule.getApplication().getPackageName();
        if ((packageName != null && !packageName.equals("*")) || !firewallRule.getNetworkInterface().equals(Firewall.NetworkInterface.ALL_NETWORKS)) {
            sb.append(";");
            sb.append(packageName);
            sb.append(";");
            sb.append(translateNetworkInterfaceToString(firewallRule.getNetworkInterface()));
        }
        FirewallDenyRule firewallDenyRule = new FirewallDenyRule();
        firewallDenyRule.add(sb.toString());
        return firewallDenyRule;
    }

    private static FirewallRerouteRule translateToOldRedirect(FirewallRule firewallRule) {
        StringBuilder sb = new StringBuilder();
        sb.append(firewallRule.getIpAddress());
        sb.append(":");
        sb.append(firewallRule.getPortNumber());
        sb.append(";");
        sb.append(firewallRule.getTargetIpAddress());
        sb.append(":");
        sb.append(firewallRule.getTargetPortNumber());
        String packageName = firewallRule.getApplication().getPackageName();
        if ((packageName != null && !packageName.equals("*")) || !firewallRule.getNetworkInterface().equals(Firewall.NetworkInterface.ALL_NETWORKS)) {
            sb.append(";");
            sb.append(packageName);
            sb.append(";");
            sb.append(translateNetworkInterfaceToString(firewallRule.getNetworkInterface()));
        }
        FirewallRerouteRule firewallRerouteRule = new FirewallRerouteRule();
        firewallRerouteRule.add(sb.toString());
        return firewallRerouteRule;
    }

    private static FirewallExceptionRule translateToOldRedirectException(FirewallRule firewallRule) {
        FirewallExceptionRule firewallExceptionRule = new FirewallExceptionRule();
        firewallExceptionRule.add(firewallRule.getIpAddress() + ":" + firewallRule.getPortNumber());
        return firewallExceptionRule;
    }
}
