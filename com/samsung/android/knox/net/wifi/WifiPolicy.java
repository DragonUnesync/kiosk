package com.samsung.android.knox.net.wifi;

import android.net.wifi.WifiConfiguration;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.List;

public class WifiPolicy {
    private android.app.enterprise.WifiPolicy mWifiPolicy;

    public WifiPolicy(android.app.enterprise.WifiPolicy wifiPolicy) {
        this.mWifiPolicy = wifiPolicy;
    }

    public boolean activateWifiSsidRestriction(boolean z) {
        return this.mWifiPolicy.activateWifiSsidRestriction(z);
    }

    public boolean addBlockedNetwork(String str) {
        return this.mWifiPolicy.addBlockedNetwork(str);
    }

    public boolean addWifiSsidsToBlackList(List<String> list) {
        return this.mWifiPolicy.addWifiSsidsToBlackList(list);
    }

    public boolean addWifiSsidsToWhiteList(List<String> list) {
        return this.mWifiPolicy.addWifiSsidsToWhiteList(list);
    }

    public boolean allowOpenWifiAp(boolean z) {
        return this.mWifiPolicy.allowOpenWifiAp(z);
    }

    public boolean allowWifiApSettingUserModification(boolean z) {
        return this.mWifiPolicy.allowWifiApSettingUserModification(z);
    }

    public boolean clearWifiSsidsFromBlackList() {
        return this.mWifiPolicy.clearWifiSsidsFromBlackList();
    }

    public boolean clearWifiSsidsFromList() {
        return this.mWifiPolicy.clearWifiSsidsFromList();
    }

    public boolean clearWifiSsidsFromWhiteList() {
        return this.mWifiPolicy.clearWifiSsidsFromWhiteList();
    }

    public boolean getAllowUserPolicyChanges() {
        return this.mWifiPolicy.getAllowUserPolicyChanges();
    }

    public boolean getAllowUserProfiles(boolean z) {
        return this.mWifiPolicy.getAllowUserProfiles(z);
    }

    public boolean getAutomaticConnectionToWifi() {
        return this.mWifiPolicy.getAutomaticConnectionToWifi();
    }

    public List<String> getBlockedNetworks() {
        return this.mWifiPolicy.getBlockedNetworks();
    }

    public int getMinimumRequiredSecurity() {
        return this.mWifiPolicy.getMinimumRequiredSecurity();
    }

    public List<String> getNetworkSSIDList() {
        return this.mWifiPolicy.getNetworkSSIDList();
    }

    public boolean getPasswordHidden() {
        return this.mWifiPolicy.getPasswordHidden();
    }

    public boolean getPromptCredentialsEnabled() {
        return this.mWifiPolicy.getPromptCredentialsEnabled();
    }

    public WifiConfiguration getWifiApSetting() {
        return this.mWifiPolicy.getWifiApSetting();
    }

    public WifiAdminProfile getWifiProfile(String str) {
        try {
            WifiAdminProfile convertToNew = WifiAdminProfile.convertToNew(this.mWifiPolicy.getWifiProfile(str));
            if (EnterpriseDeviceManager.getAPILevel() > -1 && EnterpriseDeviceManager.getAPILevel() < 17 && convertToNew != null) {
                convertToNew.staticIpEnabled = !this.mWifiPolicy.getNetworkDHCPEnabled(str);
                convertToNew.staticIp = this.mWifiPolicy.getNetworkIp(str);
                convertToNew.staticGateway = this.mWifiPolicy.getNetworkGateway(str);
                convertToNew.staticPrimaryDns = this.mWifiPolicy.getNetworkPrimaryDNS(str);
                convertToNew.staticSecondaryDns = this.mWifiPolicy.getNetworkSecondaryDNS(str);
                convertToNew.staticSubnetMask = this.mWifiPolicy.getNetworkSubnetMask(str);
                convertToNew.proxyState = this.mWifiPolicy.getNetworkProxyEnabled(str) ? 1 : 0;
                convertToNew.proxyHostname = this.mWifiPolicy.getNetworkProxyHostName(str);
                convertToNew.proxyPort = this.mWifiPolicy.getNetworkProxyPort(str);
                convertToNew.proxyBypassList = this.mWifiPolicy.getUrlsFromNetworkProxyBypassList(str);
            }
            return convertToNew;
        } catch (NoSuchMethodError e) {
            throw new NoSuchMethodError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        } catch (NoClassDefFoundError e9) {
            throw new NoClassDefFoundError(e9.getMessage());
        }
    }

    public List<WifiControlInfo> getWifiSsidsFromBlackLists() {
        return WifiControlInfo.convertToNewList(this.mWifiPolicy.getWifiSsidsFromBlackLists());
    }

    public List<WifiControlInfo> getWifiSsidsFromWhiteLists() {
        return WifiControlInfo.convertToNewList(this.mWifiPolicy.getWifiSsidsFromWhiteLists());
    }

    public boolean isNetworkBlocked(String str, boolean z) {
        return this.mWifiPolicy.isNetworkBlocked(str, z);
    }

    public boolean isOpenWifiApAllowed() {
        return this.mWifiPolicy.isOpenWifiApAllowed();
    }

    public boolean isWifiApSettingUserModificationAllowed() {
        return this.mWifiPolicy.isWifiApSettingUserModificationAllowed();
    }

    public boolean isWifiSsidRestrictionActive() {
        return this.mWifiPolicy.isWifiSsidRestrictionActive();
    }

    public boolean isWifiStateChangeAllowed() {
        return this.mWifiPolicy.isWifiStateChangeAllowed();
    }

    public boolean removeBlockedNetwork(String str) {
        return this.mWifiPolicy.removeBlockedNetwork(str);
    }

    public boolean removeNetworkConfiguration(String str) {
        return this.mWifiPolicy.removeNetworkConfiguration(str);
    }

    public boolean removeWifiSsidsFromBlackList(List<String> list) {
        return this.mWifiPolicy.removeWifiSsidsFromBlackList(list);
    }

    public boolean removeWifiSsidsFromWhiteList(List<String> list) {
        return this.mWifiPolicy.removeWifiSsidsFromWhiteList(list);
    }

    public boolean setAllowUserPolicyChanges(boolean z) {
        return this.mWifiPolicy.setAllowUserPolicyChanges(z);
    }

    public boolean setAllowUserProfiles(boolean z) {
        return this.mWifiPolicy.setAllowUserProfiles(z);
    }

    public boolean setAutomaticConnectionToWifi(boolean z) {
        return this.mWifiPolicy.setAutomaticConnectionToWifi(z);
    }

    public boolean setMinimumRequiredSecurity(int i) {
        return this.mWifiPolicy.setMinimumRequiredSecurity(i);
    }

    public boolean setPasswordHidden(boolean z) {
        return this.mWifiPolicy.setPasswordHidden(z);
    }

    public boolean setPromptCredentialsEnabled(boolean z) {
        return this.mWifiPolicy.setPromptCredentialsEnabled(z);
    }

    public boolean setWifiApSetting(String str, String str2, String str3) {
        return this.mWifiPolicy.setWifiApSetting(str, str2, str3);
    }

    public boolean setWifiProfile(WifiAdminProfile wifiAdminProfile) {
        try {
            boolean wifiProfile = this.mWifiPolicy.setWifiProfile(WifiAdminProfile.convertToOld(wifiAdminProfile));
            if (EnterpriseDeviceManager.getAPILevel() <= -1 || EnterpriseDeviceManager.getAPILevel() >= 17 || !wifiProfile || wifiAdminProfile == null) {
                return wifiProfile;
            }
            if (wifiAdminProfile.proxyBypassList != null) {
                this.mWifiPolicy.clearUrlsFromNetworkProxyBypassList(wifiAdminProfile.ssid);
                for (String addUrlForNetworkProxyBypass : wifiAdminProfile.proxyBypassList) {
                    wifiProfile |= this.mWifiPolicy.addUrlForNetworkProxyBypass(wifiAdminProfile.ssid, addUrlForNetworkProxyBypass);
                }
            }
            boolean z = false;
            boolean networkDHCPEnabled = wifiProfile | this.mWifiPolicy.setNetworkDHCPEnabled(wifiAdminProfile.ssid, !wifiAdminProfile.staticIpEnabled) | this.mWifiPolicy.setNetworkIp(wifiAdminProfile.ssid, wifiAdminProfile.staticIp) | this.mWifiPolicy.setNetworkGateway(wifiAdminProfile.ssid, wifiAdminProfile.staticGateway) | this.mWifiPolicy.setNetworkPrimaryDNS(wifiAdminProfile.ssid, wifiAdminProfile.staticPrimaryDns) | this.mWifiPolicy.setNetworkSecondaryDNS(wifiAdminProfile.ssid, wifiAdminProfile.staticSecondaryDns) | this.mWifiPolicy.setNetworkSubnetMask(wifiAdminProfile.ssid, wifiAdminProfile.staticSubnetMask);
            android.app.enterprise.WifiPolicy wifiPolicy = this.mWifiPolicy;
            String str = wifiAdminProfile.ssid;
            if (wifiAdminProfile.proxyState == 1) {
                z = true;
            }
            return networkDHCPEnabled | wifiPolicy.setNetworkProxyEnabled(str, z) | this.mWifiPolicy.setNetworkProxyHostName(wifiAdminProfile.ssid, wifiAdminProfile.proxyHostname) | this.mWifiPolicy.setNetworkProxyPort(wifiAdminProfile.ssid, wifiAdminProfile.proxyPort);
        } catch (NoSuchMethodError e) {
            throw new NoSuchMethodError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        } catch (NoClassDefFoundError e9) {
            throw new NoClassDefFoundError(e9.getMessage());
        }
    }

    public boolean setWifiStateChangeAllowed(boolean z) {
        return this.mWifiPolicy.setWifiStateChangeAllowed(z);
    }

    public boolean addWifiSsidsToWhiteList(List<String> list, boolean z) {
        return this.mWifiPolicy.addWifiSsidsToWhiteList(list, z);
    }
}
