package R0;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class C extends C0158c {

    /* renamed from: Y  reason: collision with root package name */
    public final int f4236Y;

    /* renamed from: Z  reason: collision with root package name */
    public final byte[] f4237Z;

    /* renamed from: a0  reason: collision with root package name */
    public final DatagramPacket f4238a0;

    /* renamed from: b0  reason: collision with root package name */
    public Uri f4239b0;

    /* renamed from: c0  reason: collision with root package name */
    public DatagramSocket f4240c0;

    /* renamed from: d0  reason: collision with root package name */
    public MulticastSocket f4241d0;

    /* renamed from: e0  reason: collision with root package name */
    public InetAddress f4242e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f4243f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f4244g0;

    public C(int i) {
        super(true);
        this.f4236Y = i;
        byte[] bArr = new byte[2000];
        this.f4237Z = bArr;
        this.f4238a0 = new DatagramPacket(bArr, 0, 2000);
    }

    public final void close() {
        this.f4239b0 = null;
        MulticastSocket multicastSocket = this.f4241d0;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f4242e0;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f4241d0 = null;
        }
        DatagramSocket datagramSocket = this.f4240c0;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f4240c0 = null;
        }
        this.f4242e0 = null;
        this.f4244g0 = 0;
        if (this.f4243f0) {
            this.f4243f0 = false;
            e();
        }
    }

    public final long f(l lVar) {
        Uri uri = lVar.f4277a;
        this.f4239b0 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f4239b0.getPort();
        g();
        try {
            this.f4242e0 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f4242e0, port);
            if (this.f4242e0.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f4241d0 = multicastSocket;
                multicastSocket.joinGroup(this.f4242e0);
                this.f4240c0 = this.f4241d0;
            } else {
                this.f4240c0 = new DatagramSocket(inetSocketAddress);
            }
            this.f4240c0.setSoTimeout(this.f4236Y);
            this.f4243f0 = true;
            h(lVar);
            return -1;
        } catch (SecurityException e) {
            throw new i(e, 2006);
        } catch (IOException e8) {
            throw new i(e8, 2001);
        }
    }

    public final Uri p() {
        return this.f4239b0;
    }

    public final int x(byte[] bArr, int i, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f4244g0;
        DatagramPacket datagramPacket = this.f4238a0;
        if (i9 == 0) {
            try {
                DatagramSocket datagramSocket = this.f4240c0;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f4244g0 = length;
                b(length);
            } catch (SocketTimeoutException e) {
                throw new i(e, 2002);
            } catch (IOException e8) {
                throw new i(e8, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i10 = this.f4244g0;
        int min = Math.min(i10, i8);
        System.arraycopy(this.f4237Z, length2 - i10, bArr, i, min);
        this.f4244g0 -= min;
        return min;
    }
}
