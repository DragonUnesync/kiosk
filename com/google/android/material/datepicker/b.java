package com.google.android.material.datepicker;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Calendar;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new S(21);

    /* renamed from: U  reason: collision with root package name */
    public final o f9268U;

    /* renamed from: V  reason: collision with root package name */
    public final o f9269V;

    /* renamed from: W  reason: collision with root package name */
    public final d f9270W;

    /* renamed from: X  reason: collision with root package name */
    public final o f9271X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f9272Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f9273Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f9274a0;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f9268U = oVar;
        this.f9269V = oVar2;
        this.f9271X = oVar3;
        this.f9272Y = i;
        this.f9270W = dVar;
        if (oVar3 != null && oVar.f9329U.compareTo(oVar3.f9329U) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (oVar3 != null && oVar3.f9329U.compareTo(oVar2.f9329U) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i < 0 || i > w.c((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.f9274a0 = oVar.x(oVar2) + 1;
            this.f9273Z = (oVar2.f9331W - oVar.f9331W) + 1;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f9268U.equals(bVar.f9268U) || !this.f9269V.equals(bVar.f9269V) || !Objects.equals(this.f9271X, bVar.f9271X) || this.f9272Y != bVar.f9272Y || !this.f9270W.equals(bVar.f9270W)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f9272Y);
        d dVar = this.f9270W;
        return Arrays.hashCode(new Object[]{this.f9268U, this.f9269V, this.f9271X, valueOf, dVar});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f9268U, 0);
        parcel.writeParcelable(this.f9269V, 0);
        parcel.writeParcelable(this.f9271X, 0);
        parcel.writeParcelable(this.f9270W, 0);
        parcel.writeInt(this.f9272Y);
    }
}
