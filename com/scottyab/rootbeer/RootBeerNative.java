package com.scottyab.rootbeer;

import N7.a;

public class RootBeerNative {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f9557a = true;

    static {
        try {
            System.loadLibrary("toolChecker");
        } catch (UnsatisfiedLinkError e) {
            a.d(e);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}
