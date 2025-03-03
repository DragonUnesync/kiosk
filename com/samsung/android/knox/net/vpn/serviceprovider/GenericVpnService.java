package com.samsung.android.knox.net.vpn.serviceprovider;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.sec.vpn.knox.GenericVpnService;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class GenericVpnService extends com.sec.vpn.knox.GenericVpnService {

    public class Builder extends GenericVpnService.Builder {
        public Builder() {
            super(GenericVpnService.this);
        }

        public ParcelFileDescriptor establish() {
            return GenericVpnService.super.establish();
        }

        public Builder addSearchDomain(String str) {
            GenericVpnService.super.addSearchDomain(str);
            return this;
        }

        public Builder setConfigureIntent(PendingIntent pendingIntent) {
            GenericVpnService.super.setConfigureIntent(pendingIntent);
            return this;
        }

        public Builder setMtu(int i) {
            GenericVpnService.super.setMtu(i);
            return this;
        }

        public Builder setSession(String str) {
            GenericVpnService.super.setSession(str);
            return this;
        }

        public Builder addAddress(InetAddress inetAddress, int i) {
            GenericVpnService.super.addAddress(inetAddress, i);
            return this;
        }

        public Builder addDnsServer(InetAddress inetAddress) {
            GenericVpnService.super.addDnsServer(inetAddress);
            return this;
        }

        public Builder addRoute(InetAddress inetAddress, int i) {
            GenericVpnService.super.addRoute(inetAddress, i);
            return this;
        }

        public Builder addAddress(String str, int i) {
            GenericVpnService.super.addAddress(str, i);
            return this;
        }

        public Builder addDnsServer(String str) {
            GenericVpnService.super.addDnsServer(str);
            return this;
        }

        public Builder addRoute(String str, int i) {
            GenericVpnService.super.addRoute(str, i);
            return this;
        }
    }

    public static Intent prepare(Context context, String str, boolean z, boolean z6) {
        return com.sec.vpn.knox.GenericVpnService.prepare(context, str, z, z6);
    }

    public IBinder onBind(Intent intent) {
        return GenericVpnService.super.onBind(intent);
    }

    public void onRevoke() {
        GenericVpnService.super.onRevoke();
    }

    public boolean protect(int i) {
        return GenericVpnService.super.protect(i);
    }

    public boolean protect(Socket socket) {
        return GenericVpnService.super.protect(socket);
    }

    public boolean protect(DatagramSocket datagramSocket) {
        return GenericVpnService.super.protect(datagramSocket);
    }
}
