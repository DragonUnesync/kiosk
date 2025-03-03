package V4;

import j$.util.Objects;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final a f5985a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f5986b;

    public e(a aVar, Throwable th) {
        this.f5985a = aVar;
        this.f5986b = th;
    }

    public boolean a() {
        return true;
    }

    public boolean b(e eVar) {
        return true;
    }

    public a c() {
        return this.f5985a;
    }

    public String d() {
        String str;
        StringBuilder sb = new StringBuilder("publish=");
        sb.append(this.f5985a);
        Throwable th = this.f5986b;
        if (th == null) {
            str = "";
        } else {
            str = ", error=" + th;
        }
        sb.append(str);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!eVar.b(this) || !this.f5985a.equals(eVar.f5985a) || !Objects.equals(this.f5986b, eVar.f5986b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f5986b) + (this.f5985a.hashCode() * 31);
    }

    public String toString() {
        return "MqttPublishResult{" + d() + '}';
    }
}
