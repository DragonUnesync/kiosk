package com.samsung.android.knox.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.ControlInfo;
import java.util.ArrayList;
import java.util.List;

public class AccountControlInfo extends ControlInfo {
    public static final Parcelable.Creator<AccountControlInfo> CREATOR = new Parcelable.Creator<AccountControlInfo>() {
        public AccountControlInfo createFromParcel(Parcel parcel) {
            return new AccountControlInfo(parcel);
        }

        public AccountControlInfo[] newArray(int i) {
            return new AccountControlInfo[i];
        }
    };

    public static AccountControlInfo convertToNew(android.app.enterprise.AccountControlInfo accountControlInfo) {
        if (accountControlInfo == null) {
            return null;
        }
        AccountControlInfo accountControlInfo2 = new AccountControlInfo();
        accountControlInfo2.adminPackageName = accountControlInfo.adminPackageName;
        accountControlInfo2.entries = new ArrayList(accountControlInfo.entries);
        return accountControlInfo2;
    }

    public static List<AccountControlInfo> convertToNewList(List<android.app.enterprise.AccountControlInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (android.app.enterprise.AccountControlInfo convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public AccountControlInfo() {
    }

    private AccountControlInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
