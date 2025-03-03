package T7;

import Q0.d;

public class I extends d implements Cloneable {

    /* renamed from: W  reason: collision with root package name */
    public String f5095W;

    public final void p() {
        this.f5095W = null;
    }

    /* renamed from: r */
    public final I clone() {
        try {
            return (I) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f5095W;
    }
}
