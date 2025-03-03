package com.samsung.android.knox.datetime;

import android.content.Context;
import com.samsung.android.knox.SupportLibUtils;
import java.util.Date;

public class DateTimePolicy {
    public static final String ACTION_EVENT_NTP_SERVER_UNREACHABLE = "com.samsung.android.knox.intent.action.EVENT_NTP_SERVER_UNREACHABLE";
    private Context mContext;
    private android.app.enterprise.DateTimePolicy mDateTimePolicy;

    public DateTimePolicy(Context context, android.app.enterprise.DateTimePolicy dateTimePolicy) {
        this.mContext = context;
        this.mDateTimePolicy = dateTimePolicy;
    }

    public boolean getAutomaticTime() {
        return this.mDateTimePolicy.getAutomaticTime();
    }

    public String getDateFormat() {
        return this.mDateTimePolicy.getDateFormat();
    }

    public Date getDateTime() {
        return this.mDateTimePolicy.getDateTime();
    }

    public boolean getDaylightSavingTime() {
        return this.mDateTimePolicy.getDaylightSavingTime();
    }

    public NtpInfo getNtpInfo() {
        try {
            return NtpInfo.convertToNew(this.mDateTimePolicy.getNtpInfo());
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(DateTimePolicy.class, "getNtpInfo", (Class<?>[]) null, 17));
        }
    }

    public String getTimeFormat() {
        return this.mDateTimePolicy.getTimeFormat();
    }

    public String getTimeZone() {
        return this.mDateTimePolicy.getTimeZone();
    }

    public boolean isDateTimeChangeEnabled() {
        return this.mDateTimePolicy.isDateTimeChangeEnabled();
    }

    public boolean setAutomaticTime(boolean z) {
        return this.mDateTimePolicy.setAutomaticTime(z);
    }

    public boolean setDateTime(int i, int i8, int i9, int i10, int i11, int i12) {
        return this.mDateTimePolicy.setDateTime(i, i8, i9, i10, i11, i12);
    }

    public boolean setDateTimeChangeEnabled(boolean z) {
        return this.mDateTimePolicy.setDateTimeChangeEnabled(z);
    }

    public boolean setNtpInfo(NtpInfo ntpInfo) {
        try {
            return this.mDateTimePolicy.setNtpInfo(NtpInfo.convertToOld(this.mContext, ntpInfo));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public boolean setTimeFormat(String str) {
        return this.mDateTimePolicy.setTimeFormat(str);
    }

    public boolean setTimeZone(String str) {
        return this.mDateTimePolicy.setTimeZone(str);
    }
}
