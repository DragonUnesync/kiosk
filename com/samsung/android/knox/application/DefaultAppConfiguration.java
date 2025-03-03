package com.samsung.android.knox.application;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class DefaultAppConfiguration implements Parcelable {
    public static final Parcelable.Creator<DefaultAppConfiguration> CREATOR = new Parcelable.Creator<DefaultAppConfiguration>() {
        public DefaultAppConfiguration createFromParcel(Parcel parcel) {
            return new DefaultAppConfiguration(parcel);
        }

        public DefaultAppConfiguration[] newArray(int i) {
            return new DefaultAppConfiguration[i];
        }
    };
    private ComponentName mComponentName;
    private Intent mTaskType;

    public static DefaultAppConfiguration convertToNew(android.app.enterprise.DefaultAppConfiguration defaultAppConfiguration) {
        if (defaultAppConfiguration == null) {
            return null;
        }
        DefaultAppConfiguration defaultAppConfiguration2 = new DefaultAppConfiguration();
        defaultAppConfiguration2.setComponentName(defaultAppConfiguration.getComponentName());
        defaultAppConfiguration2.setTaskType(defaultAppConfiguration.getTaskType());
        return defaultAppConfiguration2;
    }

    public static List<DefaultAppConfiguration> convertToNewList(List<android.app.enterprise.DefaultAppConfiguration> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (android.app.enterprise.DefaultAppConfiguration convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    public Intent getTaskType() {
        return this.mTaskType;
    }

    public void readFromParcel(Parcel parcel) {
        this.mTaskType = (Intent) Intent.CREATOR.createFromParcel(parcel);
        this.mComponentName = ComponentName.readFromParcel(parcel);
    }

    public void setComponentName(ComponentName componentName) {
        this.mComponentName = componentName;
    }

    public void setTaskType(Intent intent) {
        this.mTaskType = intent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.mTaskType.writeToParcel(parcel, i);
        ComponentName.writeToParcel(this.mComponentName, parcel);
    }

    public DefaultAppConfiguration(Intent intent, ComponentName componentName) {
        this.mTaskType = intent;
        this.mComponentName = componentName;
    }

    private DefaultAppConfiguration(Parcel parcel) {
        readFromParcel(parcel);
    }

    public DefaultAppConfiguration() {
    }
}
