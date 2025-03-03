package com.samsung.android.knox.net.firewall;

import android.app.enterprise.FirewallPolicy;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.net.firewall.FirewallResponse;
import com.samsung.android.knox.net.firewall.FirewallRule;
import com.sec.enterprise.firewall.FirewallRule;
import java.util.ArrayList;
import java.util.List;

public class Firewall {
    public static final String ACTION_BLOCKED_DOMAIN = "com.samsung.android.knox.intent.action.BLOCKED_DOMAIN";
    public static final String EXTRA_BLOCKED_DOMAIN_ISFOREGROUND = "com.samsung.android.knox.intent.extra.BLOCKED_DOMAIN_ISFOREGROUND";
    public static final String EXTRA_BLOCKED_DOMAIN_PACKAGENAME = "com.samsung.android.knox.intent.extra.BLOCKED_DOMAIN_PACKAGENAME";
    public static final String EXTRA_BLOCKED_DOMAIN_TIMESTAMP = "com.samsung.android.knox.intent.extra.BLOCKED_DOMAIN_TIMESTAMP";
    public static final String EXTRA_BLOCKED_DOMAIN_UID = "com.samsung.android.knox.intent.extra.BLOCKED_DOMAIN_UID";
    public static final String EXTRA_BLOCKED_DOMAIN_URL = "com.samsung.android.knox.intent.extra.BLOCKED_DOMAIN_URL";
    private static final int FIREWALL_ALLOW_RULE = 1;
    private static final int FIREWALL_DENY_RULE = 2;
    private static final int FIREWALL_REDIRECT_EXCEPTION_RULE = 8;
    private static final int FIREWALL_REDIRECT_RULE = 4;
    private com.sec.enterprise.firewall.Firewall mFirewall;
    private FirewallPolicy mFirewallPolicy;

    public enum AddressType {
        IPV4,
        IPV6
    }

    public enum Direction {
        INPUT,
        OUTPUT,
        ALL
    }

    public enum NetworkInterface {
        ALL_NETWORKS,
        WIFI_DATA_ONLY,
        MOBILE_DATA_ONLY
    }

    public enum PortLocation {
        REMOTE,
        LOCAL,
        ALL
    }

    public enum Protocol {
        TCP,
        UDP,
        ALL
    }

    public Firewall(com.sec.enterprise.firewall.Firewall firewall) {
        this.mFirewall = firewall;
        this.mFirewallPolicy = null;
    }

    public FirewallResponse[] addDomainFilterRules(List<DomainFilterRule> list) {
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        if (firewall != null) {
            try {
                return FirewallResponse.convertToNewArray(firewall.addDomainFilterRules(DomainFilterRule.convertToOldList(list)));
            } catch (NoClassDefFoundError e) {
                throw new NoClassDefFoundError(e.getMessage());
            } catch (NoSuchMethodError e8) {
                throw new NoSuchMethodError(e8.getMessage());
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(Firewall.class, "addDomainFilterRules", new Class[]{List.class}, 19));
        }
    }

    public FirewallResponse[] addRules(FirewallRule[] firewallRuleArr) {
        FirewallResponse addFail;
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        if (firewall != null) {
            try {
                return FirewallResponse.convertToNewArray(firewall.addRules(FirewallRule.convertToOldArray(firewallRuleArr)));
            } catch (NoClassDefFoundError e) {
                throw new NoClassDefFoundError(e.getMessage());
            } catch (NoSuchMethodError e8) {
                throw new NoSuchMethodError(e8.getMessage());
            }
        } else if (firewallRuleArr == null) {
            return null;
        } else {
            int i = 0;
            while (i < firewallRuleArr.length) {
                try {
                    FirewallRuleValidator.usesUnsupportedParameters(firewallRuleArr[i]);
                    i++;
                } catch (NoSuchMethodError e9) {
                    throw new NoSuchMethodError(e9.getMessage());
                }
            }
            FirewallResponse[] firewallResponseArr = new FirewallResponse[firewallRuleArr.length];
            for (int i8 = 0; i8 < firewallRuleArr.length; i8++) {
                FirewallRule firewallRule = firewallRuleArr[i8];
                FirewallResponse validateFirewallRule = FirewallRuleValidator.validateFirewallRule(firewallRule);
                if (validateFirewallRule.getResult() == FirewallResponse.Result.SUCCESS) {
                    if (this.mFirewallPolicy.addRules(FirewallRuleTranslator.translateToOld(firewallRule))) {
                        addFail = FirewallResponse.addSuccess();
                    } else {
                        addFail = FirewallResponse.addFail();
                    }
                    validateFirewallRule = addFail;
                }
                firewallResponseArr[i8] = validateFirewallRule;
            }
            return firewallResponseArr;
        }
    }

    public FirewallResponse[] clearRules(int i) {
        FirewallResponse firewallResponse;
        FirewallResponse firewallResponse2;
        FirewallResponse firewallResponse3;
        FirewallResponse firewallResponse4;
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        if (firewall != null) {
            return FirewallResponse.convertToNewArray(firewall.clearRules(i));
        }
        FirewallResponse[] firewallResponseArr = new FirewallResponse[4];
        if ((i & 1) == 1) {
            if (this.mFirewallPolicy.cleanIptablesAllowRules()) {
                firewallResponse4 = FirewallResponse.clearSuccess();
            } else {
                firewallResponse4 = FirewallResponse.clearFail();
            }
            firewallResponseArr[0] = firewallResponse4;
        } else {
            firewallResponseArr[0] = FirewallResponse.clearNoChanges();
        }
        if ((i & 2) == 2) {
            if (this.mFirewallPolicy.cleanIptablesDenyRules()) {
                firewallResponse3 = FirewallResponse.clearSuccess();
            } else {
                firewallResponse3 = FirewallResponse.clearFail();
            }
            firewallResponseArr[1] = firewallResponse3;
        } else {
            firewallResponseArr[1] = FirewallResponse.clearNoChanges();
        }
        if ((i & 4) == 4) {
            if (this.mFirewallPolicy.cleanIptablesRerouteRules()) {
                firewallResponse2 = FirewallResponse.clearSuccess();
            } else {
                firewallResponse2 = FirewallResponse.clearFail();
            }
            firewallResponseArr[2] = firewallResponse2;
        } else {
            firewallResponseArr[2] = FirewallResponse.clearNoChanges();
        }
        if ((i & 8) == 8) {
            if (this.mFirewallPolicy.cleanIptablesRedirectExceptionsRules()) {
                firewallResponse = FirewallResponse.clearSuccess();
            } else {
                firewallResponse = FirewallResponse.clearFail();
            }
            firewallResponseArr[3] = firewallResponse;
        } else {
            firewallResponseArr[3] = FirewallResponse.clearNoChanges();
        }
        return firewallResponseArr;
    }

    public FirewallResponse enableDomainFilterReport(boolean z) {
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        Class<Firewall> cls = Firewall.class;
        if (firewall != null) {
            try {
                return FirewallResponse.convertToNew(firewall.enableDomainFilterReport(z));
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "enableDomainFilterReport", new Class[]{Boolean.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "enableDomainFilterReport", new Class[]{Boolean.TYPE}, 19));
        }
    }

    public FirewallResponse enableFirewall(boolean z) {
        FirewallResponse firewallResponse;
        String str;
        String str2;
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        if (firewall != null) {
            return FirewallResponse.convertToNew(firewall.enableFirewall(z));
        }
        if (this.mFirewallPolicy.setIptablesOption(z)) {
            FirewallResponse.Result result = FirewallResponse.Result.SUCCESS;
            FirewallResponse.ErrorCode errorCode = FirewallResponse.ErrorCode.NO_ERROR;
            if (z) {
                str2 = " successfully enabled.\n";
            } else {
                str2 = " successfully disabled.\n";
            }
            firewallResponse = new FirewallResponse(result, errorCode, str2);
        } else {
            FirewallResponse.Result result2 = FirewallResponse.Result.FAILED;
            FirewallResponse.ErrorCode errorCode2 = FirewallResponse.ErrorCode.UNEXPECTED_ERROR;
            if (z) {
                str = " failed to enable. Error: ";
            } else {
                str = " failed to disable. Error: ";
            }
            firewallResponse = new FirewallResponse(result2, errorCode2, str);
        }
        return firewallResponse;
    }

    public List<DomainFilterReport> getDomainFilterReport(List<String> list) {
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        Class<List> cls = List.class;
        Class<Firewall> cls2 = Firewall.class;
        if (firewall != null) {
            try {
                return DomainFilterReport.convertToNewList(firewall.getDomainFilterReport(list));
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "getDomainFilterReport", new Class[]{cls}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "getDomainFilterReport", new Class[]{cls}, 19));
        }
    }

    public List<DomainFilterRule> getDomainFilterRules(List<String> list) {
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        Class<List> cls = List.class;
        Class<Firewall> cls2 = Firewall.class;
        if (firewall != null) {
            try {
                return DomainFilterRule.convertToNewList(firewall.getDomainFilterRules(list));
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "getDomainFilterRules", new Class[]{cls}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "getDomainFilterRules", new Class[]{cls}, 19));
        }
    }

    public FirewallRule[] getRules(int i, FirewallRule.Status status) {
        FirewallRule.Status status2;
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        if (firewall != null) {
            return FirewallRule.convertToNewArray(firewall.getRules(i, SupportLibUtils.convertEnumToEnum(status, FirewallRule.Status.class)));
        }
        if (isFirewallEnabled()) {
            status2 = FirewallRule.Status.ENABLED;
        } else {
            status2 = FirewallRule.Status.DISABLED;
        }
        if (status != null && status != status2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) == 1) {
            arrayList.addAll(FirewallRuleTranslator.translateToNewList(this.mFirewallPolicy.getIptablesAllowRules(), FirewallRule.RuleType.ALLOW, status2));
        }
        if ((i & 2) == 2) {
            arrayList.addAll(FirewallRuleTranslator.translateToNewList(this.mFirewallPolicy.getIptablesDenyRules(), FirewallRule.RuleType.DENY, status2));
        }
        if ((i & 4) == 4) {
            arrayList.addAll(FirewallRuleTranslator.translateToNewList(this.mFirewallPolicy.getIptablesRerouteRules(), FirewallRule.RuleType.REDIRECT, status2));
        }
        if ((i & 8) == 8) {
            arrayList.addAll(FirewallRuleTranslator.translateToNewList(this.mFirewallPolicy.getIptablesRedirectExceptionsRules(), FirewallRule.RuleType.REDIRECT_EXCEPTION, status2));
        }
        FirewallRule[] firewallRuleArr = new FirewallRule[arrayList.size()];
        arrayList.toArray(firewallRuleArr);
        return firewallRuleArr;
    }

    public boolean isDomainFilterReportEnabled() {
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        Class<Firewall> cls = Firewall.class;
        if (firewall != null) {
            try {
                return firewall.isDomainFilterReportEnabled();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "isDomainFilterReportEnabled", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "isDomainFilterReportEnabled", (Class<?>[]) null, 19));
        }
    }

    public boolean isFirewallEnabled() {
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        if (firewall != null) {
            return firewall.isFirewallEnabled();
        }
        return this.mFirewallPolicy.getIptablesOption();
    }

    public String[] listIptablesRules() {
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        if (firewall != null) {
            return firewall.listIptablesRules();
        }
        List listIptablesRules = this.mFirewallPolicy.listIptablesRules();
        String[] strArr = new String[listIptablesRules.size()];
        listIptablesRules.toArray(strArr);
        return strArr;
    }

    public FirewallResponse[] removeDomainFilterRules(List<DomainFilterRule> list) {
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        if (firewall != null) {
            try {
                return FirewallResponse.convertToNewArray(firewall.removeDomainFilterRules(DomainFilterRule.convertToOldList(list)));
            } catch (NoClassDefFoundError e) {
                throw new NoClassDefFoundError(e.getMessage());
            } catch (NoSuchMethodError e8) {
                throw new NoSuchMethodError(e8.getMessage());
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(Firewall.class, "removeDomainFilterRules", new Class[]{List.class}, 19));
        }
    }

    public FirewallResponse[] removeRules(FirewallRule[] firewallRuleArr) {
        FirewallResponse removeFail;
        com.sec.enterprise.firewall.Firewall firewall = this.mFirewall;
        if (firewall != null) {
            try {
                return FirewallResponse.convertToNewArray(firewall.removeRules(FirewallRule.convertToOldArray(firewallRuleArr)));
            } catch (NoClassDefFoundError e) {
                throw new NoClassDefFoundError(e.getMessage());
            } catch (NoSuchMethodError e8) {
                throw new NoSuchMethodError(e8.getMessage());
            }
        } else {
            int i = 0;
            while (i < firewallRuleArr.length) {
                try {
                    FirewallRuleValidator.usesUnsupportedParameters(firewallRuleArr[i]);
                    i++;
                } catch (NoSuchMethodError e9) {
                    throw new NoSuchMethodError(e9.getMessage());
                }
            }
            FirewallResponse[] firewallResponseArr = new FirewallResponse[firewallRuleArr.length];
            for (int i8 = 0; i8 < firewallRuleArr.length; i8++) {
                FirewallRule firewallRule = firewallRuleArr[i8];
                FirewallResponse validateFirewallRule = FirewallRuleValidator.validateFirewallRule(firewallRule);
                if (validateFirewallRule.getResult() == FirewallResponse.Result.SUCCESS) {
                    if (this.mFirewallPolicy.removeRules(FirewallRuleTranslator.translateToOld(firewallRule))) {
                        removeFail = FirewallResponse.removeSuccess();
                    } else {
                        removeFail = FirewallResponse.removeFail();
                    }
                    validateFirewallRule = removeFail;
                }
                firewallResponseArr[i8] = validateFirewallRule;
            }
            return firewallResponseArr;
        }
    }

    public Firewall(FirewallPolicy firewallPolicy) {
        this.mFirewall = null;
        this.mFirewallPolicy = firewallPolicy;
    }
}
