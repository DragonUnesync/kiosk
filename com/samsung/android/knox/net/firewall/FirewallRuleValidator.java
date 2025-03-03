package com.samsung.android.knox.net.firewall;

import android.text.TextUtils;
import android.util.Patterns;
import com.samsung.android.knox.AppIdentity;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.net.firewall.Firewall;
import com.samsung.android.knox.net.firewall.FirewallResponse;
import com.samsung.android.knox.net.firewall.FirewallRule;

class FirewallRuleValidator {
    private static final String ADDRESS = "address";
    private static final String APP_IDENTITY = "app identity";
    private static final String DIRECTION = "direction";
    private static final String NETWORK_INTERFACE = "network interface";
    private static final String PARAMETERS = "Parameter(s): ";
    private static final String PORT_LOCATION = "port location";
    private static final String PORT_NUMBER = "port number";
    private static final String PROTOCOL = "protocol";
    private static final int SIZE_IPV4_ADDRESS = 4;
    private static final int SIZE_IPV6_ADDRESS = 16;
    private static final int SIZE_SHORT_INT = 2;
    private static final String SOURCE_ADDRESS = "source address";
    private static final String SOURCE_PORT_NUMBER = "source port number";
    private static final String TARGET_IP = "target IP";
    private static final String TARGET_PORT_NUMBER = "target port number";

    /* renamed from: com.samsung.android.knox.net.firewall.FirewallRuleValidator$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.net.firewall.FirewallRuleValidator.AnonymousClass1.<clinit>():void");
        }
    }

    private static long convertFromHexToInt(String str) {
        return Long.parseLong(str, 16);
    }

    private static String convertIpv6ToCompleteForm(String str) {
        if (str == null || !str.contains("::")) {
            return str;
        }
        String[] split = str.split("::");
        int i = 0;
        if (split.length == 1) {
            if (str.charAt(0) == ':') {
                String[] split2 = split[0].split(":");
                int length = 8 - split2.length;
                StringBuilder sb = new StringBuilder();
                while (i < length) {
                    sb.append("0:");
                    i++;
                }
                for (int i8 = length; i8 < 8; i8++) {
                    sb.append(split2[i8 - length]);
                    if (i8 != 7) {
                        sb.append(":");
                    }
                }
                return sb.toString();
            }
            String[] split3 = split[0].split(":");
            int length2 = 8 - split3.length;
            StringBuilder sb2 = new StringBuilder();
            while (i < length2) {
                sb2.append(split3[i] + ":");
                i++;
            }
            while (length2 < 8) {
                sb2.append("0");
                if (length2 != 7) {
                    sb2.append(":");
                }
                length2++;
            }
            return sb2.toString();
        } else if (split.length != 2) {
            return null;
        } else {
            String[] split4 = split[0].split(":");
            String[] split5 = split[1].split(":");
            int length3 = (8 - split4.length) - split5.length;
            StringBuilder sb3 = new StringBuilder();
            while (i < split4.length) {
                sb3.append(split4[i] + ":");
                i++;
            }
            for (int length4 = split4.length; length4 < split4.length + length3; length4++) {
                sb3.append("0:");
            }
            for (int length5 = split4.length + length3; length5 < 8; length5++) {
                sb3.append(split5[(length5 - split4.length) - length3]);
                if (length5 != 7) {
                    sb3.append(":");
                }
            }
            return sb3.toString();
        }
    }

    private static boolean isIpv4MappedAddress(byte[] bArr) {
        if (bArr != null && bArr.length >= 16) {
            for (int i = 0; i < 10; i++) {
                if (bArr[i] != 0) {
                    return false;
                }
            }
            if (bArr[10] == -1 && bArr[11] == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static byte[] translateIpv4MappedAddress(byte[] bArr) {
        if (!isIpv4MappedAddress(bArr)) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 12, bArr2, 0, 4);
        return bArr2;
    }

    private static byte[] translateIpv4TextualAddress(String str) {
        String str2 = str;
        if (str2 == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[4];
        String[] split = str2.split("\\.", -1);
        try {
            int length = split.length;
            int i = 0;
            if (length == 1) {
                long parseLong = Long.parseLong(split[0]);
                if (parseLong < 0 || parseLong > 4294967295L) {
                    return null;
                }
                bArr[0] = (byte) ((int) ((parseLong >> 24) & 255));
                bArr[1] = (byte) ((int) (((16777215 & parseLong) >> 16) & 255));
                bArr[2] = (byte) ((int) (((parseLong & 65535) >> 8) & 255));
                bArr[3] = (byte) ((int) (parseLong & 255));
            } else if (length == 2) {
                long parseInt = (long) Integer.parseInt(split[0]);
                if (parseInt < 0 || parseInt > 255) {
                    return null;
                }
                try {
                    bArr[0] = (byte) ((int) (parseInt & 255));
                    long parseInt2 = (long) Integer.parseInt(split[1]);
                    if (parseInt2 < 0 || parseInt2 > 16777215) {
                        return null;
                    }
                    bArr[1] = (byte) ((int) ((parseInt2 >> 16) & 255));
                    bArr[2] = (byte) ((int) (((parseInt2 & 65535) >> 8) & 255));
                    bArr[3] = (byte) ((int) (parseInt2 & 255));
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else if (length == 3) {
                while (i < 2) {
                    long parseInt3 = (long) Integer.parseInt(split[i]);
                    if (parseInt3 >= 0) {
                        if (parseInt3 <= 255) {
                            bArr[i] = (byte) ((int) (parseInt3 & 255));
                            i++;
                        }
                    }
                    return null;
                }
                long parseInt4 = (long) Integer.parseInt(split[2]);
                if (parseInt4 >= 0) {
                    if (parseInt4 <= 65535) {
                        bArr[2] = (byte) ((int) ((parseInt4 >> 8) & 255));
                        bArr[3] = (byte) ((int) (parseInt4 & 255));
                    }
                }
                return null;
            } else if (length != 4) {
                return null;
            } else {
                while (i < 4) {
                    long parseInt5 = (long) Integer.parseInt(split[i]);
                    if (parseInt5 >= 0) {
                        if (parseInt5 <= 255) {
                            bArr[i] = (byte) ((int) (parseInt5 & 255));
                            i++;
                        }
                    }
                    return null;
                }
            }
            return bArr;
        } catch (NumberFormatException unused2) {
            return null;
        }
    }

    public static void usesUnsupportedParameters(FirewallRule firewallRule) {
        if (firewallRule != null) {
            FirewallRule.RuleType ruleType = firewallRule.getRuleType();
            if (firewallRule.getAddressType() == null || firewallRule.getAddressType().equals(Firewall.AddressType.IPV4)) {
                Class<String> cls = String.class;
                if (TextUtils.isEmpty(firewallRule.getApplication().getSignature())) {
                    String packageName = firewallRule.getApplication().getPackageName();
                    if (packageName != null && !packageName.trim().isEmpty() && !packageName.equals("*") && ruleType != null && !ruleType.equals(FirewallRule.RuleType.DENY) && !ruleType.equals(FirewallRule.RuleType.REDIRECT)) {
                        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(FirewallRule.class, "setPackageName", new Class[]{cls}, 17));
                    } else if (ruleType != null && !ruleType.equals(FirewallRule.RuleType.REDIRECT) && !ruleType.equals(FirewallRule.RuleType.REDIRECT_EXCEPTION) && !firewallRule.getDirection().equals(Firewall.Direction.ALL)) {
                        throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(Firewall.Direction.class, firewallRule.getDirection().name(), 17));
                    } else if (!firewallRule.getProtocol().equals(Firewall.Protocol.ALL)) {
                        throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(Firewall.Protocol.class, firewallRule.getProtocol().name(), 17));
                    }
                } else {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(AppIdentity.class, "setSignature", new Class[]{cls}, 19));
                }
            } else {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(Firewall.AddressType.class, Firewall.AddressType.IPV6.name(), 17));
            }
        }
    }

    public static boolean validadeIpv4Range(String str) {
        if (str != null && str.contains("-")) {
            String[] split = str.split("-");
            if (split.length == 2 && validateIpv4Address(split[0]) && validateIpv4Address(split[1])) {
                String[] split2 = split[0].split("\\.");
                String[] split3 = split[1].split("\\.");
                if (split2 != null && split2.length == 4 && split3 != null && split3.length == 4) {
                    int i = 0;
                    while (i < 4) {
                        try {
                            int parseInt = Integer.parseInt(split2[i]);
                            int parseInt2 = Integer.parseInt(split3[i]);
                            if (parseInt > parseInt2) {
                                return false;
                            }
                            if (parseInt < parseInt2) {
                                return true;
                            }
                            i++;
                        } catch (NumberFormatException unused) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean validadeIpv6Range(String str) {
        if (str != null && str.contains("-")) {
            String[] split = str.split("-");
            if (split.length == 2 && validateIpv6Address(split[0]) && validateIpv6Address(split[1])) {
                String[] split2 = str.split("-");
                if (split2[0].contains("::")) {
                    split2[0] = convertIpv6ToCompleteForm(split2[0]);
                }
                if (split2[1].contains("::")) {
                    split2[1] = convertIpv6ToCompleteForm(split2[1]);
                }
                String[] split3 = split2[0].split(":");
                String[] split4 = split2[1].split(":");
                if (split3 != null && split3.length == 8 && split4 != null && split4.length == 8) {
                    for (int i = 0; i < 8; i++) {
                        int i8 = (convertFromHexToInt(split3[i]) > convertFromHexToInt(split4[i]) ? 1 : (convertFromHexToInt(split3[i]) == convertFromHexToInt(split4[i]) ? 0 : -1));
                        if (i8 > 0) {
                            return false;
                        }
                        if (i8 < 0) {
                            return true;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean validadePortNumberRange(String str) {
        if (str != null && str.contains("-")) {
            String[] split = str.split("-");
            if (split.length == 2 && validatePortNumber(split[0]) && validatePortNumber(split[1])) {
                try {
                    if (Integer.parseInt(split[0]) > Integer.parseInt(split[1])) {
                        return false;
                    }
                    return true;
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.samsung.android.knox.net.firewall.FirewallResponse validateAllowRule(com.samsung.android.knox.net.firewall.FirewallRule r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r6 != 0) goto L_0x0013
            com.samsung.android.knox.net.firewall.FirewallResponse r6 = new com.samsung.android.knox.net.firewall.FirewallResponse
            com.samsung.android.knox.net.firewall.FirewallResponse$Result r0 = com.samsung.android.knox.net.firewall.FirewallResponse.Result.FAILED
            com.samsung.android.knox.net.firewall.FirewallResponse$ErrorCode r1 = com.samsung.android.knox.net.firewall.FirewallResponse.ErrorCode.OPERATION_NOT_PERMITTED_ERROR
            java.lang.String r2 = "Rule is null."
            r6.<init>(r0, r1, r2)
            return r6
        L_0x0013:
            com.samsung.android.knox.net.firewall.Firewall$AddressType r1 = r6.getAddressType()
            java.lang.String r2 = r6.getIpAddress()
            com.samsung.android.knox.net.firewall.Firewall$AddressType r3 = com.samsung.android.knox.net.firewall.Firewall.AddressType.IPV4
            boolean r1 = r1.equals(r3)
            java.lang.String r3 = "Parameter(s): address"
            java.lang.String r4 = "*"
            r5 = 0
            if (r1 == 0) goto L_0x003f
            boolean r1 = validadeIpv4Range(r2)
            if (r1 != 0) goto L_0x0055
            boolean r1 = validateIpv4Address(r2)
            if (r1 != 0) goto L_0x0055
            boolean r1 = r4.equals(r2)
            if (r1 != 0) goto L_0x0055
            r0.append(r3)
        L_0x003d:
            r1 = 0
            goto L_0x0056
        L_0x003f:
            boolean r1 = validadeIpv6Range(r2)
            if (r1 != 0) goto L_0x0055
            boolean r1 = validateIpv6Address(r2)
            if (r1 != 0) goto L_0x0055
            boolean r1 = r4.equals(r2)
            if (r1 != 0) goto L_0x0055
            r0.append(r3)
            goto L_0x003d
        L_0x0055:
            r1 = 1
        L_0x0056:
            java.lang.String r2 = r6.getPortNumber()
            boolean r2 = validatePortNumber(r2)
            if (r2 != 0) goto L_0x0082
            java.lang.String r2 = r6.getPortNumber()
            boolean r2 = validadePortNumberRange(r2)
            if (r2 != 0) goto L_0x0082
            java.lang.String r2 = r6.getPortNumber()
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0082
            if (r1 == 0) goto L_0x007c
            java.lang.String r1 = "Parameter(s): port number"
            r0.append(r1)
            goto L_0x0081
        L_0x007c:
            java.lang.String r1 = ", port number"
            r0.append(r1)
        L_0x0081:
            r1 = 0
        L_0x0082:
            com.samsung.android.knox.net.firewall.Firewall$PortLocation r2 = r6.getPortLocation()
            if (r2 != 0) goto L_0x0096
            if (r1 == 0) goto L_0x0090
            java.lang.String r1 = "Parameter(s): port location"
            r0.append(r1)
            goto L_0x0095
        L_0x0090:
            java.lang.String r1 = ", port location"
            r0.append(r1)
        L_0x0095:
            r1 = 0
        L_0x0096:
            com.samsung.android.knox.AppIdentity r2 = r6.getApplication()
            if (r2 == 0) goto L_0x00c2
            com.samsung.android.knox.AppIdentity r2 = r6.getApplication()
            java.lang.String r2 = r2.getPackageName()
            if (r2 == 0) goto L_0x00c2
            com.samsung.android.knox.AppIdentity r2 = r6.getApplication()
            java.lang.String r2 = r2.getPackageName()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00d0
            com.samsung.android.knox.AppIdentity r2 = r6.getApplication()
            java.lang.String r2 = r2.getPackageName()
            boolean r2 = validatePackageName(r2)
            if (r2 != 0) goto L_0x00d0
        L_0x00c2:
            if (r1 == 0) goto L_0x00ca
            java.lang.String r1 = "Parameter(s): app identity"
            r0.append(r1)
            goto L_0x00cf
        L_0x00ca:
            java.lang.String r1 = ", app identity"
            r0.append(r1)
        L_0x00cf:
            r1 = 0
        L_0x00d0:
            com.samsung.android.knox.net.firewall.Firewall$NetworkInterface r2 = r6.getNetworkInterface()
            if (r2 != 0) goto L_0x00e4
            if (r1 == 0) goto L_0x00de
            java.lang.String r1 = "Parameter(s): network interface"
            r0.append(r1)
            goto L_0x00e3
        L_0x00de:
            java.lang.String r1 = ", network interface"
            r0.append(r1)
        L_0x00e3:
            r1 = 0
        L_0x00e4:
            com.samsung.android.knox.net.firewall.Firewall$Protocol r2 = r6.getProtocol()
            if (r2 != 0) goto L_0x00f8
            if (r1 == 0) goto L_0x00f2
            java.lang.String r1 = "Parameter(s): protocol"
            r0.append(r1)
            goto L_0x00f7
        L_0x00f2:
            java.lang.String r1 = ", protocol"
            r0.append(r1)
        L_0x00f7:
            r1 = 0
        L_0x00f8:
            com.samsung.android.knox.net.firewall.Firewall$Direction r6 = r6.getDirection()
            if (r6 != 0) goto L_0x010c
            if (r1 == 0) goto L_0x0106
            java.lang.String r6 = "Parameter(s): direction"
            r0.append(r6)
            goto L_0x010d
        L_0x0106:
            java.lang.String r6 = ", direction"
            r0.append(r6)
            goto L_0x010d
        L_0x010c:
            r5 = r1
        L_0x010d:
            if (r5 != 0) goto L_0x0122
            java.lang.String r6 = " is(are) invalid."
            r0.append(r6)
            com.samsung.android.knox.net.firewall.FirewallResponse r6 = new com.samsung.android.knox.net.firewall.FirewallResponse
            com.samsung.android.knox.net.firewall.FirewallResponse$Result r1 = com.samsung.android.knox.net.firewall.FirewallResponse.Result.FAILED
            com.samsung.android.knox.net.firewall.FirewallResponse$ErrorCode r2 = com.samsung.android.knox.net.firewall.FirewallResponse.ErrorCode.INVALID_PARAMETER_ERROR
            java.lang.String r0 = r0.toString()
            r6.<init>(r1, r2, r0)
            return r6
        L_0x0122:
            com.samsung.android.knox.net.firewall.FirewallResponse r6 = new com.samsung.android.knox.net.firewall.FirewallResponse
            com.samsung.android.knox.net.firewall.FirewallResponse$Result r0 = com.samsung.android.knox.net.firewall.FirewallResponse.Result.SUCCESS
            com.samsung.android.knox.net.firewall.FirewallResponse$ErrorCode r1 = com.samsung.android.knox.net.firewall.FirewallResponse.ErrorCode.NO_ERROR
            java.lang.String r2 = "Parameters validated successfully"
            r6.<init>(r0, r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.net.firewall.FirewallRuleValidator.validateAllowRule(com.samsung.android.knox.net.firewall.FirewallRule):com.samsung.android.knox.net.firewall.FirewallResponse");
    }

    private static FirewallResponse validateDenyRule(FirewallRule firewallRule) {
        return validateAllowRule(firewallRule);
    }

    public static FirewallResponse validateFirewallRule(FirewallRule firewallRule) {
        if (firewallRule == null) {
            return new FirewallResponse(FirewallResponse.Result.FAILED, FirewallResponse.ErrorCode.OPERATION_NOT_PERMITTED_ERROR, "Rule is null.");
        }
        int i = AnonymousClass1.$SwitchMap$com$samsung$android$knox$net$firewall$FirewallRule$RuleType[firewallRule.getRuleType().ordinal()];
        if (i == 1) {
            return validateAllowRule(firewallRule);
        }
        if (i == 2) {
            return validateDenyRule(firewallRule);
        }
        if (i == 3) {
            return validateRedirectRule(firewallRule);
        }
        if (i != 4) {
            return new FirewallResponse(FirewallResponse.Result.FAILED, FirewallResponse.ErrorCode.UNEXPECTED_ERROR, "Failed to validate Rule.");
        }
        return validateRedirectExceptionRule(firewallRule);
    }

    public static boolean validateIpv4Address(String str) {
        if (translateIpv4TextualAddress(str) != null) {
            return Patterns.IP_ADDRESS.matcher(str).matches();
        }
        return false;
    }

    public static boolean validateIpv6Address(String str) {
        int i;
        byte[] translateIpv4TextualAddress;
        int i8;
        if (str == null || str.length() < 2) {
            return false;
        }
        byte[] bArr = new byte[16];
        if (str.charAt(0) != ':') {
            i = 0;
        } else if (str.charAt(1) != ':') {
            return false;
        } else {
            i = 1;
        }
        int i9 = i;
        int i10 = 0;
        boolean z = false;
        int i11 = 0;
        int i12 = -1;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            int i13 = i + 1;
            char charAt = str.charAt(i);
            int digit = Character.digit(charAt, 16);
            if (digit != -1) {
                i10 = (i10 << 4) | digit;
                if (i10 > 65535) {
                    return false;
                }
                i8 = i13;
                z = true;
            } else if (charAt == ':') {
                if (!z) {
                    if (i12 != -1) {
                        return false;
                    }
                    i12 = i11;
                    i8 = i13;
                    i9 = i8;
                } else if (i13 == str.length() || i11 + 2 > 16) {
                    return false;
                } else {
                    int i14 = i11 + 1;
                    bArr[i11] = (byte) ((i10 >> 8) & 255);
                    i11 += 2;
                    bArr[i14] = (byte) (i10 & 255);
                    i8 = i13;
                    i9 = i8;
                    i10 = 0;
                    z = false;
                }
            } else if (charAt != '.' || i11 + 4 > 16) {
                return false;
            } else {
                String substring = str.substring(i9, str.length());
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    int indexOf = substring.indexOf(46, i15);
                    if (indexOf == -1) {
                        break;
                    }
                    i16++;
                    i15 = indexOf + 1;
                }
                if (i16 != 3 || (translateIpv4TextualAddress = translateIpv4TextualAddress(substring)) == null) {
                    return false;
                }
                int i17 = 0;
                while (i17 < 4) {
                    bArr[i11] = translateIpv4TextualAddress[i17];
                    i17++;
                    i11++;
                }
                z = false;
            }
        }
        if (z) {
            if (i11 + 2 > 16) {
                return false;
            }
            int i18 = i11 + 1;
            bArr[i11] = (byte) ((i10 >> 8) & 255);
            i11 += 2;
            bArr[i18] = (byte) (i10 & 255);
        }
        if (i12 != -1) {
            int i19 = i11 - i12;
            if (i11 == 16) {
                return false;
            }
            for (int i20 = 1; i20 <= i19; i20++) {
                int i21 = (i12 + i19) - i20;
                bArr[16 - i20] = bArr[i21];
                bArr[i21] = 0;
            }
            i11 = 16;
        }
        if (i11 != 16) {
            return false;
        }
        translateIpv4MappedAddress(bArr);
        return true;
    }

    public static boolean validatePackageName(String str) {
        if (str == null) {
            return false;
        }
        if ("*".equals(str)) {
            return true;
        }
        String[] split = str.split("\\.");
        int i = 0;
        for (int i8 = 0; i8 < str.length(); i8++) {
            if (str.charAt(i8) == '.') {
                i++;
            }
        }
        if (i >= split.length) {
            return false;
        }
        for (String str2 : split) {
            if (!str2.matches("^[A-Za-z0-9_]+$") || str2.charAt(0) == '_' || (str2.charAt(0) >= '0' && str2.charAt(0) <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static boolean validatePortNumber(String str) {
        int i;
        if (str == null) {
            return false;
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i < 0 || i > 65535) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.samsung.android.knox.net.firewall.FirewallResponse validateRedirectExceptionRule(com.samsung.android.knox.net.firewall.FirewallRule r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r6 != 0) goto L_0x0013
            com.samsung.android.knox.net.firewall.FirewallResponse r6 = new com.samsung.android.knox.net.firewall.FirewallResponse
            com.samsung.android.knox.net.firewall.FirewallResponse$Result r0 = com.samsung.android.knox.net.firewall.FirewallResponse.Result.FAILED
            com.samsung.android.knox.net.firewall.FirewallResponse$ErrorCode r1 = com.samsung.android.knox.net.firewall.FirewallResponse.ErrorCode.OPERATION_NOT_PERMITTED_ERROR
            java.lang.String r2 = "Rule is null."
            r6.<init>(r0, r1, r2)
            return r6
        L_0x0013:
            com.samsung.android.knox.net.firewall.Firewall$AddressType r1 = r6.getAddressType()
            java.lang.String r2 = r6.getIpAddress()
            com.samsung.android.knox.net.firewall.Firewall$AddressType r3 = com.samsung.android.knox.net.firewall.Firewall.AddressType.IPV4
            boolean r1 = r1.equals(r3)
            java.lang.String r3 = "Parameter(s): address"
            java.lang.String r4 = "*"
            r5 = 0
            if (r1 == 0) goto L_0x003f
            boolean r1 = validadeIpv4Range(r2)
            if (r1 != 0) goto L_0x0055
            boolean r1 = validateIpv4Address(r2)
            if (r1 != 0) goto L_0x0055
            boolean r1 = r4.equals(r2)
            if (r1 != 0) goto L_0x0055
            r0.append(r3)
        L_0x003d:
            r1 = 0
            goto L_0x0056
        L_0x003f:
            boolean r1 = validadeIpv6Range(r2)
            if (r1 != 0) goto L_0x0055
            boolean r1 = validateIpv6Address(r2)
            if (r1 != 0) goto L_0x0055
            boolean r1 = r4.equals(r2)
            if (r1 != 0) goto L_0x0055
            r0.append(r3)
            goto L_0x003d
        L_0x0055:
            r1 = 1
        L_0x0056:
            java.lang.String r2 = r6.getPortNumber()
            boolean r2 = validatePortNumber(r2)
            if (r2 != 0) goto L_0x0082
            java.lang.String r2 = r6.getPortNumber()
            boolean r2 = validadePortNumberRange(r2)
            if (r2 != 0) goto L_0x0082
            java.lang.String r2 = r6.getPortNumber()
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0082
            if (r1 == 0) goto L_0x007c
            java.lang.String r1 = "Parameter(s): port number"
            r0.append(r1)
            goto L_0x0081
        L_0x007c:
            java.lang.String r1 = ", port number"
            r0.append(r1)
        L_0x0081:
            r1 = 0
        L_0x0082:
            com.samsung.android.knox.AppIdentity r2 = r6.getApplication()
            if (r2 == 0) goto L_0x00ae
            com.samsung.android.knox.AppIdentity r2 = r6.getApplication()
            java.lang.String r2 = r2.getPackageName()
            if (r2 == 0) goto L_0x00ae
            com.samsung.android.knox.AppIdentity r2 = r6.getApplication()
            java.lang.String r2 = r2.getPackageName()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00bc
            com.samsung.android.knox.AppIdentity r2 = r6.getApplication()
            java.lang.String r2 = r2.getPackageName()
            boolean r2 = validatePackageName(r2)
            if (r2 != 0) goto L_0x00bc
        L_0x00ae:
            if (r1 == 0) goto L_0x00b6
            java.lang.String r1 = "Parameter(s): app identity"
            r0.append(r1)
            goto L_0x00bb
        L_0x00b6:
            java.lang.String r1 = ", app identity"
            r0.append(r1)
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            com.samsung.android.knox.net.firewall.Firewall$Protocol r6 = r6.getProtocol()
            if (r6 != 0) goto L_0x00d0
            if (r1 == 0) goto L_0x00ca
            java.lang.String r6 = "Parameter(s): protocol"
            r0.append(r6)
            goto L_0x00d1
        L_0x00ca:
            java.lang.String r6 = ", protocol"
            r0.append(r6)
            goto L_0x00d1
        L_0x00d0:
            r5 = r1
        L_0x00d1:
            if (r5 != 0) goto L_0x00e6
            java.lang.String r6 = " is(are) invalid."
            r0.append(r6)
            com.samsung.android.knox.net.firewall.FirewallResponse r6 = new com.samsung.android.knox.net.firewall.FirewallResponse
            com.samsung.android.knox.net.firewall.FirewallResponse$Result r1 = com.samsung.android.knox.net.firewall.FirewallResponse.Result.FAILED
            com.samsung.android.knox.net.firewall.FirewallResponse$ErrorCode r2 = com.samsung.android.knox.net.firewall.FirewallResponse.ErrorCode.INVALID_PARAMETER_ERROR
            java.lang.String r0 = r0.toString()
            r6.<init>(r1, r2, r0)
            return r6
        L_0x00e6:
            com.samsung.android.knox.net.firewall.FirewallResponse r6 = new com.samsung.android.knox.net.firewall.FirewallResponse
            com.samsung.android.knox.net.firewall.FirewallResponse$Result r0 = com.samsung.android.knox.net.firewall.FirewallResponse.Result.SUCCESS
            com.samsung.android.knox.net.firewall.FirewallResponse$ErrorCode r1 = com.samsung.android.knox.net.firewall.FirewallResponse.ErrorCode.NO_ERROR
            java.lang.String r2 = "Parameters validated successfully"
            r6.<init>(r0, r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.net.firewall.FirewallRuleValidator.validateRedirectExceptionRule(com.samsung.android.knox.net.firewall.FirewallRule):com.samsung.android.knox.net.firewall.FirewallResponse");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.samsung.android.knox.net.firewall.FirewallResponse validateRedirectRule(com.samsung.android.knox.net.firewall.FirewallRule r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r8 != 0) goto L_0x0013
            com.samsung.android.knox.net.firewall.FirewallResponse r8 = new com.samsung.android.knox.net.firewall.FirewallResponse
            com.samsung.android.knox.net.firewall.FirewallResponse$Result r0 = com.samsung.android.knox.net.firewall.FirewallResponse.Result.FAILED
            com.samsung.android.knox.net.firewall.FirewallResponse$ErrorCode r1 = com.samsung.android.knox.net.firewall.FirewallResponse.ErrorCode.OPERATION_NOT_PERMITTED_ERROR
            java.lang.String r2 = "Rule is null."
            r8.<init>(r0, r1, r2)
            return r8
        L_0x0013:
            com.samsung.android.knox.net.firewall.Firewall$AddressType r1 = r8.getAddressType()
            java.lang.String r2 = r8.getIpAddress()
            com.samsung.android.knox.net.firewall.Firewall$AddressType r3 = com.samsung.android.knox.net.firewall.Firewall.AddressType.IPV4
            boolean r4 = r1.equals(r3)
            java.lang.String r5 = "Parameter(s): source address"
            java.lang.String r6 = "*"
            r7 = 0
            if (r4 == 0) goto L_0x003f
            boolean r4 = validadeIpv4Range(r2)
            if (r4 != 0) goto L_0x0055
            boolean r4 = validateIpv4Address(r2)
            if (r4 != 0) goto L_0x0055
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0055
            r0.append(r5)
        L_0x003d:
            r2 = 0
            goto L_0x0056
        L_0x003f:
            boolean r4 = validadeIpv6Range(r2)
            if (r4 != 0) goto L_0x0055
            boolean r4 = validateIpv6Address(r2)
            if (r4 != 0) goto L_0x0055
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0055
            r0.append(r5)
            goto L_0x003d
        L_0x0055:
            r2 = 1
        L_0x0056:
            java.lang.String r4 = r8.getPortNumber()
            boolean r4 = validatePortNumber(r4)
            if (r4 != 0) goto L_0x0082
            java.lang.String r4 = r8.getPortNumber()
            boolean r4 = validadePortNumberRange(r4)
            if (r4 != 0) goto L_0x0082
            java.lang.String r4 = r8.getPortNumber()
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0082
            if (r2 == 0) goto L_0x007c
            java.lang.String r2 = "Parameter(s): source port number"
            r0.append(r2)
            goto L_0x0081
        L_0x007c:
            java.lang.String r2 = ", source port number"
            r0.append(r2)
        L_0x0081:
            r2 = 0
        L_0x0082:
            java.lang.String r4 = r8.getTargetIpAddress()
            boolean r1 = r1.equals(r3)
            java.lang.String r3 = "Parameter(s): target IP"
            if (r1 == 0) goto L_0x0099
            boolean r1 = validateIpv4Address(r4)
            if (r1 != 0) goto L_0x00a3
            r0.append(r3)
        L_0x0097:
            r2 = 0
            goto L_0x00a3
        L_0x0099:
            boolean r1 = validateIpv6Address(r4)
            if (r1 != 0) goto L_0x00a3
            r0.append(r3)
            goto L_0x0097
        L_0x00a3:
            java.lang.String r1 = r8.getTargetPortNumber()
            boolean r1 = validatePortNumber(r1)
            if (r1 == 0) goto L_0x00b7
            java.lang.String r1 = r8.getTargetPortNumber()
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00c5
        L_0x00b7:
            if (r2 == 0) goto L_0x00bf
            java.lang.String r1 = "Parameter(s): target port number"
            r0.append(r1)
            goto L_0x00c4
        L_0x00bf:
            java.lang.String r1 = ", target port number"
            r0.append(r1)
        L_0x00c4:
            r2 = 0
        L_0x00c5:
            com.samsung.android.knox.AppIdentity r1 = r8.getApplication()
            if (r1 == 0) goto L_0x00f1
            com.samsung.android.knox.AppIdentity r1 = r8.getApplication()
            java.lang.String r1 = r1.getPackageName()
            if (r1 == 0) goto L_0x00f1
            com.samsung.android.knox.AppIdentity r1 = r8.getApplication()
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00ff
            com.samsung.android.knox.AppIdentity r1 = r8.getApplication()
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = validatePackageName(r1)
            if (r1 != 0) goto L_0x00ff
        L_0x00f1:
            if (r2 == 0) goto L_0x00f9
            java.lang.String r1 = "Parameter(s): app identity"
            r0.append(r1)
            goto L_0x00fe
        L_0x00f9:
            java.lang.String r1 = ", app identity"
            r0.append(r1)
        L_0x00fe:
            r2 = 0
        L_0x00ff:
            com.samsung.android.knox.net.firewall.Firewall$NetworkInterface r1 = r8.getNetworkInterface()
            if (r1 != 0) goto L_0x0113
            if (r2 == 0) goto L_0x010d
            java.lang.String r1 = "Parameter(s): network interface"
            r0.append(r1)
            goto L_0x0112
        L_0x010d:
            java.lang.String r1 = ", network interface"
            r0.append(r1)
        L_0x0112:
            r2 = 0
        L_0x0113:
            com.samsung.android.knox.net.firewall.Firewall$Protocol r8 = r8.getProtocol()
            if (r8 != 0) goto L_0x0127
            if (r2 == 0) goto L_0x0121
            java.lang.String r8 = "Parameter(s): protocol"
            r0.append(r8)
            goto L_0x0128
        L_0x0121:
            java.lang.String r8 = ", protocol"
            r0.append(r8)
            goto L_0x0128
        L_0x0127:
            r7 = r2
        L_0x0128:
            if (r7 != 0) goto L_0x013d
            java.lang.String r8 = " is(are) invalid."
            r0.append(r8)
            com.samsung.android.knox.net.firewall.FirewallResponse r8 = new com.samsung.android.knox.net.firewall.FirewallResponse
            com.samsung.android.knox.net.firewall.FirewallResponse$Result r1 = com.samsung.android.knox.net.firewall.FirewallResponse.Result.FAILED
            com.samsung.android.knox.net.firewall.FirewallResponse$ErrorCode r2 = com.samsung.android.knox.net.firewall.FirewallResponse.ErrorCode.INVALID_PARAMETER_ERROR
            java.lang.String r0 = r0.toString()
            r8.<init>(r1, r2, r0)
            return r8
        L_0x013d:
            com.samsung.android.knox.net.firewall.FirewallResponse r8 = new com.samsung.android.knox.net.firewall.FirewallResponse
            com.samsung.android.knox.net.firewall.FirewallResponse$Result r0 = com.samsung.android.knox.net.firewall.FirewallResponse.Result.SUCCESS
            com.samsung.android.knox.net.firewall.FirewallResponse$ErrorCode r1 = com.samsung.android.knox.net.firewall.FirewallResponse.ErrorCode.NO_ERROR
            java.lang.String r2 = "Parameters validated successfully"
            r8.<init>(r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.net.firewall.FirewallRuleValidator.validateRedirectRule(com.samsung.android.knox.net.firewall.FirewallRule):com.samsung.android.knox.net.firewall.FirewallResponse");
    }
}
