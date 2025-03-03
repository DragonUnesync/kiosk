package de.ozerov.fully;

import android.webkit.PermissionRequest;

/* renamed from: de.ozerov.fully.h2  reason: case insensitive filesystem */
public final /* synthetic */ class C0707h2 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10687U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ PermissionRequest f10688V;

    public /* synthetic */ C0707h2(PermissionRequest permissionRequest, int i) {
        this.f10687U = i;
        this.f10688V = permissionRequest;
    }

    public final void run() {
        switch (this.f10687U) {
            case 0:
                PermissionRequest permissionRequest = this.f10688V;
                permissionRequest.grant(permissionRequest.getResources());
                return;
            default:
                this.f10688V.deny();
                return;
        }
    }
}
