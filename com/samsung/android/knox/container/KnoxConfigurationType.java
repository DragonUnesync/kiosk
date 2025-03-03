package com.samsung.android.knox.container;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import com.samsung.android.knox.SupportLibUtils;
import com.sec.enterprise.knox.container.ContainerModeConfigurationType;
import com.sec.enterprise.knox.container.LightweightConfigurationType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class KnoxConfigurationType implements Parcelable {
    public static final Parcelable.Creator<KnoxConfigurationType> CREATOR = new Parcelable.Creator<KnoxConfigurationType>() {
        public KnoxConfigurationType createFromParcel(Parcel parcel) {
            return new KnoxConfigurationType(parcel);
        }

        public KnoxConfigurationType[] newArray(int i) {
            Log.d(KnoxConfigurationType.TAG, "KnoxConfigurationType[] array to be created");
            return new KnoxConfigurationType[i];
        }
    };
    private static final String TAG = "KnoxConfigurationType";
    private static final int fingerprint = 1;
    private static final int iris = 2;
    private HashMap<String, List<Pair<String, String>>> mAllowChangeDataSettings;
    protected boolean mAllowMultiwindowMode;
    private boolean mAllowSwitch;
    protected boolean mAllowTaskManager;
    protected boolean mAllowUSBDebugging;
    protected List<String> mAppInstallationList;
    private AuthenticationConfig mAuthenticationConfig;
    protected int mBiometricAuthValue;
    protected String mCustomBadgeIcon;
    protected String mCustomHomeScreenWallpaper;
    protected String mCustomLockScreenWallpaper;
    protected String mCustomStatusIcon;
    protected String mCustomStatusLabel;
    protected boolean mEC;
    protected String mECBadge;
    protected String mECIcon;
    protected String mECName;
    protected List<String> mForbiddenStrings;
    protected List<String> mGoogleAppsList;
    protected boolean mIsBiometricAuthEnabled;
    private boolean mIsDefaultConfigType;
    protected int mKeyguardDisabledFeatures;
    private int mLayoutType;
    private boolean mManagedType;
    protected int mMaximumCharacterOccurences;
    protected int mMaximumCharacterSequenceLength;
    protected int mMaximumFailedPasswordsForWipe;
    protected int mMaximumNumericSequenceLength;
    protected int mMaximumTimeToLock;
    protected boolean mMultifactorAuthEnabled;
    protected String mName;
    protected String mNameIcon;
    protected int mPasswordMinimumLength;
    protected int mPasswordMinimumLetters;
    protected int mPasswordMinimumLowerCase;
    protected int mPasswordMinimumNonLetters;
    protected int mPasswordMinimumNumeric;
    protected int mPasswordMinimumSymbols;
    protected int mPasswordMinimumUpperCase;
    protected String mPasswordPattern;
    protected int mPasswordQuality;
    protected List<String> mProtectedList;
    private HashMap<String, List<Pair<String, String>>> mRCPDataSettings;
    private HashMap<String, List<Pair<String, String>>> mRCPNotifSettings;
    protected boolean mSimplePasswordEnabled;
    private String mVersion;

    public KnoxConfigurationType() {
        this.mPasswordMinimumNonLetters = 0;
        this.mPasswordMinimumLetters = 0;
        this.mPasswordMinimumNumeric = 0;
        this.mPasswordMinimumUpperCase = 0;
        this.mPasswordMinimumLowerCase = 0;
        this.mPasswordMinimumSymbols = 0;
        this.mPasswordQuality = 0;
        this.mMaximumFailedPasswordsForWipe = 0;
        this.mMaximumCharacterOccurences = 0;
        this.mMaximumCharacterSequenceLength = 0;
        this.mMaximumNumericSequenceLength = 0;
        this.mPasswordMinimumLength = 0;
        this.mMaximumTimeToLock = 0;
        this.mPasswordPattern = null;
        this.mName = null;
        this.mCustomHomeScreenWallpaper = null;
        this.mEC = false;
        this.mNameIcon = null;
        this.mECName = null;
        this.mECIcon = null;
        this.mECBadge = null;
        this.mCustomLockScreenWallpaper = null;
        this.mAppInstallationList = new ArrayList();
        this.mLayoutType = -1;
        this.mAllowSwitch = true;
        this.mAuthenticationConfig = new AuthenticationConfig();
        this.mForbiddenStrings = new ArrayList();
        this.mMultifactorAuthEnabled = false;
        this.mIsBiometricAuthEnabled = false;
        this.mBiometricAuthValue = -1;
        this.mKeyguardDisabledFeatures = -1;
        this.mRCPDataSettings = new HashMap<>();
        this.mAllowChangeDataSettings = new HashMap<>();
        this.mVersion = "custom";
        this.mManagedType = false;
        this.mSimplePasswordEnabled = true;
        this.mAllowMultiwindowMode = true;
        this.mAllowTaskManager = true;
        this.mAllowUSBDebugging = false;
        this.mIsDefaultConfigType = false;
        this.mCustomBadgeIcon = null;
        this.mCustomStatusLabel = null;
        this.mCustomStatusIcon = null;
        this.mProtectedList = new ArrayList();
        this.mGoogleAppsList = new ArrayList();
        this.mRCPNotifSettings = new HashMap<>();
    }

    public static KnoxConfigurationType convertToNew(com.sec.enterprise.knox.container.KnoxConfigurationType knoxConfigurationType) {
        if (knoxConfigurationType == null) {
            return null;
        }
        if (knoxConfigurationType instanceof LightweightConfigurationType) {
            return LightweightConfigurationType.convertToNew((LightweightConfigurationType) knoxConfigurationType);
        }
        if (knoxConfigurationType instanceof ContainerModeConfigurationType) {
            return ContainerModeConfigurationType.convertToNew((ContainerModeConfigurationType) knoxConfigurationType);
        }
        KnoxConfigurationType knoxConfigurationType2 = new KnoxConfigurationType();
        convertToNew(knoxConfigurationType2, knoxConfigurationType);
        return knoxConfigurationType2;
    }

    public static List<KnoxConfigurationType> convertToNewList(List<com.sec.enterprise.knox.container.KnoxConfigurationType> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (com.sec.enterprise.knox.container.KnoxConfigurationType convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public static com.sec.enterprise.knox.container.KnoxConfigurationType convertToOld(KnoxConfigurationType knoxConfigurationType) {
        throw null;
    }

    public static com.sec.enterprise.knox.container.KnoxConfigurationType convertToOld(KnoxConfigurationType knoxConfigurationType, com.sec.enterprise.knox.container.KnoxConfigurationType knoxConfigurationType2) {
        Class<List> cls = List.class;
        Class<String> cls2 = String.class;
        Class<KnoxConfigurationType> cls3 = KnoxConfigurationType.class;
        if (knoxConfigurationType == null) {
            return null;
        }
        knoxConfigurationType2.setName(knoxConfigurationType.getName());
        knoxConfigurationType2.setPasswordMinimumNonLetters(knoxConfigurationType.getPasswordMinimumNonLetters());
        knoxConfigurationType2.setPasswordMinimumLetters(knoxConfigurationType.getPasswordMinimumLetters());
        knoxConfigurationType2.setPasswordMinimumNumeric(knoxConfigurationType.getPasswordMinimumNumeric());
        knoxConfigurationType2.setPasswordMinimumUpperCase(knoxConfigurationType.getPasswordMinimumUpperCase());
        knoxConfigurationType2.setPasswordMinimumLowerCase(knoxConfigurationType.getPasswordMinimumLowerCase());
        knoxConfigurationType2.setPasswordMinimumSymbols(knoxConfigurationType.getPasswordMinimumSymbols());
        knoxConfigurationType2.setPasswordQuality(knoxConfigurationType.getPasswordQuality());
        knoxConfigurationType2.setMaximumTimeToLock(knoxConfigurationType.getMaximumTimeToLock());
        knoxConfigurationType2.setMaximumFailedPasswordsForWipe(knoxConfigurationType.getMaximumFailedPasswordsForWipe());
        knoxConfigurationType2.setCustomHomeScreenWallpaper(knoxConfigurationType.getCustomHomeScreenWallpaper());
        try {
            knoxConfigurationType2.setBiometricAuthenticationEnabled(1, knoxConfigurationType.isBiometricAuthenticationEnabled(1));
            knoxConfigurationType2.setBiometricAuthenticationEnabled(2, knoxConfigurationType.isBiometricAuthenticationEnabled(2));
        } catch (NoSuchMethodError unused) {
            if (knoxConfigurationType.isBiometricAuthenticationEnabled(1) || knoxConfigurationType.isBiometricAuthenticationEnabled(2)) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setBiometricAuthenticationEnabled", new Class[]{Integer.TYPE, Boolean.TYPE}, 14));
            }
        }
        try {
            knoxConfigurationType2.setCustomizedContainerNameIcon(knoxConfigurationType.getCustomizedContainerNameIcon());
        } catch (NoSuchMethodError unused2) {
            if (knoxConfigurationType.getCustomizedContainerNameIcon() != null) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setCustomizedContainerNameIcon", new Class[]{cls2}, 20));
            }
        }
        try {
            knoxConfigurationType2.setCustomizedContainerEnabled(knoxConfigurationType.isCustomizedContainerEnabled());
        } catch (NoSuchMethodError unused3) {
            if (knoxConfigurationType.isCustomizedContainerEnabled()) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setCustomizedContainerEnabled", new Class[]{Boolean.TYPE}, 20));
            }
        }
        try {
            knoxConfigurationType2.setCustomizedContainerName(knoxConfigurationType.getCustomizedContainerName());
        } catch (NoSuchMethodError unused4) {
            if (knoxConfigurationType.getCustomizedContainerName() != null) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setCustomizedContainerName", new Class[]{cls2}, 20));
            }
        }
        try {
            knoxConfigurationType2.setCustomizedContainerIcon(knoxConfigurationType.getCustomizedContainerIcon());
        } catch (NoSuchMethodError unused5) {
            if (knoxConfigurationType.getCustomizedContainerIcon() != null) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setCustomizedContainerIcon", new Class[]{cls2}, 20));
            }
        }
        try {
            knoxConfigurationType2.setCustomizedContainerBadge(knoxConfigurationType.getCustomizedContainerBadge());
        } catch (NoSuchMethodError unused6) {
            if (knoxConfigurationType.getCustomizedContainerBadge() != null) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setCustomizedContainerBadge", new Class[]{cls2}, 20));
            }
        }
        try {
            knoxConfigurationType2.setCustomLockScreenWallpaper(knoxConfigurationType.getCustomLockScreenWallpaper());
        } catch (NoSuchMethodError unused7) {
            if (knoxConfigurationType.getCustomLockScreenWallpaper() != null) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setCustomLockScreenWallpaper", new Class[]{cls2}, 20));
            }
        }
        knoxConfigurationType2.setAppInstallationList(knoxConfigurationType.getAppInstallationList());
        knoxConfigurationType2.setForbiddenStrings(knoxConfigurationType.getForbiddenStrings());
        knoxConfigurationType2.setMaximumCharacterOccurences(knoxConfigurationType.getMaximumCharacterOccurences());
        knoxConfigurationType2.setMaximumCharacterSequenceLength(knoxConfigurationType.getMaximumCharacterSequenceLength());
        knoxConfigurationType2.setMaximumNumericSequenceLength(knoxConfigurationType.getMaximumNumericSequenceLength());
        knoxConfigurationType2.setPasswordMinimumLength(knoxConfigurationType.getPasswordMinimumLength());
        try {
            knoxConfigurationType2.enforceMultifactorAuthentication(knoxConfigurationType.isMultifactorAuthenticationEnforced());
        } catch (NoSuchMethodError unused8) {
            if (knoxConfigurationType.isMultifactorAuthenticationEnforced()) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "enforceMultifactorAuthentication", new Class[]{Boolean.TYPE}, 13));
            }
        }
        try {
            knoxConfigurationType2.setRequiredPasswordPattern(knoxConfigurationType.getRequiredPwdPatternRestrictions());
        } catch (NoSuchMethodError unused9) {
            if (knoxConfigurationType.getRequiredPwdPatternRestrictions() != null) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setRequiredPasswordPattern", new Class[]{cls2}, 12));
            }
        }
        try {
            knoxConfigurationType2.setContainerLayout(knoxConfigurationType.getContainerLayout());
        } catch (NoSuchMethodError unused10) {
            if (knoxConfigurationType.getContainerLayout() != -1) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setContainerLayout", new Class[]{Integer.TYPE}, 17));
            }
        }
        try {
            knoxConfigurationType2.allowLayoutSwitching(knoxConfigurationType.isLayoutSwitchingAllowed());
        } catch (NoSuchMethodError unused11) {
            if (!knoxConfigurationType.isLayoutSwitchingAllowed()) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "allowLayoutSwitching", new Class[]{Boolean.TYPE}, 17));
            }
        }
        try {
            knoxConfigurationType2.setDefaultConfigType(knoxConfigurationType.isDefaultConfigType());
        } catch (NoSuchMethodError unused12) {
            if (knoxConfigurationType.isDefaultConfigType()) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setDefaultConfigType", new Class[]{Boolean.TYPE}, 17));
            }
        }
        try {
            knoxConfigurationType2.setEnterpriseIdentityAuthentication(AuthenticationConfig.convertToOld(knoxConfigurationType.getEnterpriseIdentityAuthentication()));
        } catch (NoSuchMethodError unused13) {
            if (!AuthenticationConfig.isDefaultObject(knoxConfigurationType.getEnterpriseIdentityAuthentication())) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setEnterpriseIdentityAuthentication", new Class[]{AuthenticationConfig.class}, 15));
            }
        }
        try {
            knoxConfigurationType2.setKeyguardDisabledFeatures(knoxConfigurationType.getKeyguardDisabledFeatures());
        } catch (NoSuchMethodError unused14) {
            if (knoxConfigurationType.getKeyguardDisabledFeatures() != -1) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setKeyguardDisabledFeatures", new Class[]{Integer.TYPE}, 15));
            }
        }
        List<String> list = knoxConfigurationType.mAppInstallationList;
        if (list != null) {
            for (String str : list) {
                List<Pair> list2 = knoxConfigurationType.mRCPDataSettings.get(str);
                if (list2 != null) {
                    for (Pair pair : list2) {
                        knoxConfigurationType2.setDataSyncPolicy(knoxConfigurationType.mAppInstallationList, (String) pair.first, (String) pair.second);
                    }
                }
            }
        }
        List<String> list3 = knoxConfigurationType.mAppInstallationList;
        if (list3 != null) {
            for (String str2 : list3) {
                List<Pair> list4 = knoxConfigurationType.mAllowChangeDataSettings.get(str2);
                if (list4 != null) {
                    for (Pair pair2 : list4) {
                        knoxConfigurationType2.setAllowChangeDataSyncPolicy(knoxConfigurationType.mAppInstallationList, (String) pair2.first, Boolean.valueOf((String) pair2.second).booleanValue());
                    }
                }
            }
        }
        knoxConfigurationType2.setManagedType(knoxConfigurationType.getManagedType());
        knoxConfigurationType2.setCustomBadgeIcon(knoxConfigurationType.getCustomBadgeIcon());
        knoxConfigurationType2.setCustomStatusLabel(knoxConfigurationType.getCustomStatusLabel());
        knoxConfigurationType2.setCustomStatusIcon(knoxConfigurationType.getCustomStatusIcon());
        knoxConfigurationType2.setSimplePasswordEnabled(knoxConfigurationType.getSimplePasswordEnabled());
        knoxConfigurationType2.allowTaskManager(knoxConfigurationType.isTaskManagerAllowed());
        knoxConfigurationType2.allowMultiwindowMode(knoxConfigurationType.isMultiwindowModeAllowed());
        List<String> list5 = knoxConfigurationType.mAppInstallationList;
        if (list5 != null) {
            for (String str3 : list5) {
                List<Pair> list6 = knoxConfigurationType.mRCPNotifSettings.get(str3);
                if (list6 != null) {
                    for (Pair pair3 : list6) {
                        knoxConfigurationType2.setDataSyncPolicy(knoxConfigurationType.mAppInstallationList, (String) pair3.first, (String) pair3.second);
                    }
                }
            }
        }
        try {
            knoxConfigurationType2.setVersion(knoxConfigurationType.getVersion());
        } catch (NoSuchMethodError unused15) {
            if (!knoxConfigurationType.getVersion().equals("custom")) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setVersion", new Class[]{cls2}, 12));
            }
        }
        try {
            knoxConfigurationType2.setProtectedPackageList(knoxConfigurationType.getProtectedPackageList());
        } catch (NoSuchMethodError unused16) {
            if (knoxConfigurationType.getProtectedPackageList() != null) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setProtectedPackageList", new Class[]{cls}, 12));
            }
        }
        try {
            knoxConfigurationType2.setGoogleAppsList(knoxConfigurationType.getGoogleAppsList());
        } catch (NoSuchMethodError unused17) {
            if (knoxConfigurationType.getProtectedPackageList() != null) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "setGoogleAppsList", new Class[]{cls}, 12));
            }
        }
        try {
            knoxConfigurationType2.allowUSBDebugging(knoxConfigurationType.isUSBDebuggingAllowed());
        } catch (NoSuchMethodError unused18) {
            if (knoxConfigurationType.isUSBDebuggingAllowed()) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls3, "allowUSBDebugging", new Class[]{Boolean.TYPE}, 15));
            }
        }
        return knoxConfigurationType2;
    }

    private void deserializeRCPSettings(Parcel parcel, HashMap<String, List<Pair<String, String>>> hashMap) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            ArrayList arrayList = new ArrayList();
            int readInt2 = parcel.readInt();
            for (int i8 = 0; i8 < readInt2; i8++) {
                arrayList.add(new Pair(parcel.readString(), parcel.readString()));
            }
            hashMap.put(readString, arrayList);
        }
    }

    private List<String> getListFromSyncPolicy(String str, String str2, HashMap<String, List<Pair<String, String>>> hashMap) {
        Set<String> keySet;
        ArrayList arrayList = null;
        if (!(hashMap == null || str == null || str.isEmpty() || str2 == null || str2.isEmpty() || (keySet = hashMap.keySet()) == null)) {
            Pair pair = new Pair(str, str2);
            for (String next : keySet) {
                List<Pair> list = hashMap.get(next);
                if (list != null) {
                    for (Pair equals : list) {
                        if (pair.equals(equals)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private String getRCPSyncPolicy(String str, String str2, HashMap<String, List<Pair<String, String>>> hashMap) {
        List<Pair> list;
        if (!(hashMap == null || str == null || str.isEmpty() || str2 == null || str2.isEmpty() || (list = hashMap.get(str)) == null)) {
            for (Pair pair : list) {
                if (((String) pair.first).equals(str2)) {
                    return (String) pair.second;
                }
            }
        }
        return null;
    }

    private boolean isDefaultConfigType() {
        return this.mIsDefaultConfigType;
    }

    private void serializeRCPSettings(Parcel parcel, HashMap<String, List<Pair<String, String>>> hashMap) {
        Set<String> keySet = hashMap.keySet();
        if (keySet != null) {
            parcel.writeInt(keySet.size());
            for (String next : keySet) {
                parcel.writeString(next);
                List<Pair> list = hashMap.get(next);
                if (list != null) {
                    parcel.writeInt(list.size());
                    for (Pair pair : list) {
                        parcel.writeString((String) pair.first);
                        parcel.writeString((String) pair.second);
                    }
                } else {
                    parcel.writeInt(0);
                }
            }
            return;
        }
        parcel.writeInt(0);
    }

    private void setDefaultConfigType(boolean z) {
        this.mIsDefaultConfigType = z;
    }

    private void setRCPSyncPolicy(HashMap<String, List<Pair<String, String>>> hashMap, HashMap<String, List<Pair<String, String>>> hashMap2) {
        Set<String> keySet;
        if (hashMap2 != null) {
            hashMap2.clear();
            if (hashMap != null && (keySet = hashMap.keySet()) != null) {
                for (String next : keySet) {
                    List<Pair> list = hashMap.get(next);
                    if (list != null && !list.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Pair pair : list) {
                            arrayList.add(new Pair(pair.first, pair.second));
                        }
                        hashMap2.put(next, arrayList);
                    }
                }
            }
        }
    }

    public void allowLayoutSwitching(boolean z) {
        this.mAllowSwitch = z;
    }

    public void allowMultiwindowMode(boolean z) {
        this.mAllowMultiwindowMode = z;
    }

    public void allowTaskManager(boolean z) {
        this.mAllowTaskManager = z;
    }

    public void allowUSBDebugging(boolean z) {
        this.mAllowUSBDebugging = z;
    }

    public KnoxConfigurationType clone(String str) {
        if (str == null || str.isEmpty()) {
            Log.d(TAG, "clone(): name is either null or empty, hence returning null");
            return null;
        }
        KnoxConfigurationType knoxConfigurationType = new KnoxConfigurationType();
        cloneConfiguration(knoxConfigurationType, str);
        return knoxConfigurationType;
    }

    public void cloneConfiguration(KnoxConfigurationType knoxConfigurationType, String str) {
        knoxConfigurationType.setName(str);
        knoxConfigurationType.setPasswordMinimumNonLetters(this.mPasswordMinimumNonLetters);
        knoxConfigurationType.setPasswordMinimumLetters(this.mPasswordMinimumLetters);
        knoxConfigurationType.setPasswordMinimumNumeric(this.mPasswordMinimumNumeric);
        knoxConfigurationType.setPasswordMinimumUpperCase(this.mPasswordMinimumUpperCase);
        knoxConfigurationType.setPasswordMinimumLowerCase(this.mPasswordMinimumLowerCase);
        knoxConfigurationType.setPasswordMinimumSymbols(this.mPasswordMinimumSymbols);
        knoxConfigurationType.setPasswordQuality(this.mPasswordQuality);
        knoxConfigurationType.setMaximumFailedPasswordsForWipe(this.mMaximumFailedPasswordsForWipe);
        knoxConfigurationType.setManagedType(this.mManagedType);
        knoxConfigurationType.setCustomBadgeIcon(this.mCustomBadgeIcon);
        knoxConfigurationType.setCustomHomeScreenWallpaper(this.mCustomHomeScreenWallpaper);
        knoxConfigurationType.setCustomizedContainerNameIcon(this.mNameIcon);
        knoxConfigurationType.setCustomizedContainerEnabled(this.mEC);
        knoxConfigurationType.setCustomizedContainerName(this.mECName);
        knoxConfigurationType.setCustomizedContainerIcon(this.mECIcon);
        knoxConfigurationType.setCustomizedContainerBadge(this.mECBadge);
        knoxConfigurationType.setCustomLockScreenWallpaper(this.mCustomLockScreenWallpaper);
        knoxConfigurationType.setCustomStatusLabel(this.mCustomStatusLabel);
        knoxConfigurationType.setCustomStatusIcon(this.mCustomStatusIcon);
        knoxConfigurationType.setAppInstallationList(this.mAppInstallationList);
        knoxConfigurationType.setForbiddenStrings(this.mForbiddenStrings);
        knoxConfigurationType.setProtectedPackageList(this.mProtectedList);
        knoxConfigurationType.setGoogleAppsList(this.mGoogleAppsList);
        knoxConfigurationType.setMaximumCharacterOccurences(this.mMaximumCharacterOccurences);
        knoxConfigurationType.setMaximumCharacterSequenceLength(this.mMaximumCharacterSequenceLength);
        knoxConfigurationType.setMaximumNumericSequenceLength(this.mMaximumNumericSequenceLength);
        knoxConfigurationType.setPasswordMinimumLength(this.mPasswordMinimumLength);
        knoxConfigurationType.setSimplePasswordEnabled(this.mSimplePasswordEnabled);
        knoxConfigurationType.enforceMultifactorAuthentication(this.mMultifactorAuthEnabled);
        knoxConfigurationType.setRequiredPasswordPattern(this.mPasswordPattern);
        knoxConfigurationType.setRCPSyncPolicy(this.mRCPDataSettings, knoxConfigurationType.getDataSyncPolicy());
        knoxConfigurationType.setRCPSyncPolicy(this.mAllowChangeDataSettings, knoxConfigurationType.getAllowChangeDataSyncPolicy());
        knoxConfigurationType.setRCPSyncPolicy(this.mRCPNotifSettings, knoxConfigurationType.getNotificationSyncPolicy());
        knoxConfigurationType.setMaximumTimeToLock(this.mMaximumTimeToLock);
        knoxConfigurationType.setVersion(this.mVersion);
        knoxConfigurationType.allowMultiwindowMode(this.mAllowMultiwindowMode);
        knoxConfigurationType.allowTaskManager(this.mAllowTaskManager);
        knoxConfigurationType.setBiometricAuthenticationEnabled(this.mBiometricAuthValue, this.mIsBiometricAuthEnabled);
        knoxConfigurationType.allowUSBDebugging(this.mAllowUSBDebugging);
        knoxConfigurationType.setContainerLayout(this.mLayoutType);
        knoxConfigurationType.allowLayoutSwitching(this.mAllowSwitch);
        knoxConfigurationType.setDefaultConfigType(this.mIsDefaultConfigType);
        knoxConfigurationType.setEnterpriseIdentityAuthentication(this.mAuthenticationConfig);
        knoxConfigurationType.setKeyguardDisabledFeatures(this.mKeyguardDisabledFeatures);
    }

    public int describeContents() {
        return 0;
    }

    public void enforceMultifactorAuthentication(boolean z) {
        this.mMultifactorAuthEnabled = z;
    }

    public HashMap<String, List<Pair<String, String>>> getAllowChangeDataSyncPolicy() {
        return this.mAllowChangeDataSettings;
    }

    public List<String> getAppInstallationList() {
        return this.mAppInstallationList;
    }

    public boolean getBiometricAuthenticationEnabledValue() {
        return this.mIsBiometricAuthEnabled;
    }

    public int getContainerLayout() {
        return this.mLayoutType;
    }

    public String getCustomBadgeIcon() {
        return this.mCustomBadgeIcon;
    }

    public String getCustomHomeScreenWallpaper() {
        return this.mCustomHomeScreenWallpaper;
    }

    public String getCustomLockScreenWallpaper() {
        return this.mCustomLockScreenWallpaper;
    }

    public String getCustomStatusIcon() {
        return this.mCustomStatusIcon;
    }

    public String getCustomStatusLabel() {
        return this.mCustomStatusLabel;
    }

    public String getCustomizedContainerBadge() {
        return this.mECBadge;
    }

    public String getCustomizedContainerIcon() {
        return this.mECIcon;
    }

    public String getCustomizedContainerName() {
        return this.mECName;
    }

    public String getCustomizedContainerNameIcon() {
        return this.mNameIcon;
    }

    public HashMap<String, List<Pair<String, String>>> getDataSyncPolicy() {
        return this.mRCPDataSettings;
    }

    public AuthenticationConfig getEnterpriseIdentityAuthentication() {
        return this.mAuthenticationConfig;
    }

    public List<String> getForbiddenStrings() {
        return this.mForbiddenStrings;
    }

    public List<String> getGoogleAppsList() {
        return this.mGoogleAppsList;
    }

    public int getKeyguardDisabledFeatures() {
        return this.mKeyguardDisabledFeatures;
    }

    public List<String> getListFromAllowChangeDataSyncPolicy(String str, boolean z) {
        return getListFromSyncPolicy(str, Boolean.toString(z), this.mAllowChangeDataSettings);
    }

    public List<String> getListFromDataSyncPolicy(String str, String str2) {
        return getListFromSyncPolicy(str, str2, this.mRCPDataSettings);
    }

    public boolean getManagedType() {
        return this.mManagedType;
    }

    public int getMaximumCharacterOccurences() {
        return this.mMaximumCharacterOccurences;
    }

    public int getMaximumCharacterSequenceLength() {
        return this.mMaximumCharacterSequenceLength;
    }

    public int getMaximumFailedPasswordsForWipe() {
        return this.mMaximumFailedPasswordsForWipe;
    }

    public int getMaximumNumericSequenceLength() {
        return this.mMaximumNumericSequenceLength;
    }

    public int getMaximumTimeToLock() {
        return this.mMaximumTimeToLock;
    }

    public String getName() {
        return this.mName;
    }

    public HashMap<String, List<Pair<String, String>>> getNotificationSyncPolicy() {
        return this.mRCPNotifSettings;
    }

    public int getPasswordMinimumLength() {
        return this.mPasswordMinimumLength;
    }

    public int getPasswordMinimumLetters() {
        return this.mPasswordMinimumLetters;
    }

    public int getPasswordMinimumLowerCase() {
        return this.mPasswordMinimumLowerCase;
    }

    public int getPasswordMinimumNonLetters() {
        return this.mPasswordMinimumNonLetters;
    }

    public int getPasswordMinimumNumeric() {
        return this.mPasswordMinimumNumeric;
    }

    public int getPasswordMinimumSymbols() {
        return this.mPasswordMinimumSymbols;
    }

    public int getPasswordMinimumUpperCase() {
        return this.mPasswordMinimumUpperCase;
    }

    public int getPasswordQuality() {
        return this.mPasswordQuality;
    }

    public List<String> getProtectedPackageList() {
        return this.mProtectedList;
    }

    public String getRequiredPwdPatternRestrictions() {
        return this.mPasswordPattern;
    }

    public boolean getSimplePasswordEnabled() {
        return this.mSimplePasswordEnabled;
    }

    public String getVersion() {
        return this.mVersion;
    }

    public boolean isBiometricAuthenticationEnabled(int i) {
        int i8 = this.mBiometricAuthValue;
        if (i8 == -1 || (i8 & i) != i) {
            return false;
        }
        Log.d(TAG, "isBiometricAuthenticationEnabled: return true (hasValue)");
        return true;
    }

    public boolean isCustomizedContainerEnabled() {
        return this.mEC;
    }

    public boolean isLayoutSwitchingAllowed() {
        return this.mAllowSwitch;
    }

    public boolean isMultifactorAuthenticationEnforced() {
        return this.mMultifactorAuthEnabled;
    }

    public boolean isMultiwindowModeAllowed() {
        return this.mAllowMultiwindowMode;
    }

    public boolean isTaskManagerAllowed() {
        return this.mAllowTaskManager;
    }

    public boolean isUSBDebuggingAllowed() {
        return this.mAllowUSBDebugging;
    }

    public void setAllowChangeDataSyncPolicy(List<String> list, String str, boolean z) {
        setRCPSyncPolicy(list, str, Boolean.toString(z), this.mAllowChangeDataSettings);
    }

    public void setAppInstallationList(List<String> list) {
        this.mAppInstallationList = list;
    }

    public void setBiometricAuthenticationEnabled(int i, boolean z) {
        int i8;
        if (i >= 0) {
            int i9 = this.mBiometricAuthValue;
            if (i9 <= 0) {
                i9 = 0;
            }
            if (z) {
                i8 = i | i9;
            } else {
                i8 = (~i) & i9;
            }
            this.mBiometricAuthValue = i8;
            if (i8 <= 0) {
                this.mIsBiometricAuthEnabled = false;
            } else {
                this.mIsBiometricAuthEnabled = true;
            }
            Log.d(TAG, "setBiometricAuthenticationEnabled : bioAuth = " + this.mBiometricAuthValue + ", enabled : " + this.mIsBiometricAuthEnabled);
        }
    }

    public void setContainerLayout(int i) {
        this.mLayoutType = i;
    }

    public void setCustomBadgeIcon(String str) {
        this.mCustomBadgeIcon = str;
    }

    public void setCustomHomeScreenWallpaper(String str) {
        this.mCustomHomeScreenWallpaper = str;
    }

    public void setCustomLockScreenWallpaper(String str) {
        this.mCustomLockScreenWallpaper = str;
    }

    public void setCustomStatusIcon(String str) {
        this.mCustomStatusIcon = str;
    }

    public void setCustomStatusLabel(String str) {
        this.mCustomStatusLabel = str;
    }

    public void setCustomizedContainerBadge(String str) {
        this.mECBadge = str;
    }

    public void setCustomizedContainerEnabled(boolean z) {
        this.mEC = z;
    }

    public void setCustomizedContainerIcon(String str) {
        this.mECIcon = str;
    }

    public void setCustomizedContainerName(String str) {
        this.mECName = str;
    }

    public void setCustomizedContainerNameIcon(String str) {
        this.mNameIcon = str;
    }

    public void setDataSyncPolicy(List<String> list, String str, String str2) {
        setRCPSyncPolicy(list, str, str2, this.mRCPDataSettings);
    }

    public void setEnterpriseIdentityAuthentication(AuthenticationConfig authenticationConfig) {
        this.mAuthenticationConfig = authenticationConfig;
    }

    public void setForbiddenStrings(List<String> list) {
        this.mForbiddenStrings = list;
    }

    public void setGoogleAppsList(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.mGoogleAppsList.clear();
            this.mGoogleAppsList.addAll(list);
        }
    }

    public void setKeyguardDisabledFeatures(int i) {
        this.mKeyguardDisabledFeatures = i;
    }

    public void setManagedType(boolean z) {
        this.mManagedType = z;
    }

    public void setMaximumCharacterOccurences(int i) {
        this.mMaximumCharacterOccurences = i;
    }

    public void setMaximumCharacterSequenceLength(int i) {
        this.mMaximumCharacterSequenceLength = i;
    }

    public void setMaximumFailedPasswordsForWipe(int i) {
        this.mMaximumFailedPasswordsForWipe = i;
    }

    public void setMaximumNumericSequenceLength(int i) {
        this.mMaximumNumericSequenceLength = i;
    }

    public void setMaximumTimeToLock(int i) {
        this.mMaximumTimeToLock = i;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setNotificationSyncPolicy(List<String> list, String str, String str2) {
        setRCPSyncPolicy(list, str, str2, this.mRCPNotifSettings);
    }

    public void setPasswordMinimumLength(int i) {
        this.mPasswordMinimumLength = i;
    }

    public void setPasswordMinimumLetters(int i) {
        this.mPasswordMinimumLetters = i;
    }

    public void setPasswordMinimumLowerCase(int i) {
        this.mPasswordMinimumLowerCase = i;
    }

    public void setPasswordMinimumNonLetters(int i) {
        this.mPasswordMinimumNonLetters = i;
    }

    public void setPasswordMinimumNumeric(int i) {
        this.mPasswordMinimumNumeric = i;
    }

    public void setPasswordMinimumSymbols(int i) {
        this.mPasswordMinimumSymbols = i;
    }

    public void setPasswordMinimumUpperCase(int i) {
        this.mPasswordMinimumUpperCase = i;
    }

    public void setPasswordQuality(int i) {
        this.mPasswordQuality = i;
    }

    public void setProtectedPackageList(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.mProtectedList.clear();
            this.mProtectedList.addAll(list);
        }
    }

    public void setRequiredPasswordPattern(String str) {
        this.mPasswordPattern = str;
    }

    public void setSimplePasswordEnabled(boolean z) {
        this.mSimplePasswordEnabled = z;
    }

    public void setVersion(String str) {
        this.mVersion = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = this.mName;
        if (str != null) {
            parcel.writeString(str);
        } else {
            parcel.writeString("custom");
        }
        String str2 = this.mVersion;
        if (str2 != null) {
            parcel.writeString(str2);
        } else {
            parcel.writeString("custom");
        }
        parcel.writeInt(this.mPasswordMinimumNonLetters);
        parcel.writeInt(this.mPasswordMinimumLetters);
        parcel.writeInt(this.mPasswordMinimumNumeric);
        parcel.writeInt(this.mPasswordMinimumUpperCase);
        parcel.writeInt(this.mPasswordMinimumLowerCase);
        parcel.writeInt(this.mPasswordMinimumSymbols);
        parcel.writeInt(this.mPasswordQuality);
        parcel.writeInt(this.mMaximumTimeToLock);
        parcel.writeInt(this.mMaximumFailedPasswordsForWipe);
        parcel.writeInt(this.mManagedType ? 1 : 0);
        String str3 = this.mCustomBadgeIcon;
        if (str3 != null) {
            parcel.writeString(str3);
        } else {
            parcel.writeString("");
        }
        String str4 = this.mCustomHomeScreenWallpaper;
        if (str4 != null) {
            parcel.writeString(str4);
        } else {
            parcel.writeString("");
        }
        Log.d(TAG, "writing to parcel mEC " + this.mEC);
        parcel.writeInt(this.mEC ? 1 : 0);
        String str5 = this.mNameIcon;
        if (str5 != null) {
            parcel.writeString(str5);
        } else {
            parcel.writeString("");
        }
        String str6 = this.mECName;
        if (str6 != null) {
            parcel.writeString(str6);
        } else {
            parcel.writeString("");
        }
        String str7 = this.mECIcon;
        if (str7 != null) {
            parcel.writeString(str7);
        } else {
            parcel.writeString("");
        }
        String str8 = this.mECBadge;
        if (str8 != null) {
            parcel.writeString(str8);
        } else {
            parcel.writeString("");
        }
        String str9 = this.mCustomLockScreenWallpaper;
        if (str9 != null) {
            parcel.writeString(str9);
        } else {
            parcel.writeString("");
        }
        String str10 = this.mCustomStatusLabel;
        if (str10 != null) {
            parcel.writeString(str10);
        } else {
            parcel.writeString("");
        }
        String str11 = this.mCustomStatusIcon;
        if (str11 != null) {
            parcel.writeString(str11);
        } else {
            parcel.writeString("");
        }
        parcel.writeStringList(this.mAppInstallationList);
        parcel.writeStringList(this.mForbiddenStrings);
        parcel.writeStringList(this.mProtectedList);
        parcel.writeStringList(this.mGoogleAppsList);
        parcel.writeInt(this.mMaximumCharacterOccurences);
        parcel.writeInt(this.mMaximumCharacterSequenceLength);
        parcel.writeInt(this.mMaximumNumericSequenceLength);
        parcel.writeInt(this.mPasswordMinimumLength);
        String str12 = this.mPasswordPattern;
        if (str12 != null) {
            parcel.writeString(str12);
        } else {
            parcel.writeString("");
        }
        parcel.writeInt(this.mSimplePasswordEnabled ? 1 : 0);
        parcel.writeInt(this.mMultifactorAuthEnabled ? 1 : 0);
        parcel.writeInt(this.mAllowMultiwindowMode ? 1 : 0);
        parcel.writeInt(this.mAllowTaskManager ? 1 : 0);
        parcel.writeInt(this.mIsBiometricAuthEnabled ? 1 : 0);
        parcel.writeInt(this.mBiometricAuthValue);
        parcel.writeInt(this.mAllowUSBDebugging ? 1 : 0);
        parcel.writeInt(this.mLayoutType);
        parcel.writeInt(this.mAllowSwitch ? 1 : 0);
        parcel.writeInt(this.mIsDefaultConfigType ? 1 : 0);
        serializeRCPSettings(parcel, this.mRCPDataSettings);
        serializeRCPSettings(parcel, this.mAllowChangeDataSettings);
        serializeRCPSettings(parcel, this.mRCPNotifSettings);
        parcel.writeParcelable(this.mAuthenticationConfig, i);
        parcel.writeInt(this.mKeyguardDisabledFeatures);
    }

    public boolean getAllowChangeDataSyncPolicy(String str, String str2) {
        return Boolean.parseBoolean(getRCPSyncPolicy(str, str2, this.mAllowChangeDataSettings));
    }

    public String getDataSyncPolicy(String str, String str2) {
        return getRCPSyncPolicy(str, str2, this.mRCPDataSettings);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(25:2|3|4|(2:5|6)|7|9|10|11|12|13|15|16|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|31) */
    /* JADX WARNING: Can't wrap try/catch for region: R(26:2|3|4|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|31) */
    /* JADX WARNING: Can't wrap try/catch for region: R(27:2|3|4|5|6|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|31) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x00ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00d8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0134 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x013b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0142 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0074 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.samsung.android.knox.container.KnoxConfigurationType convertToNew(com.samsung.android.knox.container.KnoxConfigurationType r2, com.sec.enterprise.knox.container.KnoxConfigurationType r3) {
        /*
            if (r3 != 0) goto L_0x0004
            r2 = 0
            return r2
        L_0x0004:
            java.lang.String r0 = r3.getName()
            r2.setName(r0)
            int r0 = r3.getPasswordMinimumNonLetters()
            r2.setPasswordMinimumNonLetters(r0)
            int r0 = r3.getPasswordMinimumLetters()
            r2.setPasswordMinimumLetters(r0)
            int r0 = r3.getPasswordMinimumNumeric()
            r2.setPasswordMinimumNumeric(r0)
            int r0 = r3.getPasswordMinimumUpperCase()
            r2.setPasswordMinimumUpperCase(r0)
            int r0 = r3.getPasswordMinimumLowerCase()
            r2.setPasswordMinimumLowerCase(r0)
            int r0 = r3.getPasswordMinimumSymbols()
            r2.setPasswordMinimumSymbols(r0)
            int r0 = r3.getPasswordQuality()
            r2.setPasswordQuality(r0)
            int r0 = r3.getMaximumTimeToLock()
            r2.setMaximumTimeToLock(r0)
            int r0 = r3.getMaximumFailedPasswordsForWipe()
            r2.setMaximumFailedPasswordsForWipe(r0)
            java.lang.String r0 = r3.getCustomHomeScreenWallpaper()
            r2.setCustomHomeScreenWallpaper(r0)
            java.lang.String r0 = r3.getCustomizedContainerNameIcon()     // Catch:{ NoSuchMethodError -> 0x0074 }
            r2.setCustomizedContainerNameIcon(r0)     // Catch:{ NoSuchMethodError -> 0x0074 }
            boolean r0 = r3.isCustomizedContainerEnabled()     // Catch:{ NoSuchMethodError -> 0x0074 }
            r2.setCustomizedContainerEnabled(r0)     // Catch:{ NoSuchMethodError -> 0x0074 }
            java.lang.String r0 = r3.getCustomizedContainerName()     // Catch:{ NoSuchMethodError -> 0x0074 }
            r2.setCustomizedContainerName(r0)     // Catch:{ NoSuchMethodError -> 0x0074 }
            java.lang.String r0 = r3.getCustomizedContainerIcon()     // Catch:{ NoSuchMethodError -> 0x0074 }
            r2.setCustomizedContainerIcon(r0)     // Catch:{ NoSuchMethodError -> 0x0074 }
            java.lang.String r0 = r3.getCustomizedContainerBadge()     // Catch:{ NoSuchMethodError -> 0x0074 }
            r2.setCustomizedContainerBadge(r0)     // Catch:{ NoSuchMethodError -> 0x0074 }
        L_0x0074:
            java.lang.String r0 = r3.getCustomLockScreenWallpaper()     // Catch:{ NoSuchMethodError -> 0x007b }
            r2.setCustomLockScreenWallpaper(r0)     // Catch:{ NoSuchMethodError -> 0x007b }
        L_0x007b:
            java.util.List r0 = r3.getAppInstallationList()
            r2.setAppInstallationList(r0)
            java.util.List r0 = r3.getForbiddenStrings()
            r2.setForbiddenStrings(r0)
            int r0 = r3.getMaximumCharacterOccurences()
            r2.setMaximumCharacterOccurences(r0)
            int r0 = r3.getMaximumCharacterSequenceLength()
            r2.setMaximumCharacterSequenceLength(r0)
            int r0 = r3.getMaximumNumericSequenceLength()
            r2.setMaximumNumericSequenceLength(r0)
            int r0 = r3.getPasswordMinimumLength()
            r2.setPasswordMinimumLength(r0)
            boolean r0 = r3.isMultifactorAuthenticationEnforced()     // Catch:{ NoSuchMethodError -> 0x00ac }
            r2.enforceMultifactorAuthentication(r0)     // Catch:{ NoSuchMethodError -> 0x00ac }
        L_0x00ac:
            java.lang.String r0 = r3.getRequiredPwdPatternRestrictions()     // Catch:{ NoSuchMethodError -> 0x00b3 }
            r2.setRequiredPasswordPattern(r0)     // Catch:{ NoSuchMethodError -> 0x00b3 }
        L_0x00b3:
            r0 = 1
            boolean r1 = r3.isBiometricAuthenticationEnabled(r0)     // Catch:{ NoSuchMethodError -> 0x00c3 }
            r2.setBiometricAuthenticationEnabled(r0, r1)     // Catch:{ NoSuchMethodError -> 0x00c3 }
            r0 = 2
            boolean r1 = r3.isBiometricAuthenticationEnabled(r0)     // Catch:{ NoSuchMethodError -> 0x00c3 }
            r2.setBiometricAuthenticationEnabled(r0, r1)     // Catch:{ NoSuchMethodError -> 0x00c3 }
        L_0x00c3:
            int r0 = r3.getContainerLayout()     // Catch:{ NoSuchMethodError -> 0x00d8 }
            r2.setContainerLayout(r0)     // Catch:{ NoSuchMethodError -> 0x00d8 }
            boolean r0 = r3.isLayoutSwitchingAllowed()     // Catch:{ NoSuchMethodError -> 0x00d8 }
            r2.allowLayoutSwitching(r0)     // Catch:{ NoSuchMethodError -> 0x00d8 }
            boolean r0 = r3.isDefaultConfigType()     // Catch:{ NoSuchMethodError -> 0x00d8 }
            r2.setDefaultConfigType(r0)     // Catch:{ NoSuchMethodError -> 0x00d8 }
        L_0x00d8:
            int r0 = r3.getKeyguardDisabledFeatures()     // Catch:{ NoSuchMethodError -> 0x00ea }
            r2.setKeyguardDisabledFeatures(r0)     // Catch:{ NoSuchMethodError -> 0x00ea }
            com.sec.enterprise.identity.AuthenticationConfig r0 = r3.getEnterpriseIdentityAuthentication()     // Catch:{ NoSuchMethodError -> 0x00ea }
            com.samsung.android.knox.container.AuthenticationConfig r0 = com.samsung.android.knox.container.AuthenticationConfig.convertToNew(r0)     // Catch:{ NoSuchMethodError -> 0x00ea }
            r2.setEnterpriseIdentityAuthentication(r0)     // Catch:{ NoSuchMethodError -> 0x00ea }
        L_0x00ea:
            java.util.HashMap r0 = r2.getDataSyncPolicy()
            r2.mRCPDataSettings = r0
            java.util.HashMap r0 = r2.getAllowChangeDataSyncPolicy()
            r2.mAllowChangeDataSettings = r0
            boolean r0 = r3.getManagedType()
            r2.setManagedType(r0)
            java.lang.String r0 = r3.getCustomBadgeIcon()
            r2.setCustomBadgeIcon(r0)
            java.lang.String r0 = r3.getCustomStatusLabel()
            r2.setCustomStatusLabel(r0)
            java.lang.String r0 = r3.getCustomStatusIcon()
            r2.setCustomStatusIcon(r0)
            boolean r0 = r3.getSimplePasswordEnabled()
            r2.setSimplePasswordEnabled(r0)
            boolean r0 = r3.isTaskManagerAllowed()
            r2.allowTaskManager(r0)
            boolean r0 = r3.isMultiwindowModeAllowed()
            r2.allowMultiwindowMode(r0)
            java.util.HashMap r0 = r2.getNotificationSyncPolicy()
            r2.mRCPNotifSettings = r0
            java.lang.String r0 = r3.getVersion()     // Catch:{ NoSuchMethodError -> 0x0134 }
            r2.setVersion(r0)     // Catch:{ NoSuchMethodError -> 0x0134 }
        L_0x0134:
            java.util.List r0 = r3.getProtectedPackageList()     // Catch:{ NoSuchMethodError -> 0x013b }
            r2.setProtectedPackageList(r0)     // Catch:{ NoSuchMethodError -> 0x013b }
        L_0x013b:
            java.util.List r0 = r3.getGoogleAppsList()     // Catch:{ NoSuchMethodError -> 0x0142 }
            r2.setGoogleAppsList(r0)     // Catch:{ NoSuchMethodError -> 0x0142 }
        L_0x0142:
            boolean r3 = r3.isUSBDebuggingAllowed()     // Catch:{ NoSuchMethodError -> 0x0149 }
            r2.allowUSBDebugging(r3)     // Catch:{ NoSuchMethodError -> 0x0149 }
        L_0x0149:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.container.KnoxConfigurationType.convertToNew(com.samsung.android.knox.container.KnoxConfigurationType, com.sec.enterprise.knox.container.KnoxConfigurationType):com.samsung.android.knox.container.KnoxConfigurationType");
    }

    private void setRCPSyncPolicy(List<String> list, String str, String str2, HashMap<String, List<Pair<String, String>>> hashMap) {
        if (hashMap != null && list != null && !list.isEmpty() && str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            Pair pair = new Pair(str, str2);
            Iterator<String> it = list.iterator();
            Pair pair2 = null;
            while (true) {
                boolean z = true;
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        List<Pair> list2 = hashMap.get(next);
                        if (list2 == null) {
                            list2 = new ArrayList<>();
                        } else {
                            for (Pair pair3 : list2) {
                                if (pair3.equals(pair)) {
                                    Log.d(TAG, "Ignoring the duplicate entry: " + ((String) pair.first) + " " + ((String) pair.second));
                                    z = false;
                                } else if (((String) pair3.first).equals(str)) {
                                    Log.d(TAG, "property found, remove and add it again: " + ((String) pair.first) + " " + ((String) pair.second));
                                    pair2 = pair3;
                                }
                            }
                            if (pair2 != null) {
                                list2.remove(pair2);
                                pair2 = null;
                            }
                        }
                        if (z) {
                            list2.add(pair);
                            hashMap.put(next, list2);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public KnoxConfigurationType(Parcel parcel) {
        boolean z = false;
        this.mPasswordMinimumNonLetters = 0;
        this.mPasswordMinimumLetters = 0;
        this.mPasswordMinimumNumeric = 0;
        this.mPasswordMinimumUpperCase = 0;
        this.mPasswordMinimumLowerCase = 0;
        this.mPasswordMinimumSymbols = 0;
        this.mPasswordQuality = 0;
        this.mMaximumFailedPasswordsForWipe = 0;
        this.mMaximumCharacterOccurences = 0;
        this.mMaximumCharacterSequenceLength = 0;
        this.mMaximumNumericSequenceLength = 0;
        this.mPasswordMinimumLength = 0;
        this.mMaximumTimeToLock = 0;
        String str = null;
        this.mPasswordPattern = null;
        this.mName = null;
        this.mCustomHomeScreenWallpaper = null;
        this.mEC = false;
        this.mNameIcon = null;
        this.mECName = null;
        this.mECIcon = null;
        this.mECBadge = null;
        this.mCustomLockScreenWallpaper = null;
        this.mAppInstallationList = new ArrayList();
        this.mLayoutType = -1;
        this.mAllowSwitch = true;
        this.mAuthenticationConfig = new AuthenticationConfig();
        this.mForbiddenStrings = new ArrayList();
        this.mMultifactorAuthEnabled = false;
        this.mIsBiometricAuthEnabled = false;
        this.mBiometricAuthValue = -1;
        this.mKeyguardDisabledFeatures = -1;
        this.mRCPDataSettings = new HashMap<>();
        this.mAllowChangeDataSettings = new HashMap<>();
        this.mVersion = "custom";
        this.mManagedType = false;
        this.mSimplePasswordEnabled = true;
        this.mAllowMultiwindowMode = true;
        this.mAllowTaskManager = true;
        this.mAllowUSBDebugging = false;
        this.mIsDefaultConfigType = false;
        this.mCustomBadgeIcon = null;
        this.mCustomStatusLabel = null;
        this.mCustomStatusIcon = null;
        this.mProtectedList = new ArrayList();
        this.mGoogleAppsList = new ArrayList();
        this.mRCPNotifSettings = new HashMap<>();
        this.mName = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            this.mVersion = readString;
        } else {
            this.mVersion = "custom";
        }
        this.mPasswordMinimumNonLetters = parcel.readInt();
        this.mPasswordMinimumLetters = parcel.readInt();
        this.mPasswordMinimumNumeric = parcel.readInt();
        this.mPasswordMinimumUpperCase = parcel.readInt();
        this.mPasswordMinimumLowerCase = parcel.readInt();
        this.mPasswordMinimumSymbols = parcel.readInt();
        this.mPasswordQuality = parcel.readInt();
        this.mMaximumTimeToLock = parcel.readInt();
        this.mMaximumFailedPasswordsForWipe = parcel.readInt();
        this.mManagedType = parcel.readInt() == 1;
        String readString2 = parcel.readString();
        this.mCustomBadgeIcon = (readString2 == null || readString2.isEmpty()) ? null : readString2;
        String readString3 = parcel.readString();
        this.mCustomHomeScreenWallpaper = (readString3 == null || readString3.isEmpty()) ? null : readString3;
        this.mEC = parcel.readInt() == 1;
        Log.d(TAG, "reading from parcel mEC " + this.mEC);
        String readString4 = parcel.readString();
        this.mNameIcon = (readString4 == null || readString4.isEmpty()) ? null : readString4;
        String readString5 = parcel.readString();
        this.mECName = (readString5 == null || readString5.isEmpty()) ? null : readString5;
        String readString6 = parcel.readString();
        this.mECIcon = (readString6 == null || readString6.isEmpty()) ? null : readString6;
        String readString7 = parcel.readString();
        this.mECBadge = (readString7 == null || readString7.isEmpty()) ? null : readString7;
        String readString8 = parcel.readString();
        this.mCustomLockScreenWallpaper = (readString8 == null || readString8.isEmpty()) ? null : readString8;
        String readString9 = parcel.readString();
        this.mCustomStatusLabel = (readString9 == null || readString9.isEmpty()) ? null : readString9;
        String readString10 = parcel.readString();
        this.mCustomStatusIcon = (readString10 == null || readString10.isEmpty()) ? null : readString10;
        parcel.readStringList(this.mAppInstallationList);
        parcel.readStringList(this.mForbiddenStrings);
        parcel.readStringList(this.mProtectedList);
        parcel.readStringList(this.mGoogleAppsList);
        this.mMaximumCharacterOccurences = parcel.readInt();
        this.mMaximumCharacterSequenceLength = parcel.readInt();
        this.mMaximumNumericSequenceLength = parcel.readInt();
        this.mPasswordMinimumLength = parcel.readInt();
        String readString11 = parcel.readString();
        if (readString11 != null && !readString11.isEmpty()) {
            str = readString11;
        }
        this.mPasswordPattern = str;
        this.mSimplePasswordEnabled = parcel.readInt() == 1;
        this.mMultifactorAuthEnabled = parcel.readInt() == 1;
        this.mAllowMultiwindowMode = parcel.readInt() == 1;
        this.mAllowTaskManager = parcel.readInt() == 1;
        this.mIsBiometricAuthEnabled = parcel.readInt() == 1;
        this.mBiometricAuthValue = parcel.readInt();
        this.mAllowUSBDebugging = parcel.readInt() == 1;
        this.mLayoutType = parcel.readInt();
        this.mAllowSwitch = parcel.readInt() == 1;
        this.mIsDefaultConfigType = parcel.readInt() == 1 ? true : z;
        deserializeRCPSettings(parcel, this.mRCPDataSettings);
        deserializeRCPSettings(parcel, this.mAllowChangeDataSettings);
        deserializeRCPSettings(parcel, this.mRCPNotifSettings);
        this.mAuthenticationConfig = (AuthenticationConfig) parcel.readParcelable(AuthenticationConfig.class.getClassLoader());
        this.mKeyguardDisabledFeatures = parcel.readInt();
    }
}
