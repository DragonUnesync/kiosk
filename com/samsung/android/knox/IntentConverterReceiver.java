package com.samsung.android.knox;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import com.samsung.android.knox.accounts.EmailAccountPolicy;
import com.samsung.android.knox.accounts.ExchangeAccountPolicy;
import com.samsung.android.knox.accounts.HostAuth;
import com.samsung.android.knox.accounts.LDAPAccountPolicy;
import com.samsung.android.knox.application.ApplicationPolicy;
import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.knox.custom.SystemManager;
import com.samsung.android.knox.datetime.DateTimePolicy;
import com.samsung.android.knox.deviceinfo.DeviceInventory;
import com.samsung.android.knox.deviceinfo.SimChangeInfo;
import com.samsung.android.knox.integrity.AttestationPolicy;
import com.samsung.android.knox.keystore.CEPConstants;
import com.samsung.android.knox.keystore.CertificatePolicy;
import com.samsung.android.knox.kiosk.KioskMode;
import com.samsung.android.knox.license.EnterpriseLicenseManager;
import com.samsung.android.knox.license.KnoxEnterpriseLicenseManager;
import com.samsung.android.knox.location.Geofencing;
import com.samsung.android.knox.log.AuditLog;
import com.samsung.android.knox.net.firewall.Firewall;
import com.samsung.android.knox.net.vpn.GenericVpnPolicy;
import com.samsung.android.knox.restriction.RestrictionPolicy;

public class IntentConverterReceiver extends BroadcastReceiver {
    private static final String ACTION_CBA_INSTALL_STATUS_OLDEST = "android.intent.action.sec.CBA_INSTALL_STATUS";
    private static final String ACTION_SIM_CARD_CHANGED_OLDEST = "android.intent.action.sec.SIM_CARD_CHANGED";
    private static final int DEFAULT_CBA_INSTALL_STATUS = 1;
    private static final int DEFAULT_EXCHANGE_ACCOUNT_RESULT = 8;
    private static final int DEFAULT_VALUE = -1;

    private Intent convertActionApplicationFocusChangeIntent(Intent intent) {
        Intent intent2 = new Intent(ApplicationPolicy.ACTION_APPLICATION_FOCUS_CHANGE);
        intent2.putExtra(ApplicationPolicy.EXTRA_APPLICATION_FOCUS_COMPONENT_NAME, intent.getStringExtra("application_focus_component_name"));
        intent2.putExtra(ApplicationPolicy.EXTRA_APPLICATION_FOCUS_STATUS, intent.getStringExtra("application_focus_status"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("user_id", -1));
        return intent2;
    }

    private Intent convertActionAuditFullSize() {
        return new Intent(AuditLog.ACTION_AUDIT_FULL_SIZE);
    }

    private Intent convertActionAuditMaximumSize() {
        return new Intent(AuditLog.ACTION_AUDIT_MAXIMUM_SIZE);
    }

    private Intent convertActionBindResult(Intent intent) {
        Intent intent2 = new Intent(GenericVpnPolicy.ACTION_BIND_RESULT);
        intent2.putExtra(GenericVpnPolicy.EXTRA_BIND_VENDOR, intent.getStringExtra(GenericVpnPolicy.EXTRA_BIND_VENDOR_OLD));
        intent2.putExtra(GenericVpnPolicy.EXTRA_BIND_CID, intent.getIntExtra(GenericVpnPolicy.EXTRA_BIND_CID_OLD, -1));
        intent2.putExtra(GenericVpnPolicy.EXTRA_BIND_STATUS, intent.getBooleanExtra(GenericVpnPolicy.EXTRA_BIND_STATUS_OLD, false));
        return intent2;
    }

    private Intent convertActionBlockedDomainIntent(Intent intent) {
        Intent intent2 = new Intent(Firewall.ACTION_BLOCKED_DOMAIN);
        intent2.putExtra(Firewall.EXTRA_BLOCKED_DOMAIN_PACKAGENAME, intent.getStringExtra("com.sec.enterprise.intent.extra.BLOCKED_DOMAIN_PACKAGENAME"));
        intent2.putExtra(Firewall.EXTRA_BLOCKED_DOMAIN_TIMESTAMP, intent.getStringExtra("com.sec.enterprise.intent.extra.BLOCKED_DOMAIN_TIMESTAMP"));
        intent2.putExtra(Firewall.EXTRA_BLOCKED_DOMAIN_UID, intent.getStringExtra("com.sec.enterprise.intent.extra.BLOCKED_DOMAIN_UID"));
        intent2.putExtra(Firewall.EXTRA_BLOCKED_DOMAIN_URL, intent.getStringExtra("com.sec.enterprise.intent.extra.BLOCKED_DOMAIN_URL"));
        intent2.putExtra(Firewall.EXTRA_BLOCKED_DOMAIN_ISFOREGROUND, intent.getBooleanExtra("com.sec.enterprise.intent.extra.BLOCKED_DOMAIN_ISFOREGROUND", false));
        return intent2;
    }

    private Intent convertActionCertEnrollStatus(Intent intent) {
        Intent intent2 = new Intent(CEPConstants.CEP_ACTION_CERT_ENROLL_STATUS);
        intent2.putExtra(CEPConstants.EXTRA_ENROLL_STATUS, intent.getIntExtra(CEPConstants.EXTRA_ENROLL_STATUS, -3));
        intent2.putExtra(CEPConstants.EXTRA_ENROLL_ALIAS, intent.getStringExtra(CEPConstants.EXTRA_ENROLL_ALIAS));
        intent2.putExtra(CEPConstants.EXTRA_ENROLL_TRANSACTION_ID, intent.getStringExtra(CEPConstants.EXTRA_ENROLL_TRANSACTION_ID));
        intent2.putExtra(CEPConstants.EXTRA_ENROLL_REFERENCE_NUMBER, intent.getStringExtra(CEPConstants.EXTRA_ENROLL_REFERENCE_NUMBER));
        intent2.putExtra(CEPConstants.EXTRA_ENROLL_CERT_HASH, intent.getStringExtra(CEPConstants.EXTRA_ENROLL_CERT_HASH));
        intent2.putExtra(CEPConstants.EXTRA_SERVICE_USERID, intent.getIntExtra(CEPConstants.EXTRA_SERVICE_USERID, -1));
        intent2.putExtra(CEPConstants.EXTRA_SERVICE_PROTOCOL, intent.getStringExtra(CEPConstants.EXTRA_SERVICE_PROTOCOL));
        return intent2;
    }

    private Intent convertActionCertificateRemovedIntent(Intent intent) {
        Intent intent2 = new Intent(CertificatePolicy.ACTION_CERTIFICATE_REMOVED);
        intent2.putExtra(CertificatePolicy.EXTRA_CERTIFICATE_REMOVED_SUBJECT, intent.getStringExtra("com.samsung.edm.intent.extra.CERTIFICATE_REMOVED_SUBJECT"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("com.samsung.edm.intent.extra.USER_ID", -1));
        return intent2;
    }

    private Intent convertActionCriticalSize() {
        return new Intent(AuditLog.ACTION_AUDIT_CRITICAL_SIZE);
    }

    private Intent convertActionDumpLogResult(Intent intent) {
        Intent intent2 = new Intent(AuditLog.ACTION_DUMP_LOG_RESULT);
        intent2.putExtra(AuditLog.EXTRA_AUDIT_RESULT, intent.getIntExtra("mdm.intent.extra.audit.log.result", -1));
        return intent2;
    }

    private Intent convertActionEmailAccountAddResultIntent(Intent intent) {
        Intent intent2 = new Intent(EmailAccountPolicy.ACTION_EMAIL_ACCOUNT_ADD_RESULT);
        intent2.putExtra("com.samsung.android.knox.intent.extra.RESULT", intent.getIntExtra("result", -1));
        intent2.putExtra(EmailAccountPolicy.EXTRA_INCOMING_PROTOCOL, intent.getStringExtra(HostAuth.PROTOCOL));
        intent2.putExtra("com.samsung.android.knox.intent.extra.EMAIL_ADDRESS", intent.getStringExtra("email_id"));
        intent2.putExtra(EmailAccountPolicy.EXTRA_INCOMING_SERVER_ADDRESS, intent.getStringExtra("receive_host"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.ACCOUNT_ID", intent.getLongExtra("account_id", -1));
        return intent2;
    }

    private Intent convertActionEmailAccountDeleteResultIntent(Intent intent) {
        Intent intent2 = new Intent(EmailAccountPolicy.ACTION_EMAIL_ACCOUNT_DELETE_RESULT);
        intent2.putExtra("com.samsung.android.knox.intent.extra.RESULT", intent.getIntExtra("result", -1));
        intent2.putExtra(EmailAccountPolicy.EXTRA_INCOMING_PROTOCOL, intent.getStringExtra(HostAuth.PROTOCOL));
        intent2.putExtra("com.samsung.android.knox.intent.extra.EMAIL_ADDRESS", intent.getStringExtra("email_id"));
        intent2.putExtra(EmailAccountPolicy.EXTRA_INCOMING_SERVER_ADDRESS, intent.getStringExtra("receive_host"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.ACCOUNT_ID", intent.getLongExtra("account_id", -1));
        return intent2;
    }

    private Intent convertActionKnoxAttestationResult(Intent intent) {
        Intent intent2 = new Intent(AttestationPolicy.ACTION_KNOX_ATTESTATION_RESULT);
        intent2.putExtra("com.samsung.android.knox.intent.extra.RESULT", intent.getIntExtra("com.sec.enterprise.knox.intent.extra.RESULT", -4));
        intent2.putExtra(AttestationPolicy.EXTRA_ATTESTATION_DATA, intent.getByteArrayExtra("com.sec.enterprise.knox.intent.extra.ATTESTATION_DATA"));
        intent2.putExtra(AttestationPolicy.EXTRA_ERROR_MSG, intent.getStringExtra("com.sec.enterprise.knox.intent.extra.ERROR_MSG"));
        return intent2;
    }

    private Intent convertActionLogException(Intent intent) {
        Intent intent2 = new Intent(AuditLog.ACTION_LOG_EXCEPTION);
        intent2.putExtra(AuditLog.EXTRA_AUDIT_RESULT, intent.getStringExtra("mdm.intent.extra.audit.log.result"));
        return intent2;
    }

    private Intent convertActionNoUserActivity(Intent intent) {
        return new Intent(SystemManager.ACTION_NO_USER_ACTIVITY);
    }

    private Intent convertActionServiceDisconnected(Intent intent) {
        Intent intent2 = new Intent(CEPConstants.CEP_ACTION_SERVICE_DISCONNECTED);
        intent2.putExtra(CEPConstants.EXTRA_SERVICE_USERID, intent.getIntExtra(CEPConstants.EXTRA_SERVICE_USERID, -1));
        intent2.putExtra(CEPConstants.EXTRA_SERVICE_PROTOCOL, intent.getStringExtra(CEPConstants.EXTRA_SERVICE_PROTOCOL));
        return intent2;
    }

    private Intent convertActionUpdateFotaVersionIntent(Intent intent) {
        Intent intent2 = new Intent(RestrictionPolicy.ACTION_UPDATE_FOTA_VERSION_RESULT);
        intent2.putExtra(RestrictionPolicy.EXTRA_UPDATE_FOTA_VERSION_STATUS, intent.getIntExtra("com.sec.enterprise.intent.extra.UPDATE_FOTA_VERSION_STATUS", -1));
        return intent2;
    }

    private Intent convertActionUserActivity(Intent intent) {
        return new Intent(SystemManager.ACTION_USER_ACTIVITY);
    }

    private Intent convertCbaInstallStatusIntent(Intent intent) {
        Intent intent2 = new Intent(ExchangeAccountPolicy.ACTION_CBA_INSTALL_STATUS);
        intent2.putExtra(ExchangeAccountPolicy.EXTRA_STATUS, intent.getIntExtra("status", 1));
        return intent2;
    }

    private Intent convertCertificateFailureIntent(Intent intent) {
        Intent intent2 = new Intent(CertificatePolicy.ACTION_CERTIFICATE_FAILURE);
        intent2.putExtra(CertificatePolicy.EXTRA_CERTIFICATE_FAILURE_MODULE, intent.getStringExtra("certificate_failure_module"));
        intent2.putExtra(CertificatePolicy.EXTRA_CERTIFICATE_FAILURE_MESSAGE, intent.getStringExtra("certificate_failure_message"));
        if (EnterpriseDeviceManager.getAPILevel() >= 19) {
            intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("com.samsung.edm.intent.extra.USER_ID", -1));
        }
        return intent2;
    }

    private Intent convertContainerAdminLockIntent(Intent intent) {
        Intent intent2 = new Intent(KnoxContainerManager.ACTION_CONTAINER_ADMIN_LOCK);
        Bundle bundleExtra = intent.getBundleExtra(KnoxContainerManager.INTENT_BUNDLE);
        Bundle bundle = new Bundle();
        bundle.putInt(KnoxContainerManager.CONTAINER_ID, bundleExtra.getInt(KnoxContainerManager.CONTAINER_ID));
        intent2.putExtra(KnoxContainerManager.INTENT_BUNDLE, bundle);
        return intent2;
    }

    private Intent convertContainerCreationStatusIntent(Intent intent) {
        Intent intent2 = new Intent(KnoxContainerManager.ACTION_CONTAINER_CREATION_STATUS);
        Bundle extras = intent.getExtras();
        Bundle bundle = new Bundle();
        bundle.putInt(KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE, extras.getInt(KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE));
        bundle.putInt(KnoxContainerManager.CONTAINER_CREATION_REQUEST_ID, extras.getInt(KnoxContainerManager.CONTAINER_CREATION_REQUEST_ID));
        intent2.putExtra(KnoxContainerManager.INTENT_BUNDLE, bundle);
        return intent2;
    }

    private Intent convertContainerRemovedIntent(Intent intent) {
        Intent intent2 = new Intent(KnoxContainerManager.ACTION_CONTAINER_REMOVED);
        Bundle bundleExtra = intent.getBundleExtra(KnoxContainerManager.INTENT_BUNDLE);
        Bundle bundle = new Bundle();
        bundle.putInt(KnoxContainerManager.CONTAINER_ID, bundleExtra.getInt(KnoxContainerManager.CONTAINER_ID));
        intent2.putExtra(KnoxContainerManager.INTENT_BUNDLE, bundle);
        return intent2;
    }

    private Intent convertContainerStateChangedIntent(Intent intent) {
        Intent intent2 = new Intent(KnoxContainerManager.ACTION_CONTAINER_STATE_CHANGED);
        Bundle bundleExtra = intent.getBundleExtra(KnoxContainerManager.INTENT_BUNDLE);
        Bundle bundle = new Bundle();
        bundle.putInt(KnoxContainerManager.CONTAINER_ID, bundleExtra.getInt(KnoxContainerManager.CONTAINER_ID));
        bundle.putInt(KnoxContainerManager.CONTAINER_OLD_STATE, bundleExtra.getInt(KnoxContainerManager.CONTAINER_OLD_STATE));
        bundle.putInt(KnoxContainerManager.CONTAINER_NEW_STATE, bundleExtra.getInt(KnoxContainerManager.CONTAINER_NEW_STATE));
        intent2.putExtra(KnoxContainerManager.INTENT_BUNDLE, bundle);
        return intent2;
    }

    private Intent convertCreateLDAPAccountResultIntent(Intent intent) {
        Intent intent2 = new Intent(LDAPAccountPolicy.ACTION_LDAP_CREATE_ACCT_RESULT);
        intent2.putExtra(LDAPAccountPolicy.EXTRA_LDAP_RESULT, intent.getIntExtra("edm.intent.extra.ldap.result", -1));
        intent2.putExtra(LDAPAccountPolicy.EXTRA_LDAP_ACCT_ID, intent.getLongExtra("edm.intent.extra.ldap.acct.id", -1));
        if (EnterpriseDeviceManager.getAPILevel() >= 12) {
            intent2.putExtra(LDAPAccountPolicy.EXTRA_LDAP_USER_ID, intent.getIntExtra("edm.intent.extra.ldap.user.id", -1));
        }
        return intent2;
    }

    private Intent convertDeviceInsideGeofenceIntent(Intent intent) {
        Intent intent2 = new Intent(Geofencing.ACTION_DEVICE_INSIDE_GEOFENCE);
        intent2.putExtra(Geofencing.EXTRA_ID, intent.getIntArrayExtra("edm.intent.extra.geofence.id"));
        if (EnterpriseDeviceManager.getAPILevel() >= 12) {
            intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("edm.intent.extra.geofence.user.id", -1));
        }
        return intent2;
    }

    private Intent convertDeviceLocationUnavailableIntent(Intent intent) {
        Intent intent2 = new Intent(Geofencing.ACTION_DEVICE_LOCATION_UNAVAILABLE);
        if (EnterpriseDeviceManager.getAPILevel() >= 12) {
            intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("edm.intent.extra.geofence.user.id", -1));
        }
        return intent2;
    }

    private Intent convertDeviceOutsideGeofenceIntent(Intent intent) {
        Intent intent2 = new Intent(Geofencing.ACTION_DEVICE_OUTSIDE_GEOFENCE);
        if (EnterpriseDeviceManager.getAPILevel() >= 12) {
            intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("edm.intent.extra.geofence.user.id", -1));
        }
        return intent2;
    }

    private Intent convertDisableKioskModeResultIntent(Intent intent) {
        Intent intent2 = new Intent(KioskMode.ACTION_DISABLE_KIOSK_MODE_RESULT);
        intent2.putExtra(KioskMode.EXTRA_KIOSK_RESULT, intent.getIntExtra("edm.intent.extra.kiosk.mode.result", -2000));
        return intent2;
    }

    private Intent convertEnableKioskModeResultIntent(Intent intent) {
        Intent intent2 = new Intent(KioskMode.ACTION_ENABLE_KIOSK_MODE_RESULT);
        intent2.putExtra(KioskMode.EXTRA_KIOSK_RESULT, intent.getIntExtra("edm.intent.extra.kiosk.mode.result", -1));
        return intent2;
    }

    private Intent convertEnforceSmimeAliasResultIntent(Intent intent) {
        Intent intent2 = new Intent(ExchangeAccountPolicy.ACTION_ENFORCE_SMIME_ALIAS_RESULT);
        intent2.putExtra(ExchangeAccountPolicy.EXTRA_ENFORCE_SMIME_ALIAS_TYPE, intent.getIntExtra("com.samsung.edm.intent.extra.ENFORCE_SMIME_ALIAS_TYPE", -1));
        intent2.putExtra("com.samsung.android.knox.intent.extra.ACCOUNT_ID", intent.getLongExtra("account_id", -1));
        intent2.putExtra(ExchangeAccountPolicy.EXTRA_SMIME_RESULT, intent.getIntExtra("result", 0));
        return intent2;
    }

    private Intent convertExchangeAccountAddResultIntent(Intent intent) {
        Intent intent2 = new Intent(ExchangeAccountPolicy.ACTION_EXCHANGE_ACCOUNT_ADD_RESULT);
        intent2.putExtra("com.samsung.android.knox.intent.extra.RESULT", intent.getIntExtra("result", 8));
        intent2.putExtra("com.samsung.android.knox.intent.extra.EMAIL_ADDRESS", intent.getStringExtra("email_id"));
        intent2.putExtra(ExchangeAccountPolicy.EXTRA_SERVER_ADDRESS, intent.getStringExtra("server_host"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.ACCOUNT_ID", intent.getLongExtra("account_id", -1));
        return intent2;
    }

    private Intent convertExchangeAccountDeleteResultIntent(Intent intent) {
        Intent intent2 = new Intent(ExchangeAccountPolicy.ACTION_EXCHANGE_ACCOUNT_DELETE_RESULT);
        intent2.putExtra("com.samsung.android.knox.intent.extra.RESULT", intent.getIntExtra("result", 8));
        intent2.putExtra("com.samsung.android.knox.intent.extra.EMAIL_ADDRESS", intent.getStringExtra("email_id"));
        intent2.putExtra(ExchangeAccountPolicy.EXTRA_SERVER_ADDRESS, intent.getStringExtra("server_host"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.ACCOUNT_ID", intent.getLongExtra("account_id", -1));
        return intent2;
    }

    private Intent convertKnoxLicenseStatusIntent(Intent intent) {
        Intent intent2 = new Intent(KnoxEnterpriseLicenseManager.ACTION_LICENSE_STATUS);
        intent2.putExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_STATUS, intent.getStringExtra("edm.intent.extra.knox_license.status"));
        intent2.putExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_ERROR_CODE, intent.getIntExtra("edm.intent.extra.knox_license.errorcode", 102));
        intent2.putExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_ACTIVATION_INITIATOR, intent.getIntExtra("edm.intent.extra.knox_license.activaton_initiator", -1));
        intent2.putExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_RESULT_TYPE, intent.getIntExtra("edm.intent.extra.knox_license.result_type", -1));
        return intent2;
    }

    private Intent convertLicenseStatusIntent(Intent intent) {
        Intent intent2 = new Intent(EnterpriseLicenseManager.ACTION_LICENSE_STATUS);
        intent2.putExtra(EnterpriseLicenseManager.EXTRA_LICENSE_STATUS, intent.getStringExtra("edm.intent.extra.license.status"));
        intent2.putExtra(EnterpriseLicenseManager.EXTRA_LICENSE_ERROR_CODE, intent.getIntExtra("edm.intent.extra.license.errorcode", 102));
        intent2.putExtra(EnterpriseLicenseManager.EXTRA_LICENSE_RESULT_TYPE, intent.getIntExtra("edm.intent.extra.license.result_type", -1));
        intent2.putExtra(EnterpriseLicenseManager.EXTRA_LICENSE_PERM_GROUP, intent.getStringExtra("edm.intent.extra.license.perm_group"));
        if (EnterpriseDeviceManager.getAPILevel() >= 20) {
            intent2.putExtra(EnterpriseLicenseManager.EXTRA_LICENSE_ATTESTATION_STATUS, intent.getIntExtra("com.sec.enterprise.intent.extra.LICENSE_ATTESTATION_STATUS", 3));
        }
        return intent2;
    }

    private Intent convertNtpServerUnreachableIntent(Intent intent) {
        return new Intent(DateTimePolicy.ACTION_EVENT_NTP_SERVER_UNREACHABLE);
    }

    private Intent convertPreventApplicationStartIntent(Intent intent) {
        Intent intent2 = new Intent(ApplicationPolicy.ACTION_PREVENT_APPLICATION_START);
        intent2.putExtra(ApplicationPolicy.EXTRA_APPLICATION_PACKAGE_NAME, intent.getStringExtra("application_package_name"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("user_id", -1));
        return intent2;
    }

    private Intent convertPreventApplicationStopIntent(Intent intent) {
        Intent intent2 = new Intent(ApplicationPolicy.ACTION_PREVENT_APPLICATION_STOP);
        intent2.putExtra(ApplicationPolicy.EXTRA_APPLICATION_PACKAGE_NAME, intent.getStringExtra("application_package_name"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("user_id", -1));
        intent2.putExtra(ApplicationPolicy.EXTRA_ERROR_TYPE, intent.getStringExtra("error_type"));
        intent2.putExtra(ApplicationPolicy.EXTRA_ERROR_REASON, intent.getStringExtra("error_reason"));
        intent2.putExtra(ApplicationPolicy.EXTRA_ERROR_CLASS, intent.getStringExtra("error_class"));
        return intent2;
    }

    private Intent convertSimCardChangedIntent(Intent intent) {
        Intent intent2 = new Intent(DeviceInventory.ACTION_SIM_CARD_CHANGED);
        intent2.putExtra(DeviceInventory.EXTRA_SIM_CHANGE_INFO, SimChangeInfo.convertToNew(intent.getParcelableExtra("simChangeInfo")));
        return intent2;
    }

    private Intent convertUnexpectedKioskBehaviorIntent(Intent intent) {
        return new Intent(KioskMode.ACTION_UNEXPECTED_KIOSK_BEHAVIOR);
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r0 = r7.getAction()
            int r1 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            r2 = -1
            if (r1 <= r2) goto L_0x02ad
            int r1 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            r3 = 20
            if (r1 > r3) goto L_0x02ad
            java.lang.String r1 = "com.samsung.enterprise.container_state_changed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0021
            android.content.Intent r7 = r5.convertContainerStateChangedIntent(r7)
            goto L_0x02ae
        L_0x0021:
            java.lang.String r1 = "com.samsung.knox.container.creation.status"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x002f
            android.content.Intent r7 = r5.convertContainerCreationStatusIntent(r7)
            goto L_0x02ae
        L_0x002f:
            java.lang.String r1 = "com.samsung.knox.container.admin.locked"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003d
            android.content.Intent r7 = r5.convertContainerAdminLockIntent(r7)
            goto L_0x02ae
        L_0x003d:
            java.lang.String r1 = "com.samsung.knox.container.removed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004b
            android.content.Intent r7 = r5.convertContainerRemovedIntent(r7)
            goto L_0x02ae
        L_0x004b:
            java.lang.String r1 = "edm.intent.application.action.prevent.start"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0059
            android.content.Intent r7 = r5.convertPreventApplicationStartIntent(r7)
            goto L_0x02ae
        L_0x0059:
            java.lang.String r1 = "edm.intent.application.action.prevent.stop"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x006f
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            r1 = 14
            if (r0 < r1) goto L_0x02ad
            android.content.Intent r7 = r5.convertPreventApplicationStopIntent(r7)
            goto L_0x02ae
        L_0x006f:
            java.lang.String r1 = "edm.intent.action.ldap.createacct.result"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x007d
            android.content.Intent r7 = r5.convertCreateLDAPAccountResultIntent(r7)
            goto L_0x02ae
        L_0x007d:
            java.lang.String r1 = "edm.intent.action.device.inside"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x008b
            android.content.Intent r7 = r5.convertDeviceInsideGeofenceIntent(r7)
            goto L_0x02ae
        L_0x008b:
            java.lang.String r1 = "edm.intent.action.device.outside"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0099
            android.content.Intent r7 = r5.convertDeviceOutsideGeofenceIntent(r7)
            goto L_0x02ae
        L_0x0099:
            java.lang.String r1 = "edm.intent.action.device.location.unavailable"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00a7
            android.content.Intent r7 = r5.convertDeviceLocationUnavailableIntent(r7)
            goto L_0x02ae
        L_0x00a7:
            java.lang.String r1 = "com.samsung.edm.intent.action.CERTIFICATE_REMOVED"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00bd
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            r1 = 19
            if (r0 < r1) goto L_0x02ad
            android.content.Intent r7 = r5.convertActionCertificateRemovedIntent(r7)
            goto L_0x02ae
        L_0x00bd:
            java.lang.String r1 = "edm.intent.certificate.action.certificate.failure"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cb
            android.content.Intent r7 = r5.convertCertificateFailureIntent(r7)
            goto L_0x02ae
        L_0x00cb:
            java.lang.String r1 = "com.samsung.edm.intent.action.APPLICATION_FOCUS_CHANGE"
            boolean r1 = r1.equals(r0)
            r4 = 15
            if (r1 == 0) goto L_0x00e1
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 < r4) goto L_0x02ad
            android.content.Intent r7 = r5.convertActionApplicationFocusChangeIntent(r7)
            goto L_0x02ae
        L_0x00e1:
            java.lang.String r1 = "edm.intent.action.EMAIL_ACCOUNT_ADD_RESULT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ef
            android.content.Intent r7 = r5.convertActionEmailAccountAddResultIntent(r7)
            goto L_0x02ae
        L_0x00ef:
            java.lang.String r1 = "edm.intent.action.EMAIL_ACCOUNT_DELETE_RESULT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00fd
            android.content.Intent r7 = r5.convertActionEmailAccountDeleteResultIntent(r7)
            goto L_0x02ae
        L_0x00fd:
            java.lang.String r1 = "com.sec.enterprise.intent.action.BLOCKED_DOMAIN"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0111
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 < r3) goto L_0x02ad
            android.content.Intent r7 = r5.convertActionBlockedDomainIntent(r7)
            goto L_0x02ae
        L_0x0111:
            java.lang.String r1 = "com.sec.enterprise.intent.action.UPDATE_FOTA_VERSION_RESULT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0125
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 < r3) goto L_0x02ad
            android.content.Intent r7 = r5.convertActionUpdateFotaVersionIntent(r7)
            goto L_0x02ae
        L_0x0125:
            java.lang.String r1 = "android.intent.action.sec.CBA_INSTALL_STATUS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x013f
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 <= r2) goto L_0x02ad
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 >= r4) goto L_0x02ad
            android.content.Intent r7 = r5.convertCbaInstallStatusIntent(r7)
            goto L_0x02ae
        L_0x013f:
            java.lang.String r1 = "com.samsung.edm.intent.action.EXCHANGE_CBA_INSTALL_STATUS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0153
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 < r4) goto L_0x02ad
            android.content.Intent r7 = r5.convertCbaInstallStatusIntent(r7)
            goto L_0x02ae
        L_0x0153:
            java.lang.String r1 = "edm.intent.action.EXCHANGE_ACCOUNT_ADD_RESULT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0161
            android.content.Intent r7 = r5.convertExchangeAccountAddResultIntent(r7)
            goto L_0x02ae
        L_0x0161:
            java.lang.String r1 = "edm.intent.action.EXCHANGE_ACCOUNT_DELETE_RESULT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x016f
            android.content.Intent r7 = r5.convertExchangeAccountDeleteResultIntent(r7)
            goto L_0x02ae
        L_0x016f:
            java.lang.String r1 = "com.samsung.edm.intent.action.ENFORCE_SMIME_ALIAS_RESULT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0183
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 < r4) goto L_0x02ad
            android.content.Intent r7 = r5.convertEnforceSmimeAliasResultIntent(r7)
            goto L_0x02ae
        L_0x0183:
            java.lang.String r1 = "edm.intent.action.knox_license.status"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0191
            android.content.Intent r7 = r5.convertKnoxLicenseStatusIntent(r7)
            goto L_0x02ae
        L_0x0191:
            java.lang.String r1 = "edm.intent.action.license.status"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x019f
            android.content.Intent r7 = r5.convertLicenseStatusIntent(r7)
            goto L_0x02ae
        L_0x019f:
            java.lang.String r1 = "com.samsung.edm.intent.event.NTP_SERVER_UNREACHABLE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b5
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            r1 = 17
            if (r0 < r1) goto L_0x02ad
            android.content.Intent r7 = r5.convertNtpServerUnreachableIntent(r7)
            goto L_0x02ae
        L_0x01b5:
            java.lang.String r1 = "edm.intent.action.enable.kiosk.mode.result"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01c3
            android.content.Intent r7 = r5.convertEnableKioskModeResultIntent(r7)
            goto L_0x02ae
        L_0x01c3:
            java.lang.String r1 = "edm.intent.action.disable.kiosk.mode.result"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01d1
            android.content.Intent r7 = r5.convertDisableKioskModeResultIntent(r7)
            goto L_0x02ae
        L_0x01d1:
            java.lang.String r1 = "edm.intent.action.unexpected.kiosk.behavior"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01df
            android.content.Intent r7 = r5.convertUnexpectedKioskBehaviorIntent(r7)
            goto L_0x02ae
        L_0x01df:
            java.lang.String r1 = "android.intent.action.sec.SIM_CARD_CHANGED"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01f9
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 <= r2) goto L_0x02ad
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 >= r4) goto L_0x02ad
            android.content.Intent r7 = r5.convertSimCardChangedIntent(r7)
            goto L_0x02ae
        L_0x01f9:
            java.lang.String r1 = "com.samsung.edm.intent.action.SIM_CARD_CHANGED"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x020d
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 < r4) goto L_0x02ad
            android.content.Intent r7 = r5.convertSimCardChangedIntent(r7)
            goto L_0x02ae
        L_0x020d:
            java.lang.String r1 = "com.samsung.action.knox.certenroll.CEP_CERT_ENROLL_STATUS"
            boolean r1 = r1.equals(r0)
            r2 = 12
            if (r1 == 0) goto L_0x0223
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 < r2) goto L_0x02ad
            android.content.Intent r7 = r5.convertActionCertEnrollStatus(r7)
            goto L_0x02ae
        L_0x0223:
            java.lang.String r1 = "com.samsung.action.knox.certenroll.CEP_SERVICE_DISCONNECTED"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0237
            int r0 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()
            if (r0 < r2) goto L_0x02ad
            android.content.Intent r7 = r5.convertActionServiceDisconnected(r7)
            goto L_0x02ae
        L_0x0237:
            java.lang.String r1 = "com.sec.enterprise.knox.intent.action.KNOX_ATTESTATION_RESULT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0245
            android.content.Intent r7 = r5.convertActionKnoxAttestationResult(r7)
            goto L_0x02ae
        L_0x0245:
            java.lang.String r1 = "com.sec.action.NO_USER_ACTIVITY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0252
            android.content.Intent r7 = r5.convertActionNoUserActivity(r7)
            goto L_0x02ae
        L_0x0252:
            java.lang.String r1 = "com.sec.action.USER_ACTIVITY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x025f
            android.content.Intent r7 = r5.convertActionUserActivity(r7)
            goto L_0x02ae
        L_0x025f:
            java.lang.String r1 = "com.samsung.android.mdm.VPN_BIND_RESULT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x026c
            android.content.Intent r7 = r5.convertActionBindResult(r7)
            goto L_0x02ae
        L_0x026c:
            java.lang.String r1 = "mdm.intent.action.audit.log.critical.size"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0279
            android.content.Intent r7 = r5.convertActionCriticalSize()
            goto L_0x02ae
        L_0x0279:
            java.lang.String r1 = "mdm.intent.action.audit.log.full.size"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0286
            android.content.Intent r7 = r5.convertActionAuditFullSize()
            goto L_0x02ae
        L_0x0286:
            java.lang.String r1 = "mdm.intent.action.audit.log.maximum.size"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0293
            android.content.Intent r7 = r5.convertActionAuditMaximumSize()
            goto L_0x02ae
        L_0x0293:
            java.lang.String r1 = "mdm.intent.action.dump.audit.log.result"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02a0
            android.content.Intent r7 = r5.convertActionDumpLogResult(r7)
            goto L_0x02ae
        L_0x02a0:
            java.lang.String r1 = "mdm.intent.action.audit.log.exception"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02ad
            android.content.Intent r7 = r5.convertActionLogException(r7)
            goto L_0x02ae
        L_0x02ad:
            r7 = 0
        L_0x02ae:
            if (r7 == 0) goto L_0x02ba
            java.lang.String r0 = r6.getPackageName()
            r7.setPackage(r0)
            r6.sendBroadcast(r7)
        L_0x02ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.IntentConverterReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
