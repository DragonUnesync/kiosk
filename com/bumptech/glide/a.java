package com.bumptech.glide;

import W2.m;

public final class a implements Cloneable {

    /* renamed from: U  reason: collision with root package name */
    public U2.a f8966U;

    /* renamed from: a */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean b(Object obj) {
        if (obj instanceof a) {
            return m.b(this.f8966U, ((a) obj).f8966U);
        }
        return false;
    }

    public final int c() {
        U2.a aVar = this.f8966U;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a) || !b(obj)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return c();
    }
}
